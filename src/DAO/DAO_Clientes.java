package DAO;

import Formato.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DAO_Clientes extends ConectarDB{
    
    public DAO_Clientes(){}
    
    // Método que muestra los datos de la tabla clientes en un JTable
    public void MostrarClientes(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"Nro", "ID Clientes", "Nombres", "Género", "Teléfono", "Correo", "Direccion"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Clientes cli = new Clientes();
        int cantreg = 0;
        try {
            rs = st.executeQuery("select idcliente,nombresCli,genero,telefono,correo,direccion,indicador "
                    + "from clientes where indicador='S';");
            while (rs.next()) {
                cantreg++;
                cli.setIdcliente(rs.getInt(1));
                cli.setNombres(rs.getString(2));
                cli.setGenero(rs.getString(3));
                cli.setTelefono(rs.getString(4));
                cli.setCorreo(rs.getString(5));
                cli.setDireccion(rs.getString(6));                
                cli.setIndicador(rs.getString(7));
                modelo.addRow(cli.RegistrarClientes(cantreg));
            }//fin while
            //ManejadorTablas.FormatoTablaClientes(tabla);
            etiqueta.setText("Cantidad de Registros  : " + cantreg);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se pueden mostrar los clientes ...." + e);
        }
    }
    
    // Método que inserta un cliente en la tabla clientes
    public void InsertarClientes(Clientes cli) {
        try {
            //preparamos la consulta
            ps = conexion.prepareStatement("insert into clientes (nombresCli,genero,telefono,correo,direccion,indicador) "
                    + "values (?,?,?,?,?,'S');");
            //actualizando los parametros
            ps.setString(1, cli.getNombres());
            ps.setString(2, cli.getGenero());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getCorreo());
            ps.setString(5, cli.getDireccion());
            ps.executeUpdate(); //actualizamos la consulta y ejecutamos
            Mensajes.M1("Datos insertados correctamente");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede insertar el cliente..." + e);
        }
    }
    
    
    //metodo que recupera un registro de la tabla clientes mediante su id
    public Clientes ConsultarRegistro(int idcli) {
        Clientes cli = null;
        try {
            rs = st.executeQuery("select idcliente,nombresCli,genero,telefono,correo,direccion,"
                    + "indicador from clientes where indicador='S' and idcliente=" + idcli + ";");
            if (rs.next()) {
                cli = new Clientes();
                cli.setIdcliente(rs.getInt(1));
                cli.setNombres(rs.getString(2));
                cli.setGenero(rs.getString(3));
                cli.setTelefono(rs.getString(4));
                cli.setCorreo(rs.getString(5));
                cli.setDireccion(rs.getString(6));                
                cli.setIndicador(rs.getString(7));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede consultar el registro ..." + e);
        }
        return cli;
    }
    
    
    //método que actualiza un registro  de la tabla clientes por medio de su id
    public void ActualizarRegistro(Clientes cli) {
        try {
            ps = conexion.prepareStatement("update clientes set nombresCli=?,genero=?,telefono=?,correo=?,direccion=? where idcliente=?;");
            ps.setString(1, cli.getNombres());
            ps.setString(2, cli.getGenero());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getCorreo());
            ps.setString(5, cli.getDireccion());
            ps.setInt(6, cli.getIdcliente());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente...");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede actualizar el registro..." + ex);
        }
    }
    
    
    //método que elimina (inhabilita) un registro de la tabla clientes
    public void EliminarRegistro(int idcli) {
        try {
            ps = conexion.prepareStatement("update clientes set indicador='N' where idcliente=?;");
            ps.setInt(1, idcli);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado de la tabla clientes");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede eliminar el registro.." + ex);
        }
    }
}
