package Procesos;

//librerias
import Modelo.Ventas;
import Vista.InternalFrameGestionarVentas;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProcesosFrmVentas {
    
    public static Calendar cal = new GregorianCalendar();
    
    public static void Presentacion(InternalFrameGestionarVentas if2) {
        if2.setTitle("Mantenimiento de Ventas");
        if2.txtIDVenta.setEnabled(false);
        if2.datecFecha.setCalendar(cal);
        if2.setVisible(true);
    }

    public static void Estado1(InternalFrameGestionarVentas if2) {
        if2.btnRegistrar.setEnabled(true);
        if2.btnConsultar.setEnabled(true);
        if2.btnActualizar.setEnabled(false);
        if2.btnEliminar.setEnabled(false);
    }

    public static void Estado2(InternalFrameGestionarVentas if2) {
        if2.btnRegistrar.setEnabled(false);
        if2.btnConsultar.setEnabled(true);
        if2.btnActualizar.setEnabled(true);
        if2.btnEliminar.setEnabled(true);
    }

    public static void LimpiarEntradas(InternalFrameGestionarVentas if2) {
        if2.txtIDVenta.setText("");
        if2.datecFecha.setCalendar(cal);
        if2.cbxProducto.setSelectedIndex(0);
        if2.txtPrecioUni.setText("");
        if2.txtCliente.setText("");
        if2.spnCantidad.setValue(0);
        if2.txaDetalleVenta.setText("");
        if2.txtTotal.setText("");
        if2.datecFecha.requestFocus();
    }

    //metodo que la categoria
    public static Ventas LeerDatos(InternalFrameGestionarVentas if2) {
        Ventas ven = new Ventas();
        ven.setFecha(if2.datecFecha.getDate());
        ven.setProducto(if2.cbxProducto.getSelectedItem().toString());
        ven.setPrecioUnitario(Double.parseDouble(if2.txtPrecioUni.getText()));
        ven.setCliente(if2.txtCliente.getText());
        ven.setCantidad(Integer.parseInt(if2.spnCantidad.getValue().toString()));
        ven.setDetalleVenta(if2.txaDetalleVenta.getText());
        ven.setTotal(Double.parseDouble(if2.txtTotal.getText()));
        return ven;
    }
    
    public static void CargarCombos(InternalFrameGestionarVentas if2){
        if2.cbxProducto.addItem("Pera");
        if2.cbxProducto.addItem("Kiwi");
    }
}
