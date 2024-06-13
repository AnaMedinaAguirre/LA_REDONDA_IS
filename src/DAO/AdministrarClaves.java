package DAO;

import Formato.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministrarClaves extends ConectarDB {
    
    public String consultaprod = "select p.idproductos from productos p where p.nombre = ?;";
    public String consultaprov = "select pr.idproveedor from proveedores pr where pr.nombrecompania = ?;";
    public String consultacli = "select c.idcliente from clientes c where c.nombresCli = ?;";
    
    public String consulta1 = "select nombresCli from clientes where idcliente = ?;"; // clientes
    public String consulta2 = "select nombre from productos where idproductos = ?;"; // productos
    public String consulta3 = "select nombrecompania from proveedores where idproveedor = ?;"; // proveedores

    public AdministrarClaves() {}

    public String RecuperarNombre(String consulta, int parametro) {
        String nombre = "";
        Connection conexion = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, parametro);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombre = rs.getString(1);
            }
        } catch (SQLException ex) {
            Mensajes.M1("Error no se puede recuperar los nombres......" + ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                Mensajes.M1("Error cerrando recursos......" + ex);
            }
        }
        return nombre;
    }

    public int RecuperarID(String consulta, String parametro) {
        int id = 0;
        Connection conexion = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, parametro);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Mensajes.M1("ERROR no se puede recuperar el ID...." + ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                Mensajes.M1("Error cerrando recursos......" + ex);
            }
        }
        return id;
    }
}
