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
        String[] titulos = {"Nro", "ID venta", "Producto", "Cliente", "Fecha", "Cantidad", "Detalle Venta", "Precio Unit.", "Total"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Ventas ven = new Ventas();
        int cantreg = 0;
        try {
            rs = st.executeQuery("select idventas,idproductos,idcliente,fecha,cantidad,detalleVenta,precioUnitario,total,indicador from registrarventas where indicador='S';");
            while (rs.next()) {
                cantreg++;
                ven.setIdVentas(rs.getInt(1));
                ven.setIdproductos(rs.getInt(2));
                ven.setIdcliente(rs.getInt(3));
                ven.setFecha(rs.getDate(4));
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
            ps = conexion.prepareStatement("insert into registrarventas(idproductos,idcliente,fecha,cantidad,detalleVenta,precioUnitario,total,indicador) values (?,?,?,?,?,?,?,'S');");
            //actualizando los parametros
            ps.setInt(1, ven.getIdproductos());
            ps.setInt(2, ven.getIdcliente());
            // Convertir java.util.Date a java.sql.Date
            java.util.Date fechaUtil = ven.getFecha();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(3, fechaSql);
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
    
    
    //metodo que recupera un registro de la tabla registrarventas mediante su id
    public Ventas ConsultarRegistro(int idven) {
        Ventas ven = null;
        try {
            rs = st.executeQuery("select idventas,idproductos,idcliente,fecha,cantidad,detalleVenta,precioUnitario,total,"
                    + "indicador from registrarventas where indicador='S' and idventas=" + idven + ";");
            if (rs.next()) {
                ven = new Ventas();
                ven.setIdVentas(rs.getInt(1));
                ven.setIdproductos(rs.getInt(2));
                ven.setIdcliente(rs.getInt(3));
                ven.setFecha(rs.getDate(4));
                ven.setCantidad(rs.getInt(5));
                ven.setDetalleVenta(rs.getString(6));
                ven.setPrecioUnitario(rs.getDouble(7));
                ven.setTotal(rs.getDouble(8));
                ven.setIndicador(rs.getString(9));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede consultar el registro ..." + e);
        }
        return ven;
    }
    
    
    //método que actualiza un registro  de la tabla registrarventas por medio de su id
    public void ActualizarRegistro(Ventas ven) {
        try {
            ps = conexion.prepareStatement("update registrarventas set idproductos=?,idcliente=?,fecha=?,cantidad=?,detalleVenta=?,precioUnitario=?,total=? where idventas=?;");
            ps.setInt(1, ven.getIdproductos());
            ps.setInt(2, ven.getIdcliente());
            java.util.Date fechaUtil = ven.getFecha();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(3, fechaSql);
            ps.setInt(4, ven.getCantidad());
            ps.setString(5, ven.getDetalleVenta());
            ps.setDouble(6, ven.getPrecioUnitario());
            ps.setDouble(7, ven.getTotal());
            ps.setInt(8, ven.getIdVentas());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente...");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede actualizar el registro..." + ex);
        }
    }
    
    
    //método que elimina (inhabilita) un registro de la tabla registrarventas
    public void EliminarRegistro(int idven) {
        try {
            ps = conexion.prepareStatement("update registrarventas set indicador='N' where idventas=?;");
            ps.setInt(1, idven);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado de la tabla registrarventas");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede eliminar el registro.." + ex);
        }
    }
}
