package Procesos;

//librerias
import Modelo.Productos;
import Vista.InterFrameGestionarProductos;
import java.util.Calendar;
import java.util.GregorianCalendar;
import DAO.*;


public class ProcesosFrmProductos {
    
    public static Calendar cal = new GregorianCalendar();
    
    public static void Presentacion(InterFrameGestionarProductos if3) {
        if3.setTitle("Mantenimiento de Productos");
        ActualizarCombo ac = new ActualizarCombo();
        ac.CargarDatos(if3.cbxProveedor,ac.consultaprov);
        if3.txtIDProductos.setEnabled(false);
        if3.datecFechaVenc.setCalendar(cal);
        if3.setVisible(true);
    }

    public static void Estado1(InterFrameGestionarProductos if3) {
        if3.btnRegistrar.setEnabled(true);
        if3.btnConsultar.setEnabled(true);
        if3.btnActualizar.setEnabled(false);
        if3.btnEliminar.setEnabled(false);
    }

    public static void Estado2(InterFrameGestionarProductos if3) {
        if3.btnRegistrar.setEnabled(false);
        if3.btnConsultar.setEnabled(true);
        if3.btnActualizar.setEnabled(true);
        if3.btnEliminar.setEnabled(true);
    }

    public static void LimpiarEntradas(InterFrameGestionarProductos if3) {
        if3.txtIDProductos.setText("");
        if3.datecFechaVenc.setCalendar(cal);
        if3.txtNombreProd.setText("");
        if3.cbxProveedor.setSelectedIndex(0);
        if3.txtPrecioProd.setText("");
        if3.txtStockProd.setText("");
        if3.txaDescripcionProd.setText("");
        if3.datecFechaVenc.requestFocus();
    }

    //metodo que la categoria
    public static Productos LeerDatos(InterFrameGestionarProductos if3) {
        Productos prod = new Productos();
        prod.setFechaven(if3.datecFechaVenc.getDate());
        prod.setNombre(if3.txtNombreProd.getText());
        AdministrarClaves ac = new AdministrarClaves();
        prod.setIdproveedor(ac.RecuperarID(ac.consultaprov, if3.cbxProveedor.getSelectedItem().toString()));
        prod.setPrecio(Double.parseDouble(if3.txtPrecioProd.getText()));
        prod.setStock(Integer.parseInt(if3.txtStockProd.getText()));
        prod.setDescripcion(if3.txaDescripcionProd.getText());
        return prod;
    }
    
}//fin del class
