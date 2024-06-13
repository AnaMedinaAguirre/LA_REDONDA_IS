package Procesos;

//librerias
import Modelo.Clientes;
import Vista.InterFrameGestionarClientes;

public class ProcesosFrmClientes {
        
    public static void Presentacion(InterFrameGestionarClientes if5) {
        if5.setTitle("Mantenimiento de Clientes");
        if5.txtIDClientes.setEnabled(false);
        if5.setVisible(true);
    }

    public static void Estado1(InterFrameGestionarClientes if5) {
        if5.btnRegistrar.setEnabled(true);
        if5.btnConsultar.setEnabled(true);
        if5.btnActualizar.setEnabled(false);
        if5.btnEliminar.setEnabled(false);
    }

    public static void Estado2(InterFrameGestionarClientes if5) {
        if5.btnRegistrar.setEnabled(false);
        if5.btnConsultar.setEnabled(true);
        if5.btnActualizar.setEnabled(true);
        if5.btnEliminar.setEnabled(true);
    }

    public static void LimpiarEntradas(InterFrameGestionarClientes if5) {
        if5.txtIDClientes.setText("");
        if5.txtNombresCli.setText("");
        if5.cbxGenero.setSelectedIndex(0);
        if5.txtTelefono.setText("");
        if5.txtCorreo.setText("");
        if5.txtDireccion.setText("");
        if5.txtNombresCli.requestFocus();
    }

    //metodo que lee los clientes
    public static Clientes LeerDatos(InterFrameGestionarClientes if5) {
        Clientes cli = new Clientes();
        cli.setNombres(if5.txtNombresCli.getText());
        cli.setGenero(if5.cbxGenero.getSelectedItem().toString());
        cli.setTelefono(if5.txtTelefono.getText());
        cli.setCorreo(if5.txtCorreo.getText());
        cli.setDireccion(if5.txtDireccion.getText());
        return cli;
    }
    
    public static void CargarCombos(InterFrameGestionarClientes if5){
        if5.cbxGenero.addItem("M");
        if5.cbxGenero.addItem("F");
    }
    
}//fin del class
