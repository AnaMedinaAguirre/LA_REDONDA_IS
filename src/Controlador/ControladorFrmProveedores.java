package Controlador;

import Procesos.ProcesosFrmProveedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Proveedores;
import Vista.InterFrameGestionarProveedores;
import DAO.*;

public class ControladorFrmProveedores implements ActionListener{
    
    InterFrameGestionarProveedores vista;
    DAO_Proveedores crud; // c: create r:read  u:update   d=delete    
    Proveedores prov;
    
    public ControladorFrmProveedores(InterFrameGestionarProveedores if4){
        vista = if4;
        vista.btnRegistrar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        ProcesosFrmProveedores.Presentacion(if4);
        ActualizarForma();
    }//fin del constructor
    
    void ActualizarForma() {
        crud = new DAO_Proveedores();
        crud.MostrarProveedores(vista.tblProveedores, vista.jlblCantidadregistros);
        ProcesosFrmProveedores.Estado1(vista);
        ProcesosFrmProveedores.LimpiarEntradas(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            prov = ProcesosFrmProveedores.LeerDatos(vista);
            crud = new DAO_Proveedores();
            crud.InsertarProveedores(prov);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnConsultar) {
            int idprov = Mensajes.M2("Ingrese el ID del Proveedor a buscar...");
            crud = new DAO_Proveedores();
            prov = crud.ConsultarRegistro(idprov);
            if (prov == null) {
                Mensajes.M1("El id " + idprov + " no existe en la tabla proveedores...");
            } else {
                vista.txtIDProveedores.setText(Integer.toString(prov.getIdproveedor()));
                vista.txtNombreCompania.setText(prov.getNombrecompania());
                vista.txtNombreContacto.setText(prov.getNombrecontacto());
                vista.txtCargoContacto.setText(prov.getCargocontacto());
                vista.txtDireccion.setText(prov.getDireccion());
                vista.txtTelefono.setText(prov.getTelefono());
                vista.txtPagWeb.setText(prov.getPaginaweb());
                ProcesosFrmProveedores.Estado2(vista);
            }
        }
        if (e.getSource() == vista.btnActualizar) {
            prov = ProcesosFrmProveedores.LeerDatos(vista);
            prov.setIdproveedor(Integer.parseInt(vista.txtIDProveedores.getText()));
            crud = new DAO_Proveedores();
            crud.ActualizarRegistro(prov);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnEliminar) {
            int respuesta = Mensajes.M3("Confirmar!!!!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                int idprov = Integer.parseInt(vista.txtIDProveedores.getText());
                crud = new DAO_Proveedores();
                crud.EliminarRegistro(idprov);
                ActualizarForma();
            }
        }
    }
    
}//fin del class
