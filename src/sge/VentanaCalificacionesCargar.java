/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana Cargar Calificaciones
 * Autor: Marcos Gonzalez
 */ 
package sge;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaCalificacionesCargar extends javax.swing.JInternalFrame {

    private int parametroCurso;

    DefaultTableModel modelo = new DefaultTableModel();

    Connection conn;
    Conexion c;
    Statement stmt;

    VentanaCalificacionesCargar(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaCalificacionesCargar() {
        initComponents();
        parametroCurso = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoCurso = new javax.swing.JTextField();
        seleccionCurso = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        textoMateria = new javax.swing.JTextField();
        seleccionMaterias = new javax.swing.JComboBox();
        seleccionNota = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cedula1 = new javax.swing.JTextField();
        cedula2 = new javax.swing.JTextField();
        cedula3 = new javax.swing.JTextField();
        cedula4 = new javax.swing.JTextField();
        cedula5 = new javax.swing.JTextField();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        nota4 = new javax.swing.JTextField();
        nota5 = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        ok1 = new javax.swing.JButton();
        nombre3 = new javax.swing.JLabel();
        nombre4 = new javax.swing.JLabel();
        nombre5 = new javax.swing.JLabel();
        ok2 = new javax.swing.JButton();
        ok3 = new javax.swing.JButton();
        ok4 = new javax.swing.JButton();
        ok5 = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cargar Notas");

        jLabel4.setText("Curso:");

        textoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCursoActionPerformed(evt);
            }
        });

        seleccionCurso.setModel(new CursosComboBoxModel());
        seleccionCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccionCursoItemStateChanged(evt);
            }
        });
        seleccionCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionCursoActionPerformed(evt);
            }
        });

        jLabel2.setText("Materias:");

        textoMateria.setText(" ");

        seleccionMaterias.setModel(new MateriasPorCursoModel(parametroCurso));
        seleccionMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccionMateriasItemStateChanged(evt);
            }
        });
        seleccionMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionMateriasActionPerformed(evt);
            }
        });

        seleccionNota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nota1", "Nota2", "Nota3", "Nota4", "Nota5" }));

        jLabel3.setText("Cedula:");

        cedula1.setText(" ");

        cedula2.setText(" ");

        cedula3.setText(" ");

        cedula4.setText(" ");

        cedula5.setText(" ");

        nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1ActionPerformed(evt);
            }
        });

        nota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota2ActionPerformed(evt);
            }
        });

        nota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota3ActionPerformed(evt);
            }
        });

        nota4.setText(" ");

        nota5.setText(" ");

        nombre1.setText(" ");

        nombre2.setText(" ");

        ok1.setText("Ok");
        ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ActionPerformed(evt);
            }
        });

        nombre3.setText(" ");

        nombre4.setText(" ");

        nombre5.setText(" ");

        ok2.setText("Ok");
        ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok2ActionPerformed(evt);
            }
        });

        ok3.setText("Ok");
        ok3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok3ActionPerformed(evt);
            }
        });

        ok4.setText("Ok");
        ok4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok4ActionPerformed(evt);
            }
        });

        ok5.setText("Ok");
        ok5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok5ActionPerformed(evt);
            }
        });

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/guardar.png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(textoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seleccionCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seleccionMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seleccionNota, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cedula5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cedula4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                            .addComponent(cedula3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cedula2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cedula1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nota1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                            .addComponent(nota2)
                                            .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nota5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                            .addComponent(nota4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nombre4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nombre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ok1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ok2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ok3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ok4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ok5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(131, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(botonGuardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre1)
                    .addComponent(ok1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre2)
                    .addComponent(ok2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre3)
                    .addComponent(ok3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre4)
                    .addComponent(ok4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre5)
                    .addComponent(ok5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
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

    private void seleccionCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccionCursoItemStateChanged
        String cursoSeleccionado = (String) seleccionCurso.getSelectedItem();
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
            textoCurso.setText(datoObtenido);
            parametroCurso = Integer.parseInt(datoObtenido);
            seleccionMaterias.setModel(new MateriasPorCursoModel(parametroCurso));
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_seleccionCursoItemStateChanged

    private void seleccionCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionCursoActionPerformed

    private void seleccionMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccionMateriasItemStateChanged
        String materiaSeleccionada = (String) seleccionMaterias.getSelectedItem();
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
            textoMateria.setText(datoObtenido);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_seleccionMateriasItemStateChanged

    private void seleccionMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionMateriasActionPerformed
    
    }//GEN-LAST:event_seleccionMateriasActionPerformed

    private void ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ActionPerformed
        try {
            String resultado = "ERROR";
            String alumnoCedula = "ERROR";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            String cadena = "Select * from alumno where alum_cedula =" + cedula1.getText().toString().trim();
            ResultSet rs = null;
            rs = snt.executeQuery(cadena);
            while (rs.next()) {
                resultado = rs.getString("alum_nombre") + " " + rs.getString("alum_apellido");
                alumnoCedula = rs.getString("alum_cedula");
            }
            String ver = verificarInscriptoCurso(textoCurso.getText(), alumnoCedula);
            if (ver.equals("si")) {
                nombre1.setText(resultado);
            } else {
                Utilidades.invocarError("Error al traer alumno", "No se encontro registro del alumno en este curso.");
                nombre1.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_ok1ActionPerformed

    private void ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok2ActionPerformed
        try {
            String resultado = "ERROR";
            String alumnoCedula = "ERROR";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            String cadena = "Select * from alumno where alum_cedula =" + cedula2.getText().toString().trim();
            ResultSet rs = null;
            rs = snt.executeQuery(cadena);
            while (rs.next()) {
                resultado = rs.getString("alum_nombre") + " " + rs.getString("alum_apellido");
                alumnoCedula = rs.getString("alum_cedula");
            }
            String ver = verificarInscriptoCurso(textoCurso.getText(), alumnoCedula);
            if (ver.equals("si")) {
                nombre2.setText(resultado);
            } else {
                Utilidades.invocarError("Error al traer alumno", "No se encontro registro del alumno en este curso.");
                nombre2.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_ok2ActionPerformed

    private void ok3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok3ActionPerformed
        try {
            String resultado = "ERROR";
            String alumnoCedula = "ERROR";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            String cadena = "Select * from alumno where alum_cedula =" + cedula3.getText().toString().trim();
            ResultSet rs = null;
            rs = snt.executeQuery(cadena);
            while (rs.next()) {
                resultado = rs.getString("alum_nombre") + " " + rs.getString("alum_apellido");
                alumnoCedula = rs.getString("alum_cedula");
            }
            String ver = verificarInscriptoCurso(textoCurso.getText(), alumnoCedula);
            if (ver.equals("si")) {
                nombre3.setText(resultado);
            } else {
                Utilidades.invocarError("Error al traer alumno", "No se encontro registro del alumno en este curso.");
                nombre3.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_ok3ActionPerformed

    private void ok4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok4ActionPerformed
        try {
            String resultado = "ERROR";
            String alumnoCedula = "ERROR";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            String cadena = "Select * from alumno where alum_cedula =" + cedula4.getText().toString().trim();
            ResultSet rs = null;
            rs = snt.executeQuery(cadena);
            while (rs.next()) {
                resultado = rs.getString("alum_nombre") + " " + rs.getString("alum_apellido");
                alumnoCedula = rs.getString("alum_cedula");
            }
            String ver = verificarInscriptoCurso(textoCurso.getText(), alumnoCedula);
            if (ver.equals("si")) {
                nombre4.setText(resultado);
            } else {
                Utilidades.invocarError("Error al traer alumno", "No se encontro registro del alumno en este curso.");
                nombre4.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_ok4ActionPerformed

    private void ok5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok5ActionPerformed
        try {
            String resultado = "ERROR";
            String alumnoCedula = "ERROR";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            String cadena = "Select * from alumno where alum_cedula =" + cedula5.getText().toString().trim();
            ResultSet rs = null;
            rs = snt.executeQuery(cadena);
            while (rs.next()) {
                resultado = rs.getString("alum_nombre") + " " + rs.getString("alum_apellido");
                alumnoCedula = rs.getString("alum_cedula");
            }
            String ver = verificarInscriptoCurso(textoCurso.getText(), alumnoCedula);
            if (ver.equals("si")) {
                nombre5.setText(resultado);
            } else {
                Utilidades.invocarError("Error al traer alumno", "No se encontro registro del alumno en este curso.");
                nombre5.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_ok5ActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        int procesar = 0;
        if (cedula1.getText().trim().equals("") && !nota1.getText().trim().equals("")
                || !cedula1.getText().trim().equals("") && nota1.getText().trim().equals("")) {
            Utilidades.invocarError("Error", "Debe completar los campos cedula y nota. En la primera fila.");
            procesar = 1;
        } else {
            if (cedula2.getText().trim().equals("") && !nota2.getText().trim().equals("")
                    || !cedula2.getText().trim().equals("") && nota2.getText().trim().equals("")) {
                Utilidades.invocarError("Error", "Debe completar los campos cedula y nota. En la segunda fila fila.");
                procesar = 1;
            } else {
                if (cedula3.getText().trim().equals("") && !nota3.getText().trim().equals("")
                        || !cedula3.getText().trim().equals("") && nota3.getText().trim().equals("")) {
                    Utilidades.invocarError("Error", "Debe completar los campos cedula y nota. En la tercera fila fila.");
                    procesar = 1;
                } else {
                    if (cedula4.getText().trim().equals("") && !nota4.getText().trim().equals("")
                            || !cedula4.getText().trim().equals("") && nota4.getText().trim().equals("")) {
                        Utilidades.invocarError("Error", "Debe completar los campos cedula y nota. En la cuarta fila fila.");
                        procesar = 1;
                    } else {
                        if (cedula5.getText().trim().equals("") && !nota5.getText().trim().equals("")
                                || !cedula5.getText().trim().equals("") && nota5.getText().trim().equals("")) {
                            Utilidades.invocarError("Error", "Debe completar los campos cedula y nota. En la quinta fila fila.");
                            procesar = 1;
                        }
                    }
                }
            }
        }
        if (procesar == 0) {
            String validarNota = "ok";
            String errorRegistro = "Falso";
            String materia = textoMateria.getText();
            String curso = textoCurso.getText();
            String nota = notaParametro(seleccionNota.getSelectedItem().toString());
            String sql1 = "UPDATE nota SET " + nota + " = " + nota1.getText() + " WHERE mate_codigo = " + materia + " "
                    + "and curs_codigo = " + curso + " AND alum_cedula = " + cedula1.getText();
            String sql2 = "UPDATE nota SET " + nota + " = " + nota2.getText() + " WHERE mate_codigo = " + materia + " "
                    + "and curs_codigo = " + curso + " AND alum_cedula = " + cedula2.getText();
            String sql3 = "UPDATE nota SET " + nota + " = " + nota3.getText() + " WHERE mate_codigo = " + materia + " "
                    + "and curs_codigo = " + curso + " AND alum_cedula = " + cedula3.getText();
            String sql4 = "UPDATE nota SET " + nota + " = " + nota4.getText() + " WHERE mate_codigo = " + materia + " "
                    + "and curs_codigo = " + curso + " AND alum_cedula = " + cedula4.getText();
            String sql5 = "UPDATE nota SET " + nota + " = " + nota5.getText() + " WHERE mate_codigo = " + materia + " "
                    + "and curs_codigo = " + curso + " AND alum_cedula = " + cedula5.getText();
            try {
                Statement snt;
                conn = c.ObtenerConexion();
                snt = conn.createStatement();
                if (cedula1.getText().trim() != null && !cedula1.getText().trim().equals("")) {
                    if (nota1.getText().trim() != null && !nota1.getText().trim().equals("")) {
                        try {
                            int nota1val = Integer.parseInt(nota1.getText().trim());
                            if (nota1val > 0 && nota1val < 6) {
                                boolean execute = snt.execute(sql1);
                                nota1.setText("");
                                cedula1.setText("");
                                nombre1.setText("");
                            } else {
                                errorRegistro = "Las notas deben estar entre 1-5. ";
                            }
                        } catch (Exception e) {
                            errorRegistro = "Error al insertar el registro de " + cedula1.getText() + " " + e;
                        }
                    }
                }

                if (cedula2.getText().trim() != null && !cedula2.getText().trim().equals("")) {
                    if (nota2.getText().trim() != null && !nota2.getText().trim().equals("")) {
                        try {
                            int nota2val = Integer.parseInt(nota2.getText().trim());
                            if (nota2val > 0 && nota2val < 6) {
                                boolean execute = snt.execute(sql2);
                                nota2.setText("");
                                cedula2.setText("");
                                nombre2.setText("");
                            } else {
                                errorRegistro = "Las notas deben estar entre 1-5. ";
                            }
                        } catch (Exception e) {
                            errorRegistro = "Error al insertar el registro de " + cedula2.getText() + " ";
                        }
                    }
                }

                if (cedula3.getText().trim() != null && !cedula3.getText().trim().equals("")) {
                    if (nota3.getText().trim() != null && !nota3.getText().trim().equals("")) {
                        try {
                            int nota3val = Integer.parseInt(nota3.getText().trim());
                            if (nota3val > 0 && nota3val < 6) {
                                boolean execute = snt.execute(sql3);
                                nota3.setText("");
                                cedula3.setText("");
                                nombre3.setText("");
                            } else {
                                errorRegistro = "Las notas deben estar entre 1-5. ";
                            }
                        } catch (Exception e) {
                            errorRegistro = "Error al insertar el registro de " + cedula3.getText() + " ";
                        }
                    }
                }

                if (cedula4.getText().trim() != null && !cedula4.getText().trim().equals("")) {
                    if (nota4.getText().trim() != null && !nota4.getText().trim().equals("")) {
                        try {
                            int nota4val = Integer.parseInt(nota4.getText().trim());
                            if (nota4val > 0 && nota4val < 6) {
                                boolean execute = snt.execute(sql4);
                                nota3.setText("");
                                cedula3.setText("");
                                nombre3.setText("");
                            } else {
                                errorRegistro = "Las notas deben estar entre 1-5. ";
                            }
                        } catch (Exception e) {
                            errorRegistro = "Error al insertar el registro de " + cedula4.getText() + " ";
                        }
                    }
                }

                if (cedula5.getText().trim() != null && !cedula5.getText().trim().equals("")) {
                    if (nota5.getText().trim() != null && !nota5.getText().trim().equals("")) {
                        try {
                            int nota5val = Integer.parseInt(nota5.getText().trim());
                            if (nota5val > 0 && nota5val < 6) {
                                boolean execute = snt.execute(sql5);
                                nota3.setText("");
                                cedula3.setText("");
                                nombre3.setText("");
                            } else {
                                errorRegistro = "Las notas deben estar entre 1-5. ";
                            }
                        } catch (Exception e) {
                            errorRegistro = "Error al insertar el registro de " + cedula5.getText() + " ";
                        }
                    }
                }
                if (!errorRegistro.equals("Falso")) {
                    Utilidades.invocarError("Error de Registro de Notas", errorRegistro);
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void textoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCursoActionPerformed

    private void nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1ActionPerformed

    private void nota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota2ActionPerformed

    private void nota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota3ActionPerformed

    private String notaParametro(String param) {
        String notaReal = "";
        if (param.equals("Nota1")) {
            notaReal = "nota_1";
        }
        if (param.equals("Nota2")) {
            notaReal = "nota_2";
        }
        if (param.equals("Nota3")) {
            notaReal = "nota_3";
        }
        if (param.equals("Nota4")) {
            notaReal = "nota_4";
        }
        if (param.equals("Nota5")) {
            notaReal = "nota_5";
        }
        return notaReal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cedula1;
    private javax.swing.JTextField cedula2;
    private javax.swing.JTextField cedula3;
    private javax.swing.JTextField cedula4;
    private javax.swing.JTextField cedula5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JTextField nota4;
    private javax.swing.JTextField nota5;
    private javax.swing.JButton ok1;
    private javax.swing.JButton ok2;
    private javax.swing.JButton ok3;
    private javax.swing.JButton ok4;
    private javax.swing.JButton ok5;
    private javax.swing.JComboBox seleccionCurso;
    private javax.swing.JComboBox seleccionMaterias;
    private javax.swing.JComboBox seleccionNota;
    private javax.swing.JTextField textoCurso;
    private javax.swing.JTextField textoMateria;
    // End of variables declaration//GEN-END:variables

    public String verificarInscriptoCurso(String curso, String cedula) throws SQLException {
        String resultado = "no";
        Statement snt;
        conn = c.ObtenerConexion();
        snt = conn.createStatement();
        String cadena = "select * from nota where  curs_codigo = " + curso + " AND alum_cedula = " + cedula;
        ResultSet rs = null;
        rs = snt.executeQuery(cadena);
        String cedulaComparacion = "ERROR";
        while (rs.next()) {
            cedulaComparacion = rs.getString("alum_cedula");
        }
        if (cedula.equals(cedulaComparacion)) {
            resultado = "si";
        }
        return resultado;
    }
}
