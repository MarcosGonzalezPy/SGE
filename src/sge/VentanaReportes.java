/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana Principal de Reportes 
 * Autor: Marcos Gonzalez
 */
package sge;

import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static sge.Utilidades.obtenerIcono;

public class VentanaReportes extends javax.swing.JInternalFrame {

    public VentanaReportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelParaConsultas = new javax.swing.JPanel();
        botonAlumno = new javax.swing.JButton();
        botonDocente = new javax.swing.JButton();
        botonAdministrativo = new javax.swing.JButton();
        botonMaterias = new javax.swing.JButton();
        botonCurso = new javax.swing.JButton();
        botonNota = new javax.swing.JButton();
        botonCargo = new javax.swing.JButton();
        botonCaja = new javax.swing.JButton();
        botonPromedio = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setName("Consultas"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Seleccione:");

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

        botonAlumno.setText("Alumno");
        botonAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlumnoActionPerformed(evt);
            }
        });

        botonDocente.setText("Docente");
        botonDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDocenteActionPerformed(evt);
            }
        });

        botonAdministrativo.setText("Administrativo");
        botonAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrativoActionPerformed(evt);
            }
        });

        botonMaterias.setText("Materias");
        botonMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMateriasActionPerformed(evt);
            }
        });

        botonCurso.setText("Cursos");
        botonCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCursoActionPerformed(evt);
            }
        });

        botonNota.setText("Notas");
        botonNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNotaActionPerformed(evt);
            }
        });

        botonCargo.setText("Cargos");
        botonCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargoActionPerformed(evt);
            }
        });

        botonCaja.setText("Caja");
        botonCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCajaActionPerformed(evt);
            }
        });

        botonPromedio.setText("Promedio");
        botonPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPromedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAdministrativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelParaConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAdministrativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPromedio)
                .addContainerGap(157, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlumnoActionPerformed
        limpiarPanel();
        VentanaReportesAlumno ventanaReportesAlumno = new VentanaReportesAlumno();
        PanelParaConsultas.add(ventanaReportesAlumno);
        ventanaReportesAlumno.setVisible(true);
        Icon imagen = obtenerIcono();
        ventanaReportesAlumno.setFrameIcon(imagen);
    }//GEN-LAST:event_botonAlumnoActionPerformed

    private void botonAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrativoActionPerformed
        limpiarPanel();
        try {
            Connection miconexion = null;
            try {
                miconexion = Conexion.ObtenerConexion();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            JasperReport reporte = JasperCompileManager.compileReport("c:\\Reportes\\ReporteAdministrativo.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, miconexion);
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte" + e);
        }
    }//GEN-LAST:event_botonAdministrativoActionPerformed

    private void botonMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMateriasActionPerformed
        limpiarPanel();
        try {
            Connection miconexion = null;
            try {
                miconexion = Conexion.ObtenerConexion();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            JasperReport reporte = JasperCompileManager.compileReport("c:\\Reportes\\ReporteMateria.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, miconexion);
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte" + e);
        }
    }//GEN-LAST:event_botonMateriasActionPerformed

    private void botonCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargoActionPerformed
        limpiarPanel();
                try {
            Connection miconexion = null;
            try {
                miconexion = Conexion.ObtenerConexion();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            JasperReport reporte = JasperCompileManager.compileReport("c:\\Reportes\\ReporteCargo.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, miconexion);
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte" + e);
        }
        
    }//GEN-LAST:event_botonCargoActionPerformed

    private void botonDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDocenteActionPerformed
        limpiarPanel();
        try {
            Connection miconexion = null;
            try {
                miconexion = Conexion.ObtenerConexion();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            JasperReport reporte = JasperCompileManager.compileReport("c:\\Reportes\\ReporteDocente.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, miconexion);
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte" + e);
        }
    }//GEN-LAST:event_botonDocenteActionPerformed

    private void botonCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCursoActionPerformed
        limpiarPanel();
        try {
            Connection miconexion = null;
            try {
                miconexion = Conexion.ObtenerConexion();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            JasperReport reporte = JasperCompileManager.compileReport("c:\\Reportes\\ReporteCurso.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, miconexion);
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte" + e);
        }
    }//GEN-LAST:event_botonCursoActionPerformed

    private void botonNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNotaActionPerformed
        limpiarPanel();
        try {
            Connection miconexion = null;
            try {
                miconexion = Conexion.ObtenerConexion();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            JasperReport reporte = (JasperReport) JRLoader.loadObject("c:\\Reportes\\ReporteNota.jasper");

            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro, miconexion);
            JasperViewer visor = new JasperViewer(print, false);
            visor.setLocationRelativeTo(null);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte" + e);
        }
    }//GEN-LAST:event_botonNotaActionPerformed

    private void botonCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCajaActionPerformed
        limpiarPanel();
        VentanaReportesCaja ventanaReportesCaja = new VentanaReportesCaja();
        PanelParaConsultas.add(ventanaReportesCaja);
        ventanaReportesCaja.setVisible(true);
        Icon imagen = obtenerIcono();
        ventanaReportesCaja.setFrameIcon(imagen);
    }//GEN-LAST:event_botonCajaActionPerformed

    private void botonPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPromedioActionPerformed
        // TODO add your handling code here:
                limpiarPanel();
        try {
            Connection miconexion = null;
            try {
                miconexion = Conexion.ObtenerConexion();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            JasperReport reporte = (JasperReport) JRLoader.loadObject("c:\\Reportes\\ReportePromedio.jasper");

            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro, miconexion);
            JasperViewer visor = new JasperViewer(print, false);
            visor.setLocationRelativeTo(null);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte" + e);
        }
    }//GEN-LAST:event_botonPromedioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelParaConsultas;
    private javax.swing.JButton botonAdministrativo;
    private javax.swing.JButton botonAlumno;
    private javax.swing.JButton botonCaja;
    private javax.swing.JButton botonCargo;
    private javax.swing.JButton botonCurso;
    private javax.swing.JButton botonDocente;
    private javax.swing.JButton botonMaterias;
    private javax.swing.JButton botonNota;
    private javax.swing.JButton botonPromedio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void limpiarPanel() {
        Component[] d = PanelParaConsultas.getComponents();
        for (int index = 0; index < d.length; index++) {
            System.out.println(d[index].getName());
            if (!(d[index].getName() == "tuComponet")) {
                PanelParaConsultas.remove(d[index]);
            }
        }
    }
}
