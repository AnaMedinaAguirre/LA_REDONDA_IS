package DAO;

import Formato.*;
import Modelo.Ventas;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DAO_Venta extends ConectarDB{
    
    public DAO_Venta(){}
    
    // Método que muestra los datos de la tabla registrarventas en un JTable
    public void MostrarVentas(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"Nro", "ID venta", "Fecha", "Producto", "Cliente", "Cantidad", "Detalle Venta", "Precio Unit.", "Total"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Ventas ven = new Ventas();
        int cantreg = 0;
        try {
            rs = st.executeQuery("select idventas,fecha,producto,cliente,cantidad,detalleVenta,precioUnitario,total,indicador from registrarventas where indicador='S';");
            while (rs.next()) {
                cantreg++;
                ven.setIdVentas(rs.getInt(1));
                ven.setFecha(rs.getDate(2));
                ven.setProducto(rs.getString(3));
                ven.setCliente(rs.getString(4));
                ven.setCantidad(rs.getInt(5));
                ven.setDetalleVenta(rs.getString(6));
                ven.setPrecioUnitario(rs.getDouble(7));
                ven.setTotal(rs.getDouble(8));
                ven.setIndicador(rs.getString(9));
                //modelo.addRow(ven.RegistroVenta(cantreg));
                // Asegurarse de que el array de datos tenga exactamente 9 elementos
                Object[] fila = ven.RegistroVenta(cantreg);
                if (fila.length == 9) {
                    modelo.addRow(fila);
                } else {
                    Mensajes.M1("ERROR: La fila de datos no tiene 9 elementos: " + Arrays.toString(fila));
                }
            }//fin while
            ManejadorTablas.FormatoTablaVentas(tabla);
            etiqueta.setText("Cantidad de Registros  : " + cantreg);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se pueden mostrar las ventas ...." + e);
        }
    }
    
    // Método que inserta una venta en la tabla registrarventas
    public void InsertarVentas(Ventas ven) {
        try {
            //preparamos la consulta
            ps = conexion.prepareStatement("insert into registrarventas(fecha,producto,cliente,cantidad,detalleVenta,precioUnitario,total,indicador) values (?,?,?,?,?,?,?,'S');");
            //actualizando los parametros
            // Convertir java.util.Date a java.sql.Date
            java.util.Date fechaUtil = ven.getFecha();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(1, fechaSql);
            ps.setString(2, ven.getProducto());
            ps.setString(3, ven.getCliente());
            ps.setInt(4, ven.getCantidad());
            ps.setString(5, ven.getDetalleVenta());
            ps.setDouble(6, ven.getPrecioUnitario());
            ps.setDouble(7, ven.getTotal());
            ps.executeUpdate(); //actualizamos la consulta y ejecutamos
            Mensajes.M1("Datos insertados correctamente");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede insertar la venta..." + e);
        }
    }
}
