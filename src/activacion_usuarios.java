
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class activacion_usuarios extends javax.swing.JDialog {

 
    public activacion_usuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        activacion_usuarios();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
        btnactivar.setEnabled(false);
        act_estado.setEnabled(false);
    }

    void activacion_usuarios(){
        
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("NOMBRES");
        modelo1.addColumn("APELLIDOS");
        modelo1.addColumn("NICK");
        modelo1.addColumn("CONTRASEÑA");
        modelo1.addColumn("ESTADO");
        tabactivacion.setModel(modelo1);
        
        String []datos = new String[5];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombres,apellidos,username,password,estado FROM usuarios");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo1.addRow(datos);   
            } 
            tabactivacion.setModel(modelo1);
        } catch (SQLException ex) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabactivacion = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        act_estado = new javax.swing.JComboBox<String>();
        btnactivar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem1.setText("Activar/Desctivar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACTIVACIÓN DE USUARIOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setText("ACTIVACIÓN DE USUARIOS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 25, -1, -1));

        tabactivacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabactivacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabactivacion.setComponentPopupMenu(jPopupMenu2);
        jScrollPane1.setViewportView(tabactivacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 69, 603, 177));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("ESTADO DEL USUARIO:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 275, -1, -1));

        act_estado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        act_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(act_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 274, 93, -1));

        btnactivar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_est1.png"))); // NOI18N
        btnactivar.setToolTipText("");
        btnactivar.setBorder(null);
        btnactivar.setBorderPainted(false);
        btnactivar.setContentAreaFilled(false);
        btnactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactivar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactivar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_est3.png"))); // NOI18N
        btnactivar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_est2.png"))); // NOI18N
        btnactivar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnactivar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 273, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 320));

        jMenu1.setText("ESTADO");

        jMenuItem2.setText("Activar todos los usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Desactiar todos los usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        String estado_user = "";
        
        int fila = tabactivacion.getSelectedRow();
        if(fila >= 0){
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT estado FROM usuarios WHERE username = '"+tabactivacion.getValueAt(fila, 2).toString()+"'");
            while(rs.next()){
                estado_user = rs.getString("estado");
                act_estado.setSelectedItem(estado_user);
                btnactivar.setEnabled(true);
                act_estado.setEnabled(true);
            } 
            
        } catch (SQLException ex) {
            
        }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla", "ACTUALIZAR ESTADO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactivarActionPerformed
        
        int fila = tabactivacion.getSelectedRow();
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Realmente desea actualizar el estado?", "ACTUALIZAR ESTADO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE usuarios SET estado='" + act_estado.getSelectedItem().toString() + "' WHERE username = '" + tabactivacion.getValueAt(fila, 2).toString() + "'");
                pst.executeUpdate();
                activacion_usuarios();
                btnactivar.setEnabled(false);
                act_estado.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Actualización Exitosa");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_btnactivarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
       try {
                PreparedStatement pst = cn.prepareStatement("UPDATE usuarios SET estado='"+"Activo"+"'");
                pst.executeUpdate();
                activacion_usuarios();
                JOptionPane.showMessageDialog(null, "Actualización Exitosa");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        try {
                PreparedStatement pst = cn.prepareStatement("UPDATE usuarios SET estado='"+"Inactivo"+"'");
                pst.executeUpdate();
                activacion_usuarios();
                JOptionPane.showMessageDialog(null, "Actualización Exitosa");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> act_estado;
    private javax.swing.JButton btnactivar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabactivacion;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
