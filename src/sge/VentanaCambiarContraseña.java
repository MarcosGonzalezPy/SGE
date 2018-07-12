/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Cambiar la Contraseña
 * Autor: Marcos Gonzalez
 */ 
package sge;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JInternalFrame;

public class VentanaCambiarContraseña extends javax.swing.JInternalFrame {

    private String parametroCedula;

    Connection conn;
    Conexion c;
    Statement stmt;

    VentanaCambiarContraseña(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaCambiarContraseña(String cedula) {
        initComponents();
        parametroCedula = cedula;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelParaConsultas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passViejo = new javax.swing.JPasswordField();
        PassNuevo1 = new javax.swing.JPasswordField();
        PassNuevo2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setName("Consultas"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setText("Antigua Contraseña:");

        jLabel3.setText("Nueva Contraseña: ");

        jLabel4.setText("Repita Nueva contraseña: ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/guardar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelParaConsultasLayout = new javax.swing.GroupLayout(PanelParaConsultas);
        PanelParaConsultas.setLayout(PanelParaConsultasLayout);
        PanelParaConsultasLayout.setHorizontalGroup(
            PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelParaConsultasLayout.createSequentialGroup()
                .addGroup(PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelParaConsultasLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PassNuevo2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(PassNuevo1)
                            .addComponent(passViejo)))
                    .addGroup(PanelParaConsultasLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton1)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        PanelParaConsultasLayout.setVerticalGroup(
            PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelParaConsultasLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passViejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PassNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PassNuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelParaConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
            .addComponent(PanelParaConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = null;
        try {
            conn = sge.Conexion.ObtenerConexion();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Contrasena");
            String password = "";
            while (rs.next()) {
                if (rs.getString("cont_cedula").equals(parametroCedula)) {
                    password = rs.getString("cont_password");
                }
            }
            char PassArray[] = passViejo.getPassword();
            String contViejo = new String(PassArray);
            char PassArray2[] = PassNuevo1.getPassword();
            String contNuevo1 = new String(PassArray2);
            char PassArray3[] = PassNuevo2.getPassword();
            String contNuevo2 = new String(PassArray3);
            if (contViejo.equals(password)) {
                if (contNuevo1.equals(contNuevo2)) {
                    String cadena = "UPDATE  \"contrasena\" SET cont_password='" + contNuevo1 + "' where cont_cedula = " + parametroCedula;
                    conn = sge.Conexion.ObtenerConexion();
                    Statement stmt2 = conn.createStatement();
                    System.out.println("HOLA");
                    try {
                        ResultSet rs2 = stmt2.executeQuery(cadena);
                    } catch (Exception e) {
                        System.out.println("Error al ejecutar update: " + e);
                    }
                    PassNuevo1.setText("");
                    PassNuevo2.setText("");
                    passViejo.setText("");
                } else {
                    Utilidades.invocarError("Error al Ingresar contraseña", "La contraseña nueva y la confirmacion deben ser iguales");
                }
            } else {
                Utilidades.invocarError("Error al Ingresar contraseña", "La contraseña ingresada no es correcta" + password);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelParaConsultas;
    private javax.swing.JPasswordField PassNuevo1;
    private javax.swing.JPasswordField PassNuevo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passViejo;
    // End of variables declaration//GEN-END:variables
}
