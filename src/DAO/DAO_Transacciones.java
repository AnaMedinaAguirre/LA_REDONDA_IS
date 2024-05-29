package DAO;

import Formato.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DAO_Transacciones extends ConectarDB{
    
    public DAO_Transacciones(){}
    
    // Método que muestra los datos de la tabla Transacciones en un JTable
    public void MostrarTransacciones(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"Nro", "ID transaccion", "Fecha", "Tipo", "Monto", "Empleado", "Descripción"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Transacciones tran = new Transacciones();
        int cantreg = 0;
        try {
            rs = st.executeQuery("CALL SP_DAO_MostrarTransaccion();");
            while (rs.next()) {
                cantreg++;
                tran.setIdtransaccion(rs.getInt(1));
                tran.setFecha(rs.getDate(2));
                tran.setTipo(rs.getString(3));
                tran.setMonto(rs.getDouble(4));
                tran.setEmpleado(rs.getString(5));
                tran.setDescripcion(rs.getString(6));
                tran.setIndicador(rs.getString(7));
                modelo.addRow(tran.RegistroTransaccion(cantreg));
            }//fin while
            ManejadorTablas.FormatoTablaTransacciones(tabla);
            etiqueta.setText("Cantidad de Registros  : " + cantreg);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se pueden mostrar las transacciones ...." + e);
        }
    }
    
    // Método que inserta una transacción en la tabla Transacciones
    public void InsertarTransaccion(Transacciones tran) {
        try {
            //preparamos la consulta
            ps = conexion.prepareStatement("CALL SP_DAO_InsertarTransaccion(?,?,?,?,?,'S');");
            //actualizando los parametros
            // Convertir java.util.Date a java.sql.Date
            java.util.Date fechaUtil = tran.getFecha();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(1, fechaSql);
            ps.setString(2, tran.getTipo());
            ps.setDouble(3, tran.getMonto());
            ps.setString(4, tran.getEmpleado());
            ps.setString(5, tran.getDescripcion());
            ps.executeUpdate(); //actualizamos la consulta y ejecutamos
            Mensajes.M1("Datos insertados correctamente");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede insertar la transaccion..." + e);
        }
    }
    
    
    //metodo que recupera un registro de la tabla transaccion mediante su id
    public Transacciones ConsultarRegistro(int idtran) {
        Transacciones tran = null;
        try {
            rs = st.executeQuery("CALL SP_DAO_ConsultarTransaccion\"+\"(\"+idtran+\")\"+\";");
            if (rs.next()) {
                tran = new Transacciones();
                tran.setIdtransaccion(rs.getInt(1));
                tran.setFecha(rs.getDate(2));
                tran.setTipo(rs.getString(3));
                tran.setMonto(rs.getDouble(4));
                tran.setEmpleado(rs.getString(5));
                tran.setDescripcion(rs.getString(6));
                tran.setIndicador(rs.getString(7));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede consultar el registro ..." + e);
        }
        return tran;
    }
    
    
    //método que actualiza un registro  de la tabla transaccion por medio de su id
    public void ActualizarRegistro(Transacciones tran) {
        try {
            ps = conexion.prepareStatement("CALL SP_DAO_ActualizarTransaccion(?,?,?,?,?,?,'S');");
            java.util.Date fechaUtil = tran.getFecha();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
            ps.setDate(1, fechaSql);
            ps.setString(2, tran.getTipo());
            ps.setDouble(3, tran.getMonto());
            ps.setString(4, tran.getEmpleado());
            ps.setString(5, tran.getDescripcion());
            ps.setInt(6, tran.getIdtransaccion());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente...");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede actualizar el registro..." + ex);
        }
    }
    
    
    //método que elimina (inhabilita) un registro de la tabla Transacciones
    public void EliminarRegistro(int idtran) {
        try {
            ps = conexion.prepareStatement("CALL SP_DAO_EliminarTransaccion(?);");
            ps.setInt(1, idtran);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado de la tabla Transacciones");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede eliminar el registro.." + ex);
        }
    }
}
