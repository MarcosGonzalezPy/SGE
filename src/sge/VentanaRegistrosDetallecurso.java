/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana para el Registro de Detalles de Cursos
 * Autor: Marcos Gonzalez
 */
package sge;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sge.Utilidades.invocarError;

public class VentanaRegistrosDetallecurso extends javax.swing.JInternalFrame {

    Connection conn;
    Conexion c;
    Statement stmt;
    String valorCodigo;

    VentanaRegistrosDetallecurso(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaRegistrosDetallecurso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxCurso = new javax.swing.JComboBox();
        comboBoxMateria = new javax.swing.JComboBox();
        textoCodigo = new javax.swing.JTextField();
        textCurso = new javax.swing.JLabel();
        textoMateria = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Registrar Detalle Curso");

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/suma1.png"))); // NOI18N
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/buscar.jpg"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/basurero.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel13.setText("Agregar");

        jLabel14.setText("Consultar");

        jLabel16.setText("Eliminar");

        jLabel3.setText("Codigo: ");

        comboBoxCurso.setModel(new ModelTotalCursos());
        comboBoxCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCursoItemStateChanged(evt);
            }
        });

        comboBoxMateria.setModel(new ModelTotalMaterias());
        comboBoxMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMateriaItemStateChanged(evt);
            }
        });

        textCurso.setText(" ");

        textoMateria.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addComponent(comboBoxCurso, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxMateria, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textoMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16))
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoMateria))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        boolean banderaError = false;
        extraerCodigo = textoCodigo.getText();
        try {
            Conexion c = new Conexion();
            VentanaRegistrosDetallecurso Agregar;
            Agregar = new VentanaRegistrosDetallecurso(c);
            try {
                Agregar.Borrar(extraerCodigo);
            } catch (SQLException ex) {
                invocarError("Error al Borrar", "Error al tratar de borrar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosDetallecurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosDetallecurso.class.getName()).log(Level.SEVERE, null, ex);
            invocarError("Error de Conexion", "Error al tratar de obteber una conexion a la base de datos");
            banderaError = true;
        }
        if (!banderaError) {
            vaciarCampos();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        extraerCodigo = textoCodigo.getText();
        try {
            Consultar(extraerCodigo);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosDetallecurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean banderaError = false;
        extraerDatos();
        try {
            Conexion c = new Conexion();
            VentanaRegistrosDetallecurso Agregar;
            Agregar = new VentanaRegistrosDetallecurso(c);
            try {
                Agregar.Insertar(extraerCurso, extraerMateria);
            } catch (SQLException ex) {
                invocarError("Error al Insertar", "Error al tratar de insertar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosDetallecurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosDetallecurso.class.getName()).log(Level.SEVERE, null, ex);
            invocarError("Error de Conexion", "Error al tratar de obteber una conexion a la base de datos");
            banderaError = true;
        }
        if (!banderaError) {
            vaciarCampos();
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void comboBoxCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCursoItemStateChanged
        String cursoSeleccionado = (String) comboBoxCurso.getSelectedItem();
        limpiarLabel();
        try {
            String SQL = "SELECT curs_codigo FROM curso WHERE curs_descripcion = '" + cursoSeleccionado + "'";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String datoObtenido = "Error";
            while (rs.next()) {
                datoObtenido = rs.getString("curs_codigo");
            }
            extraerCurso = datoObtenido;
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboBoxCursoItemStateChanged

    private void comboBoxMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxMateriaItemStateChanged
        String materiaSeleccionada = (String) comboBoxMateria.getSelectedItem();
        limpiarLabel();
        try {
            String SQL = "SELECT mate_codigo FROM materia WHERE mate_descripcion = '" + materiaSeleccionada + "'";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String datoObtenido = "Error";
            while (rs.next()) {
                datoObtenido = rs.getString("mate_codigo");
            }
            extraerMateria = datoObtenido;
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboBoxMateriaItemStateChanged
    private String extraerCodigo;
    private String extraerCurso;
    private String extraerMateria;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JComboBox comboBoxCurso;
    private javax.swing.JComboBox comboBoxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textCurso;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JLabel textoMateria;
    // End of variables declaration//GEN-END:variables

    public void extraerDatos() {
        extraerCodigo = textoCodigo.getText().toUpperCase();
    }

    public void Insertar(String curso, String codigo) throws SQLException {
        String cadena;
        cadena = "INSERT INTO \"detallecurso\" (curs_codigo, mate_codigo) "
                + " VALUES (" + curso + ", " + codigo + ")";
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void Borrar(String codigo) throws SQLException {
        String cadena;
        cadena = "DELETE FROM detallecurso WHERE deta_codigo = " + codigo;
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void Consultar(String codigo) throws SQLException {
        String cadena;
        cadena = "SELECT * FROM detallecurso WHERE deta_codigo = " + codigo + "";
        Statement snt;
        conn = c.ObtenerConexion();
        snt = conn.createStatement();
        ResultSet rs = null;
        try {
            rs = snt.executeQuery(cadena);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        String curso = null;
        String materia = null;
        try {
            while (rs.next()) {
                curso = rs.getString("curs_codigo");
                materia = rs.getString("mate_codigo");
            }
        } catch (Exception e) {
            invocarError("Error al realizar la consulta", "No se encontro registros de la Materia. Verifique que este correcto el nombre.");
        }
        if (curso == null) {
            invocarError("Error de Acceso", "No existe el registro que quiere consultar.");
        } else {
            cargarDescripcion(curso, materia);
        }
    }

    private void vaciarCampos() {
        textoCodigo.setText("");
        textCurso.setText("");
        textoMateria.setText("");
    }

    private void cargarDescripcion(String curso, String materia) {
        try {
            String SQL = "SELECT curs_descripcion FROM curso WHERE curs_codigo = " + curso + "";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String datoObtenido = "Error";
            while (rs.next()) {
                datoObtenido = rs.getString("curs_descripcion");
            }
            textCurso.setText(datoObtenido);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String SQL = "SELECT mate_descripcion FROM materia WHERE mate_codigo = " + materia + "";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String datoObtenido = "Error";
            while (rs.next()) {
                datoObtenido = rs.getString("mate_descripcion");
            }
            textoMateria.setText(datoObtenido);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiarLabel() {
        textCurso.setText("");
        textoMateria.setText("");
        textoCodigo.setText("");
    }
}
