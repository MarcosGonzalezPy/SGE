/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Modelo de Cargo 
 * Autor: Marcos Gonzalez
 */
package sge;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class CargoComboBoxModel extends AbstractListModel implements ComboBoxModel {

    ArrayList cargo = new ArrayList();
    Connection conn;
    Conexion c;
    Statement stmt;

    public CargoComboBoxModel() {

        ResultSet rs = null;
        try {
            String SQL = "SELECT carg_descripcion FROM cargo";

            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();

            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            while (rs.next()) {
                cargo.add(rs.getString("carg_descripcion"));
            }
            snt.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    String selection = "Seleccionar...";

    public Object getElementAt(int index) {
        return cargo.get(index);
    }

    public int getSize() {
        return cargo.size();
    }

    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;
    }

    public Object getSelectedItem() {
        return selection;
    }
}
