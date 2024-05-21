package Controlador;

import Procesos.ProcesosFrmVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Ventas;
import Vista.InternalFrameGestionarVentas;
import DAO.*;

public class ControladorFrmVentas implements ActionListener{
    
    InternalFrameGestionarVentas vista;
    DAO_Venta crud;
    Ventas ven;
    
    public ControladorFrmVentas(InternalFrameGestionarVentas if2){
        vista = if2;
        vista.btnRegistrar.addActionListener(this);
        ProcesosFrmVentas.Presentacion(if2);
        ProcesosFrmVentas.CargarCombos(if2);
        ActualizarForma();
    }
    
    void ActualizarForma() {
        crud = new DAO_Venta();
        crud.MostrarVentas(vista.tblVentas, vista.jlblCantidadregistros);
        ProcesosFrmVentas.Estado1(vista);
        ProcesosFrmVentas.LimpiarEntradas(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            ven = ProcesosFrmVentas.LeerDatos(vista);
            crud = new DAO_Venta();
            crud.InsertarVentas(ven);
            ActualizarForma();
        }
    }
    
}
