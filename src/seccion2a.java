
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class seccion2a extends javax.swing.JInternalFrame {

    public seccion2a() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtotropared = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipovi = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        condicionesvi = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        matpared = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        matpiso = new javax.swing.JComboBox<String>();
        jLabel16 = new javax.swing.JLabel();
        txtotropiso = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtotrotipo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mattecho = new javax.swing.JComboBox<String>();
        jLabel18 = new javax.swing.JLabel();
        txtotrotecho = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtnumalcobas = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtnumpiso = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtnumbaños = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtnumcocinas = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtnumhogares = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtnumpersonas = new javax.swing.JTextField();
        espacios = new javax.swing.JComboBox<String>();
        acceso = new javax.swing.JComboBox<String>();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        labuser = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setTitle("2.1. Características");
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
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 19, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "CARACTERÍSTICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("CUAL:");

        txtotropared.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotropared.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotropared.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotroparedKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("TIPO DE VIVIENDA:");

        tipovi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tipovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoviActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("CONDICIONES DE LA VIVIENDA:");

        condicionesvi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        condicionesvi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buena", "Mala", "Regular" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("MATERIAL PREDOMINANTE DE LAS PAREDES:");

        matpared.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        matpared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matparedActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("MATERIAL PREDOMINANTE DE LOS PISOS:");

        matpiso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        matpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matpisoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("CUAL:");

        txtotropiso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotropiso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotropiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotropisoKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("CUAL:");

        txtotrotipo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotrotipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotrotipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotrotipoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("MATERIAL PREDOMINANTE DEL TECHO:");

        mattecho.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        mattecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mattechoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("CUAL:");

        txtotrotecho.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotrotecho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotrotecho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotrotechoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mattecho, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(matpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matpared, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotropared, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotropiso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotrotecho, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipovi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtotrotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(condicionesvi, 0, 82, Short.MAX_VALUE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tipovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtotrotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(condicionesvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(matpared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtotropared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(matpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtotropiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(mattecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtotrotecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 58, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "DISTRIBUCION DE LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("ESPACIOS SEPARADOS:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("ACCESO INDEPENDIENTE:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("No. DE PISOS:");

        txtnumalcobas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumalcobas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumalcobas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumalcobasKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("No. DE ALCOBAS:");

        txtnumpiso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumpiso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumpisoKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("No. DE BAÑOS:");

        txtnumbaños.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumbaños.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumbaños.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumbañosKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("No. DE COCINAS:");

        txtnumcocinas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumcocinas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumcocinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumcocinasKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("No. DE HOGARES QUE HABITAN LA VIVIENDA:");

        txtnumhogares.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumhogares.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumhogares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumhogaresKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("No. PERSONAS QUE HABITAN LA VIVIENDA: ");

        txtnumpersonas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumpersonas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumpersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumpersonasKeyTyped(evt);
            }
        });

        espacios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        espacios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        acceso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        acceso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(espacios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumbaños, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumalcobas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumcocinas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumhogares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtnumpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(espacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)
                                .addComponent(txtnumbaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumalcobas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumcocinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtnumhogares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtnumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 268, 783, -1));

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
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel19.setText("REGISTRO:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 480, -1, -1));

        labuser.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        getContentPane().add(labuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 479, 348, 15));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        String[] id = new String[1];
        int tipvi = 0;
        int matpar = 0;
        int matpis = 0;
        int mattech = 0;

        try {
            Statement s;
            s = cn.createStatement();
            ResultSet r = s.executeQuery("SELECT id FROM tipos_vivienda WHERE tipo_vivienda = '" + tipovi.getSelectedItem().toString() + "'");
            while (r.next()) {
                tipvi = r.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement sta;
            sta = cn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT id FROM materiales WHERE material = '" + matpared.getSelectedItem().toString() + "'");
            while (rs.next()) {
                matpar = rs.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement st;
            st = cn.createStatement();
            ResultSet res = st.executeQuery("SELECT id FROM materiales WHERE material = '" + matpiso.getSelectedItem().toString() + "'");
            while (res.next()) {
                matpis = res.getInt("id");

            }
        } catch (Exception e) {
        }

        try {
            Statement t;
            t = cn.createStatement();
            ResultSet rest = t.executeQuery("SELECT id FROM materiales WHERE material = '" + mattecho.getSelectedItem().toString() + "'");
            while (rest.next()) {
                mattech = rest.getInt("id");

            }
        } catch (Exception e) {
        }

        if (txtnumpiso.getText().isEmpty() || txtnumalcobas.getText().isEmpty() || txtnumbaños.getText().isEmpty() || txtnumcocinas.getText().isEmpty() || txtnumhogares.getText().isEmpty() || txtnumpersonas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else if (txtnumpiso.getText().isEmpty() && txtnumalcobas.getText().isEmpty() && txtnumbaños.getText().isEmpty() && txtnumcocinas.getText().isEmpty() && txtnumhogares.getText().isEmpty() && txtnumpersonas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else {

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
                PreparedStatement pst = cn.prepareStatement("UPDATE persona_vivienda SET  id_tipo_vivienda='" + tipvi + "',otro_tipo_vivienda='" + txtotrotipo.getText() + "',condicion_vivienda='" + condicionesvi.getSelectedItem().toString() + "',id_material_pared='" + matpar + "',id_material_piso='" + matpis + "',id_material_techo='" + mattech + "',otro_material_pared='" + txtotropared.getText() + "',otro_material_piso='" + txtotropiso.getText() + "',otro_material_techo='" + txtotrotecho.getText() + "',espacios_separados='" + espacios.getSelectedItem().toString() + "',acceso_independiente='" + acceso.getSelectedItem().toString() + "',nro_pisos='" + txtnumpiso.getText() + "',nro_alcobas='" + txtnumalcobas.getText() + "',nro_banos='" + txtnumbaños.getText() + "',nro_cocinas='" + txtnumcocinas.getText() + "',nro_hogares='" + txtnumhogares.getText() + "',total_personas='" + txtnumpersonas.getText() + "' WHERE id_persona= '" + id[0] + "'");
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }

        }

    }//GEN-LAST:event_guardarActionPerformed

    private void txtotrotipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotrotipoKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotrotipoKeyTyped

    private void txtotroparedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotroparedKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotroparedKeyTyped

    private void txtotropisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotropisoKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotropisoKeyTyped

    private void txtotrotechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotrotechoKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotrotechoKeyTyped

    private void txtnumpisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumpisoKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumpisoKeyTyped

    private void txtnumbañosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumbañosKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumbañosKeyTyped

    private void txtnumalcobasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumalcobasKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumalcobasKeyTyped

    private void txtnumcocinasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumcocinasKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumcocinasKeyTyped

    private void txtnumhogaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumhogaresKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumhogaresKeyTyped

    private void txtnumpersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumpersonasKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumpersonasKeyTyped

    private void tipoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoviActionPerformed

        if (tipovi.getSelectedItem().toString().equals("Otro")) {
            txtotrotipo.setEnabled(true);
        } else {
            txtotrotipo.setEnabled(false);
            txtotrotipo.setText("");
        }
    }//GEN-LAST:event_tipoviActionPerformed

    private void matparedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matparedActionPerformed

        if (matpared.getSelectedItem().toString().equals("Otro")) {
            txtotropared.setEnabled(true);
        } else {
            txtotropared.setEnabled(false);
            txtotropared.setText("");
        }
    }//GEN-LAST:event_matparedActionPerformed

    private void matpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matpisoActionPerformed

        if (matpiso.getSelectedItem().toString().equals("Otro")) {
            txtotropiso.setEnabled(true);
        } else {
            txtotropiso.setEnabled(false);
            txtotropiso.setText("");
        }
    }//GEN-LAST:event_matpisoActionPerformed

    private void mattechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mattechoActionPerformed

        if (mattecho.getSelectedItem().toString().equals("Otro")) {
            txtotrotecho.setEnabled(true);
        } else {
            txtotrotecho.setEnabled(false);
            txtotrotecho.setText("");
        }
    }//GEN-LAST:event_mattechoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        txtotrotipo.setEnabled(false);
        txtotropared.setEnabled(false);
        txtotropiso.setEnabled(false);
        txtotrotecho.setEnabled(false);

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
            Statement ts;
            ts = cn.createStatement();
            ResultSet rel = ts.executeQuery("SELECT * FROM tipos_vivienda");
            while (rel.next()) {
                tipovi.addItem(rel.getString("tipo_vivienda"));

            }
        } catch (Exception e) {
        }

        try {
            Statement sta;
            sta = cn.createStatement();
            ResultSet s = sta.executeQuery("SELECT * FROM materiales WHERE id_tipo_material = '" + 1 + "'");
            while (s.next()) {
                matpared.addItem(s.getString("material"));

            }
        } catch (Exception e) {
        }

        try {
            Statement ta;
            ta = cn.createStatement();
            ResultSet sr = ta.executeQuery("SELECT * FROM materiales WHERE id_tipo_material = '" + 2 + "'");
            while (sr.next()) {
                matpiso.addItem(sr.getString("material"));

            }
        } catch (Exception e) {
        }

        try {
            Statement at;
            at = cn.createStatement();
            ResultSet rt = at.executeQuery("SELECT * FROM materiales WHERE id_tipo_material = '" + 3 + "'");
            while (rt.next()) {
                mattecho.addItem(rt.getString("material"));

            }
        } catch (Exception e) {
        }
        labuser.setText(nom + " " + ape);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acceso;
    private javax.swing.JComboBox<String> condicionesvi;
    private javax.swing.JComboBox<String> espacios;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labuser;
    private javax.swing.JComboBox<String> matpared;
    private javax.swing.JComboBox<String> matpiso;
    private javax.swing.JComboBox<String> mattecho;
    private javax.swing.JComboBox<String> tipovi;
    private javax.swing.JTextField txtnumalcobas;
    private javax.swing.JTextField txtnumbaños;
    private javax.swing.JTextField txtnumcocinas;
    private javax.swing.JTextField txtnumhogares;
    private javax.swing.JTextField txtnumpersonas;
    private javax.swing.JTextField txtnumpiso;
    private javax.swing.JTextField txtotropared;
    private javax.swing.JTextField txtotropiso;
    private javax.swing.JTextField txtotrotecho;
    private javax.swing.JTextField txtotrotipo;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
