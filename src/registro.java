
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class registro extends javax.swing.JDialog {

    
    public registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(409,650);
        this.setResizable(false); 
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnregistrar = new javax.swing.JButton();
        btnsalir2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpas = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnick = new javax.swing.JTextField();
        txtpas2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("REGISTRO DE USUARIOS");
        setAutoRequestFocus(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnregistrar.setBackground(new java.awt.Color(51, 255, 51));
        btnregistrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reg1.png"))); // NOI18N
        btnregistrar.setBorder(null);
        btnregistrar.setBorderPainted(false);
        btnregistrar.setContentAreaFilled(false);
        btnregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnregistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reg3.png"))); // NOI18N
        btnregistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reg2.png"))); // NOI18N
        btnregistrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnregistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnsalir2.setBackground(new java.awt.Color(204, 0, 0));
        btnsalir2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnsalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_salir.png"))); // NOI18N
        btnsalir2.setBorder(null);
        btnsalir2.setBorderPainted(false);
        btnsalir2.setContentAreaFilled(false);
        btnsalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_salir3.png"))); // NOI18N
        btnsalir2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_salir2.png"))); // NOI18N
        btnsalir2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsalir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("REPITA SU CONTRASEÑA");

        txtnom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("NOMBRES");

        txtpas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("APELLIDOS");

        txtape.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapeKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("NICK");

        txtnick.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtpas2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtpas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpas2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("CONTRASEÑA");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE USUARIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpas, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(txtnick)
                    .addComponent(txtape)
                    .addComponent(txtnom)
                    .addComponent(txtpas2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnick, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpas2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 330, 580));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

        if(txtnom.getText().isEmpty() || txtape.getText().isEmpty() || txtnick.getText().isEmpty() || txtpas.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);

        }else{
            if(txtnom.getText().isEmpty() && txtape.getText().isEmpty() && txtnick.getText().isEmpty() && txtpas.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
            }else{
                if(!txtpas.getText().equals(txtpas2.getText())){
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden "+"\n"+"Por favor digite las contraseñas nuevamente", "CONFIRMACION DE CLAVE", JOptionPane.WARNING_MESSAGE);
                }else{

                    try {

                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM usuarios WHERE username ='" + txtnick.getText() + "'");
                        if(!rs.next()){
                            try {
                                PreparedStatement pst = cn.prepareStatement("INSERT INTO usuarios( nombres, apellidos, username, password,estado) VALUES(?,?,?,?,?)");
                                pst.setString(1,txtnom.getText());
                                pst.setString(2,txtape.getText());
                                pst.setString(3,txtnick.getText());
                                pst.setString(4,txtpas.getText());
                                pst.setString(5,"Activo");
                                int n = pst.executeUpdate();

                                if(n>0){
                                    JOptionPane.showMessageDialog(null, " Usuario registrado con exito");
                                }
                                txtnom.setText("");
                                txtape.setText("");
                                txtnick.setText("");
                                txtpas.setText("");
                                txtpas2.setText("");
                                txtnom.grabFocus();
                            } catch (Exception e) {
                            }
                        }else{

                            JOptionPane.showMessageDialog(null, "Este NICK ya existe", "CONFIRMACION DE CUENTA", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped

        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapeKeyTyped

        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtapeKeyTyped

    private void txtpas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpas2ActionPerformed

    }//GEN-LAST:event_txtpas2ActionPerformed

    private void btnsalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir2ActionPerformed

        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar el formulario?","CERRAR FORMULARIO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        this.setVisible(false);

    }//GEN-LAST:event_btnsalir2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar el formulario?","CERRAR FORMULARIO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtnick;
    private javax.swing.JTextField txtnom;
    private javax.swing.JPasswordField txtpas;
    private javax.swing.JPasswordField txtpas2;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
