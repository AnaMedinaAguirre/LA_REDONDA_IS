package Controlador;

import Procesos.ProcesosFrmVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Ventas;
import Vista.InternalFrameGestionarVentas;
import DAO.*;

public class ControladorFrmVentas implements ActionListener{
    
    InternalFrameGestionarVentas vista;
    DAO_Venta crud;
    Ventas ven;
    
    public ControladorFrmVentas(InternalFrameGestionarVentas if2){
        vista = if2;
        vista.btnRegistrar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        ProcesosFrmVentas.Presentacion(if2);
        ProcesosFrmVentas.CargarCombos(if2);
        ActualizarForma();
    }
    
    void ActualizarForma() {
        crud = new DAO_Venta();
        crud.MostrarVentas(vista.tblVentas, vista.jlblCantidadregistros);
        ProcesosFrmVentas.Estado1(vista);
        ProcesosFrmVentas.LimpiarEntradas(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            ven = ProcesosFrmVentas.LeerDatos(vista);
            crud = new DAO_Venta();
            crud.InsertarVentas(ven);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnConsultar) {
            int idven = Mensajes.M2("Ingrese el ID de la venta a buscar...");
            crud = new DAO_Venta();
            ven = crud.ConsultarRegistro(idven);
            if (ven == null) {
                Mensajes.M1("El id " + idven + " no existe en la tabla registrarventas...");
            } else {
                vista.txtIDVenta.setText(Integer.toString(ven.getIdVentas()));
                vista.datecFecha.setDate(ven.getFecha());
                vista.cbxProducto.setSelectedItem(ven.getProducto());
                vista.txtPrecioUni.setText(Double.toString(ven.getPrecioUnitario()));
                vista.txtCliente.setText(ven.getCliente());
                vista.spnCantidad.setValue(ven.getCantidad());
                vista.txaDetalleVenta.setText(ven.getDetalleVenta());
                vista.txtTotal.setText(Double.toString(ven.getTotal()));
                ProcesosFrmVentas.Estado2(vista);
            }
        }
        if (e.getSource() == vista.btnActualizar) {
            ven = ProcesosFrmVentas.LeerDatos(vista);
            ven.setIdVentas(Integer.parseInt(vista.txtIDVenta.getText()));
            crud = new DAO_Venta();
            crud.ActualizarRegistro(ven);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnEliminar) {
            int respuesta = Mensajes.M3("Confirmar!!!!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                int idven = Integer.parseInt(vista.txtIDVenta.getText());
                crud = new DAO_Venta();
                crud.EliminarRegistro(idven);
                ActualizarForma();
            }
        }
    }
    
}
