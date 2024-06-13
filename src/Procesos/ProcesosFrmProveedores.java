package Procesos;

//librerias
import Modelo.Proveedores;
import Vista.InterFrameGestionarProveedores;

public class ProcesosFrmProveedores {
        
    public static void Presentacion(InterFrameGestionarProveedores if4) {
        if4.setTitle("Mantenimiento de Proveedores");
        if4.txtIDProveedores.setEnabled(false);
        if4.setVisible(true);
    }

    public static void Estado1(InterFrameGestionarProveedores if4) {
        if4.btnRegistrar.setEnabled(true);
        if4.btnConsultar.setEnabled(true);
        if4.btnActualizar.setEnabled(false);
        if4.btnEliminar.setEnabled(false);
    }

    public static void Estado2(InterFrameGestionarProveedores if4) {
        if4.btnRegistrar.setEnabled(false);
        if4.btnConsultar.setEnabled(true);
        if4.btnActualizar.setEnabled(true);
        if4.btnEliminar.setEnabled(true);
    }

    public static void LimpiarEntradas(InterFrameGestionarProveedores if4) {
        if4.txtIDProveedores.setText("");
        if4.txtNombreCompania.setText("");
        if4.txtNombreContacto.setText("");
        if4.txtCargoContacto.setText("");
        if4.txtDireccion.setText("");
        if4.txtTelefono.setText("");
        if4.txtPagWeb.setText("");
        if4.txtNombreCompania.requestFocus();
    }

    //metodo que lee los proveedores
    public static Proveedores LeerDatos(InterFrameGestionarProveedores if4) {
        Proveedores prov = new Proveedores();
        prov.setNombrecompania(if4.txtNombreCompania.getText());
        prov.setNombrecontacto(if4.txtNombreContacto.getText());
        prov.setCargocontacto(if4.txtCargoContacto.getText());
        prov.setDireccion(if4.txtDireccion.getText());
        prov.setTelefono(if4.txtTelefono.getText());
        prov.setPaginaweb(if4.txtPagWeb.getText());
        return prov;
    }
    
}//fin del class
