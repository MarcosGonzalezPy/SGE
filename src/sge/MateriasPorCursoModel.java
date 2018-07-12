/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Modelo de Curso 
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

public class MateriasPorCursoModel extends AbstractListModel implements ComboBoxModel {

    ArrayList cursos = new ArrayList();
    Connection conn;
    Conexion c;
    Statement stmt;

    public MateriasPorCursoModel(int curso) {

        ResultSet rs = null;

        try {
            String SQL = "select distinct mate_descripcion from materia A inner join detallecurso B on a.mate_codigo = b.mate_codigo where b.curs_codigo = " + curso;

            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();

            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            while (rs.next()) {
                cursos.add(rs.getString("mate_descripcion"));
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