/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Modelo Total de Cursos 
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

public class ModelTotalCursos extends AbstractListModel implements ComboBoxModel {

    ArrayList cursos = new ArrayList();
    Connection conn;
    Conexion c;
    Statement stmt;

    public ModelTotalCursos() {

        ResultSet rs = null;

        try {
            String SQL = "select distinct curs_descripcion from curso";

            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();

            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            while (rs.next()) {
                cursos.add(rs.getString("curs_descripcion"));
            }
            snt.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    String selection = "Seleccionar...";

    public Object getElementAt(int index) {
        return cursos.get(index);
    }

    public int getSize() {
        return cursos.size();
    }

    public void setSelectedItem(Object anItem) {
        selection = (String) anItem; 
    } 

    public Object getSelectedItem() {
        return selection;
    }
}
