/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana para el Registro de Cursos
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
import static sge.Utilidades.invocarError;

public class VentanaRegistrosCurso extends javax.swing.JInternalFrame {

    Connection conn;
    Conexion c;
    Statement stmt;
    String valorCodigo;

    VentanaRegistrosCurso(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaRegistrosCurso() {
        initComponents();
        maxDireccion(textoDescripcion);
        maxCedula(textoCIDocente);
        maxPeriodo(textoPeriodo);
        maxSalon(textoSalon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoDescripcion = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoCIDocente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textoPeriodo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        turno = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        textoSalon = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Registrar Curso:");

        jLabel2.setText("Descripcion:");

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

        jLabel3.setText("Codigo: ");

        codigo.setText(" ");

        jLabel5.setText("CI Docente:");

        jLabel6.setText("Periodo:");

        jLabel7.setText("Turno:");

        turno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "T", "N" }));

        jLabel8.setText("Salon:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel13)))))
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
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(53, 53, 53)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textoCIDocente))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addGap(167, 167, 167)))))
                .addContainerGap(185, Short.MAX_VALUE))
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
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(codigo))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textoCIDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textoSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        boolean banderaError = false;
        extraerDatos();
        try {
            Conexion c = new Conexion();
            VentanaRegistrosCurso Accion;
            Accion = new VentanaRegistrosCurso(c);
            try {
                Accion.Borrar(extraerCodigo);
            } catch (SQLException ex) {
                invocarError("Error al Borrar", "Error al tratar de borrar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosCurso.class.getName()).log(Level.SEVERE, null, ex);
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
            VentanaRegistrosCurso Accion;
            Accion = new VentanaRegistrosCurso(c);
            try {
                Accion.Modificar(extraerCodigo, extraerDescripcion, extraerCIDocente, extraerPeriodo, extraerTurno, extraerSalon, extraerMaxAlu);
            } catch (SQLException ex) {
                invocarError("Error al Modificar", "Error al tratar de Modificar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosCurso.class.getName()).log(Level.SEVERE, null, ex);
            invocarError("Error de Conexion", "Error al tratar de obteber una conexion a la base de datos");
            banderaError = true;
        }
        if (!banderaError) {
            vaciarCampos();
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        extraerDescripcion = textoDescripcion.getText();
        try {
            Consular(extraerDescripcion);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean banderaError = false;
        extraerDatos();
        try {
            Conexion c = new Conexion();
            VentanaRegistrosCurso Accion;
            Accion = new VentanaRegistrosCurso(c);
            try {
                Accion.Insertar(extraerDescripcion, extraerCIDocente, extraerPeriodo, extraerTurno, extraerSalon, extraerMaxAlu);
            } catch (SQLException ex) {
                invocarError("Error al Insertar", "Error al tratar de insertar el registro a la base de datos");
                banderaError = true;
                Logger.getLogger(VentanaRegistrosCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistrosCurso.class.getName()).log(Level.SEVERE, null, ex);
            invocarError("Error de Conexion", "Error al tratar de obteber una conexion a la base de datos");
            banderaError = true;
        }
        if (!banderaError) {
            vaciarCampos();
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private String extraerDescripcion;
    private String extraerCodigo;
    private String extraerCIDocente;
    private String extraerPeriodo;
    private String extraerTurno;
    private String extraerSalon;
    private String extraerMaxAlu;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoCIDocente;
    private javax.swing.JTextField textoDescripcion;
    private javax.swing.JTextField textoPeriodo;
    private javax.swing.JTextField textoSalon;
    private javax.swing.JComboBox turno;
    // End of variables declaration//GEN-END:variables

    public void extraerDatos() {
        extraerDescripcion = textoDescripcion.getText().toUpperCase();
        extraerCodigo = codigo.getText();
        extraerCIDocente = textoCIDocente.getText().toUpperCase();
        extraerPeriodo = textoPeriodo.getText().toUpperCase();
        extraerTurno = turno.getSelectedItem().toString();
        extraerSalon = textoSalon.getText().toString();
        extraerMaxAlu = extraerMaxAlum();
    }

    private String extraerMaxAlum() {
        String datoObtenido = "Error";
        try {
            String SQL = "SELECT conf_max_alum FROM configuraciones WHERE conf_codigo = 1";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            while (rs.next()) {
                datoObtenido = rs.getString("conf_max_alum");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datoObtenido;
    }

    public void Insertar(String descripcion, String cedula, String periodo, String turno, String salon, String maxAlum) throws SQLException {
        String cadena;
        cadena = "INSERT INTO \"curso\" (curs_descripcion, doce_cedula, curs_periodo, curs_turno, curs_salon, curs_max_alum) "
                + " VALUES ('" + descripcion + "', " + cedula + ",  " + periodo + ", '" + turno + "', '" + salon + "'," + maxAlum + " )";
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void Modificar(String codigo, String descripcion, String cedula, String periodo, String turno, String salon, String maxAlum) throws SQLException {
        String cadena = "UPDATE curso SET curs_descripcion = '" + descripcion + "', doce_cedula = " + cedula + ","
                + " curs_periodo=" + periodo + ",curs_turno='" + turno + "',curs_salon='" + salon + "', curs_max_alum=" + maxAlum + " WHERE curs_codigo = " + codigo;
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void Borrar(String codigo) throws SQLException {
        String cadena;
        cadena = "DELETE FROM curso WHERE curs_codigo = " + codigo + "";
        boolean execute = stmt.execute(cadena);
        stmt.close();
    }

    public void Consular(String descripcion) throws SQLException {
        String cadena;
        cadena = "SELECT * FROM curso WHERE curs_descripcion = '" + descripcion + "'";
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
                textoDescripcion.setText(rs.getString("curs_descripcion"));
                codigo.setText(rs.getString("curs_codigo"));
                valorCodigo = rs.getString("curs_codigo");
                textoCIDocente.setText(rs.getString("doce_cedula"));
                textoPeriodo.setText(rs.getString("curs_periodo"));
                turno.setSelectedItem(rs.getString("curs_turno"));
                textoSalon.setText(rs.getString("curs_salon"));
            }
        } catch (Exception e) {
            invocarError("Error al realizar la consulta", "No se encontro registros de la Cargo. Verifique que este correcto el nombre.");
        }
    }

    private void vaciarCampos() {
        textoCIDocente.setText("");
        textoPeriodo.setText("");
        textoSalon.setText("");
        textoDescripcion.setText("");
        codigo.setText("");
    }

    public void maxDireccion(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (textoDescripcion.getText().length() > 59) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxCedula(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (textoCIDocente.getText().length() > 9) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxPeriodo(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (textoPeriodo.getText().length() > 3) {
                    getToolkit().beep();
                    e.consume();
                }
                if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9') {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void maxSalon(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (textoSalon.getText().length() > 14) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }
}
