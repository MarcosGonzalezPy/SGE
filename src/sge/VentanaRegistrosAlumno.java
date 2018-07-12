/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana para el Registro de Alumnos
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
import static sge.Utilidades.invocarError;

public class VentanaRegistrosAlumno extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    Connection conn;
    Conexion c;
    Statement stmt;

    VentanaRegistrosAlumno(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaRegistrosAlumno() {
        initComponents();
        maxCedula(campoCedula);
        maxNombre(campoNombre);
        maxApellido(campoApellido);
        maxDireccion(campoDireccion);
        maxTelefono(campoTelefono);
        maxCelular(campoCelular);
        maxEmail(campoEmail);
        maxObs(campoObs);
        maxFecha(campoFecha);
       SNumeros(campoTelefono);
    }

    public void SLetras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void KeyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        campoFecha = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox();
        campoEmail = new javax.swing.JTextField();
        campoObs = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Registrar Alumno:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Cedula:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Telefono:");

        jLabel9.setText("Celular:");

        jLabel10.setText("Fecha Nac.:");

        jLabel11.setText("(AAAA-MM-DD)");

        jLabel12.setText("Sexo");

        jLabel4.setText("E-mail");

        jLabel8.setText("Observaciones:");

        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaActionPerformed(evt);
            }
        });

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });

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

        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/guardar.png"))); // NOI18N
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
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

        jLabel15.setText("Actualizar");

        jLabel16.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16))
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addContainerGap(251, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNombre)
                                    .addComponent(campoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14))))
                            .addComponent(campoObs, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(84, 84, 84)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(50, Short.MAX_VALUE))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
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

    private void campoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaActionPerformed
        
    }//GEN-LAST:event_campoCedulaActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        
    }//GEN-LAST:event_sexoActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean banderaError = false;
        extraerDatos();
        try {
            Conexion c = new Conexion();
            VentanaRegistrosAlumno Agregar;
            Agregar = new VentanaRegistrosAlumno(c);
            try {
                Agregar.InsertarAlumno(intCedula, extraerNombre, extraerApellido, extraerDireccion, extraerCelular, extraerTelefono, extraerFecha, extraerEmail, extraerSexo, extraerObs);
            } catch (SQLException ex) {
                invocarError("Error al Insertar", "Error al tratar de insertar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosAlumno.class.getName()).log(Level.SEVERE, null, ex);
            invocarError("Error de Conexion", "Error al tratar de obteber una conexion a la base de datos");
            banderaError = true;
        }
        if (!banderaError) {
            vaciarCampos();
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        extraerCedula = campoCedula.getText();
        intCedula = 0;
        try {
            intCedula = Integer.parseInt(extraerCedula);
        } catch (Exception e1) {
            invocarError("Error al cargar la cedula", "La cedula no puede tener valores alfanumericos. Por favor carge solo valores [0-9]");
        }
        vaciarCampos();
        campoCedula.setText(extraerCedula);
        try {
            ConsultarAlumno(intCedula);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        boolean banderaError = false;
        extraerCedula = campoCedula.getText();
        intCedula = 0;
        try {
            intCedula = Integer.parseInt(extraerCedula);
        } catch (Exception e1) {
            invocarError("Error al cargar la cedula", "La cedula no puede tener valores alfanumericos. Por favor carge solo valores [0-9]");
        }
        try {
            Conexion c = new Conexion();
            VentanaRegistrosAlumno Agregar;
            Agregar = new VentanaRegistrosAlumno(c);
            try {
                Agregar.BorrarAlumno(intCedula);
            } catch (SQLException ex) {
                invocarError("Error al Borrar", "Error al tratar de borrar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosAlumno.class.getName()).log(Level.SEVERE, null, ex);
            invocarError("Error de Conexion", "Error al tratar de obteber una conexion a la base de datos");
            banderaError = true;
        }
        if (!banderaError) {
            vaciarCampos();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        boolean banderaError = false;
        extraerDatos();
        try {
            Conexion c = new Conexion();
            VentanaRegistrosAlumno Agregar;
            Agregar = new VentanaRegistrosAlumno(c);
            try {
                Agregar.Modificar(intCedula, extraerNombre, extraerApellido, extraerDireccion, extraerCelular, extraerTelefono, extraerFecha, extraerEmail, extraerSexo, extraerObs);
            } catch (SQLException ex) {
                invocarError("Error al Modificar", "Error al tratar de Modificar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosAlumno.class.getName()).log(Level.SEVERE, null, ex);
            invocarError("Error de Conexion", "Error al tratar de obteber una conexion a la base de datos");
            banderaError = true;
        }
        if (!banderaError) {
            vaciarCampos();
        }
    }//GEN-LAST:event_botonActualizarActionPerformed
    private String extraerNombre;
    private String extraerApellido;
    private String extraerCedula;
    private String extraerDireccion;
    private String extraerEmail;
    private String extraerCelular;
    private String extraerObs;
    private String extraerTelefono;
    private String extraerFecha;
    private String extraerSexo;
    private int intCedula;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoObs;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox sexo;
    // End of variables declaration//GEN-END:variables

    public void extraerDatos() {
        extraerCedula = campoCedula.getText();
        intCedula = 0;
        try {
            intCedula = Integer.parseInt(extraerCedula);
        } catch (Exception e1) {
            invocarError("Error al cargar la cedula", "La cedula no puede tener valores alfanumericos. Por favor carge solo valores [0-9]");
        }
        extraerNombre = campoNombre.getText().toUpperCase();
        extraerApellido = campoApellido.getText().toUpperCase();
        extraerDireccion = campoDireccion.getText().toUpperCase();
        extraerTelefono = campoTelefono.getText().toUpperCase();
        extraerCelular = campoCelular.getText().toUpperCase();
        extraerFecha = campoFecha.getText().toUpperCase();
        extraerSexo = (String) sexo.getSelectedItem();
        extraerEmail = campoEmail.getText();
        extraerObs = campoObs.getText();
    }

    public void InsertarAlumno(int cedula, String nombre, String apellido, String direccion, String celular, String telefono, String fech_naci, String email, String sexo, String obs) throws SQLException {
        String cadena;
        cadena = "INSERT INTO alumno (alum_cedula, alum_nombre, alum_apellido, alum_direccion, alum_telefono, alum_celular, alum_email, alum_fech_naci, alum_sexo, alum_obs) "
                + " VALUES (" + cedula + ", '" + nombre + "','" + apellido + "','" + direccion + "','" + telefono + "','" + celular + "','" + email + "','" + fech_naci + "','" + sexo + "','" + obs + "')";
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void Modificar(int cedula, String nombre, String apellido, String direccion, String celular, String telefono, String fech_naci, String email, String sexo, String obs) throws SQLException {
        String cadena = "UPDATE alumno SET alum_cedula=" + cedula + ",alum_nombre ='" + nombre + "',alum_apellido = '" + apellido + "', alum_direccion = '" + direccion + "', alum_telefono = '" + telefono + "', alum_celular = '" + celular + "', alum_fech_naci = '" + fech_naci + "', alum_sexo = '" + sexo + "', alum_email = '" + email + "', alum_obs = '" + obs + "' WHERE alum_cedula = " + cedula + "";
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void BorrarAlumno(int cedula) throws SQLException {
        String cadena;
        cadena = "DELETE FROM alumno WHERE alum_cedula = " + cedula + "";
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void ConsultarAlumno(int cedula) throws SQLException {

        String cadena;
        cadena = "SELECT * FROM alumno WHERE alum_cedula = " + cedula + "";
        Statement snt;
        conn = c.ObtenerConexion();
        snt = conn.createStatement();
        ResultSet rs = null;
        try {
            rs = snt.executeQuery(cadena);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            while (rs.next()) {
                campoCedula.setText(rs.getString("alum_cedula"));
                campoNombre.setText(rs.getString("alum_nombre"));
                campoApellido.setText(rs.getString("alum_apellido"));
                campoDireccion.setText(rs.getString("alum_direccion"));
                campoTelefono.setText(rs.getString("alum_telefono"));
                campoCelular.setText(rs.getString("alum_celular"));
                campoFecha.setText(rs.getString("alum_fech_naci"));
                campoEmail.setText(rs.getString("alum_email"));
                campoObs.setText(rs.getString("alum_obs"));
            }
        } catch (Exception e) {
            invocarError("Error al realizar la consulta", "No se encontro registros del alumno. Verifique que el numero de cedula este correcto.");
        }
    }

    private void vaciarCampos() {
        campoCedula.setText("");
        campoNombre.setText("");
        campoApellido.setText("");
        campoDireccion.setText("");
        campoTelefono.setText("");
        campoCelular.setText("");
        campoFecha.setText("");
        campoEmail.setText("");
        campoObs.setText("");
    }

    public void maxCedula(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoCedula.getText().length() > 9) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxNombre(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoNombre.getText().length() > 29) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxApellido(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoApellido.getText().length() > 29) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxDireccion(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoDireccion.getText().length() > 59) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxTelefono(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoTelefono.getText().length() > 14) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxCelular(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoCelular.getText().length() > 14) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxEmail(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoEmail.getText().length() > 59) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxObs(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoObs.getText().length() > 399) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxFecha(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (campoFecha.getText().length() > 9) {
                    getToolkit().beep();
                    e.consume();
                } else if (campoFecha.getText().length() == 4 || campoFecha.getText().length() == 7) {
                    if (c != '-') {
                        getToolkit().beep();
                        e.consume();
                    }
                } else if (campoFecha.getText().length() < 4 || (campoFecha.getText().length() > 4 && campoFecha.getText().length() < 7) || (campoFecha.getText().length() > 7 && campoFecha.getText().length() < 10)) {
                    if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9') {
                        getToolkit().beep();
                        e.consume();
                    }
                }
            }
        });
    }

    public void SNumeros(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void KeyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }
}
