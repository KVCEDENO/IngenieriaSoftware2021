package ec.edu.utpl.adopcionmascotas.vista;

import ec.edu.utpl.adopcionmascotas.controlador.ControladorBienvenida;
import ec.edu.utpl.adopcionmascotas.modelo.pojo.Sesion;

/**
 * Interfaz de Bienvenida de la aplicacion
 * 
 * @author Grupo 3 - Ingeniería de Software
 * @version 1.0
 */
public class Bienvenida extends javax.swing.JFrame {

    private ControladorBienvenida controladorSesion;
    private Sesion sesion;
    
    /**
     * Creates new form Mensaje
     * @param cusuario
     * @param usuario
     */
    public Bienvenida(Integer cusuario, String usuario) {
        try {
            this.sesion = new Sesion(usuario, cusuario);
            controladorSesion = new ControladorBienvenida(sesion, cusuario, usuario);
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            initComponents();
            setLocationRelativeTo(null);
            setUsuarioInfo();
        }catch(Exception e){
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

        jButton1 = new javax.swing.JButton();
        panBienvenida = new javax.swing.JPanel();
        cmbRol = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        lblRol = new javax.swing.JLabel();
        panTituloBienvenida = new javax.swing.JPanel();
        lblIconoUtpl = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panBienvenida.setBackground(new java.awt.Color(41, 41, 41));
        panBienvenida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panBienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbRol.setToolTipText("Rol asignado al usuario");
        panBienvenida.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 35, 200, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Enviar al menu principal");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panBienvenida.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, 30));

        lblRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRol.setForeground(new java.awt.Color(255, 255, 255));
        lblRol.setText("Rol:");
        panBienvenida.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 35, 50, 20));

        getContentPane().add(panBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 130));

        panTituloBienvenida.setBackground(new java.awt.Color(255, 54, 54));
        panTituloBienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoUtpl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgLogoPequeño.png"))); // NOI18N
        panTituloBienvenida.add(lblIconoUtpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 94, 50));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bienvenido,");
        panTituloBienvenida.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 350, 20));

        lblNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 204, 0));
        lblNombreUsuario.setText("Nombre Usuario");
        panTituloBienvenida.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 350, 30));

        getContentPane().add(panTituloBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Inicio inicio = new Inicio();
        inicio.setSesion(sesion);
        inicio.setIsLogged(true);
        inicio.setVisible(true);
        inicio.disableLogin();
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    
    private void setUsuarioInfo(){
        
        controladorSesion.getDatosCombo(cmbRol);
        lblNombreUsuario.setText(sesion.getNombreUsuario());
    }
    
    private void setAdministrador(){
        
        boolean admin = false;
        String combo = cmbRol.getSelectedItem().toString();
        if(combo.contains("Administrador")){
            admin = true;
        }
        sesion.setIsAdministrador(admin);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblIconoUtpl;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panBienvenida;
    private javax.swing.JPanel panTituloBienvenida;
    // End of variables declaration//GEN-END:variables


}
