
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class seccion2b extends javax.swing.JInternalFrame {

    public seccion2b() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtagua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        obtenagua = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        combustible = new javax.swing.JComboBox<String>();
        jLabel16 = new javax.swing.JLabel();
        txtcombustible = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        basuras = new javax.swing.JComboBox<String>();
        jLabel18 = new javax.swing.JLabel();
        txtbasuras = new javax.swing.JTextField();
        energiaelectrica = new javax.swing.JComboBox<String>();
        alcantarillado = new javax.swing.JComboBox<String>();
        jLabel17 = new javax.swing.JLabel();
        serviciosan = new javax.swing.JComboBox<String>();
        jLabel19 = new javax.swing.JLabel();
        txtsanitario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        ubicacionvivienda = new javax.swing.JComboBox<String>();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        vivienda = new javax.swing.JComboBox<String>();
        jLabel30 = new javax.swing.JLabel();
        txtvivienda = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        labuser = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setTitle("2.2. Servicios con que cuenta la Vivienda");
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
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 19, 489, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "SERVICIOS CON QUE CUENTA LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("CUAL:");

        txtagua.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtagua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtagua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaguaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ENERGÍA ELÉCTRICA:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("ALCANTARILLADO:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("OBTENCIÓN AGUA PARA CONSUMO:");

        obtenagua.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        obtenagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenaguaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("COMBUSTIBLE PARA COCINAR:");

        combustible.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        combustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustibleActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("CUAL:");

        txtcombustible.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtcombustible.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcombustible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcombustibleKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("ELIMINACIÓN DE BASURAS:");

        basuras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        basuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basurasActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("CUAL:");

        txtbasuras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtbasuras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbasuras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbasurasKeyTyped(evt);
            }
        });

        energiaelectrica.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        energiaelectrica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        alcantarillado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        alcantarillado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("SERVICIO SANITARIO USADO:");

        serviciosan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        serviciosan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciosanActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("CUAL:");

        txtsanitario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtsanitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsanitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsanitarioKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("UBICACIÓN DEL SERVICIO SANITARIO:");

        ubicacionvivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ubicacionvivienda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dentro de la Vivienda", "Fuera de la Vivienda" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(energiaelectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alcantarillado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(serviciosan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtsanitario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(basuras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtbasuras, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combustible, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtcombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(obtenagua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtagua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubicacionvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(energiaelectrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(alcantarillado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(obtenagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(combustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtcombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(basuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtbasuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(serviciosan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtsanitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ubicacionvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 58, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "TENENCIA DE LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("VIVIENDA:");

        vivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        vivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viviendaActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("CUAL:");

        txtvivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtvivienda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvivienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtviviendaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(txtvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 354, -1, -1));

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
        guardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 448, -1, -1));

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
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 448, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel21.setText("REGISTRO:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 483, -1, -1));

        labuser.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        getContentPane().add(labuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 482, 352, 15));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        String[] id = new String[1];

        int agua = 0;
        int combust = 0;
        int elmbas = 0;
        int servsa = 0;
        int tenviv = 0;

        try {
            Statement tat;
            tat = cn.createStatement();
            ResultSet rn = tat.executeQuery("SELECT id FROM servicios WHERE descripcion = '" + obtenagua.getSelectedItem().toString() + "'");
            while (rn.next()) {
                agua = rn.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement sta;
            sta = cn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT id FROM servicios WHERE descripcion = '" + combustible.getSelectedItem().toString() + "'");
            while (rs.next()) {
                combust = rs.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement st;
            st = cn.createStatement();
            ResultSet res = st.executeQuery("SELECT id FROM servicios WHERE descripcion = '" + basuras.getSelectedItem().toString() + "'");
            while (res.next()) {
                elmbas = res.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement t;
            t = cn.createStatement();
            ResultSet rest = t.executeQuery("SELECT id FROM servicios WHERE descripcion = '" + serviciosan.getSelectedItem().toString() + "'");
            while (rest.next()) {
                servsa = rest.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement tr;
            tr = cn.createStatement();
            ResultSet srt = tr.executeQuery("SELECT id FROM  tenencia_vivienda WHERE tipo_tenencia = '" + vivienda.getSelectedItem().toString() + "'");
            while (srt.next()) {
                tenviv = srt.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement s;
            s = cn.createStatement();
            ResultSet r = s.executeQuery("SELECT id_persona FROM persona_vivienda ");
            while (r.next()) {
                id[0] = r.getString("id_persona");
            }
        } catch (Exception e) {
        }
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE persona_vivienda SET id_obtencion_agua='" + agua + "',id_combustible_cocina='" + combust + "',id_elm_basura='" + elmbas + "',id_servicio_sanitario='" + servsa + "',id_tenencia_vivienda='" + tenviv + "',energia_electrica='" + energiaelectrica.getSelectedItem().toString() + "',alcantarillado='" + alcantarillado.getSelectedItem().toString() + "',otro_obtencion_agua='" + txtagua.getText() + "',otro_combustible_cocina='" + txtcombustible.getText() + "',otro_elm_basura='" + txtbasuras.getText() + "',otro_servicio_sanitario='" + txtsanitario.getText() + "',ubicacion_serv_sanitario='" + ubicacionvivienda.getSelectedItem().toString() + "',otro_tenencia_vivienda='" + txtvivienda.getText() + "' WHERE id_persona= '" + id[0] + "'");
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }


    }//GEN-LAST:event_guardarActionPerformed

    private void txtaguaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaguaKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtaguaKeyTyped

    private void txtcombustibleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcombustibleKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcombustibleKeyTyped

    private void txtbasurasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbasurasKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtbasurasKeyTyped

    private void txtsanitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsanitarioKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtsanitarioKeyTyped

    private void txtviviendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtviviendaKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtviviendaKeyTyped

    private void obtenaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenaguaActionPerformed

        if (obtenagua.getSelectedItem().toString().equals("Otro")) {
            txtagua.setEnabled(true);
        } else {
            txtagua.setEnabled(false);
            txtagua.setText("");
        }
    }//GEN-LAST:event_obtenaguaActionPerformed

    private void combustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combustibleActionPerformed

        if (combustible.getSelectedItem().toString().equals("Otro")) {
            txtcombustible.setEnabled(true);
        } else {
            txtcombustible.setEnabled(false);
            txtcombustible.setText("");
        }
    }//GEN-LAST:event_combustibleActionPerformed

    private void basurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basurasActionPerformed

        if (basuras.getSelectedItem().toString().equals("Otro")) {
            txtbasuras.setEnabled(true);
        } else {
            txtbasuras.setEnabled(false);
            txtbasuras.setText("");
        }
    }//GEN-LAST:event_basurasActionPerformed

    private void serviciosanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciosanActionPerformed

        if (serviciosan.getSelectedItem().toString().equals("Otro")) {
            txtsanitario.setEnabled(true);
        } else {
            txtsanitario.setEnabled(false);
            txtsanitario.setText("");
        }
    }//GEN-LAST:event_serviciosanActionPerformed

    private void viviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viviendaActionPerformed

        if (vivienda.getSelectedItem().toString().equals("Otro")) {
            txtvivienda.setEnabled(true);
        } else {
            txtvivienda.setEnabled(false);
            txtvivienda.setText("");
        }
    }//GEN-LAST:event_viviendaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        txtagua.setEnabled(false);
        txtcombustible.setEnabled(false);
        txtbasuras.setEnabled(false);
        txtsanitario.setEnabled(false);
        txtvivienda.setEnabled(false);

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
            ResultSet s = sta.executeQuery("SELECT * FROM servicios WHERE id_tipo_servicio = '" + 1 + "'");
            while (s.next()) {
                obtenagua.addItem(s.getString("descripcion"));

            }
        } catch (Exception e) {
        }

        try {
            Statement ta;
            ta = cn.createStatement();
            ResultSet sr = ta.executeQuery("SELECT * FROM servicios WHERE id_tipo_servicio = '" + 2 + "'");
            while (sr.next()) {
                combustible.addItem(sr.getString("descripcion"));

            }
        } catch (Exception e) {
        }

        try {
            Statement at;
            at = cn.createStatement();
            ResultSet rt = at.executeQuery("SELECT * FROM servicios WHERE id_tipo_servicio = '" + 3 + "'");
            while (rt.next()) {
                basuras.addItem(rt.getString("descripcion"));

            }
        } catch (Exception e) {
        }

        try {
            Statement at;
            at = cn.createStatement();
            ResultSet rt = at.executeQuery("SELECT * FROM servicios WHERE id_tipo_servicio = '" + 4 + "'");
            while (rt.next()) {
                serviciosan.addItem(rt.getString("descripcion"));

            }
        } catch (Exception e) {
        }

        try {
            Statement at;
            at = cn.createStatement();
            ResultSet rt = at.executeQuery("SELECT * FROM tenencia_vivienda ");
            while (rt.next()) {
                vivienda.addItem(rt.getString("tipo_tenencia"));

            }
        } catch (Exception e) {
        }
        labuser.setText(nom + " " + ape);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alcantarillado;
    private javax.swing.JComboBox<String> basuras;
    private javax.swing.JComboBox<String> combustible;
    private javax.swing.JComboBox<String> energiaelectrica;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labuser;
    private javax.swing.JComboBox<String> obtenagua;
    private javax.swing.JComboBox<String> serviciosan;
    private javax.swing.JTextField txtagua;
    private javax.swing.JTextField txtbasuras;
    private javax.swing.JTextField txtcombustible;
    private javax.swing.JTextField txtsanitario;
    private javax.swing.JTextField txtvivienda;
    private javax.swing.JComboBox<String> ubicacionvivienda;
    private javax.swing.JComboBox<String> vivienda;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
