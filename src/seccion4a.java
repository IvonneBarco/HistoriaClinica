
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class seccion4a extends javax.swing.JInternalFrame {

    public seccion4a() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ocupacion = new javax.swing.JComboBox<String>();
        ingresos = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtingresos = new javax.swing.JTextField();
        programacolmayor = new javax.swing.JComboBox<String>();
        jLabel19 = new javax.swing.JLabel();
        tipoocupacion = new javax.swing.JComboBox<String>();
        ingresomensual = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        usatec = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        cuentatec = new javax.swing.JComboBox<String>();
        jLabel13 = new javax.swing.JLabel();
        requieretec = new javax.swing.JComboBox<String>();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        labuser = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setTitle("4.1. Características");
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "CARACTERISTICAS ECONÓMICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("OCUPACIÓN:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("RECIBE INGRESOS:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("PERTENECE AL PROGRAMA COLOMBIA MAYOR:");

        ocupacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ocupacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin Actividad", "Trabajando" }));
        ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupacionActionPerformed(evt);
            }
        });

        ingresos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ingresos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("DE DONDE PROVIENEN:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("SUS INGRESOS MENSUALES ESTAN ENTRE:");

        txtingresos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtingresos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtingresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingresosKeyTyped(evt);
            }
        });

        programacolmayor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        programacolmayor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("EN QUE:");

        tipoocupacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tipoocupacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oficios del Hogar", "Pensionado", "Otro" }));

        ingresomensual.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("USA AYUDA TÉCNICA:");

        usatec.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usatec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("CUENTA CON AYUDA TÉCNICA:");

        cuentatec.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cuentatec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("REQUIERE AYUDA TÉCNICA:");

        requieretec.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        requieretec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(programacolmayor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(requieretec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usatec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cuentatec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(tipoocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtingresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(programacolmayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(usatec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cuentatec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(requieretec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 87, -1, -1));

        guardar.setBackground(new java.awt.Color(51, 255, 51));
        guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_ag1.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_ag3.png"))); // NOI18N
        guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_ag2.png"))); // NOI18N
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_lim1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_lim3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_lim2.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel21.setText("REGISTRO:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 488, -1, -1));

        labuser.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        getContentPane().add(labuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 487, 358, 15));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        String[] cedulas = new String[1];

        int ingresomen = 0;
        try {
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id FROM ingresos_mensuales WHERE ingresos_rango = '" + ingresomensual.getSelectedItem().toString() + "'");
            while (rs.next()) {
                ingresomen = rs.getInt("id");

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

        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE personas SET ocupacion='" + ocupacion.getSelectedItem().toString() + "',tipo_ocupacion='" + tipoocupacion.getSelectedItem().toString() + "',ingresos='" + ingresos.getSelectedItem().toString() + "',fuente_ingresos='" + txtingresos.getText() + "',prog_colombia_mayor='" + programacolmayor.getSelectedItem().toString() + "',ayuda_tecnica_usa='" + usatec.getSelectedItem().toString() + "',ayuda_tecnica_requiere='" + requieretec.getSelectedItem().toString() + "',ayuda_tecnica='" + cuentatec.getSelectedItem().toString() + "',id_ingreso_mensual='" + ingresomen + "' WHERE numero_identificacion='" + cedulas[0] + "'");
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }


    }//GEN-LAST:event_guardarActionPerformed

    private void txtingresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresosKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtingresosKeyTyped

    private void ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupacionActionPerformed

        String[] ocup = {"Oficios del Hogar", "Pensionado", "Otro"};
        if (ocupacion.getSelectedItem().toString().equals("Trabajando")) {
            tipoocupacion.setEnabled(true);
            tipoocupacion.setModel(new DefaultComboBoxModel(ocup));
        } else {
            tipoocupacion.setEnabled(false);
            tipoocupacion.removeAllItems();
        }
    }//GEN-LAST:event_ocupacionActionPerformed

    private void ingresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresosActionPerformed
        
        
        if (ingresos.getSelectedItem().toString().equals("Si")) {
            txtingresos.setEnabled(true);
        } else {
            txtingresos.setEnabled(false);
            txtingresos.setText("");

        }
    }//GEN-LAST:event_ingresosActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        String ocupvac = " ";

        tipoocupacion.setEnabled(false);
        tipoocupacion.removeAllItems();
        tipoocupacion.addItem(ocupvac);
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
            ResultSet s = sta.executeQuery("SELECT * FROM ingresos_mensuales");
            while (s.next()) {
                ingresomensual.addItem(s.getString("ingresos_rango"));

            }
        } catch (Exception e) {
        }

        labuser.setText(nom + " " + ape);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cuentatec;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> ingresomensual;
    private javax.swing.JComboBox<String> ingresos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labuser;
    private javax.swing.JComboBox<String> ocupacion;
    private javax.swing.JComboBox<String> programacolmayor;
    private javax.swing.JComboBox<String> requieretec;
    private javax.swing.JComboBox<String> tipoocupacion;
    private javax.swing.JTextField txtingresos;
    private javax.swing.JComboBox<String> usatec;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
