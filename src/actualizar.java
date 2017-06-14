
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class actualizar extends javax.swing.JDialog {

 
    public actualizar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        genero = new javax.swing.JComboBox<String>();
        tipod = new javax.swing.JComboBox<String>();
        jLabel29 = new javax.swing.JLabel();
        txtnumid = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        depex = new javax.swing.JComboBox<String>();
        munex = new javax.swing.JComboBox<String>();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        depna = new javax.swing.JComboBox<String>();
        jLabel34 = new javax.swing.JLabel();
        munna = new javax.swing.JComboBox<String>();
        fechana = new com.toedter.calendar.JDateChooser();
        jPanel14 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        estadociv = new javax.swing.JComboBox<String>();
        jLabel36 = new javax.swing.JLabel();
        hijos = new javax.swing.JComboBox<String>();
        jLabel37 = new javax.swing.JLabel();
        txthijos = new javax.swing.JTextField();
        grupoconvi = new javax.swing.JComboBox<String>();
        jLabel38 = new javax.swing.JLabel();
        txtotro = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        escolaridad = new javax.swing.JComboBox<String>();
        jLabel40 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        txtdeexp = new javax.swing.JTextField();
        txtmunexp = new javax.swing.JTextField();
        txtdepna = new javax.swing.JTextField();
        txtmunna = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        txtgrupo = new javax.swing.JTextField();
        txtotrogrupo = new javax.swing.JTextField();
        txtescolaridad = new javax.swing.JTextField();
        txtdepvi = new javax.swing.JTextField();
        txtmunvi = new javax.swing.JTextField();
        txtsector = new javax.swing.JTextField();
        txtbarrio = new javax.swing.JTextField();
        txtestrato = new javax.swing.JTextField();
        txtcel = new javax.swing.JTextField();
        txttipovi = new javax.swing.JTextField();
        txtpared = new javax.swing.JTextField();
        txtpiso = new javax.swing.JTextField();
        txttecho = new javax.swing.JTextField();
        txtcualvi = new javax.swing.JTextField();
        txtcualpared = new javax.swing.JTextField();
        txtcualpiso = new javax.swing.JTextField();
        txtcualtecho = new javax.swing.JTextField();
        txtaguacons = new javax.swing.JTextField();
        txtcombuscocina = new javax.swing.JTextField();
        txtsanitariousado = new javax.swing.JTextField();
        txtcualagua = new javax.swing.JTextField();
        txtcualsanitario = new javax.swing.JTextField();
        txtcualvivienda = new javax.swing.JTextField();
        txtcualcombus = new javax.swing.JTextField();
        txtigresosmen = new javax.swing.JTextField();
        txtpoblacion = new javax.swing.JTextField();
        txtcualelimiacion = new javax.swing.JTextField();
        txteliminacion = new javax.swing.JTextField();
        txttenvivienda = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtid_per = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtbar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sector = new javax.swing.JComboBox<String>();
        jLabel20 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        estrato = new javax.swing.JComboBox<String>();
        depgeo = new javax.swing.JComboBox<String>();
        mungeo = new javax.swing.JComboBox<String>();
        guardar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtotropared = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipovi = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        condicionesvi = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        matpared = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        matpiso = new javax.swing.JComboBox<String>();
        jLabel22 = new javax.swing.JLabel();
        txtotropiso = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtotrotipo = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        mattecho = new javax.swing.JComboBox<String>();
        jLabel42 = new javax.swing.JLabel();
        txtotrotecho = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtnumalcobas = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtnumpiso = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtnumbaños = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtnumcocinas = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtnumhogares = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtnumpersonas = new javax.swing.JTextField();
        espacios = new javax.swing.JComboBox<String>();
        acceso = new javax.swing.JComboBox<String>();
        guardar2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        txtagua = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        obtenagua = new javax.swing.JComboBox<String>();
        jLabel53 = new javax.swing.JLabel();
        combustible = new javax.swing.JComboBox<String>();
        jLabel54 = new javax.swing.JLabel();
        txtcombustible = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        basuras = new javax.swing.JComboBox<String>();
        jLabel56 = new javax.swing.JLabel();
        txtbasuras = new javax.swing.JTextField();
        energiaelectrica = new javax.swing.JComboBox<String>();
        alcantarillado = new javax.swing.JComboBox<String>();
        jLabel57 = new javax.swing.JLabel();
        serviciosan = new javax.swing.JComboBox<String>();
        jLabel58 = new javax.swing.JLabel();
        txtsanitario = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        ubicacionvivienda = new javax.swing.JComboBox<String>();
        jPanel15 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        vivienda = new javax.swing.JComboBox<String>();
        jLabel61 = new javax.swing.JLabel();
        txtvivienda = new javax.swing.JTextField();
        guardar3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        txtdiscapacidad = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        tipopoblacion = new javax.swing.JComboBox<String>();
        salud = new javax.swing.JComboBox<String>();
        jLabel66 = new javax.swing.JLabel();
        tipoafiliacion = new javax.swing.JComboBox<String>();
        jLabel67 = new javax.swing.JLabel();
        txteps = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtips = new javax.swing.JTextField();
        discapacidad = new javax.swing.JComboBox<String>();
        jLabel69 = new javax.swing.JLabel();
        vidasaludable = new javax.swing.JComboBox<String>();
        jLabel70 = new javax.swing.JLabel();
        adultomayor = new javax.swing.JComboBox<String>();
        jLabel71 = new javax.swing.JLabel();
        txtadultomayor = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        organizacion = new javax.swing.JComboBox<String>();
        guardar4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        ocupacion = new javax.swing.JComboBox<String>();
        ingresos = new javax.swing.JComboBox<String>();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        txtingresos = new javax.swing.JTextField();
        programacolmayor = new javax.swing.JComboBox<String>();
        jLabel78 = new javax.swing.JLabel();
        tipoocupacion = new javax.swing.JComboBox<String>();
        ingresomensual = new javax.swing.JComboBox<String>();
        jLabel79 = new javax.swing.JLabel();
        usatec = new javax.swing.JComboBox<String>();
        jLabel80 = new javax.swing.JLabel();
        cuentatec = new javax.swing.JComboBox<String>();
        jLabel81 = new javax.swing.JLabel();
        requieretec = new javax.swing.JComboBox<String>();
        guardar6 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ACTUALIZACIÓN DE DATOS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel15.setText("ACTUALIZACIÓN DE DATOS");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("APELLIDOS:");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("NOMBRES:");

        txtnom.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("TIPO DE DOCUMENTO:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("GÉNERO:");

        txtape.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtape.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapeKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("EDAD:");

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

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("No. IDENTIFICACIÓN:");

        txtnumid.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumidKeyTyped(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "LUGAR DE EXPEDICION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("MUN:");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("DEP:");

        depex.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        depex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depexActionPerformed(evt);
            }
        });

        munex.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(depex, 0, 188, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(munex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(depex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(munex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumid, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtedad)
                            .addComponent(genero, 0, 94, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(tipod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(txtnumid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "LUGAR Y FECHA DE NACIMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("FECHA DE NACIMIENTO:");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("DEP:");

        depna.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        depna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depnaActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("MUN:");

        munna.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechana, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depna, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(munna, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(munna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(depna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel32))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("ESTADO CIVIL:");

        estadociv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("HIJOS:");

        hijos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hijos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        hijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hijosActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("CUANTOS:");

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

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("GRUPO CONVIVIENTE:");

        txtotro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotroKeyTyped(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setText("QUIEN:");

        escolaridad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("ESCOLARIDAD:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escolaridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadociv, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grupoconvi, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txthijos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(estadociv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(grupoconvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(hijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(txthijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40)
                        .addComponent(escolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        guardar.setBackground(new java.awt.Color(51, 255, 51));
        guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar1.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar3.png"))); // NOI18N
        guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar2.png"))); // NOI18N
        guardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(316, 316, 316))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtdeexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtmunexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdepna, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtmunna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtotrogrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtescolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdepvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtmunvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtsector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtestrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txttipovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtpared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txttecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcualvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcualpared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcualpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcualtecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtaguacons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcombuscocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsanitariousado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcualagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcualsanitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcualvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcualcombus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtigresosmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcualelimiacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttenvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdeexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmunexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdepna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmunna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtotrogrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtescolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdepvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmunvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttipovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualtecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualpared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaguacons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcombuscocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsanitariousado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualcombus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualsanitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtigresosmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcualelimiacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txteliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttenvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1.1. Datos Generales", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel16.setText("ACTUALIZACIÓN DE DATOS");

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

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("CELULAR:");

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
                        .addComponent(jLabel20)
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
                        .addComponent(jLabel20)
                        .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(estrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        guardar1.setBackground(new java.awt.Color(51, 255, 51));
        guardar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar1.png"))); // NOI18N
        guardar1.setBorder(null);
        guardar1.setBorderPainted(false);
        guardar1.setContentAreaFilled(false);
        guardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar3.png"))); // NOI18N
        guardar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar2.png"))); // NOI18N
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(316, 316, 316))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardar1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar1)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1.2. Identificación Geográfica de la Vivienda", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel17.setText("ACTUALIZACIÓN DE DATOS");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "CARACTERÍSTICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("CUAL:");

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

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("CUAL:");

        txtotropiso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotropiso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotropiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotropisoKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("CUAL:");

        txtotrotipo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotrotipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotrotipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotrotipoKeyTyped(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setText("MATERIAL PREDOMINANTE DEL TECHO:");

        mattecho.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        mattecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mattechoActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setText("CUAL:");

        txtotrotecho.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtotrotecho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotrotecho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotrotechoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mattecho, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(matpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matpared, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotropared, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotropiso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotrotecho, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipovi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtotrotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(condicionesvi, 0, 82, Short.MAX_VALUE)
                        .addGap(29, 29, 29))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tipovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtotrotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(condicionesvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(matpared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtotropared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(matpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtotropiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(mattecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtotrotecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "DISTRIBUCION DE LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("ESPACIOS SEPARADOS:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("ACCESO INDEPENDIENTE:");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel43.setText("No. DE PISOS:");

        txtnumalcobas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumalcobas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumalcobas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumalcobasKeyTyped(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel44.setText("No. DE ALCOBAS:");

        txtnumpiso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumpiso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumpisoKeyTyped(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel45.setText("No. DE BAÑOS:");

        txtnumbaños.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumbaños.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumbaños.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumbañosKeyTyped(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel46.setText("No. DE COCINAS:");

        txtnumcocinas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumcocinas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumcocinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumcocinasKeyTyped(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel47.setText("No. DE HOGARES QUE HABITAN LA VIVIENDA:");

        txtnumhogares.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnumhogares.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumhogares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumhogaresKeyTyped(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setText("No. PERSONAS QUE HABITAN LA VIVIENDA: ");

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(espacios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumbaños, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumalcobas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumcocinas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumhogares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(txtnumpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(espacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45)
                                .addComponent(txtnumbaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumalcobas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumcocinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtnumhogares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(txtnumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        guardar2.setBackground(new java.awt.Color(51, 255, 51));
        guardar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar1.png"))); // NOI18N
        guardar2.setBorder(null);
        guardar2.setBorderPainted(false);
        guardar2.setContentAreaFilled(false);
        guardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar3.png"))); // NOI18N
        guardar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar2.png"))); // NOI18N
        guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(316, 316, 316))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardar2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar2)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2.1. Características", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel18.setText("ACTUALIZACIÓN DE DATOS");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "SERVICIOS CON QUE CUENTA LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel49.setText("CUAL:");

        txtagua.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtagua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtagua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaguaKeyTyped(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setText("ENERGÍA ELÉCTRICA:");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("ALCANTARILLADO:");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setText("OBTENCIÓN AGUA PARA CONSUMO:");

        obtenagua.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        obtenagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenaguaActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setText("COMBUSTIBLE PARA COCINAR:");

        combustible.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        combustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustibleActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setText("CUAL:");

        txtcombustible.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtcombustible.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcombustible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcombustibleKeyTyped(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel55.setText("ELIMINACIÓN DE BASURAS:");

        basuras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        basuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basurasActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setText("CUAL:");

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

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setText("SERVICIO SANITARIO USADO:");

        serviciosan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        serviciosan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciosanActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel58.setText("CUAL:");

        txtsanitario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtsanitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsanitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsanitarioKeyTyped(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel59.setText("UBICACIÓN DEL SERVICIO SANITARIO:");

        ubicacionvivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ubicacionvivienda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dentro de la Vivienda", "Fuera de la Vivienda" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(energiaelectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alcantarillado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(serviciosan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel58)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtsanitario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel55)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(basuras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtbasuras, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel53)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combustible, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel54)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtcombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel52)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(obtenagua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel49)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtagua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubicacionvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(energiaelectrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(alcantarillado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(obtenagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(txtagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(combustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(txtcombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(basuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(txtbasuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(serviciosan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(txtsanitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(ubicacionvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "TENENCIA DE LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel60.setText("VIVIENDA:");

        vivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        vivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viviendaActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel61.setText("CUAL:");

        txtvivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtvivienda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvivienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtviviendaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61)
                        .addComponent(txtvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        guardar3.setBackground(new java.awt.Color(51, 255, 51));
        guardar3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar1.png"))); // NOI18N
        guardar3.setBorder(null);
        guardar3.setBorderPainted(false);
        guardar3.setContentAreaFilled(false);
        guardar3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar3.png"))); // NOI18N
        guardar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar2.png"))); // NOI18N
        guardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(guardar3)
                        .addGap(396, 396, 396))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar3)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2.2. Servicios con que cuenta la Vivienda", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel19.setText("ACTUALIZACIÓN DE DATOS");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "CARACTERÍSTICAS SOCIALES Y DE SALUD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setText("CUAL:");

        txtdiscapacidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtdiscapacidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdiscapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiscapacidadKeyTyped(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel63.setText("TIPO DE POBLACIÓN:");

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel64.setText("AFILIACIÓN EN SALUD:");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel65.setText("PRESENTA DISPACIDAD:");

        tipopoblacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        salud.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        salud.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        salud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saludActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel66.setText("TIPO DE AFILIACIÓN:");

        tipoafiliacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tipoafiliacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Subsidiado", "Contributivo", "B/C" }));

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel67.setText("QUE EPS LO ASISTE:");

        txteps.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txteps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txteps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtepsKeyTyped(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel68.setText("QUE IPS LE PRESTA SUS SERVICIOS:");

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

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel69.setText("PARTICIPA EN ESTILOS DE VIDA SALUDABLE:");

        vidasaludable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        vidasaludable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel70.setText("PERTENECE A UN GRUPO DE ADULTO MAYOR:");

        adultomayor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        adultomayor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        adultomayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultomayorActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel71.setText("CUAL:");

        txtadultomayor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtadultomayor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtadultomayor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtadultomayorKeyTyped(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel72.setText("PERTENECE A UNA ORGANIZACION COMUNITARIA, SOCIAL:");

        organizacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        organizacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vidasaludable, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(organizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtadultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipopoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoafiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtips, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(tipopoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(tipoafiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(txtips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(txtdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(vidasaludable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(adultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(txtadultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(organizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        guardar4.setBackground(new java.awt.Color(51, 255, 51));
        guardar4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar1.png"))); // NOI18N
        guardar4.setBorder(null);
        guardar4.setBorderPainted(false);
        guardar4.setContentAreaFilled(false);
        guardar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar3.png"))); // NOI18N
        guardar4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar2.png"))); // NOI18N
        guardar4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        guardar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(316, 316, 316))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardar4)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar4)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("3.1. Características", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel14.setText("ACTUALIZACIÓN DE DATOS");

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "CARACTERISTICAS ECONÓMICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel73.setText("OCUPACIÓN:");

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setText("RECIBE INGRESOS:");

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel75.setText("PERTENECE AL PROGRAMA COLOMBIA MAYOR:");

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

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel76.setText("DE DONDE PROVIENEN:");

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel77.setText("SUS INGRESOS MENSUALES ESTAN ENTRE:");

        txtingresos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtingresos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtingresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingresosKeyTyped(evt);
            }
        });

        programacolmayor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        programacolmayor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel78.setText("EN QUE:");

        tipoocupacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tipoocupacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oficios del Hogar", "Pensionado", "Otro" }));

        ingresomensual.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel79.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel79.setText("USA AYUDA TÉCNICA:");

        usatec.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usatec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setText("CUENTA CON AYUDA TÉCNICA:");

        cuentatec.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cuentatec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setText("REQUIERE AYUDA TÉCNICA:");

        requieretec.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        requieretec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(programacolmayor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(requieretec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel79)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usatec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cuentatec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78)
                    .addComponent(tipoocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addComponent(txtingresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(ingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(programacolmayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(usatec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(cuentatec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(requieretec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        guardar6.setBackground(new java.awt.Color(51, 255, 51));
        guardar6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar1.png"))); // NOI18N
        guardar6.setBorder(null);
        guardar6.setBorderPainted(false);
        guardar6.setContentAreaFilled(false);
        guardar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar3.png"))); // NOI18N
        guardar6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_guar2.png"))); // NOI18N
        guardar6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        guardar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(316, 316, 316))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardar6)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar6)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("4.1. Características", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 1016, 609));

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapeKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtapeKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtnumidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumidKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtnumidKeyTyped

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
    }//GEN-LAST:event_depexActionPerformed

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

    private void txtotroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotroKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtotroKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        txtotro.setEnabled(false);
        txtotrotipo.setEnabled(false);
        txtotropared.setEnabled(false);
        txtotropiso.setEnabled(false);
        txtotrotecho.setEnabled(false);
        txtagua.setEnabled(false);
        txtcombustible.setEnabled(false);
        txtbasuras.setEnabled(false);
        txtsanitario.setEnabled(false);
        txtvivienda.setEnabled(false);
    
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
            ResultSet r;
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM departamentos");
            r = ps.executeQuery();
            while(r.next()){
                depgeo.addItem(r.getString("departamento"));
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
        
        try {
            Statement sta;
            sta = cn.createStatement();
            ResultSet s = sta.executeQuery("SELECT * FROM tipos_poblacion");
            while (s.next()) {
                tipopoblacion.addItem(s.getString("tipo"));

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
        
       depex.setSelectedItem(txtdeexp.getText());
       munex.setSelectedItem(txtmunexp.getText());
       depna.setSelectedItem(txtdepna.getText());
       munna.setSelectedItem(txtmunna.getText());
       tipod.setSelectedItem(txtdocumento.getText());
       grupoconvi.setSelectedItem(txtgrupo.getText());
       txtotro.setText(txtotrogrupo.getText());
       escolaridad.setSelectedItem(txtescolaridad.getText());
       estadociv.setSelectedItem(txtestado.getText());
       depgeo.setSelectedItem(txtdepvi.getText());
       mungeo.setSelectedItem(txtmunvi.getText());
       sector.setSelectedItem(txtsector.getText());
       txtbar.setText(txtbarrio.getText());
       estrato.setSelectedItem(txtestrato.getText());
       txtcelular.setText(txtcel.getText());
       tipovi.setSelectedItem(txttipovi.getText());
       matpared.setSelectedItem(txtpared.getText());
       matpiso.setSelectedItem(txtpiso.getText());
       mattecho.setSelectedItem(txttecho.getText());
       txtotrotipo.setText(txtcualvi.getText());
       txtotropared.setText(txtcualpared.getText());
       txtotropiso.setText(txtcualpiso.getText());
       txtotrotecho.setText(txtcualtecho.getText());
       obtenagua.setSelectedItem(txtaguacons.getText());
       combustible.setSelectedItem(txtcombuscocina.getText());
       basuras.setSelectedItem(txteliminacion.getText());
       serviciosan.setSelectedItem(txtsanitariousado.getText());
       vivienda.setSelectedItem(txttenvivienda.getText());
       txtagua.setText(txtcualagua.getText());
       txtcombustible.setText(txtcualcombus.getText());
       txtbasuras.setText(txtcualelimiacion.getText());
       txtsanitario.setText(txtcualsanitario.getText());
       txtvivienda.setText(txtcualvivienda.getText());
       tipopoblacion.setSelectedItem(txtpoblacion.getText());
       ingresomensual.setSelectedItem(txtigresosmen.getText());
       
       txtdeexp.setVisible(false);
       txtmunexp.setVisible(false);
       txtmunna.setVisible(false);
       txtdepna.setVisible(false);   
       txtgrupo.setVisible(false);
       txtotrogrupo.setVisible(false);
       txtdocumento.setVisible(false);
       txtescolaridad.setVisible(false);
       txtestado.setVisible(false);
       txtdepvi.setVisible(false);
       txtmunvi.setVisible(false);
       txtestrato.setVisible(false);
       txtsector.setVisible(false);
       txtbarrio.setVisible(false);
       txtcel.setVisible(false);
       txttipovi.setVisible(false);
       txtpared.setVisible(false);
       txtpiso.setVisible(false);
       txttecho.setVisible(false);
       txtcualvi.setVisible(false);
       txtcualpared.setVisible(false);
       txtcualpiso.setVisible(false);
       txtcualtecho.setVisible(false);
       txtaguacons.setVisible(false);
       txtcombuscocina.setVisible(false);
       txteliminacion.setVisible(false);
       txtsanitariousado.setVisible(false);
       txttenvivienda.setVisible(false);
       txtcualagua.setVisible(false);
       txtcualelimiacion.setVisible(false);
       txtcualsanitario.setVisible(false);
       txtcualvivienda.setVisible(false);
       txtcualcombus.setVisible(false);
       txtpoblacion.setVisible(false);
       txtigresosmen.setVisible(false);
       txtid.setVisible(false);
       txtid_per.setVisible(false);
       
       
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea salir?","CERRAR CONSULTA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        this.dispose();
        
    }//GEN-LAST:event_formWindowClosing

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

    private void txtotroparedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotroparedKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotroparedKeyTyped

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

    private void txtotropisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotropisoKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotropisoKeyTyped

    private void txtotrotipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotrotipoKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotrotipoKeyTyped

    private void mattechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mattechoActionPerformed

        if (mattecho.getSelectedItem().toString().equals("Otro")) {
            txtotrotecho.setEnabled(true);
        } else {
            txtotrotecho.setEnabled(false);
            txtotrotecho.setText("");
        }
    }//GEN-LAST:event_mattechoActionPerformed

    private void txtotrotechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotrotechoKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtotrotechoKeyTyped

    private void txtnumalcobasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumalcobasKeyTyped

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumalcobasKeyTyped

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

    private void txtaguaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaguaKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtaguaKeyTyped

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

    private void txtcombustibleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcombustibleKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcombustibleKeyTyped

    private void basurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basurasActionPerformed

        if (basuras.getSelectedItem().toString().equals("Otro")) {
            txtbasuras.setEnabled(true);
        } else {
            txtbasuras.setEnabled(false);
            txtbasuras.setText("");
        }
    }//GEN-LAST:event_basurasActionPerformed

    private void txtbasurasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbasurasKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtbasurasKeyTyped

    private void serviciosanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciosanActionPerformed

        if (serviciosan.getSelectedItem().toString().equals("Otro")) {
            txtsanitario.setEnabled(true);
        } else {
            txtsanitario.setEnabled(false);
            txtsanitario.setText("");
        }
    }//GEN-LAST:event_serviciosanActionPerformed

    private void txtsanitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsanitarioKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtsanitarioKeyTyped

    private void viviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viviendaActionPerformed

        if (vivienda.getSelectedItem().toString().equals("Otro")) {
            txtvivienda.setEnabled(true);
        } else {
            txtvivienda.setEnabled(false);
            txtvivienda.setText("");
        }
    }//GEN-LAST:event_viviendaActionPerformed

    private void txtviviendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtviviendaKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtviviendaKeyTyped

    private void txtdiscapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiscapacidadKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdiscapacidadKeyTyped

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

    private void txtadultomayorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadultomayorKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtadultomayorKeyTyped

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

    private void txtingresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresosKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtingresosKeyTyped

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
                        PreparedStatement pst = cn.prepareStatement("UPDATE personas SET nombres = '"+txtnom.getText()+"',apellidos = '"+txtape.getText()+"',id_tipo_identificacion = '"+doc+"',numero_identificacion = '"+txtnumid.getText()+"',fecha_nacimiento = '"+fecha+"',edad = '"+Integer.parseInt(txtedad.getText())+"',genero = '"+genero.getSelectedItem().toString()+"',id_estado_civil = '"+estci+"',hijos = '"+hijos.getSelectedItem().toString()+"',"
                                + "nro_hijos = '"+Integer.parseInt(txthijos.getText())+"',id_grupo_conviviente = '"+convive+"',otro_grupo_conviviente = '"+txtotro.getText()+"',id_escolaridad = '"+escol+"', id_lugar_expedicion = '"+idmun+"',id_lugar_nacimiento = '"+idmuna+"' WHERE id = '"+txtid.getText()+"'");
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al actualizar");
                   
                    }
            }
        }
        
    }//GEN-LAST:event_guardarActionPerformed

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
        
        int idmungeo = 0;
        try {
            Statement xm;
            xm = cn.createStatement();
            ResultSet rm = xm.executeQuery("SELECT id FROM municipios WHERE municipio = '"+mungeo.getSelectedItem().toString()+"'");
            while(rm.next()){
                idmungeo = rm.getInt("id");
                
        } 
        }catch (Exception e) {
        }
        

        if (txtbar.getText().isEmpty() || txtcelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else if (txtbar.getText().isEmpty() && txtcelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE persona_vivienda SET sector = '"+sector.getSelectedItem().toString()+"',barrio_vereda = '"+txtbar.getText()+"',estrato = '"+estrato.getSelectedItem().toString()+"',celular = '"+txtcelular.getText()+"',id_municipio = '"+idmungeo+"' WHERE id_persona = '"+txtid.getText()+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }

        }
    }//GEN-LAST:event_guardar1ActionPerformed

    private void guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar2ActionPerformed
        
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
                PreparedStatement pst = cn.prepareStatement("UPDATE persona_vivienda SET  id_tipo_vivienda='" + tipvi + "',otro_tipo_vivienda='" + txtotrotipo.getText() + "',condicion_vivienda='" + condicionesvi.getSelectedItem().toString() + "',id_material_pared='" + matpar + "',id_material_piso='" + matpis + "',id_material_techo='" + mattech + "',otro_material_pared='" + txtotropared.getText() + "',otro_material_piso='" + txtotropiso.getText() + "',otro_material_techo='" + txtotrotecho.getText() + "',espacios_separados='" + espacios.getSelectedItem().toString() + "',acceso_independiente='" + acceso.getSelectedItem().toString() + "',nro_pisos='" + txtnumpiso.getText() + "',nro_alcobas='" + txtnumalcobas.getText() + "',nro_banos='" + txtnumbaños.getText() + "',nro_cocinas='" + txtnumcocinas.getText() + "',nro_hogares='" + txtnumhogares.getText() + "',total_personas='" + txtnumpersonas.getText() + "' WHERE id_persona= '" +txtid.getText()+ "'");
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }

        }
    }//GEN-LAST:event_guardar2ActionPerformed

    private void guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar3ActionPerformed
        
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
            PreparedStatement pst = cn.prepareStatement("UPDATE persona_vivienda SET id_obtencion_agua='" + agua + "',id_combustible_cocina='" + combust + "',id_elm_basura='" + elmbas + "',id_servicio_sanitario='" + servsa + "',id_tenencia_vivienda='" + tenviv + "',energia_electrica='" + energiaelectrica.getSelectedItem().toString() + "',alcantarillado='" + alcantarillado.getSelectedItem().toString() + "',otro_obtencion_agua='" + txtagua.getText() + "',otro_combustible_cocina='" + txtcombustible.getText() + "',otro_elm_basura='" + txtbasuras.getText() + "',otro_servicio_sanitario='" + txtsanitario.getText() + "',ubicacion_serv_sanitario='" + ubicacionvivienda.getSelectedItem().toString() + "',otro_tenencia_vivienda='" + txtvivienda.getText() + "' WHERE id_persona= '" +txtid.getText()+ "'");
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }

    }//GEN-LAST:event_guardar3ActionPerformed

    private void guardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar4ActionPerformed
        
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

        if (txteps.getText().isEmpty() || txtips.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else if (txteps.getText().isEmpty() && txtips.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE personas SET id_tipo_poblacion='" + poblacion + "',afiliacion_salud='" + salud.getSelectedItem().toString() + "' , tipo_salud='" + tipoafiliacion.getSelectedItem().toString() + "', eps='" + txteps.getText() + "', ips='" + txtips.getText() + "',discapacidad='" + discapacidad.getSelectedItem().toString() + "',caract_discapacidad='" + txtdiscapacidad.getText() + "',estilo_vida_saludable='" + vidasaludable.getSelectedItem().toString() + "',adulto_mayor='" + adultomayor.getSelectedItem().toString() + "',grupo_adulto_mayor='" + txtadultomayor.getText() + "',organizacion_comun='" + organizacion.getSelectedItem().toString() + "' WHERE id='" +txtid.getText()+ "'");
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }

        }
    }//GEN-LAST:event_guardar4ActionPerformed

    private void guardar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar6ActionPerformed
        
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
            PreparedStatement pst = cn.prepareStatement("UPDATE personas SET ocupacion='" + ocupacion.getSelectedItem().toString() + "',tipo_ocupacion='" + tipoocupacion.getSelectedItem().toString() + "',ingresos='" + ingresos.getSelectedItem().toString() + "',fuente_ingresos='" + txtingresos.getText() + "',prog_colombia_mayor='" + programacolmayor.getSelectedItem().toString() + "',ayuda_tecnica_usa='" + usatec.getSelectedItem().toString() + "',ayuda_tecnica_requiere='" + requieretec.getSelectedItem().toString() + "',ayuda_tecnica='" + cuentatec.getSelectedItem().toString() + "',id_ingreso_mensual='" + ingresomen + "'");
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
    }//GEN-LAST:event_guardar6ActionPerformed

    /**
     * @param args the command line arguments
     */


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> acceso;
    public javax.swing.JComboBox<String> adultomayor;
    public javax.swing.JComboBox<String> alcantarillado;
    private javax.swing.JComboBox<String> basuras;
    private javax.swing.JComboBox<String> combustible;
    public javax.swing.JComboBox<String> condicionesvi;
    public javax.swing.JComboBox<String> cuentatec;
    public javax.swing.JComboBox<String> depex;
    public javax.swing.JComboBox<String> depgeo;
    public javax.swing.JComboBox<String> depna;
    public javax.swing.JComboBox<String> discapacidad;
    public javax.swing.JComboBox<String> energiaelectrica;
    public javax.swing.JComboBox<String> escolaridad;
    public javax.swing.JComboBox<String> espacios;
    public javax.swing.JComboBox<String> estadociv;
    public javax.swing.JComboBox<String> estrato;
    public com.toedter.calendar.JDateChooser fechana;
    public javax.swing.JComboBox<String> genero;
    public javax.swing.JComboBox<String> grupoconvi;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar2;
    private javax.swing.JButton guardar3;
    private javax.swing.JButton guardar4;
    private javax.swing.JButton guardar6;
    public javax.swing.JComboBox<String> hijos;
    private javax.swing.JComboBox<String> ingresomensual;
    public javax.swing.JComboBox<String> ingresos;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> matpared;
    private javax.swing.JComboBox<String> matpiso;
    private javax.swing.JComboBox<String> mattecho;
    public javax.swing.JComboBox<String> munex;
    public javax.swing.JComboBox<String> mungeo;
    public javax.swing.JComboBox<String> munna;
    private javax.swing.JComboBox<String> obtenagua;
    public javax.swing.JComboBox<String> ocupacion;
    public javax.swing.JComboBox<String> organizacion;
    public javax.swing.JComboBox<String> programacolmayor;
    public javax.swing.JComboBox<String> requieretec;
    public javax.swing.JComboBox<String> salud;
    public javax.swing.JComboBox<String> sector;
    private javax.swing.JComboBox<String> serviciosan;
    public javax.swing.JComboBox<String> tipoafiliacion;
    public javax.swing.JComboBox<String> tipod;
    public javax.swing.JComboBox<String> tipoocupacion;
    private javax.swing.JComboBox<String> tipopoblacion;
    private javax.swing.JComboBox<String> tipovi;
    public javax.swing.JTextField txtadultomayor;
    private javax.swing.JTextField txtagua;
    public javax.swing.JTextField txtaguacons;
    public javax.swing.JTextField txtape;
    public javax.swing.JTextField txtbar;
    public javax.swing.JTextField txtbarrio;
    private javax.swing.JTextField txtbasuras;
    public javax.swing.JTextField txtcel;
    public javax.swing.JTextField txtcelular;
    public javax.swing.JTextField txtcombuscocina;
    private javax.swing.JTextField txtcombustible;
    public javax.swing.JTextField txtcualagua;
    public javax.swing.JTextField txtcualcombus;
    public javax.swing.JTextField txtcualelimiacion;
    public javax.swing.JTextField txtcualpared;
    public javax.swing.JTextField txtcualpiso;
    public javax.swing.JTextField txtcualsanitario;
    public javax.swing.JTextField txtcualtecho;
    public javax.swing.JTextField txtcualvi;
    public javax.swing.JTextField txtcualvivienda;
    public javax.swing.JTextField txtdeexp;
    public javax.swing.JTextField txtdepna;
    public javax.swing.JTextField txtdepvi;
    public javax.swing.JTextField txtdiscapacidad;
    public javax.swing.JTextField txtdocumento;
    public javax.swing.JTextField txtedad;
    public javax.swing.JTextField txteliminacion;
    public javax.swing.JTextField txteps;
    public javax.swing.JTextField txtescolaridad;
    public javax.swing.JTextField txtestado;
    public javax.swing.JTextField txtestrato;
    public javax.swing.JTextField txtgrupo;
    public javax.swing.JTextField txthijos;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtid_per;
    public javax.swing.JTextField txtigresosmen;
    public javax.swing.JTextField txtingresos;
    public javax.swing.JTextField txtips;
    public javax.swing.JTextField txtmunexp;
    public javax.swing.JTextField txtmunna;
    public javax.swing.JTextField txtmunvi;
    public javax.swing.JTextField txtnom;
    public javax.swing.JTextField txtnumalcobas;
    public javax.swing.JTextField txtnumbaños;
    public javax.swing.JTextField txtnumcocinas;
    public javax.swing.JTextField txtnumhogares;
    public javax.swing.JTextField txtnumid;
    public javax.swing.JTextField txtnumpersonas;
    public javax.swing.JTextField txtnumpiso;
    public javax.swing.JTextField txtotro;
    public javax.swing.JTextField txtotrogrupo;
    public javax.swing.JTextField txtotropared;
    public javax.swing.JTextField txtotropiso;
    public javax.swing.JTextField txtotrotecho;
    public javax.swing.JTextField txtotrotipo;
    public javax.swing.JTextField txtpared;
    public javax.swing.JTextField txtpiso;
    public javax.swing.JTextField txtpoblacion;
    private javax.swing.JTextField txtsanitario;
    public javax.swing.JTextField txtsanitariousado;
    public javax.swing.JTextField txtsector;
    public javax.swing.JTextField txttecho;
    public javax.swing.JTextField txttenvivienda;
    public javax.swing.JTextField txttipovi;
    public javax.swing.JTextField txtvivienda;
    public javax.swing.JComboBox<String> ubicacionvivienda;
    public javax.swing.JComboBox<String> usatec;
    public javax.swing.JComboBox<String> vidasaludable;
    public javax.swing.JComboBox<String> vivienda;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
