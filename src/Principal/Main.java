package Principal;

import Vista.*;

public class Main {
    
    public static FrmLogin frmLogin;
    public static Frm_Menu frmMenu;
    public static InterFrameGestionarTransaccion ifgt;
    
    public static void main(String[] args) {
        frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
    }
    
}
