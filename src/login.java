
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    ResultSet rs = null;
    public login() {
        initComponents();
        this.setSize(457,510);
        this.setResizable(false); 
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btningrear = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtpas = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        txtuser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 162, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avatar_login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 120, 120));

        btningrear.setBackground(new java.awt.Color(51, 255, 51));
        btningrear.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btningrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ing1.png"))); // NOI18N
        btningrear.setBorder(null);
        btningrear.setBorderPainted(false);
        btningrear.setContentAreaFilled(false);
        btningrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btningrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btningrear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ing3.png"))); // NOI18N
        btningrear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ing2.png"))); // NOI18N
        btningrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningrearActionPerformed(evt);
            }
        });
        getContentPane().add(btningrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 364, 91, 30));

        btnsalir.setBackground(new java.awt.Color(204, 0, 0));
        btnsalir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lsalir1.png"))); // NOI18N
        btnsalir.setBorder(null);
        btnsalir.setBorderPainted(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lsalir3.png"))); // NOI18N
        btnsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lsalir2.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 364, 91, 30));

        txtpas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 162, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marco_login.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 380));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo_login.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
      
    }//GEN-LAST:event_txtuserActionPerformed

    private void btningrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningrearActionPerformed

        String estado_user = "";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT estado FROM usuarios WHERE username = '"+txtuser.getText()+"'");
            while(rs.next()){
                estado_user = rs.getString("estado");
              
            }
            
        } catch (SQLException ex) {
        }
        
        if(txtuser.getText().isEmpty() || txtpas.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un usuario y una contraseña", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
            txtuser.grabFocus();
        }else{
            if(txtuser.getText().isEmpty() && txtpas.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Ingrese un usuario y una contraseña", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
               txtuser.grabFocus();
            }else{
                if (estado_user.equals("Inactivo")) {
                    JOptionPane.showMessageDialog(null, "                Usuario Inactivo \n Póngase en contacto con el Administrador", "ACCESO DENEGADO", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        PreparedStatement pst = cn.prepareStatement("SELECT * FROM usuarios WHERE username=? and password=?");
                        pst.setString(1, txtuser.getText());
                        pst.setString(2, txtpas.getText());
                        rs = pst.executeQuery();
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "Bienvenido");
                            cuestionario c = new cuestionario();
                            c.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario o Contraseña inválido", "ACCESO DENEGADO", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btningrearActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?","Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        System.exit(0);

    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningrear;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtpas;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
