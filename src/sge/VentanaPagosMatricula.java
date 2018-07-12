/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana para realizar el Pago de Matriculas 
 * Autor: Marcos Gonzalez
 */
package sge;

import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import static sge.Utilidades.invocarError;

public class VentanaPagosMatricula extends javax.swing.JInternalFrame {

    private int parametroCedula;
    DefaultTableModel modelo = new DefaultTableModel();
    String deudas = "NO";
    Connection conn;
    Conexion c;
    Statement stmt;

    VentanaPagosMatricula(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaPagosMatricula(int cedula) {
        initComponents();
        cargarFecha();
        cargarCosto();
        parametroCedula = cedula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoCedula = new javax.swing.JTextField();
        mostrarNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoCurso = new javax.swing.JTextField();
        seleccionCurso = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Matriculacion Alumnos:");

        jLabel2.setText("Cedula Alumno:");

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

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha:");

        fecha.setText(" ");

        jLabel5.setText("Costo");

        costo.setText(" ");

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/guardar.png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(costo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textoCurso, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seleccionCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(mostrarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costo))
                .addGap(18, 18, 18)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(86, Short.MAX_VALUE))
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

        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_seleccionCursoItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombrebuscador = textoCedula.getText().trim().toString();
        String sql = "SELECT alum_nombre,  alum_apellido FROM alumno WHERE alum_cedula = " + nombrebuscador;
        String resultado = "ERROR";
        try {
            int Cedula = Integer.parseInt(nombrebuscador);
            ResultSet rs = null;
            try {
                Statement snt;
                conn = c.ObtenerConexion();
                snt = conn.createStatement();
                if (nombrebuscador.length() > 0) {
                    rs = snt.executeQuery(sql);
                    while (rs.next()) {
                        resultado = rs.getString("alum_nombre") + " " + rs.getString("alum_apellido");
                    }
                    if (resultado.equals("ERROR")) {
                        Utilidades.invocarError("Error al buscar Alumno", "    No se encontro el Alumno. Verifique que la cedula sea correcta.");
                    } else {
                        mostrarNombre.setText(resultado);
                        deudas = validarSinDeudas(Cedula);
                    }
                } else {
                    Utilidades.invocarError("Error al buscar Alumno", "   Debe ingresar un valor dentro dentro del cuadro Cedula Alumno.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e1) {
            invocarError("Error al buscar Alumno", "   La cedula no puede tener valores alfanumericos. Por favor carge solo valores [0-9]");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (deudas.equals("NO")) {
            int intCedula = 0;
            int intCurso = 0;
            int intCosto = 0;
            int intCostoCuota = 0;
            try {
                intCedula = Integer.parseInt(textoCedula.getText().trim());
                intCurso = Integer.parseInt(textoCurso.getText().trim());
                intCosto = Integer.parseInt(costo.getText().trim());
            } catch (Exception e) {
                Utilidades.invocarError("Error al registrar la Matriculacion", "   No se pudo realizar el cambio de String a int.");
            }
            String fechaHoy = fecha.getText();
            try {
                String values1 = "(" + intCedula + "," + intCurso + ",'" + fechaHoy + "'," + intCosto + ", 'Y' , " + parametroCedula + ")";             
                String SQL1 = "INSERT INTO matricula (alum_cedula,curs_codigo, matr_fech_matr, matr_monto, matr_flg, admi_cedula) VALUES " + values1;
                String SQL4 = "SELECT mate_codigo FROM detallecurso WHERE curs_codigo = " + intCurso;
                Statement snt;
                conn = c.ObtenerConexion();
                snt = conn.createStatement();
                boolean execute = snt.execute(SQL1);
                for (int i = 0; i < 10; i++) {
                    boolean execute2 = snt.execute("INSERT INTO cuota (alum_cedula, curs_codigo, cuot_fech_pago, cuot_monto, admi_cedula, cuot_flg) VALUES " + "(" + intCedula + "," + intCurso + ",'" + fechaHoy + "'," + costoCuota() + "  , "+parametroCedula+", 'N')");
                }
                ResultSet rs = null;
                try {
                    rs = snt.executeQuery(SQL4);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                List<String> materias = new ArrayList<String>();
                int i = 0;
                while (rs.next()) {
                    materias.add(rs.getString("mate_codigo"));
                    i++;
                }
                System.out.println("La cantidad de materias: " + i);
                Statement snt2;
                conn = c.ObtenerConexion();
                snt2 = conn.createStatement();
                for (int j = 0; j < i; j++) {
                    String values3 = "(" + intCedula + "," + intCurso + "," + materias.get(j).toString() + ")";
                    String SQL3 = "INSERT INTO \"nota\" (alum_cedula, curs_codigo, mate_codigo) VALUES " + values3;
                    boolean execute3 = snt2.execute(SQL3);
                }
                textoCedula.setText("");
                textoCurso.setText("");
                mostrarNombre.setText("");
                seleccionCurso.setModel(new CursosComboBoxModel());
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            invocarError("Error de Matriculacion", "El alumno aun tiene deudas pendientes con la institucion. No puede matricularse hasta cancelarse las mismas.");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void seleccionCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCursoActionPerformed
        
    }//GEN-LAST:event_seleccionCursoActionPerformed

    private void textoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCursoActionPerformed
        
    }//GEN-LAST:event_textoCursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel costo;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mostrarNombre;
    private javax.swing.JComboBox seleccionCurso;
    private javax.swing.JTextField textoCedula;
    private javax.swing.JTextField textoCurso;
    // End of variables declaration//GEN-END:variables

    private void cargarFecha() {
        fecha.setText(Utilidades.sysDate());
    }

    private void cargarCosto() {
        try {
            String SQL = "SELECT conf_costo_matricula FROM configuraciones WHERE conf_codigo = 1";
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
                datoObtenido = rs.getString("conf_costo_matricula");
            }
            costo.setText(datoObtenido);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int costoCuota() {
        String datoObtenido = "0";
        try {
            String SQL = "SELECT conf_costo_mensualidad FROM configuraciones WHERE conf_codigo = 1";
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
                datoObtenido = rs.getString("conf_costo_mensualidad");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        int intMensualidad = 0;
        try {
            intMensualidad = Integer.parseInt(datoObtenido.trim());
        } catch (Exception e) {
            Utilidades.invocarError("Error al obtener el Costo de Mensualidad", "   No se pudo realizar el cambio de String a int.");
        }
        return intMensualidad;
    }

    private String validarSinDeudas(int Cedula) {
        ResultSet rs = null;
        try {
            String SQL = "select a.alum_cedula from alumno A inner join cuota B on a.alum_cedula = b.alum_cedula where b.alum_cedula = " + Cedula + " AND b.cuot_flg='N'";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String cedula = "0";
            while (rs.next()) {
                cedula = rs.getString("alum_cedula");
            }
            int intCedula = 0;
            try {
                intCedula = Integer.parseInt(cedula.trim());

            } catch (Exception e) {
                Utilidades.invocarError("Error al registrar la Matriculacion", "   No se pudo realizar el cambio de String a int.");
            }
            if (intCedula == Cedula) {
                deudas = "SI";
                invocarError("Error de Matriculacion", "El alumno aun tiene deudas pendientes con la institucion. No puede matricularse hasta cancelarse las mismas.");
            }
            snt.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPagosMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return deudas;
    }
}
