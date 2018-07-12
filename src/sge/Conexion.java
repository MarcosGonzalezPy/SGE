/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Conexion a la BD 
 * Autor: Marcos Gonzalez
 */

package sge;

import java.sql.*;

public class Conexion {

    public static Connection ObtenerConexion()throws SQLException{
        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/DBSGE";
        String user="postgres";
        String password="123456789";
        Connection con= null;
        
       try{
            Class.forName(driver);
            con=DriverManager.getConnection(connectString, user, password);
        }catch (Exception e){
            System.out.print("Error al cargar la base de datos: "+ e.getMessage()+"\n");
        }
        return con;
    }
}
