/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.interfaz;

import com.backend.*;

public class Login extends javax.swing.JFrame {
    Botones btn = new Botones();
    CamposTexto txt = new CamposTexto();

    public Login() {
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

        panelBorde = new javax.swing.JPanel();
        panelFondoIcono = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtpLoginContenedor = new javax.swing.JTabbedPane();
        panelUsuario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonSiguiente = new javax.swing.JPanel();
        textoBtnSiguiente = new javax.swing.JLabel();
        panelContraseña = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtUsuarioUIContraseña = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botonSiguiente1 = new javax.swing.JPanel();
        textoBtnSiguiente1 = new javax.swing.JLabel();
        jpwContraseña = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorde.setBackground(new java.awt.Color(240, 70, 79));
        panelBorde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondoIcono.setBackground(new java.awt.Color(234, 217, 101));
        panelFondoIcono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Splash.png"))); // NOI18N
        panelFondoIcono.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 340, 290));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(77, 71, 84));
        jLabel2.setText("WELL");
        panelFondoIcono.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 300, 70));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 100)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(77, 71, 84));
        jLabel4.setText("EAT");
        panelFondoIcono.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 70));

        panelBorde.add(panelFondoIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 570));

        jtpLoginContenedor.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        panelUsuario.setBackground(new java.awt.Color(142, 180, 98));
        panelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(77, 71, 84));
        jLabel3.setText("USUARIO");
        panelUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 350, 70));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(77, 71, 84));
        jLabel5.setText("INICIAR SESIÓN");
        panelUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 350, 70));

        jtxtUsuario.setBackground(new java.awt.Color(142, 181, 113));
        jtxtUsuario.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jtxtUsuario.setText("INGRESE SU USUARIO");
        jtxtUsuario.setBorder(null);
        jtxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtUsuarioMousePressed(evt);
            }
        });
        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        panelUsuario.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 380, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 380, 20));

        botonSiguiente.setBackground(new java.awt.Color(72, 127, 120));
        botonSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseExited(evt);
            }
        });
        botonSiguiente.setLayout(new java.awt.BorderLayout());

        textoBtnSiguiente.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        textoBtnSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBtnSiguiente.setText("SIGUIENTE");
        textoBtnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoBtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoBtnSiguiente.setVerifyInputWhenFocusTarget(false);
        textoBtnSiguiente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                textoBtnSiguienteMouseMoved(evt);
            }
        });
        textoBtnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoBtnSiguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoBtnSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoBtnSiguienteMouseExited(evt);
            }
        });
        botonSiguiente.add(textoBtnSiguiente, java.awt.BorderLayout.CENTER);

        panelUsuario.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 230, 50));

        jtpLoginContenedor.addTab("tab1", panelUsuario);

        panelContraseña.setBackground(new java.awt.Color(142, 180, 98));
        panelContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(77, 71, 84));
        jLabel6.setText("CONTRASEÑA");
        panelContraseña.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 200, 50));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(77, 71, 84));
        jLabel7.setText("INICIAR SESIÓN");
        panelContraseña.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 350, 70));

        jtxtUsuarioUIContraseña.setBackground(new java.awt.Color(142, 181, 113));
        jtxtUsuarioUIContraseña.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jtxtUsuarioUIContraseña.setForeground(new java.awt.Color(77, 71, 84));
        jtxtUsuarioUIContraseña.setBorder(null);
        jtxtUsuarioUIContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtUsuarioUIContraseñaMousePressed(evt);
            }
        });
        jtxtUsuarioUIContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioUIContraseñaActionPerformed(evt);
            }
        });
        panelContraseña.add(jtxtUsuarioUIContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 380, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelContraseña.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 380, 20));

        botonSiguiente1.setBackground(new java.awt.Color(72, 127, 120));
        botonSiguiente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSiguiente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSiguiente1MouseExited(evt);
            }
        });
        botonSiguiente1.setLayout(new java.awt.BorderLayout());

        textoBtnSiguiente1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        textoBtnSiguiente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBtnSiguiente1.setText("INICIO DE SESIÓN");
        textoBtnSiguiente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoBtnSiguiente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoBtnSiguiente1.setVerifyInputWhenFocusTarget(false);
        textoBtnSiguiente1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                textoBtnSiguiente1MouseMoved(evt);
            }
        });
        textoBtnSiguiente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoBtnSiguiente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoBtnSiguiente1MouseExited(evt);
            }
        });
        botonSiguiente1.add(textoBtnSiguiente1, java.awt.BorderLayout.CENTER);

        panelContraseña.add(botonSiguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 230, 50));

        jpwContraseña.setBackground(new java.awt.Color(142, 181, 113));
        jpwContraseña.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jpwContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jpwContraseña.setText("**********");
        jpwContraseña.setBorder(null);
        jpwContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpwContraseñaMousePressed(evt);
            }
        });
        jpwContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwContraseñaActionPerformed(evt);
            }
        });
        panelContraseña.add(jpwContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 380, 50));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(77, 71, 84));
        jLabel8.setText("USUARIO");
        panelContraseña.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 130, 50));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelContraseña.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 380, 20));

        jtpLoginContenedor.addTab("tab1", panelContraseña);

        panelBorde.add(jtpLoginContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, 970, 570));

        getContentPane().add(panelBorde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSiguienteMouseExited

    private void botonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSiguienteMouseEntered

    private void textoBtnSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBtnSiguienteMouseExited
        // TODO add your handling code here:
        btn.cambiarColorBotonLogin(botonSiguiente,1);
    }//GEN-LAST:event_textoBtnSiguienteMouseExited

    private void textoBtnSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBtnSiguienteMouseEntered
        // TODO add your handling code here:
        btn.cambiarColorBotonLogin(botonSiguiente,0);
    }//GEN-LAST:event_textoBtnSiguienteMouseEntered

    private void textoBtnSiguienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBtnSiguienteMouseMoved
        // TODO add your handling code here
    }//GEN-LAST:event_textoBtnSiguienteMouseMoved

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jtxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuarioMousePressed
        // TODO add your handling code here:
        txt.textoDefectoUsuario(jtxtUsuario);
    }//GEN-LAST:event_jtxtUsuarioMousePressed

    private void jtxtUsuarioUIContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuarioUIContraseñaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsuarioUIContraseñaMousePressed

    private void jtxtUsuarioUIContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioUIContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsuarioUIContraseñaActionPerformed

    private void textoBtnSiguiente1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBtnSiguiente1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBtnSiguiente1MouseMoved

    private void textoBtnSiguiente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBtnSiguiente1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBtnSiguiente1MouseEntered

    private void textoBtnSiguiente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBtnSiguiente1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBtnSiguiente1MouseExited

    private void botonSiguiente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguiente1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSiguiente1MouseEntered

    private void botonSiguiente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguiente1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSiguiente1MouseExited

    private void textoBtnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBtnSiguienteMouseClicked
        // TODO add your handling code here:
        txt.textoUsuarioUIContraseña(jtxtUsuario, jtxtUsuarioUIContraseña);
        jtpLoginContenedor.setSelectedIndex(1);
    }//GEN-LAST:event_textoBtnSiguienteMouseClicked

    private void jpwContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpwContraseñaActionPerformed

    private void jpwContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpwContraseñaMousePressed
        // TODO add your handling code here:
        txt.textoContraseñaDefecto(jpwContraseña);
    }//GEN-LAST:event_jpwContraseñaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonSiguiente;
    private javax.swing.JPanel botonSiguiente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField jpwContraseña;
    private javax.swing.JTabbedPane jtpLoginContenedor;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JTextField jtxtUsuarioUIContraseña;
    private javax.swing.JPanel panelBorde;
    private javax.swing.JPanel panelContraseña;
    private javax.swing.JPanel panelFondoIcono;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JLabel textoBtnSiguiente;
    private javax.swing.JLabel textoBtnSiguiente1;
    // End of variables declaration//GEN-END:variables
}
