package Controlador;

import Procesos.ProcesosFrmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Clientes;
import Vista.InterFrameGestionarClientes;
import DAO.*;

public class ControladorFrmClientes implements ActionListener{
    
    InterFrameGestionarClientes vista;
    DAO_Clientes crud; // c: create r:read  u:update   d=delete    
    Clientes cli;
    
    public ControladorFrmClientes(InterFrameGestionarClientes if5){
        vista = if5;
        vista.btnRegistrar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        ProcesosFrmClientes.Presentacion(if5);
        ProcesosFrmClientes.CargarCombos(if5);
        ActualizarForma();
    }//fin del constructor
    
    void ActualizarForma() {
        crud = new DAO_Clientes();
        crud.MostrarClientes(vista.tblClientes, vista.jlblCantidadregistros);
        ProcesosFrmClientes.Estado1(vista);
        ProcesosFrmClientes.LimpiarEntradas(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            cli = ProcesosFrmClientes.LeerDatos(vista);
            crud = new DAO_Clientes();
            crud.InsertarClientes(cli);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnConsultar) {
            int idcli = Mensajes.M2("Ingrese el ID del cliente a buscar...");
            crud = new DAO_Clientes();
            cli = crud.ConsultarRegistro(idcli);
            if (cli == null) {
                Mensajes.M1("El id " + idcli + " no existe en la tabla clientes...");
            } else {
                vista.txtIDClientes.setText(Integer.toString(cli.getIdcliente()));
                vista.txtNombresCli.setText(cli.getNombres());
                vista.cbxGenero.setSelectedItem(cli.getGenero());
                vista.txtTelefono.setText(cli.getTelefono());
                vista.txtCorreo.setText(cli.getCorreo());
                vista.txtDireccion.setText(cli.getDireccion());
                ProcesosFrmClientes.Estado2(vista);
            }
        }
        if (e.getSource() == vista.btnActualizar) {
            cli = ProcesosFrmClientes.LeerDatos(vista);
            cli.setIdcliente(Integer.parseInt(vista.txtIDClientes.getText()));
            crud = new DAO_Clientes();
            crud.ActualizarRegistro(cli);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnEliminar) {
            int respuesta = Mensajes.M3("Confirmar!!!!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                int idcli = Integer.parseInt(vista.txtIDClientes.getText());
                crud = new DAO_Clientes();
                crud.EliminarRegistro(idcli);
                ActualizarForma();
            }
        }
    }
    
}//fin del class
