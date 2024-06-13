package DAO;

import Formato.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DAO_Productos extends ConectarDB{
    
    public DAO_Productos(){}
    
    // Método que muestra los datos de la tabla productos en un JTable
    public void MostrarProductos(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"Nro", "ID Productos", "Nombre de Producto", "Proveedor", "Descripcion", "Fecha Vencimiento", "Precio", "Stock"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Productos prod = new Productos();
        int cantreg = 0;
        try {
            rs = st.executeQuery("select idproductos,nombre,idproveedor,descripcion,fechavencimiento,precio,stock,indicador "
                    + "from productos where indicador='S';");
            while (rs.next()) {
                cantreg++;
                prod.setIdproductos(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setIdproveedor(rs.getInt(3));
                prod.setDescripcion(rs.getString(4));
                prod.setFechaven(rs.getDate(5));
                prod.setPrecio(rs.getDouble(6));
                prod.setStock(rs.getInt(7));
                prod.setIndicador(rs.getString(8));
                modelo.addRow(prod.RegistrarProductos(cantreg));
            }//fin while
            ManejadorTablas.FormatoTablaProductos(tabla);
            etiqueta.setText("Cantidad de Registros  : " + cantreg);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se pueden mostrar los productos ...." + e);
        }
    }
    
    // Método que inserta una transacción en la tabla productos
    public void InsertarProductos(Productos prod) {
        try {
            //preparamos la consulta
            ps = conexion.prepareStatement("insert into productos(nombre,idproveedor,descripcion,fechavencimiento,precio,stock,indicador) "
                    + "values (?,?,?,?,?,?,'S');");
            //actualizando los parametros
            ps.setString(1, prod.getNombre());
            ps.setInt(2, prod.getIdproveedor());
            ps.setString(3, prod.getDescripcion());
            // Convertir java.util.Date a java.sql.Date
            java.util.Date fechaUtil = prod.getFechaven();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(4, fechaSql);
            ps.setDouble(5, prod.getPrecio());
            ps.setInt(6, prod.getStock());
            ps.executeUpdate(); //actualizamos la consulta y ejecutamos
            Mensajes.M1("Datos insertados correctamente");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede insertar el producto..." + e);
        }
    }
    
    
    //metodo que recupera un registro de la tabla productos mediante su id
    public Productos ConsultarRegistro(int idprod) {
        Productos prod = null;
        try {
            rs = st.executeQuery("select idproductos,nombre,idproveedor,descripcion,fechavencimiento,precio,stock,"
                    + "indicador from productos where indicador='S' and idproductos=" + idprod + ";");
            if (rs.next()) {
                prod = new Productos();
                prod.setIdproductos(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setIdproveedor(rs.getInt(3));
                prod.setDescripcion(rs.getString(4));
                prod.setFechaven(rs.getDate(5));
                prod.setPrecio(rs.getDouble(6));
                prod.setStock(rs.getInt(7));
                prod.setIndicador(rs.getString(8));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede consultar el registro ..." + e);
        }
        return prod;
    }
    
    
    //método que actualiza un registro  de la tabla productos por medio de su id
    public void ActualizarRegistro(Productos prod) {
        try {
            ps = conexion.prepareStatement("update productos set nombre=?,idproveedor=?,descripcion=?,fechavencimiento=?,precio=?,stock=? where idproductos=?;");
            ps.setString(1, prod.getNombre());
            ps.setInt(2, prod.getIdproveedor());
            ps.setString(3, prod.getDescripcion());
            java.util.Date fechaUtil = prod.getFechaven();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(4, fechaSql);
            ps.setDouble(5, prod.getPrecio());
            ps.setInt(6, prod.getStock());
            ps.setInt(7, prod.getIdproductos());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente...");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede actualizar el registro..." + ex);
        }
    }
    
    
    //método que elimina (inhabilita) un registro de la tabla productos
    public void EliminarRegistro(int idprod) {
        try {
            ps = conexion.prepareStatement("update productos set indicador='N' where idproductos=?;");
            ps.setInt(1, idprod);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado de la tabla productos");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede eliminar el registro.." + ex);
        }
    }
}
