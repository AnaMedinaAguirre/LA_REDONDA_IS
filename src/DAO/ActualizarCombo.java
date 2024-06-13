package DAO;
//libreria

import Formato.*;
import javax.swing.JComboBox;

public class ActualizarCombo extends ConectarDB {

    public String consultaprov = "select pr.nombrecompania"
            + " from proveedores pr"
            + " where pr.indicador='S'"
            + " order by 1;";
    public String consultaprod = "select p.nombre"
            + " from productos p"
            + " where p.indicador='S'"
            + " order by 1;";
    public String consultacli = "select c.nombresCli"
            + " from clientes c"
            + " where c.indicador='S'"
            + " order by 1;";

    public ActualizarCombo() {
    }

    //metodo que recibe un combobox y una consulta y muestra los datos en el combo
    public void CargarDatos(JComboBox combo, String consulta) {
        try {
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                combo.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede cargar combo..." + ex);
        }
    }

}//fin class
