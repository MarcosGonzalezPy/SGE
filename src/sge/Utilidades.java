/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Utilidades 
 * Autor: Marcos Gonzalez
 */
package sge;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Utilidades {

    public static Icon obtenerIcono() {
        ImageIcon image = new ImageIcon("C://Users/Home/Documents/NetBeansProjects/SGEV2/src/sgev2/graficos/par.ico");
        return image;
    }

    public static void invocarError(String titulo, String mensaje) {
        javax.swing.JDialog dialogoError;
        javax.swing.JLabel errorLabel;
        javax.swing.JButton okError;

        errorLabel = new javax.swing.JLabel();
        dialogoError = new javax.swing.JDialog();
        okError = new javax.swing.JButton();
        okError.setText("Ok");

        dialogoError.setVisible(true);
        dialogoError.setBackground(Color.white);
        dialogoError.setBounds(350, 300, 650, 150);
        errorLabel.setBounds(10, 10, 500, 100);
        dialogoError.setTitle(titulo);
        errorLabel.setText(mensaje);
        dialogoError.add(errorLabel);
    }

    public static String sysDate() {
        Date fecha1 = new Date();
        Calendar cal1 = Calendar.getInstance();
        String sysDate = cal1.get(Calendar.YEAR) + "/" + (1 + cal1.get(Calendar.MONTH))
                + "/" + cal1.get(Calendar.DATE);
        return sysDate;
    }
}
