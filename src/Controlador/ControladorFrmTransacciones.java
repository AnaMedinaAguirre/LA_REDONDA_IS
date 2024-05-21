package Controlador;

import Procesos.ProcesosFrmTransacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Transacciones;
import Vista.InterFrameGestionarTransaccion;
import DAO.*;

public class ControladorFrmTransacciones implements ActionListener{
    
    InterFrameGestionarTransaccion vista;
    DAO_Transacciones crud; // c: create r:read  u:update   d=delete    
    Transacciones tran;
    
    public ControladorFrmTransacciones(InterFrameGestionarTransaccion if1){
        vista = if1;
        vista.btnRegistrar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        ProcesosFrmTransacciones.Presentacion(if1);
        ActualizarForma();
        ProcesosFrmTransacciones.CargarCombos(if1);
    }//fin del constructor
    
    void ActualizarForma() {
        crud = new DAO_Transacciones();
        crud.MostrarTransacciones(vista.tblTransaccion, vista.jlblCantidadregistros);
        ProcesosFrmTransacciones.Estado1(vista);
        ProcesosFrmTransacciones.LimpiarEntradas(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            tran = ProcesosFrmTransacciones.LeerDatos(vista);
            crud = new DAO_Transacciones();
            crud.InsertarTransaccion(tran);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnConsultar) {
            int idtran = Mensajes.M2("Ingrese el ID de la transacción a buscar...");
            crud = new DAO_Transacciones();
            tran = crud.ConsultarRegistro(idtran);
            if (tran == null) {
                Mensajes.M1("El id " + idtran + " no existe en la tabla transacciones...");
            } else {
                vista.txtIDTransaccion.setText(Integer.toString(tran.getIdtransaccion()));
                vista.datecFechaTransaccion.setDate(tran.getFecha());
                vista.cbxTipo.setSelectedItem(tran.getTipo());
                vista.txtMonto.setText(Double.toString(tran.getMonto()));
                vista.txtEmpleado.setText(tran.getEmpleado());
                vista.txaDescripcion.setText(tran.getDescripcion());
                ProcesosFrmTransacciones.Estado2(vista);
            }
        }
        if (e.getSource() == vista.btnActualizar) {
            tran = ProcesosFrmTransacciones.LeerDatos(vista);
            tran.setIdtransaccion(Integer.parseInt(vista.txtIDTransaccion.getText()));
            crud = new DAO_Transacciones();
            crud.ActualizarRegistro(tran);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnEliminar) {
            int respuesta = Mensajes.M3("Confirmar!!!!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                int idtran = Integer.parseInt(vista.txtIDTransaccion.getText());
                crud = new DAO_Transacciones();
                crud.EliminarRegistro(idtran);
                ActualizarForma();
            }
        }
    }
    
}//fin del class
