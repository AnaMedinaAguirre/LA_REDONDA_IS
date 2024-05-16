package Principal;

import Vista.*;
import Controlador.*;

public class Main {
    
    public static ControladorMenu controladorMenu;
    
    public static InterFrameGestionarTransaccion ifgt;
    public static ControladorFrmTransacciones controltran;
    
    public static void main(String[] args) {
        FrmLogin frmLogin = new FrmLogin();
        ControladorLogin controladorLogin = new ControladorLogin(frmLogin);
        frmLogin.setVisible(true);
    }
    
}
