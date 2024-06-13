package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Vista.*;
import DAO.*;
import Modelo.Empleado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ControladorLogin implements ActionListener, KeyListener{

    FrmLogin vista;
    DAO_Login crud;
    
    public ControladorLogin(FrmLogin f1){
        vista = f1;
        vista.txtUsuario.addKeyListener(this);
        vista.txtContraseña.addKeyListener(this);
        vista.btnIniciarSesion.addActionListener(this);
        vista.setLocationRelativeTo(null);
        vista.setTitle("Login - La Redonda");
        vista.setVisible(true);
        
        // Inicializar el objeto DAO_Login
        crud = new DAO_Login();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.Login();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == vista.txtUsuario && e.getKeyCode() == KeyEvent.VK_ENTER) {
            vista.txtContraseña.requestFocus();
        } else if (e.getSource() == vista.txtContraseña && e.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Login();
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    private void Login() {
        if (!vista.txtUsuario.getText().isEmpty() && !vista.txtContraseña.getText().isEmpty()) {
            
            Empleado empleado = new Empleado();
            empleado.setUser(vista.txtUsuario.getText().trim());
            empleado.setPassword(vista.txtContraseña.getText().trim());
            
            if(crud.verificarCredenciales(empleado)){
                Frm_Menu menu = new Frm_Menu();
                ControladorMenu controladorMenu = new ControladorMenu(menu);
                menu.setVisible(true);
                
                vista.dispose();
            }else{
                Mensajes.M1("Usuario o clave incorrectos. Inténtalo de nuevo.");
            }
            
        } else {
            Mensajes.M1("Por favor ingrese sus credenciales.");
        }
    }
}
