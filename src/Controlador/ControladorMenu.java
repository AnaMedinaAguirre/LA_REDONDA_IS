package Controlador;

//librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Formato.*;
import Principal.*;
import javax.swing.JFrame;

public class ControladorMenu implements ActionListener{

    Frm_Menu vista;
    
    public ControladorMenu(Frm_Menu fm){
        vista = fm;
        vista.MenuItemGestionarProductos.addActionListener(this);
        vista.MenuItemGestionarTransaccion.addActionListener(this);
        vista.MenuItemGestionarVentas.addActionListener(this);
        vista.MenuItemGestionarProveedores.addActionListener(this);
        vista.MenuItemGestionarClientes.addActionListener(this);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Aplicación de Gestión de Inventario");  
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.MenuItemGestionarProductos) {
            Main.ifgp = new InterFrameGestionarProductos();
            Main.controlprod = new ControladorFrmProductos(Main.ifgp);
            vista.Escritorio.add(Main.ifgp);
        }
        if (e.getSource() == vista.MenuItemGestionarTransaccion) {
            Main.ifgt = new InterFrameGestionarTransaccion();
            Main.controltran = new ControladorFrmTransacciones(Main.ifgt);
            vista.Escritorio.add(Main.ifgt);
        }
        if (e.getSource() == vista.MenuItemGestionarVentas) {
            Main.ifgv = new InternalFrameGestionarVentas();
            Main.controlven = new ControladorFrmVentas(Main.ifgv);
            vista.Escritorio.add(Main.ifgv);
        }
        if (e.getSource() == vista.MenuItemGestionarProveedores) {
            Main.ifgprov = new InterFrameGestionarProveedores();
            Main.controlprov = new ControladorFrmProveedores(Main.ifgprov);
            vista.Escritorio.add(Main.ifgprov);
        }
        if (e.getSource() == vista.MenuItemGestionarClientes) {
            Main.ifgcl = new InterFrameGestionarClientes();
            Main.controlcl = new ControladorFrmClientes(Main.ifgcl);
            vista.Escritorio.add(Main.ifgcl);
        }
    }

}
