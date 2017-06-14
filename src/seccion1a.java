
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class seccion1a extends javax.swing.JInternalFrame {

    public seccion1a() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        genero = new javax.swing.JComboBox<String>();
        tipod = new javax.swing.JComboBox<String>();
        jLabel15 = new javax.swing.JLabel();
        txtnumid = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        depex = new javax.swing.JComboBox<String>();
        munex = new javax.swing.JComboBox<String>();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        depna = new javax.swing.JComboBox<String>();
        jLabel17 = new javax.swing.JLabel();
        munna = new javax.swing.JComboBox<String>();
        fechana = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        estadociv = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        hijos = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        txthijos = new javax.swing.JTextField();
        grupoconvi = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        txtotro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        escolaridad = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setTitle("1.1. Datos Generales");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("APELLIDOS:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRES:");

        txtnom.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("TIPO DE DOCUMENTO:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("GÉNERO:");

        txtape.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtape.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapeKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("EDAD:");

        txtedad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtedad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        genero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        tipod.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("No. IDENTIFICACIÓN:");

        txtnumid.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumidKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "LUGAR DE EXPEDICION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("MUN:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("DEP:");

        depex.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        depex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depexActionPerformed(evt);
            }
        });

        munex.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(depex, 0, 188, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(munex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(depex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(munex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumid, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtedad)
                            .addComponent(genero, 0, 94, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tipod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(txtnumid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 779, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setText("CARACTERIZACIÓN POBLACIÓN ADULTO MAYOR");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 19, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "LUGAR Y FECHA DE NACIMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("FECHA DE NACIMIENTO:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("DEP:");

        depna.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        depna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depnaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("MUN:");

        munna.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechana, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depna, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(munna, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(munna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(depna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 779, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ESTADO CIVIL:");

        estadociv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("HIJOS:");

        hijos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hijos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        hijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hijosActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("CUANTOS:");

        txthijos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txthijos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txthijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthijosKeyTyped(evt);
            }
        });

        grupoconvi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        grupoconvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoconviActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("GRUPO CONVIVIENTE:");

        txtotro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotroKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("QUIEN:");

        escolaridad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("ESCOLARIDAD:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escolaridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadociv, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grupoconvi, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txthijos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(estadociv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(grupoconvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(hijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txthijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(escolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

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
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 475, -1, -1));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 475, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        String dia = Integer.toString(fechana.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(fechana.getCalendar().get(Calendar.MONTH)+1);
        String año = Integer.toString(fechana.getCalendar().get(Calendar.YEAR));
        String fecha = (dia + "/" + mes + "/" + año );
        
        
        int idmun = 0;
        int idmuna = 0;
        int doc = 0;
        int estci = 0;
        int convive = 0;
        int escol = 0;
 
        try {
            Statement s;
            s = cn.createStatement();
            ResultSet r = s.executeQuery("SELECT id FROM municipios WHERE municipio = '"+munex.getSelectedItem().toString()+"'");
            while(r.next()){
                idmun = r.getInt("id");
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement xm;
            xm = cn.createStatement();
            ResultSet rm = xm.executeQuery("SELECT id FROM municipios WHERE municipio = '"+munna.getSelectedItem().toString()+"'");
            while(rm.next()){
                idmuna = rm.getInt("id");
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement sta;
            sta = cn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT id FROM tipos_identificacion WHERE tipo_identificacion = '"+tipod.getSelectedItem().toString()+"'");
            while(rs.next()){
               doc = rs.getInt("id");
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement st;
            st = cn.createStatement();
            ResultSet res = st.executeQuery("SELECT id FROM estados_civiles WHERE estado_civil= '"+estadociv.getSelectedItem().toString()+"'");
            while(res.next()){
                estci = res.getInt("id");
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement t;
            t = cn.createStatement();
            ResultSet rest = t.executeQuery("SELECT id FROM grupos_convivientes WHERE grupo = '"+grupoconvi.getSelectedItem().toString()+"'");
            while(rest.next()){
                convive = rest.getInt("id");
                
        } 
        }catch (Exception e) {
        }
          
       try {
            Statement ts;
            ts = cn.createStatement();
            ResultSet rel = ts.executeQuery("SELECT id FROM tipos_escolaridad WHERE escolaridad= '"+escolaridad.getSelectedItem().toString()+"'");
            while(rel.next()){
                escol = rel.getInt("id");  
        } 
        }catch (Exception e) {
        }
        
        if(txtnom.getText().isEmpty() || txtape.getText().isEmpty() || txtnumid.getText().isEmpty() || txtedad.getText().isEmpty() || fechana.getDate() == null || txthijos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        }else{
            if(txtnom.getText().isEmpty() && txtape.getText().isEmpty() && txtnumid.getText().isEmpty() && txtedad.getText().isEmpty() && fechana.getDate() == null  && txthijos.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE); 
            }else{
                try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM personas WHERE numero_identificacion ='" + txtnumid.getText() + "'");
                if (!rs.next()) {
                    try {
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO personas(nombres,apellidos,id_tipo_identificacion,numero_identificacion,fecha_nacimiento,edad,genero,id_estado_civil,hijos,"
                                + "nro_hijos,id_grupo_conviviente,otro_grupo_conviviente,id_escolaridad, id_lugar_expedicion,id_lugar_nacimiento) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        pst.setString(1, txtnom.getText());
                        pst.setString(2, txtape.getText());
                        pst.setInt(3, doc);
                        pst.setString(4, txtnumid.getText());
                        pst.setString(5, fecha);
                        pst.setInt(6, Integer.parseInt(txtedad.getText()));
                        pst.setString(7, genero.getSelectedItem().toString());
                        pst.setInt(8, estci);
                        pst.setString(9, hijos.getSelectedItem().toString());
                        pst.setInt(10, Integer.parseInt(txthijos.getText()));
                        pst.setInt(11, convive);
                        pst.setString(12, txtotro.getText());
                        pst.setInt(13, escol);
                        pst.setInt(14, idmun);
                        pst.setInt(15, idmuna);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Este usuario ya existe", "CONFIRMACION DE REGISTRO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            }
        }
        

    }//GEN-LAST:event_guardarActionPerformed

    private void depexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depexActionPerformed
        
       int iddep = 0;
     
       try {
            Statement xm;
            xm = cn.createStatement();
            ResultSet rm = xm.executeQuery("SELECT id FROM departamentos WHERE departamento = '"+depex.getSelectedItem().toString()+"'");
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
                munex.addItem(rest.getString("municipio"));
                
        } 
        }catch (Exception e) {
        }
       /*String [] amazonas = {"El Encanto","La Chorrera","La Pedrera","La Victoria","Leticia","Mirití-Paraná","Puerto Alegría","Puerto Arica","Puerto Nariño","Puerto Santander","Taparacá"};
       String [] antioquia = {"Medellín","Abejorral","Abriaqui","Alejandría","Amagá","Amalfi","Andes","Angelópolis","Angostura","Anorí","Antioquia","Anzá","Apartadó","Arboletes","Argelia","Armenia","Barbosa","Belmira","Bello","Betania","Betulia","Bolívar","Briseño","Buriticá","Cáceres","Caicedo","Caldas","Campamento","Cañasgordas","Caracolí","Caramanta","Carepa","Carmen de Viboral","Carolina","Caucasia","Chigorodó","Cisneros","Cocorná","Concepción","Concordia","Copacabana","Dabeiba","Don Matías","Ebéjico","El Bagre","Entrerríos","Envigado","Fredonia","Frontino","Giraldo","Girardota","Gómez Plata","Granada","Guadalupe","Guarne","Guatapé","Heliconia","Hispania","Itagüí","Ituango","Jardín","Jericó","La Ceja","La Estrella","La Pintada","La Unión","Liborina","Maceo","Marinilla","Montebello","Murindó","Mutatá","Nariño","Necoclí","Nechí","Olaya","Peñol","Peque","Pueblorrico","Puerto Berrío","Puerto Nare","Puerto Triunfo","Remedios","Retiro","Rionegro","Sabanalarga","Sabaneta","Salgar","San Andrés","San Carlos","San francisco","San José de Montaña","San Juan de Urabá","San Luis","San Pedro","San Pedro de Urabá","San Rafael","San Roque","San Vicente","Santa Bárbara","Santa Rosa de Osos","Santo Domingo","Santuario","Segovia","Sonsón","Sopetrán","Támesis","Tarazá","Tarso","Titiribí","Toledo","Turbo","Uramita","Urrao","Valdivia","Valparaíso","Vegachí","Venecia","Vigía del Fuerte","Yalí","Yarumal","Yolombó","Yondó","Zaragoza"};
       String [] arauca = {"Arauca","Arauquita","Cravo Norte","Fortul","Puerto Rondón","Fortul","Puerto Rondón","Saravena","Tame"};
       String [] atlantico = {};
       String [] bolivar = {};
       String [] boyaca = {};
       String [] caldas = {};
       String [] caqueta = {};
       String [] casanare = {};
       String [] cauca = {};
       String [] cesar = {};
       String [] choco = {};
       String [] cordoba = {};
       String [] cundinamarca = {};
       String [] guainia = {};
       String [] guaviare = {};
       String [] huila = {};
       String [] guajira = {};
       String [] magdalena = {};
       String [] meta = {};
       String [] nariño = {};
       String [] nortesantander = {};
       String [] putumayo = {};
       String [] quindio = {};
       String [] risaralda = {};
       String [] providencia = {};
       String [] santander = {};
       String [] sucre = {};
       String [] tolima = {};
       String [] valle = {};
       String [] vaupes = {};
       String [] vichada = {};
       if(depex.getSelectedItem().toString().equals("Amazonas")){
           munex.setModel(new DefaultComboBoxModel(amazonas));
       }
       */
    }//GEN-LAST:event_depexActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        txtotro.setEnabled(false);
        
        try {
            ResultSet r;
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM departamentos");
            r = ps.executeQuery();
            while(r.next()){
                depex.addItem(r.getString("departamento"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(seccion1a.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        try {
            ResultSet xm;
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM departamentos");
            xm = ps.executeQuery();
            while(xm.next()){
                depna.addItem(xm.getString("departamento"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(seccion1a.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        try {
            Statement s;
            s = cn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM tipos_identificacion");
            while(rs.next()){
                tipod.addItem(rs.getString("tipo_identificacion"));
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement st;
            st = cn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM estados_civiles");
            while(res.next()){
                estadociv.addItem(res.getString("estado_civil"));
                
        } 
        }catch (Exception e) {
        }
        
        try {
            Statement t;
            t = cn.createStatement();
            ResultSet rest = t.executeQuery("SELECT * FROM grupos_convivientes");
            while(rest.next()){
                grupoconvi.addItem(rest.getString("grupo"));
                
        } 
        }catch (Exception e) {
        }
          
       try {
            Statement ts;
            ts = cn.createStatement();
            ResultSet rel = ts.executeQuery("SELECT * FROM tipos_escolaridad");
            while(rel.next()){
                escolaridad.addItem(rel.getString("escolaridad"));
                
        } 
        }catch (Exception e) {
        }
       
       try {
            Statement tr;
            tr = cn.createStatement();
            ResultSet ar = tr.executeQuery("SELECT departamento FROM departamentos");
            while(ar.next()){
                depex.addItem(ar.getString("departamento"));
                
        } 
        }catch (Exception e) {
        }
       
       try {
            Statement r;
            r = cn.createStatement();
            ResultSet st = r.executeQuery("SELECT departamento FROM departamentos");
            while(st.next()){
                depna.addItem(st.getString("departamento"));
                
        } 
        }catch (Exception e) {
        }
          
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapeKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtapeKeyTyped

    private void txtotroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotroKeyTyped
       
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtotroKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtnumidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumidKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtnumidKeyTyped

    private void txthijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthijosKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txthijosKeyTyped

    private void grupoconviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoconviActionPerformed
        
        if(grupoconvi.getSelectedItem().toString().equals("Otros")){
            txtotro.setEnabled(true);
        }else{
            txtotro.setEnabled(false);
            txtotro.setText("");
        }
    }//GEN-LAST:event_grupoconviActionPerformed

    private void hijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hijosActionPerformed
        
        
        if(hijos.getSelectedItem().toString().equals("Si")){
            txthijos.setEnabled(true);
            txthijos.setText("");
            ;
        }else{
            txthijos.setEnabled(false);
            txthijos.setText("");
            txthijos.setText("0");
        }
    }//GEN-LAST:event_hijosActionPerformed

    private void depnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depnaActionPerformed
        
        int iddep = 0;
     
       try {
            Statement xm;
            xm = cn.createStatement();
            ResultSet rm = xm.executeQuery("SELECT id FROM departamentos WHERE departamento = '"+depex.getSelectedItem().toString()+"'");
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
                munna.addItem(rest.getString("municipio"));
                
        } 
        }catch (Exception e) {
        }
    }//GEN-LAST:event_depnaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> depex;
    private javax.swing.JComboBox<String> depna;
    private javax.swing.JComboBox<String> escolaridad;
    private javax.swing.JComboBox<String> estadociv;
    private com.toedter.calendar.JDateChooser fechana;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JComboBox<String> grupoconvi;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> hijos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> munex;
    private javax.swing.JComboBox<String> munna;
    private javax.swing.JComboBox<String> tipod;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txthijos;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnumid;
    private javax.swing.JTextField txtotro;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}


