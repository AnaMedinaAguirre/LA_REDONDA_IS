package DAO;

import Formato.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DAO_Proveedores extends ConectarDB{
    
    public DAO_Proveedores(){}
    
    // Método que muestra los datos de la tabla proveedores en un JTable
    public void MostrarProveedores(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"Nro", "ID Proveedores", "Nombre Compañía", "Nombre Contacto", "Cargo Contacto", "Dirección", "Teléfono", "Pág. Web"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Proveedores prov = new Proveedores();
        int cantreg = 0;
        try {
            rs = st.executeQuery("select idproveedor,nombrecompania,nombrecontacto,cargocontacto,direccion,telefono,paginaweb,indicador "
                    + "from proveedores where indicador='S';");
            while (rs.next()) {
                cantreg++;
                prov.setIdproveedor(rs.getInt(1));
                prov.setNombrecompania(rs.getString(2));
                prov.setNombrecontacto(rs.getString(3));
                prov.setCargocontacto(rs.getString(4));
                prov.setDireccion(rs.getString(5));
                prov.setTelefono(rs.getString(6));
                prov.setPaginaweb(rs.getString(7));                
                prov.setIndicador(rs.getString(8));
                modelo.addRow(prov.RegistrarProveedores(cantreg));
            }//fin while
            //ManejadorTablas.FormatoTablaEmpleados(tabla);
            etiqueta.setText("Cantidad de Registros  : " + cantreg);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se pueden mostrar los proveedores ...." + e);
        }
    }
    
    // Método que inserta un proveedor en la tabla proveedores
    public void InsertarProveedores(Proveedores prov) {
        try {
            //preparamos la consulta
            ps = conexion.prepareStatement("insert into proveedores(nombrecompania,nombrecontacto,cargocontacto,direccion,telefono,paginaweb,indicador) "
                    + "values (?,?,?,?,?,?,'S');");
            //actualizando los parametros
            ps.setString(1, prov.getNombrecompania());
            ps.setString(2, prov.getNombrecontacto());
            ps.setString(3, prov.getCargocontacto());
            ps.setString(4, prov.getDireccion());
            ps.setString(5, prov.getTelefono());
            ps.setString(6, prov.getPaginaweb());
            ps.executeUpdate(); //actualizamos la consulta y ejecutamos
            Mensajes.M1("Datos insertados correctamente");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede insertar el proveedor..." + e);
        }
    }
    
    
    //metodo que recupera un registro de la tabla proveedores mediante su id
    public Proveedores ConsultarRegistro(int idprov) {
        Proveedores prov = null;
        try {
            rs = st.executeQuery("select idproveedor,nombrecompania,nombrecontacto,cargocontacto,direccion,telefono,paginaweb,"
                    + "indicador from proveedores where indicador='S' and idproveedor=" + idprov + ";");
            if (rs.next()) {
                prov = new Proveedores();
                prov.setIdproveedor(rs.getInt(1));
                prov.setNombrecompania(rs.getString(2));
                prov.setNombrecontacto(rs.getString(3));
                prov.setCargocontacto(rs.getString(4));
                prov.setDireccion(rs.getString(5));
                prov.setTelefono(rs.getString(6));
                prov.setPaginaweb(rs.getString(7));                
                prov.setIndicador(rs.getString(8));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede consultar el registro ..." + e);
        }
        return prov;
    }
    
    
    //método que actualiza un registro  de la tabla proveedores por medio de su id
    public void ActualizarRegistro(Proveedores prov) {
        try {
            ps = conexion.prepareStatement("update proveedores set nombrecompania=?,nombrecontacto=?,cargocontacto=?,direccion=?,telefono=?,paginaweb=? where idproveedor=?;");
            ps.setString(1, prov.getNombrecompania());
            ps.setString(2, prov.getNombrecontacto());
            ps.setString(3, prov.getCargocontacto());
            ps.setString(4, prov.getDireccion());
            ps.setString(5, prov.getTelefono());
            ps.setString(6, prov.getPaginaweb());
            ps.setInt(7, prov.getIdproveedor());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente...");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede actualizar el registro..." + ex);
        }
    }
    
    
    //método que elimina (inhabilita) un registro de la tabla proveedores
    public void EliminarRegistro(int idprov) {
        try {
            ps = conexion.prepareStatement("update proveedores set indicador='N' where idproveedor=?;");
            ps.setInt(1, idprov);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado de la tabla proveedores");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR no se puede eliminar el registro.." + ex);
        }
    }
}
