/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package sge;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JInternalFrame;
import static sge.Utilidades.obtenerIcono;

/**
 *
 * @author Home
 */
public class VentanaConsultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Blanco
     */
    public VentanaConsultas() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PanelParaConsultas = new javax.swing.JPanel();

        setClosable(true);
        setResizable(true);
        setName("Consultas"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Seleccione:");

        jButton1.setText("Alumno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Docente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Administrativo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calificaciones");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelParaConsultasLayout = new javax.swing.GroupLayout(PanelParaConsultas);
        PanelParaConsultas.setLayout(PanelParaConsultasLayout);
        PanelParaConsultasLayout.setHorizontalGroup(
            PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        PanelParaConsultasLayout.setVerticalGroup(
            PanelParaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelParaConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(290, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Component[] d = PanelParaConsultas.getComponents();
        for (int index = 0; index < d.length; index++) {
            System.out.println(d[index].getName());
            if (!(d[index].getName() == "tuComponet")) {
                PanelParaConsultas.remove(d[index]);
            }
        }

        VentanaConsultaAlumno panelConsultas = new VentanaConsultaAlumno();
        PanelParaConsultas.add(panelConsultas);
        panelConsultas.setVisible(true);
        Icon imagen = obtenerIcono();
        panelConsultas.setFrameIcon(imagen);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Component[] d = PanelParaConsultas.getComponents();
        for (int index = 0; index < d.length; index++) {
            System.out.println(d[index].getName());
            if (!(d[index].getName() == "tuComponet")) {
                PanelParaConsultas.remove(d[index]);
            }
        }

        VentanaConsultaDocente panelConsultasDocente = new VentanaConsultaDocente();
        PanelParaConsultas.add(panelConsultasDocente);
        panelConsultasDocente.setVisible(true);
        Icon imagen = obtenerIcono();
        panelConsultasDocente.setFrameIcon(imagen);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Component[] d = PanelParaConsultas.getComponents();
        for (int index = 0; index < d.length; index++) {
            System.out.println(d[index].getName());
            if (!(d[index].getName() == "tuComponet")) {
                PanelParaConsultas.remove(d[index]);
            }
        }

        VentanaConsultaAdministrativo panelConsultasAdministrativo = new VentanaConsultaAdministrativo();
        PanelParaConsultas.add(panelConsultasAdministrativo);
        panelConsultasAdministrativo.setVisible(true);
        Icon imagen = obtenerIcono();
        panelConsultasAdministrativo.setFrameIcon(imagen);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        Component[] d = PanelParaConsultas.getComponents();
        for (int index = 0; index < d.length; index++) {
            System.out.println(d[index].getName());
            if (!(d[index].getName() == "tuComponet")) {
                PanelParaConsultas.remove(d[index]);
            }
        }
        VentanaConsultasNota ventanaConsultasNota = new VentanaConsultasNota();
        PanelParaConsultas.add(ventanaConsultasNota);
        ventanaConsultasNota.setVisible(true);
        Icon imagen = obtenerIcono();
        ventanaConsultasNota.setFrameIcon(imagen);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelParaConsultas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
