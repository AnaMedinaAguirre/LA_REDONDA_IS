package Principal;

import Vista.*;
import Controlador.*;

public class Main {
    
    public static ControladorMenu controladorMenu;
    
    public static InterFrameGestionarProductos ifgp;
    public static ControladorFrmProductos controlprod;
    
    public static InterFrameGestionarTransaccion ifgt;
    public static ControladorFrmTransacciones controltran;
    
    public static InternalFrameGestionarVentas ifgv;
    public static ControladorFrmVentas controlven;
    
    public static InterFrameGestionarProveedores ifgprov;
    public static ControladorFrmProveedores controlprov;
    
    public static InterFrameGestionarClientes ifgcl;
    public static ControladorFrmClientes controlcl;
    
    public static void main(String[] args) {
        FrmLogin frmLogin = new FrmLogin();
        ControladorLogin controladorLogin = new ControladorLogin(frmLogin);
        frmLogin.setVisible(true);
    }
    
}
