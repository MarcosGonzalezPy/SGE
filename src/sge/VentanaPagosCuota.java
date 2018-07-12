/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana para realizar el Pago de Cuotas 
 * Autor: Marcos Gonzalez
 */
package sge;

import static java.lang.Integer.toString;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static sge.Utilidades.invocarError;
import sge.CursosCuotaModel;

public class VentanaPagosCuota extends javax.swing.JInternalFrame {

    private int parametroCedula;

    DefaultTableModel modelo = new DefaultTableModel();
    Connection conn;
    Conexion c;
    Statement stmt;
    int intCedula;
    int intCuotasPendientes;
    int intCostoCuota;
    int intUltimaCuotaPagada;

    VentanaPagosCuota(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    public VentanaPagosCuota(int usuarioCedula) {
        intCedula = 0;
        initComponents();
        ConfiGrilla();
        parametroCedula = usuarioCedula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoCedula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mostrarNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cuotasPagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        montoPagar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cuotasPendientes = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        listo = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jTextField2.setText("jTextField2");

        jLabel7.setText("jLabel7");

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Pago Cuota");

        jLabel2.setText("Cedula Alumno");

        textoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCedulaActionPerformed(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mostrarNombre.setText(" ");

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

        jLabel3.setText("Cantidad de cuotas a pagar:");

        cuotasPagar.setText(" ");
        cuotasPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuotasPagarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuotasPagarKeyTyped(evt);
            }
        });

        jLabel4.setText("Monto a pagar: ");

        montoPagar.setText(" ");

        jLabel6.setText("Cuotas Pendientes: ");

        cuotasPendientes.setText(" ");

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        listo.setText("Listo");
        listo.setEnabled(false);
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(mostrarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(60, 60, 60))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(listo)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cuotasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cuotasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(montoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 19, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarNombre)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cuotasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(montoPagar)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cuotasPendientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarGrillaBuscador();
        cuotasPagar.setText("");
        montoPagar.setText("");
        String nombrebuscador = textoCedula.getText().trim().toString();
        String sql = "SELECT alum_nombre,  alum_apellido FROM alumno WHERE alum_cedula = " + nombrebuscador;
        String resultado = "ERROR";
        try {
            int cedula = Integer.parseInt(nombrebuscador);
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
                        CargaGrilla();
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked

    }//GEN-LAST:event_grillaMouseClicked

    private void grillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaKeyPressed

    }//GEN-LAST:event_grillaKeyPressed

    private void textoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCedulaActionPerformed

    }//GEN-LAST:event_textoCedulaActionPerformed

    private void cuotasPagarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotasPagarKeyPressed


    }//GEN-LAST:event_cuotasPagarKeyPressed

    private void cuotasPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotasPagarKeyTyped


    }//GEN-LAST:event_cuotasPagarKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Date d = new Date();
        int mes = d.getMonth();
        System.out.println("El mes es: "+mes);
        int intCuotasPagar = 0;
        int intCuotasPendientes = 0;
        try {
            intCuotasPagar = Integer.parseInt(cuotasPagar.getText().trim());
        } catch (Exception e) {
        }
        try {
            intCuotasPendientes = Integer.parseInt(cuotasPendientes.getText().trim());
        } catch (Exception e) {
        }
        if (intCuotasPagar > intCuotasPendientes) {
            invocarError("Error de Pago de Cuota", "La cantidad a pagar no puede ser mayor a las cuotas pendientes. ");
        } else {
            int cuotasConMulta =0;
            int cantidadPagada = 10 - intCuotasPendientes;
            int atraso= mes-1 - cantidadPagada;
            int cuotasParaPagar = intCuotasPagar;
            int conMora = 0;
            int sinMora =0;
            
            if(atraso<0){
                conMora=0;
            }else{
                if(cuotasParaPagar<= atraso){
                    conMora=cuotasParaPagar;
                }else{
                    conMora=atraso;
                }
            }
            if(atraso<0){
                sinMora=cuotasParaPagar;
            }else{
                if(cuotasParaPagar>atraso){
                    sinMora= cuotasParaPagar-atraso;
                }else{
                    sinMora=0;
                }
            } 
            
                montoPagar.setText(Integer.toString( sinMora * intCostoCuota + conMora * (intCostoCuota+ 15000)));
                listo.setEnabled(true);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed
        pagarCuotas();
    }//GEN-LAST:event_listoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuotasPagar;
    private javax.swing.JLabel cuotasPendientes;
    private javax.swing.JTable grilla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton listo;
    private javax.swing.JLabel montoPagar;
    private javax.swing.JLabel mostrarNombre;
    private javax.swing.JTextField textoCedula;
    // End of variables declaration//GEN-END:variables

    private void ConfiGrilla() { 
        modelo.addColumn("Mes");
        modelo.addColumn("Monto");
        modelo.addColumn("Estado");
        grilla.getColumnModel().getColumn(0).setPreferredWidth(100);
        grilla.getColumnModel().getColumn(1).setPreferredWidth(200);
        grilla.getColumnModel().getColumn(2).setPreferredWidth(190);
    }

    private void limpiarGrillaBuscador() { 
        int cf = grilla.getRowCount();
        for (int i = 0; i < cf; i++) {
            modelo.removeRow(0);
        }
    }

    private void CargaGrilla() {
        String SQL = null;
        String SQL2 = null;
        String nombrebuscador = textoCedula.getText().trim().toString();
        try {
            SQL = "SELECT cuot_monto, cuot_flg FROM cuota WHERE  alum_cedula = " + nombrebuscador + " AND curs_codigo IN (select curs_codigo from cuota where cuot_flg = 'N' and alum_cedula = " + nombrebuscador + "  ) order by cuot_codigo";
            SQL2 = "SELECT cuot_flg FROM cuota WHERE  alum_cedula = " + nombrebuscador + " AND cuot_flg = 'N' ";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String[] datos = new String[3];
            String[] meses = {"FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
            int i = 0;
            while (rs.next()) {
                datos[0] = meses[i];
                datos[1] = rs.getString("cuot_monto");
                datos[2] = rs.getString("cuot_flg");
                i++;
                intCostoCuota = Integer.parseInt(rs.getString("cuot_monto"));
                modelo.addRow(datos);
            }
            ResultSet rs2 = null;
            try {
                rs2 = snt.executeQuery(SQL2);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            int j = 0;
            while (rs2.next()) {
                j++;
            }
            intCuotasPendientes = j;
            cuotasPendientes.setText(Integer.toString(j));
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiarCampos() {
        cuotasPagar.setText("");
        cuotasPendientes.setText("");
        montoPagar.setText("");
        mostrarNombre.setText("");
        textoCedula.setText("");
    }

    private void pagarCuotas() {
        String SQL = null;
        String SQL2 = null;
        String nombrebuscador = textoCedula.getText().trim().toString();
        try {
            
            SQL = "SELECT cuot_codigo, cuot_flg FROM cuota WHERE  alum_cedula = " + nombrebuscador + " AND cuot_flg = 'N'";
            Statement snt;
            conn = c.ObtenerConexion();
            snt = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = snt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            String[] datos = new String[10];
            int i = 0;
            while (rs.next()) {
                datos[i] = rs.getString("cuot_codigo");
                i++;
            }
            String cantdidad = cuotasPagar.getText();
            int intCantidad = 0;
            try {
                intCantidad = Integer.parseInt(cuotasPagar.getText().trim());
            } catch (Exception e) {
                invocarError("Error en el Pago de Cuotas", "No se pudo obtener la cantidad de cuotas a pagar");
            }
            ResultSet rs2 = null;
            int regresivo = intCantidad;
            int montoConMulta =0;
            try{
                montoConMulta = Integer.parseInt(montoPagar.getText().trim());
            }catch (Exception e) {
                invocarError("Error en el Pago de Cuotas", "No se pudo obtener el monto de cuotas a pagar");
            }
            int diferencia = montoConMulta - intCantidad * intCostoCuota;
            for (int j = 0; j < intCantidad; j++) {
                if(diferencia>0){
                    diferencia = diferencia -15000;
                     try {
                        SQL2 = "UPDATE cuota SET cuot_flg = 'Y', cuot_fech_pago = '" + Utilidades.sysDate() + "', admi_cedula= " + parametroCedula + " , cuot_monto = "+ (100000+15000)+" WHERE cuot_codigo = " + datos[j];
                        rs2 = snt.executeQuery(SQL2);
                     }catch (Exception e) {
                        System.out.println("Error: " + e.getMessage() + "Construccion del Select: " + SQL2);
                    } 
                    
                }else{
                     try {
                        SQL2 = "UPDATE cuota SET cuot_flg = 'Y', cuot_fech_pago = '" + Utilidades.sysDate() + "', admi_cedula= " + parametroCedula + " WHERE cuot_codigo = " + datos[j];
                        rs2 = snt.executeQuery(SQL2);
                     }catch (Exception e) {
                        System.out.println("Error: " + e.getMessage() + "Construccion del Select: " + SQL2);
                    }                
                }
            }
            limpiarGrillaBuscador();
            limpiarCampos();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
