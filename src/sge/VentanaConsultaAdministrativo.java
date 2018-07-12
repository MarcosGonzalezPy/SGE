/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana para consultar Personal Administrativo 
 * Autor: Marcos Gonzalez
 */
package sge;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VentanaConsultaAdministrativo extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    Connection conn;
    Conexion c;
    Statement stmt;

    VentanaConsultaAdministrativo(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaConsultaAdministrativo() {
        initComponents();
        ConfiGrilla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        SelectorAdministrativo = new javax.swing.JComboBox();
        datoCargado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar personal Administrativo por:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setAutoscrolls(true);

        grilla.setModel(modelo);
        grilla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        grilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(grilla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        SelectorAdministrativo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Apellido", "Cedula" }));
        SelectorAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorAdministrativoActionPerformed(evt);
            }
        });

        datoCargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoCargadoActionPerformed(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SelectorAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datoCargado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectorAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoCargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String seleccionReal = null;
        String seleccion = (String) SelectorAdministrativo.getSelectedItem();
        if (seleccion.equals("Nombre")) {
            seleccionReal = "admi_nombre";
        }
        if (seleccion.equals("Apellido")) {
            seleccionReal = "admi_apellido";
        }
        if (seleccion.equals("Cedula")) {
            seleccionReal = "admi_cedula";
        }
        if (!datoCargado.getText().trim().equals("")) {
            limpiarGrillaBuscador();
            CargaGrillaB(seleccionReal);
        } else {
            Utilidades.invocarError("Error de Consulta", " Debe ingresar algun valor en el buscador");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datoCargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCargadoActionPerformed
 
    }//GEN-LAST:event_datoCargadoActionPerformed

    private void SelectorAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorAdministrativoActionPerformed
        
    }//GEN-LAST:event_SelectorAdministrativoActionPerformed

    private void grillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaKeyPressed
        
    }//GEN-LAST:event_grillaKeyPressed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        
    }//GEN-LAST:event_grillaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SelectorAdministrativo;
    private javax.swing.JTextField datoCargado;
    private javax.swing.JTable grilla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void CargaGrillaB(String seleccionReal) {
        String SQL = null;
        try {
            if (!seleccionReal.equals("admi_cedula")) {
                String nombrebuscador = ("'%" + datoCargado.getText().trim().toUpperCase() + "%';");
                SQL = "SELECT admi_nombre, admi_cedula, admi_apellido, admi_direccion,"
                        + "admi_telefono, admi_celular, admi_email, carg_codigo "
                        + "FROM administrativo WHERE " + seleccionReal + " LIKE " + nombrebuscador;
            } else {
                String nombrebuscador = (datoCargado.getText().trim());
                SQL = "SELECT admi_nombre, admi_cedula, admi_apellido, admi_direccion,"
                        + "admi_telefono, admi_celular, admi_email, carg_codigo "
                        + "FROM administrativo WHERE " + seleccionReal + " = " + nombrebuscador;
            }
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String[] datos = new String[8];
            while (rs.next()) {
                datos[0] = rs.getString("admi_cedula");
                datos[1] = rs.getString("admi_nombre");
                datos[2] = rs.getString("admi_apellido");
                datos[3] = rs.getString("admi_direccion");
                datos[4] = rs.getString("admi_telefono");
                datos[5] = rs.getString("admi_celular");
                datos[6] = rs.getString("admi_email");
                datos[7] = rs.getString("carg_codigo");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConsultaAdministrativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiarGrillaBuscador() { 
        int cf = grilla.getRowCount();
        for (int i = 0; i < cf; i++) {
            modelo.removeRow(0);
        }
    }

    private void ConfiGrilla() { 
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Celular");
        modelo.addColumn("Correo");
        modelo.addColumn("Cargo");
        grilla.getColumnModel().getColumn(0).setPreferredWidth(75);
        grilla.getColumnModel().getColumn(1).setPreferredWidth(125);
        grilla.getColumnModel().getColumn(2).setPreferredWidth(125);
        grilla.getColumnModel().getColumn(3).setPreferredWidth(200);
        grilla.getColumnModel().getColumn(4).setPreferredWidth(100);
        grilla.getColumnModel().getColumn(5).setPreferredWidth(100);
        grilla.getColumnModel().getColumn(6).setPreferredWidth(175);
        grilla.getColumnModel().getColumn(7).setPreferredWidth(600);
    }
}
