
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class seccion1b extends javax.swing.JInternalFrame {

    public seccion1b() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtbar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sector = new javax.swing.JComboBox<String>();
        jLabel15 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        estrato = new javax.swing.JComboBox<String>();
        depgeo = new javax.swing.JComboBox<String>();
        mungeo = new javax.swing.JComboBox<String>();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        labuser = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setTitle("1.2. Identificación Geográfica de la Vivienda");
        setPreferredSize(new java.awt.Dimension(1292, 964));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setText("CARACTERIZACIÓN POBLACIÓN ADULTO MAYOR");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 31, 605, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "IDENTIFICACION GEOGRAFICA DE LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("MUNICIPIO:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("DEPARTAMENTO:");

        txtbar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtbar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbarKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("BARRIO O VEREDA:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("SECTOR:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("ESTRATO:");

        sector.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rural", "Urbano" }));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("CELULAR:");

        txtcelular.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtcelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });

        estrato.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        estrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

        depgeo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        depgeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depgeoActionPerformed(evt);
            }
        });

        mungeo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(depgeo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mungeo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcelular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sector, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(sector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depgeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mungeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(estrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, -1, -1));

        guardar.setBackground(new java.awt.Color(51, 255, 51));
        guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_ag1.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_ag3.png"))); // NOI18N
        guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_ag2.png"))); // NOI18N
        guardar.setVerifyInputWhenFocusTarget(false);
        guardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_lim1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_lim3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_lim2.png"))); // NOI18N
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 230, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel19.setText("REGISTRO:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 495, -1, -1));

        labuser.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        getContentPane().add(labuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 494, 347, 15));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        String[] cedulas = new String[1];
        int idmungeo = 0;
        int id = 0;
        
        try {
            Statement xm;
            xm = cn.createStatement();
            ResultSet rm = xm.executeQuery("SELECT id FROM municipios WHERE municipio = '"+mungeo.getSelectedItem().toString()+"'");
            while(rm.next()){
                idmungeo = rm.getInt("id");
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement s;
            s = cn.createStatement();
            ResultSet r = s.executeQuery("SELECT numero_identificacion FROM personas ");
            while (r.next()) {
                cedulas[0] = r.getString(1);
            }
        } catch (Exception e) {
        }

        try {
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id FROM personas WHERE numero_identificacion='" + cedulas[0] + "'");
            while (rs.next()) {
                id = rs.getInt("id");

            }
        } catch (Exception e) {
        }

        if (txtbar.getText().isEmpty() || txtcelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else if (txtbar.getText().isEmpty() && txtcelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Statement es;
                es = cn.createStatement();
                ResultSet ax = es.executeQuery("SELECT id_persona FROM persona_vivienda WHERE id_persona='" + id + "'");
                if (!ax.next()) {
                    try {
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO persona_vivienda(id_persona,sector,barrio_vereda,estrato,celular,id_municipio) VALUES(?,?,?,?,?,?)");
                        pst.setInt(1, id);
                        pst.setString(2, sector.getSelectedItem().toString());
                        pst.setString(3, txtbar.getText());
                        pst.setString(4, estrato.getSelectedItem().toString());
                        pst.setString(5, txtcelular.getText());
                        pst.setInt(6, idmungeo);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Esta seccion ya ha sido guardada", "CONFIRMACION DE REGISTRO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
            }
            
            
        }
        


    }//GEN-LAST:event_guardarActionPerformed

    private void txtbarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbarKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtbarKeyTyped

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        String[] cedulas = new String[1];
        String nom = "";
        String ape = "";

        try {
            Statement s;
            s = cn.createStatement();
            ResultSet r = s.executeQuery("SELECT numero_identificacion FROM personas ");
            while (r.next()) {
                cedulas[0] = r.getString(1);
            }
        } catch (Exception e) {
        }

        try {
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombres FROM personas WHERE numero_identificacion = '" + cedulas[0] + "' ");
            while (rs.next()) {
                nom = rs.getString(1);
            }
        } catch (Exception e) {
        }

        try {
            Statement t;
            t = cn.createStatement();
            ResultSet res = t.executeQuery("SELECT apellidos FROM personas WHERE numero_identificacion = '" + cedulas[0] + "' ");
            while (res.next()) {
                ape = res.getString(1);
            }
        } catch (Exception e) {
        }

        try {
            Statement r;
            r = cn.createStatement();
            ResultSet st = r.executeQuery("SELECT departamento FROM departamentos");
            while (st.next()) {
                depgeo.addItem(st.getString("departamento"));

            }
        } catch (Exception e) {
        }
        labuser.setText(nom + " " + ape);
    }//GEN-LAST:event_formInternalFrameOpened

    private void depgeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depgeoActionPerformed
        
         int iddep = 0;
     
       try {
            Statement xm;
            xm = cn.createStatement();
            ResultSet rm = xm.executeQuery("SELECT id FROM departamentos WHERE departamento = '"+depgeo.getSelectedItem().toString()+"'");
            while(rm.next()){
                iddep = rm.getInt("id");
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement t;
            t = cn.createStatement();
            ResultSet rest = t.executeQuery("SELECT municipio FROM municipios WHERE id_departamento = '"+iddep+"'");
            while(rest.next()){
                mungeo.addItem(rest.getString("municipio"));
                
        } 
        }catch (Exception e) {
        }
    }//GEN-LAST:event_depgeoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> depgeo;
    private javax.swing.JComboBox<String> estrato;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labuser;
    private javax.swing.JComboBox<String> mungeo;
    private javax.swing.JComboBox<String> sector;
    private javax.swing.JTextField txtbar;
    private javax.swing.JTextField txtcelular;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
