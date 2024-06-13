package Formato;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class ManejadorTablas {
    
    //Metodo que especifica un ancho de las columnas de tabla    
    public static void AnchoColumnas(JTable t, int numcolumna,int ancho) {
        TableColumn column;
        column = t.getColumnModel().getColumn(numcolumna);
        column.setPreferredWidth(ancho);       
    }
    
    //metodo que justifica los datos de una columna
   public static void JustificarCelda(JTable t,int numcolumna){
       DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
       modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
       t.getColumnModel().getColumn(numcolumna).setCellRenderer(modelocentrar);       
   }
   
   //metodo que da formato al JTable de la tabla Productos
   public static void FormatoTablaProductos(JTable tabla){
       AnchoColumnas(tabla,0,80);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,80);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,80);
       AnchoColumnas(tabla,3,80);  
       AnchoColumnas(tabla,4,80);  
       AnchoColumnas(tabla,5,100);  
       JustificarCelda(tabla,5);
       AnchoColumnas(tabla,6,250);  
       JustificarCelda(tabla,6);
   }
   
   
   //metodo que da formato al JTable de la tabla Transacciones
   public static void FormatoTablaEmpleados(JTable tabla){
       AnchoColumnas(tabla,0,80);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,80);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,80);
       AnchoColumnas(tabla,3,80);  
       AnchoColumnas(tabla,4,80);  
       AnchoColumnas(tabla,5,100);  
       JustificarCelda(tabla,5);
   }
   
   
   //metodo que da formato al JTable de la tabla Transacciones
   public static void FormatoTablaTransacciones(JTable tabla){
       AnchoColumnas(tabla,0,80);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,80);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,80);
       AnchoColumnas(tabla,3,80);  
       AnchoColumnas(tabla,4,80);  
       AnchoColumnas(tabla,5,100);  
       JustificarCelda(tabla,5);
   }
   
   //metodo que da formato al JTable de la tabla Transacciones
   public static void FormatoTablaVentas(JTable tabla){
       AnchoColumnas(tabla,0,80);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,80);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,100);
       AnchoColumnas(tabla,3,150);  
       AnchoColumnas(tabla,4,100);  
       AnchoColumnas(tabla,5,100);  
       JustificarCelda(tabla,5);
       AnchoColumnas(tabla,6,250);  
       JustificarCelda(tabla,6);
       AnchoColumnas(tabla,7,100);  
       JustificarCelda(tabla,7);
       AnchoColumnas(tabla,8,100);  
       JustificarCelda(tabla,8);
   }
   
   
}