/**
 * SISTEMA GERENCIADOR ESCOLAR 
 * "SGE" 
 * FPUNA - Programacion de Computadoras 
 * Clase: Ventana Principal del Sistema 
 * Autor: Marcos Gonzalez
 */

package sge;

import java.awt.Component;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import static sge.Utilidades.obtenerIcono;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        cambiarEstadoBotones(false);
    }

    public String getUsuario() {
        return textUsua.getText();
    }

    public String obtenerNombre(int cedula) throws SQLException {

        String resultado = "ERROR";
        String cadena = "Select * from administrativo where admi_cedula =" + cedula;
        ResultSet rs = stmt.executeQuery(cadena);
        while (rs.next()) {
            resultado = rs.getString("admi_nombre") + " " + rs.getString("admi_apellido");
        }
        if (resultado.trim().equals("") || resultado.equals("ERROR")) {
            String cadena2 = "Select * from docente where doce_cedula =" + cedula;
            ResultSet rs2 = stmt.executeQuery(cadena2);
            while (rs2.next()) {
                resultado = rs2.getString("doce_nombre") + " " + rs2.getString("doce_apellido");
            }
            if (resultado.trim().equals("") || resultado.equals("ERROR")) {
                String cadena3 = "Select * from alumno where alum_cedula =" + cedula;
                ResultSet rs3 = stmt.executeQuery(cadena3);
                while (rs3.next()) {
                    resultado = rs3.getString("alum_nombre") + " " + rs3.getString("alum_apellido");
                }
            }
        }
        return resultado;
    }

    Conexion c;
    Statement stmt;

    Principal(Conexion cFormulario) throws SQLException {
        c = cFormulario;
        stmt = c.ObtenerConexion().createStatement();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoError = new javax.swing.JDialog();
        okError = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        jMenu2 = new javax.swing.JMenu();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        visorUsuario = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        textUsua = new javax.swing.JTextField();
        textPass = new javax.swing.JPasswordField();
        BotonLogin = new javax.swing.JButton();
        botonConfiguraciones = new javax.swing.JButton();
        botonRegistros = new javax.swing.JButton();
        botonConsultas = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();
        botonCalificaciones = new javax.swing.JButton();
        botonPagos = new javax.swing.JButton();
        panelVentanaInterna = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        cerrarSesion = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        colorRojo = new javax.swing.JMenuItem();
        colorNaranja = new javax.swing.JMenuItem();
        colorNegro = new javax.swing.JMenuItem();
        colorAzul = new javax.swing.JMenuItem();
        colorGris = new javax.swing.JMenuItem();
        colorVerde = new javax.swing.JMenuItem();
        colorLila = new javax.swing.JMenuItem();
        colorNormal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        okError.setText("Ok");
        okError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okErrorActionPerformed(evt);
            }
        });
        okError.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                okErrorFocusGained(evt);
            }
        });

        javax.swing.GroupLayout DialogoErrorLayout = new javax.swing.GroupLayout(DialogoError.getContentPane());
        DialogoError.getContentPane().setLayout(DialogoErrorLayout);
        DialogoErrorLayout.setHorizontalGroup(
            DialogoErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoErrorLayout.createSequentialGroup()
                .addGroup(DialogoErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogoErrorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogoErrorLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(okError, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogoErrorLayout.setVerticalGroup(
            DialogoErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(okError)
                .addContainerGap())
        );

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGE");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        jLabel4.setText("jLabel4");

        visorUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        visorUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        visorUsuario.setText(" ");
        visorUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        visorUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelUser.setText("User:");
        labelUser.setToolTipText("");
        labelUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        labelUser.setPreferredSize(new java.awt.Dimension(22, 14));
        labelUser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                labelUserPropertyChange(evt);
            }
        });

        labelPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPass.setText("Pass:");

        BotonLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonLogin.setText("Login");
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        botonConfiguraciones.setText("Configuraciones");
        botonConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfiguracionesActionPerformed(evt);
            }
        });

        botonRegistros.setText("Registros");
        botonRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrosActionPerformed(evt);
            }
        });

        botonConsultas.setText("Consultas");
        botonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultasActionPerformed(evt);
            }
        });

        botonReportes.setText("Reportes");
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        botonCalificaciones.setText("Califiaciones");
        botonCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalificacionesActionPerformed(evt);
            }
        });

        botonPagos.setText("Pagos");
        botonPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagosActionPerformed(evt);
            }
        });

        panelVentanaInterna.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelVentanaInternaLayout = new javax.swing.GroupLayout(panelVentanaInterna);
        panelVentanaInterna.setLayout(panelVentanaInternaLayout);
        panelVentanaInternaLayout.setHorizontalGroup(
            panelVentanaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        panelVentanaInternaLayout.setVerticalGroup(
            panelVentanaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/graficos/logoSanBlas - copia.png"))); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUsua, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonConfiguraciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonConsultas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonRegistros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonPagos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCalificaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(botonReportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(visorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panelVentanaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(visorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUsua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPass))
                        .addGap(18, 18, 18)
                        .addComponent(BotonLogin)
                        .addGap(78, 78, 78)
                        .addComponent(botonConsultas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPagos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCalificaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonReportes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonConfiguraciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelVentanaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(200, 30));

        menuInicio.setText("Inicio");
        menuInicio.setPreferredSize(new java.awt.Dimension(50, 19));
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Cambiar de usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuInicio.add(jMenuItem4);

        cerrarSesion.setText("Cerrar sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        menuInicio.add(cerrarSesion);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuInicio.add(jMenuItem3);

        jMenuBar1.add(menuInicio);

        menuEditar.setText("Editar");
        menuEditar.setPreferredSize(new java.awt.Dimension(50, 19));

        jMenu1.setText("Color");

        colorRojo.setText("Rojo");
        colorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRojoActionPerformed(evt);
            }
        });
        jMenu1.add(colorRojo);

        colorNaranja.setText("Naranjado");
        colorNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorNaranjaActionPerformed(evt);
            }
        });
        jMenu1.add(colorNaranja);

        colorNegro.setText("Negro");
        colorNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorNegroActionPerformed(evt);
            }
        });
        jMenu1.add(colorNegro);

        colorAzul.setText("Azul");
        colorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAzulActionPerformed(evt);
            }
        });
        jMenu1.add(colorAzul);

        colorGris.setText("Gris");
        colorGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorGrisActionPerformed(evt);
            }
        });
        jMenu1.add(colorGris);

        colorVerde.setText("Verde");
        colorVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorVerdeActionPerformed(evt);
            }
        });
        jMenu1.add(colorVerde);

        colorLila.setText("Lila");
        colorLila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorLilaActionPerformed(evt);
            }
        });
        jMenu1.add(colorLila);

        colorNormal.setText("Normal");
        colorNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorNormalActionPerformed(evt);
            }
        });
        jMenu1.add(colorNormal);

        menuEditar.add(jMenu1);

        jMenuItem1.setText("Cambiar contraseña");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuEditar.add(jMenuItem1);

        jMenuBar1.add(menuEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed

    }//GEN-LAST:event_menuInicioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        Connection conn = null;
        try {
            conn = sge.Conexion.ObtenerConexion();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Contrasena");
            String usuario = textUsua.getText();
            usuario = usuario.toUpperCase();
            char PassArray[] = textPass.getPassword();
            String password = new String(PassArray);
            String login = "fallido";
            while (rs.next()) {
                if (rs.getString("cont_user").equals(usuario) && rs.getString("cont_password").equals(password)) {
                    login = "exitoso";
                    privilegio = rs.getInt("cont_privilegio");
                    cedula = rs.getInt("cont_cedula");
                }
            }
            if (login.equals("exitoso")) {
                System.out.println("Bienvenido al sistema");
                Conexion c = new Conexion();
                Principal principal = new Principal(c);
                usuario = principal.obtenerNombre(cedula);
                visorUsuario.setText(usuario);
                cambiarEstadoBotones(true);
                cambiarEstadoLogin(false);
            } else {
                if (login.equals("fallido") && usuario.isEmpty()) {
                    invocarError("Debe ingresar un usuario.");
                } else {
                    invocarError("El usuario ingresado o password es incorrecto.");
                }
            }
            textUsua.setText("");
            textPass.setText("");
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_BotonLoginActionPerformed

    private void botonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultasActionPerformed
        limpiarVentanaInterna();
        VentanaConsultas panelConsultas = new VentanaConsultas();
        panelVentanaInterna.add(panelConsultas);
        panelConsultas.setVisible(true);
        Icon imagen = obtenerIcono();
        panelConsultas.setFrameIcon(imagen);
        panelConsultas.setBounds(50, 50, 687, 470);
    }//GEN-LAST:event_botonConsultasActionPerformed

    private void okErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okErrorActionPerformed
        DialogoError.dispose();
    }//GEN-LAST:event_okErrorActionPerformed
 
    private void okErrorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_okErrorFocusGained

    }//GEN-LAST:event_okErrorFocusGained

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        cerrarSesion();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void botonRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrosActionPerformed
        limpiarVentanaInterna();
        VentanaRegistros ventanaRegistro = new VentanaRegistros();
        panelVentanaInterna.add(ventanaRegistro);
        ventanaRegistro.setVisible(true);
        ventanaRegistro.setFrameIcon(image);
        ventanaRegistro.setBounds(50, 50, 687, 470);
    }//GEN-LAST:event_botonRegistrosActionPerformed

    private void botonConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfiguracionesActionPerformed
        limpiarVentanaInterna();
        VentanaConfiguracion ventanaConfiguracion = new VentanaConfiguracion();
        panelVentanaInterna.add(ventanaConfiguracion);
        ventanaConfiguracion.setVisible(true);
        ventanaConfiguracion.setFrameIcon(image);
        ventanaConfiguracion.setBounds(50, 50, 687, 470);
    }//GEN-LAST:event_botonConfiguracionesActionPerformed

    private void labelUserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_labelUserPropertyChange

    }//GEN-LAST:event_labelUserPropertyChange

    private void colorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRojoActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin");
    }//GEN-LAST:event_colorRojoActionPerformed

    private void colorNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorNaranjaActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.AutumnSkin");
    }//GEN-LAST:event_colorNaranjaActionPerformed

    private void colorNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorNegroActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");
    }//GEN-LAST:event_colorNegroActionPerformed

    private void colorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAzulActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin");
    }//GEN-LAST:event_colorAzulActionPerformed

    private void colorGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorGrisActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessSkin");
    }//GEN-LAST:event_colorGrisActionPerformed

    private void colorVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorVerdeActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.EmeraldDuskSkin");
    }//GEN-LAST:event_colorVerdeActionPerformed

    private void colorNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorNormalActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.ModerateSkin");

    }//GEN-LAST:event_colorNormalActionPerformed

    private void colorLilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorLilaActionPerformed
        Principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.ChallengerDeepSkin");
    }//GEN-LAST:event_colorLilaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        cerrarSesion();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagosActionPerformed
        limpiarVentanaInterna();
        String usuario = textUsua.getText();
        VentanaPagos panelPagos = new VentanaPagos(cedula);
        panelVentanaInterna.add(panelPagos);
        panelPagos.setVisible(true);
        Icon imagen = obtenerIcono();
        panelPagos.setFrameIcon(imagen);
        panelPagos.setBounds(50, 50, 687, 470);
    }//GEN-LAST:event_botonPagosActionPerformed

    private void botonCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalificacionesActionPerformed
        limpiarVentanaInterna();
        String usuario = textUsua.getText();
        VentanaCalificaciones panelCalificaciones = new VentanaCalificaciones(cedula);
        panelVentanaInterna.add(panelCalificaciones);
        panelCalificaciones.setVisible(true);
        Icon imagen = obtenerIcono();
        panelCalificaciones.setFrameIcon(imagen);
        panelCalificaciones.setBounds(50, 50, 687, 470);
    }//GEN-LAST:event_botonCalificacionesActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        limpiarVentanaInterna();
        VentanaReportes panelReportes = new VentanaReportes();
        panelVentanaInterna.add(panelReportes);
        panelReportes.setVisible(true);
        Icon imagen = obtenerIcono();
        panelReportes.setFrameIcon(imagen);
        panelReportes.setBounds(50, 50, 687, 470);
    }//GEN-LAST:event_botonReportesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        limpiarVentanaInterna();
        VentanaCambiarContraseña ventanaCambiarContraseña = new VentanaCambiarContraseña(Integer.toString(cedula));
        panelVentanaInterna.add(ventanaCambiarContraseña);
        ventanaCambiarContraseña.setVisible(true);
        Icon imagen = obtenerIcono();
        ventanaCambiarContraseña.setFrameIcon(imagen);
        ventanaCambiarContraseña.setBounds(50, 50, 687, 470);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void invocarError(String mensaje) {
        DialogoError.setVisible(true);
        DialogoError.setBounds(525, 300, 350, 150);
        DialogoError.setTitle("Error de Login");
        errorLabel.setText(mensaje);
        DialogoError.add(errorLabel);
    }

    private int privilegio;
    private int cedula;
    ImageIcon image = new ImageIcon("C://Users/Home/Documents/NetBeansProjects/SGEV2/src/sgev2/graficos/par.ico");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLogin;
    private javax.swing.JDialog DialogoError;
    private javax.swing.JButton botonCalificaciones;
    private javax.swing.JButton botonConfiguraciones;
    private javax.swing.JButton botonConsultas;
    private javax.swing.JButton botonPagos;
    private javax.swing.JButton botonRegistros;
    private javax.swing.JButton botonReportes;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JMenuItem colorAzul;
    private javax.swing.JMenuItem colorGris;
    private javax.swing.JMenuItem colorLila;
    private javax.swing.JMenuItem colorNaranja;
    private javax.swing.JMenuItem colorNegro;
    private javax.swing.JMenuItem colorNormal;
    private javax.swing.JMenuItem colorRojo;
    private javax.swing.JMenuItem colorVerde;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JButton okError;
    private javax.swing.JPanel panelVentanaInterna;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textUsua;
    private javax.swing.JLabel visorUsuario;
    // End of variables declaration//GEN-END:variables

    private void cambiarEstadoBotones(boolean estado) {
        menuEditar.setEnabled(estado);
        menuInicio.setEnabled(estado);
        botonConsultas.setEnabled(estado);
        if (privilegio < 4) {
            botonRegistros.setEnabled(estado);
            botonPagos.setEnabled(estado);
            botonCalificaciones.setEnabled(estado);
            botonReportes.setEnabled(estado);
            if (privilegio < 3) {
                botonConfiguraciones.setEnabled(estado);
            }
        }
    }

    public void cerrarSesion() {
        Component[] d = panelVentanaInterna.getComponents();
        for (int index = 0; index < d.length; index++) {
            System.out.println(d[index].getName());
            if (!(d[index].getName() == "tuComponet")) {
                panelVentanaInterna.remove(d[index]);
            }
        }
        panelVentanaInterna.updateUI();
        cambiarEstadoBotones(false);
        cambiarEstadoLogin(true);
        privilegio = 0;
        cedula = 0;
        visorUsuario.setText("");
    }

    public void cambiarEstadoLogin(boolean estado) {
        textUsua.setEnabled(estado);
        textPass.setEnabled(estado);
        BotonLogin.setEnabled(estado);
    }

    public void limpiarVentanaInterna() {
        Component[] d = panelVentanaInterna.getComponents();
        for (int index = 0; index < d.length; index++) {
            System.out.println(d[index].getName());
            if (!(d[index].getName() == "tuComponet")) {
                panelVentanaInterna.remove(d[index]);
            }
        }
    }
}
