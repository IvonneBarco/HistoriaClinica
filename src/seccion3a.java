
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class seccion3a extends javax.swing.JInternalFrame {

    public seccion3a() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtdiscapacidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tipopoblacion = new javax.swing.JComboBox<String>();
        salud = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        tipoafiliacion = new javax.swing.JComboBox<String>();
        jLabel16 = new javax.swing.JLabel();
        txteps = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtips = new javax.swing.JTextField();
        discapacidad = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        vidasaludable = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        adultomayor = new javax.swing.JComboBox<String>();
        jLabel18 = new javax.swing.JLabel();
        txtadultomayor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        organizacion = new javax.swing.JComboBox<String>();
        jButton2 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        labuser = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setTitle("3.1. Características");
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
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 31, 489, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "CARACTERÍSTICAS SOCIALES Y DE SALUD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("CUAL:");

        txtdiscapacidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtdiscapacidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdiscapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiscapacidadKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("TIPO DE POBLACIÓN:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("AFILIACIÓN EN SALUD:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("PRESENTA DISPACIDAD:");

        tipopoblacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        salud.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        salud.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        salud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saludActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("TIPO DE AFILIACIÓN:");

        tipoafiliacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tipoafiliacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Subsidiado", "Contributivo", "B/C" }));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("QUE EPS LO ASISTE:");

        txteps.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txteps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txteps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtepsKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("QUE IPS LE PRESTA SUS SERVICIOS:");

        txtips.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtips.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtips.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtipsKeyTyped(evt);
            }
        });

        discapacidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        discapacidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        discapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discapacidadActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("PARTICIPA EN ESTILOS DE VIDA SALUDABLE:");

        vidasaludable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        vidasaludable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("PERTENECE A UN GRUPO DE ADULTO MAYOR:");

        adultomayor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        adultomayor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        adultomayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultomayorActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("CUAL:");

        txtadultomayor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtadultomayor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtadultomayor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtadultomayorKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("PERTENECE A UNA ORGANIZACION COMUNITARIA, SOCIAL:");

        organizacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        organizacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vidasaludable, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(organizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtadultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipopoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoafiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtips, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tipopoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tipoafiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(vidasaludable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(adultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtadultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(organizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 87, -1, 340));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

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
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel21.setText("REGISTRO:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 484, -1, -1));

        labuser.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        getContentPane().add(labuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 483, 358, 15));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        String[] cedulas = new String[1];
        int poblacion = 0;

        try {
            Statement s;
            s = cn.createStatement();
            ResultSet r = s.executeQuery("SELECT id FROM tipos_poblacion WHERE tipo = '" + tipopoblacion.getSelectedItem().toString() + "'");
            while (r.next()) {
                poblacion = r.getInt("id");

            }
        } catch (Exception e) {
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
        if (txteps.getText().isEmpty() || txtips.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else if (txteps.getText().isEmpty() && txtips.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE personas SET id_tipo_poblacion='" + poblacion + "',afiliacion_salud='" + salud.getSelectedItem().toString() + "' , tipo_salud='" + tipoafiliacion.getSelectedItem().toString() + "', eps='" + txteps.getText() + "', ips='" + txtips.getText() + "',discapacidad='" + discapacidad.getSelectedItem().toString() + "',caract_discapacidad='" + txtdiscapacidad.getText() + "',estilo_vida_saludable='" + vidasaludable.getSelectedItem().toString() + "',adulto_mayor='" + adultomayor.getSelectedItem().toString() + "',grupo_adulto_mayor='" + txtadultomayor.getText() + "',organizacion_comun='" + organizacion.getSelectedItem().toString() + "' WHERE numero_identificacion='" + cedulas[0] + "'");
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }

        }

    }//GEN-LAST:event_guardarActionPerformed

    private void txtepsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtepsKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtepsKeyTyped

    private void txtipsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtipsKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtipsKeyTyped

    private void txtdiscapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiscapacidadKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdiscapacidadKeyTyped

    private void txtadultomayorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadultomayorKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtadultomayorKeyTyped

    private void saludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saludActionPerformed

        String[] afiliacion = {"Subsidiado", "Contributivo", "B/C"};
        if (salud.getSelectedItem().toString().equals("Si")) {
            tipoafiliacion.setEnabled(true);
            tipoafiliacion.setModel(new DefaultComboBoxModel(afiliacion));
        } else {
            tipoafiliacion.setEnabled(false);
            tipoafiliacion.removeAllItems();
        }
    }//GEN-LAST:event_saludActionPerformed

    private void discapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discapacidadActionPerformed

        if (discapacidad.getSelectedItem().toString().equals("Si")) {
            txtdiscapacidad.setEnabled(true);
        } else {
            txtdiscapacidad.setEnabled(false);
            txtdiscapacidad.setText("");
        }
    }//GEN-LAST:event_discapacidadActionPerformed

    private void adultomayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultomayorActionPerformed

        if (adultomayor.getSelectedItem().toString().equals("Si")) {
            txtadultomayor.setEnabled(true);
        } else {
            txtadultomayor.setEnabled(false);
            txtadultomayor.setText("");
        }
    }//GEN-LAST:event_adultomayorActionPerformed

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
            Statement sta;
            sta = cn.createStatement();
            ResultSet s = sta.executeQuery("SELECT * FROM tipos_poblacion");
            while (s.next()) {
                tipopoblacion.addItem(s.getString("tipo"));

            }
        } catch (Exception e) {
        }
        labuser.setText(nom + " " + ape);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adultomayor;
    private javax.swing.JComboBox<String> discapacidad;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labuser;
    private javax.swing.JComboBox<String> organizacion;
    private javax.swing.JComboBox<String> salud;
    private javax.swing.JComboBox<String> tipoafiliacion;
    private javax.swing.JComboBox<String> tipopoblacion;
    private javax.swing.JTextField txtadultomayor;
    private javax.swing.JTextField txtdiscapacidad;
    private javax.swing.JTextField txteps;
    private javax.swing.JTextField txtips;
    private javax.swing.JComboBox<String> vidasaludable;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
