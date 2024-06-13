package Controlador;

import Procesos.ProcesosFrmProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Productos;
import Vista.InterFrameGestionarProductos;
import DAO.*;

public class ControladorFrmProductos implements ActionListener{
    
    InterFrameGestionarProductos vista;
    DAO_Productos crud; // c: create r:read  u:update   d=delete    
    Productos prod;
    
    public ControladorFrmProductos(InterFrameGestionarProductos if3){
        vista = if3;
        vista.btnRegistrar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        ProcesosFrmProductos.Presentacion(if3);
        ActualizarForma();
    }//fin del constructor
    
    void ActualizarForma() {
        crud = new DAO_Productos();
        crud.MostrarProductos(vista.tblProductos, vista.jlblCantidadregistros);
        ProcesosFrmProductos.Estado1(vista);
        ProcesosFrmProductos.LimpiarEntradas(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            prod = ProcesosFrmProductos.LeerDatos(vista);
            crud = new DAO_Productos();
            crud.InsertarProductos(prod);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnConsultar) {
            int idprod = Mensajes.M2("Ingrese el ID del producto a buscar...");
            crud = new DAO_Productos();
            prod = crud.ConsultarRegistro(idprod);
            if (prod == null) {
                Mensajes.M1("El id " + idprod + " no existe en la tabla productos...");
            } else {
                vista.txtIDProductos.setText(Integer.toString(prod.getIdproductos()));
                vista.datecFechaVenc.setDate(prod.getFechaven());
                vista.txtNombreProd.setText((prod.getNombre()));
                vista.cbxProveedor.setSelectedItem(prod.getIdproveedor());
                vista.txtPrecioProd.setText(Double.toString(prod.getPrecio()));
                vista.txtStockProd.setText(Integer.toString(prod.getStock()));
                vista.txaDescripcionProd.setText(prod.getDescripcion());
                ProcesosFrmProductos.Estado2(vista);
            }
        }
        if (e.getSource() == vista.btnActualizar) {
            prod = ProcesosFrmProductos.LeerDatos(vista);
            prod.setIdproductos(Integer.parseInt(vista.txtIDProductos.getText()));
            crud = new DAO_Productos();
            crud.ActualizarRegistro(prod);
            ActualizarForma();
        }
        if (e.getSource() == vista.btnEliminar) {
            int respuesta = Mensajes.M3("Confirmar!!!!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                int idprod = Integer.parseInt(vista.txtIDProductos.getText());
                crud = new DAO_Productos();
                crud.EliminarRegistro(idprod);
                ActualizarForma();
            }
        }
    }
    
}//fin del class
