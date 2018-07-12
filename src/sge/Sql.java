/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana Principal del Sistema 
 * Autor: Marcos Gonzalez
 */

package sge;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {

    Conexion c;
    Statement stmt;

    Sql(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public String obtener(String cadena, String input, int cedula) throws SQLException {

        String resultado = "ERROR";
        ResultSet rs = stmt.executeQuery(cadena);
        while (rs.next()) {
            resultado = rs.getString("input") + " " + rs.getString("doce_apellido");
        }
        return resultado;
    }
}
