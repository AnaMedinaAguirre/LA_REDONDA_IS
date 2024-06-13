package Procesos;

//librerias
import Modelo.Ventas;
import Vista.InternalFrameGestionarVentas;
import java.util.Calendar;
import java.util.GregorianCalendar;
import DAO.*;

public class ProcesosFrmVentas {
    
    public static Calendar cal = new GregorianCalendar();
    
    public static void Presentacion(InternalFrameGestionarVentas if2) {
        if2.setTitle("Mantenimiento de Ventas");
        ActualizarCombo ac = new ActualizarCombo();
        ac.CargarDatos(if2.cbxProducto,ac.consultaprod);
        ac.CargarDatos(if2.cbxCliente, ac.consultacli);
        if2.txtIDVenta.setEnabled(false);
        if2.txtTotal.setEnabled(false);
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
        if2.cbxCliente.setSelectedIndex(0);
        if2.spnCantidad.setValue(0);
        if2.txaDetalleVenta.setText("");
        if2.txtTotal.setText("");
        if2.datecFecha.requestFocus();
    }

    //metodo que la categoria
    public static Ventas LeerDatos(InternalFrameGestionarVentas if2) {
        Ventas ven = new Ventas();
        ven.setFecha(if2.datecFecha.getDate());
        AdministrarClaves ac = new AdministrarClaves();
        ven.setIdproductos(ac.RecuperarID(ac.consultaprod, if2.cbxProducto.getSelectedItem().toString()));
        ven.setIdproductos(ac.RecuperarID(ac.consultacli, if2.cbxCliente.getSelectedItem().toString()));
        //agregado
        double precioUnitario = Double.parseDouble(if2.txtPrecioUni.getText());
        int cantidad = Integer.parseInt(if2.spnCantidad.getValue().toString());
        double total = precioUnitario * cantidad;
        ven.setPrecioUnitario(precioUnitario);
        ven.setCantidad(cantidad);
        ven.setDetalleVenta(if2.txaDetalleVenta.getText());
        ven.setTotal(total);
        return ven;
    }
}
