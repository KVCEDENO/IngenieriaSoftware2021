/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.adopcionmascotas.vista;

import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author christtian
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            initComponents();
            setLocationRelativeTo(null);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
            javax.swing.JOptionPane.showMessageDialog(this.rootPane,"Imposible modificar el tema visual","Lookandfeel inválido.",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicioPanelPrincipal = new javax.swing.JPanel();
        inicioPanelLateral = new javax.swing.JPanel();
        inicioLblSeparador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        inicioPanelSuperior = new javax.swing.JPanel();
        inicioBtnLogin = new javax.swing.JButton();
        inicioLblAvatar = new javax.swing.JLabel();
        inicioLblPortada = new javax.swing.JLabel();
        inicioLblTituloA = new javax.swing.JLabel();
        inicioLblTituloB = new javax.swing.JLabel();
        inicioLblTituloC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inicioPanelInferior = new javax.swing.JPanel();
        inicioLblLogoUtpl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1040));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        inicioPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inicioPanelPrincipal.setMaximumSize(new java.awt.Dimension(1900, 700));
        inicioPanelPrincipal.setMinimumSize(new java.awt.Dimension(1900, 1000));
        inicioPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(inicioPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 1645, 750));

        inicioPanelLateral.setBackground(new java.awt.Color(255, 54, 54));
        inicioPanelLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inicioPanelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioLblSeparador.setText("---------");
        inicioPanelLateral.add(inicioLblSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 140, 240, -1));

        jButton1.setBackground(new java.awt.Color(255, 54, 54));
        jButton1.setText("Nuestras Mascotas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        inicioPanelLateral.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 185, 60));

        jButton2.setText("Adopciones");
        inicioPanelLateral.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 185, 60));

        jButton3.setText("Usuarios");
        inicioPanelLateral.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 185, 60));

        jButton4.setText("Veterinaria");
        inicioPanelLateral.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 185, 60));

        jButton5.setText("Nosotros");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        inicioPanelLateral.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 185, 60));

        getContentPane().add(inicioPanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 1040));

        inicioPanelSuperior.setBackground(new java.awt.Color(41, 41, 41));
        inicioPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inicioPanelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioBtnLogin.setText("Ingresar");
        inicioPanelSuperior.add(inicioBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 100, 100, 30));

        inicioLblAvatar.setIcon(new javax.swing.ImageIcon("C:\\Users\\christtian\\Fuentes\\IngenieriaSoftware2021\\AdopcionMascotas\\images\\imgHombreSmall.png")); // NOI18N
        inicioPanelSuperior.add(inicioLblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 25, 64, 80));

        inicioLblPortada.setIcon(new javax.swing.ImageIcon("C:\\Users\\christtian\\Fuentes\\IngenieriaSoftware2021\\AdopcionMascotas\\images\\imgFotoPortada.png")); // NOI18N
        inicioPanelSuperior.add(inicioLblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 417, 130));

        inicioLblTituloA.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        inicioLblTituloA.setForeground(new java.awt.Color(255, 255, 0));
        inicioLblTituloA.setText("plataforma");
        inicioPanelSuperior.add(inicioLblTituloA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 30));

        inicioLblTituloB.setFont(new java.awt.Font("Tahoma", 0, 42)); // NOI18N
        inicioLblTituloB.setForeground(new java.awt.Color(255, 255, 255));
        inicioLblTituloB.setText("adopción");
        inicioPanelSuperior.add(inicioLblTituloB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 190, 50));

        inicioLblTituloC.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        inicioLblTituloC.setForeground(new java.awt.Color(255, 255, 255));
        inicioLblTituloC.setText("de mascotas");
        inicioPanelSuperior.add(inicioLblTituloC, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 500, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario Invitado");
        inicioPanelSuperior.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 110, 164, 20));

        getContentPane().add(inicioPanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 0, 1675, 150));

        inicioPanelInferior.setBackground(new java.awt.Color(41, 41, 41));
        inicioPanelInferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inicioPanelInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioLblLogoUtpl.setIcon(new javax.swing.ImageIcon("C:\\Users\\christtian\\Fuentes\\IngenieriaSoftware2021\\AdopcionMascotas\\images\\imgLogoUtplGrande.png")); // NOI18N
        inicioPanelInferior.add(inicioLblLogoUtpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1454, 20, 160, 64));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Universidad Técnica Pasticular de Loja");
        inicioPanelInferior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 400, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("[ ESPINOZA - CONTRERAS - GÓMEZ - CEDEÑO - REA ]");
        inicioPanelInferior.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 52, 400, 32));

        getContentPane().add(inicioPanelInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 940, 1675, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicioBtnLogin;
    private javax.swing.JLabel inicioLblAvatar;
    private javax.swing.JLabel inicioLblLogoUtpl;
    private javax.swing.JLabel inicioLblPortada;
    private javax.swing.JLabel inicioLblSeparador;
    private javax.swing.JLabel inicioLblTituloA;
    private javax.swing.JLabel inicioLblTituloB;
    private javax.swing.JLabel inicioLblTituloC;
    private javax.swing.JPanel inicioPanelInferior;
    private javax.swing.JPanel inicioPanelLateral;
    private javax.swing.JPanel inicioPanelPrincipal;
    private javax.swing.JPanel inicioPanelSuperior;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
