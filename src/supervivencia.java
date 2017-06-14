
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class supervivencia extends javax.swing.JDialog {


    public supervivencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
        this.setResizable(false);
        supervivencia("");
        btnactualizar.setEnabled(false);
        act_super.setEnabled(false);
    }
    
    void supervivencia(String val){
        
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("IDENTIFICACIÓN");
        modelo1.addColumn("NOMBRES");
        modelo1.addColumn("APELLIDOS");
        modelo1.addColumn("SUPERVIVENCIA ACTUAL");
        tabsupervivencia.setModel(modelo1);
        
        String sql = "";
        
         if (val.equals("")) {
             sql = "SELECT numero_identificacion,nombres,apellidos,supervivencia FROM personas";
         } else {
             sql = "SELECT numero_identificacion,nombres,apellidos,supervivencia FROM personas WHERE numero_identificacion like '%" + val + "%' ";
         }
        String []datos = new String[4];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo1.addRow(datos);   
            } 
            tabsupervivencia.setModel(modelo1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El número de identificacíon ingresado no existe", "ERROR DE IDENTIFICACIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabsupervivencia = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtval = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        act_super = new javax.swing.JComboBox<String>();
        btnactualizar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jMenuItem1.setText("Actualizar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setText("ACTUALIZACIÓN DE SUPERVIVENCIA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 35, -1, -1));

        tabsupervivencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabsupervivencia.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabsupervivencia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 174, 666, 216));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        txtval.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Boton2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono20.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("BUSQUEDA POR ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 79, 365, -1));

        act_super.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        act_super.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vivo", "Fallecido" }));
        getContentPane().add(act_super, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 409, 110, -1));

        btnactualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/act1.png"))); // NOI18N
        btnactualizar.setBorder(null);
        btnactualizar.setBorderPainted(false);
        btnactualizar.setContentAreaFilled(false);
        btnactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/act3.png"))); // NOI18N
        btnactualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/act2.png"))); // NOI18N
        btnactualizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnactualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 408, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("SUPERVIVECIA:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 410, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalKeyTyped

        char c = evt.getKeyChar();
        
            if((c<'0' || c>'9') && (c<' ' || c>' ')) evt.consume();
        
    }//GEN-LAST:event_txtvalKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        supervivencia(txtval.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        String supervi = "";
        
        int fila = tabsupervivencia.getSelectedRow();
        if(fila >= 0){
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT supervivencia FROM personas WHERE numero_identificacion = '"+tabsupervivencia.getValueAt(fila, 0).toString()+"'");
            while(rs.next()){
                supervi = rs.getString("supervivencia");
                act_super.setSelectedItem(supervi);
                btnactualizar.setEnabled(true);
                act_super.setEnabled(true);
            } 
            
        } catch (SQLException ex) {
            
        }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla", "ACTUALIZAR SUPERVIVENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        
        int fila = tabsupervivencia.getSelectedRow();
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Realmente desea actualizar la supervivencia?", "ACTUALIZAR SUPERVIVENCIA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE personas SET supervivencia='" + act_super.getSelectedItem().toString() + "' WHERE numero_identificacion = '" + tabsupervivencia.getValueAt(fila, 0).toString() + "'");
                pst.executeUpdate();
                supervivencia("");
                btnactualizar.setEnabled(false);
                act_super.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Actualización Exitosa");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
            
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> act_super;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabsupervivencia;
    private javax.swing.JTextField txtval;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
