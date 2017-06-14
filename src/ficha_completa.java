
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ficha_completa extends javax.swing.JDialog implements Printable {

    public ficha_completa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ficha = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtnom = new javax.swing.JLabel();
        tipod = new javax.swing.JLabel();
        depex = new javax.swing.JLabel();
        munex = new javax.swing.JLabel();
        txtape = new javax.swing.JLabel();
        txtedad = new javax.swing.JLabel();
        fechana = new javax.swing.JLabel();
        depna = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        txtnumid = new javax.swing.JLabel();
        hijos = new javax.swing.JLabel();
        escolaridad = new javax.swing.JLabel();
        txthijos = new javax.swing.JLabel();
        munna = new javax.swing.JLabel();
        estadociv = new javax.swing.JLabel();
        grupoconvi = new javax.swing.JLabel();
        txtotro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        depgeo = new javax.swing.JLabel();
        mungeo = new javax.swing.JLabel();
        sector = new javax.swing.JLabel();
        txtcelular = new javax.swing.JLabel();
        txtbar = new javax.swing.JLabel();
        estrato = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tipovi = new javax.swing.JLabel();
        txtotrotipo = new javax.swing.JLabel();
        condicionesvi = new javax.swing.JLabel();
        matpared = new javax.swing.JLabel();
        matpiso = new javax.swing.JLabel();
        txtotrotecho = new javax.swing.JLabel();
        mattecho = new javax.swing.JLabel();
        txtotropiso = new javax.swing.JLabel();
        txtotropared = new javax.swing.JLabel();
        espacios = new javax.swing.JLabel();
        acceso = new javax.swing.JLabel();
        txtnumbaños = new javax.swing.JLabel();
        txtnumpisos = new javax.swing.JLabel();
        txtnumcocinas = new javax.swing.JLabel();
        txtnumalcobas = new javax.swing.JLabel();
        txtnumhogares = new javax.swing.JLabel();
        txtnumpersonas = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        energiaelectrica = new javax.swing.JLabel();
        alcantarillado = new javax.swing.JLabel();
        obtenagua = new javax.swing.JLabel();
        combustible = new javax.swing.JLabel();
        basuras = new javax.swing.JLabel();
        serviciosan = new javax.swing.JLabel();
        txtagua = new javax.swing.JLabel();
        txtcombustible = new javax.swing.JLabel();
        vivienda = new javax.swing.JLabel();
        ubicacionvivienda = new javax.swing.JLabel();
        txtsanitario = new javax.swing.JLabel();
        txtbasuras = new javax.swing.JLabel();
        txtvivienda = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        tipopoblacion = new javax.swing.JLabel();
        salud = new javax.swing.JLabel();
        tipoafiliacion = new javax.swing.JLabel();
        txteps = new javax.swing.JLabel();
        txtips = new javax.swing.JLabel();
        discapacidad = new javax.swing.JLabel();
        txtdiscapacidad = new javax.swing.JLabel();
        vidasaludable = new javax.swing.JLabel();
        adultomayor = new javax.swing.JLabel();
        txtadultomayor = new javax.swing.JLabel();
        organizacion = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        ocupacion = new javax.swing.JLabel();
        tipoocupacion = new javax.swing.JLabel();
        ingresos = new javax.swing.JLabel();
        txtingresos = new javax.swing.JLabel();
        ingresomensual = new javax.swing.JLabel();
        programacolmayor = new javax.swing.JLabel();
        usatec = new javax.swing.JLabel();
        cuentatec = new javax.swing.JLabel();
        requieretec = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        fechaprueba = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FICHA COMPLETA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ficha.setBackground(new java.awt.Color(255, 255, 255));
        ficha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel25.setText("NOMBRES:");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel29.setText("No. IDENTIFICACIÓN:");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel24.setText("APELLIDOS:");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel26.setText("TIPO DE DOCUMENTO:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel27.setText("GÉNERO:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel28.setText("EDAD:");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel31.setText("DEPARTAMENTO NAC:");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel30.setText("MUNICIPIO NAC:");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel32.setText("F. DE NACIMIENTO:");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel33.setText("DEPAETAMENTO EXP:");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel34.setText("MUNICIPIO EXP:");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel35.setText("ESTADO CIVIL:");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel40.setText("ESCOLARIDAD:");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel38.setText("GRUPO CONVIVIENTE:");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel39.setText("QUIEN:");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel36.setText("HIJOS:");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel37.setText("CUANTOS:");

        txtnom.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        tipod.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        tipod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        depex.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        depex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        munex.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        munex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        munex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtape.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtape.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtape.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtedad.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtedad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        fechana.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        fechana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechana.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        depna.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        depna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depna.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        genero.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        genero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtnumid.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnumid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnumid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        hijos.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        hijos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hijos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        escolaridad.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        escolaridad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escolaridad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txthijos.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txthijos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txthijos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        munna.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        munna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        munna.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        estadociv.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        estadociv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadociv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        grupoconvi.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        grupoconvi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grupoconvi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtotro.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtotro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtotro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setText("DEPARTAMENTO:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setText("MUNICIPIO:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel6.setText("SECTOR:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel20.setText("CELULAR:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel13.setText("ESTRATO:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setText("BARRIO O VEREDA:");

        depgeo.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        depgeo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depgeo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        mungeo.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        mungeo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mungeo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        sector.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        sector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sector.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtcelular.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtcelular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcelular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtbar.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtbar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        estrato.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        estrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel7.setText("TIPO DE VIVIENDA:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel9.setText("MATERIAL PREDOMINANTE DE LAS PAREDES:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel10.setText("MATERIAL PREDOMINANTE DE LOS PISOS:");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel41.setText("MATERIAL PREDOMINANTE DEL TECHO:");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel23.setText("CUAL:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel8.setText("CONDICIONES DE LA VIVIENDA:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel21.setText("CUAL:");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel22.setText("CUAL:");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel42.setText("CUAL:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel11.setText("ESPACIOS SEPARADOS:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel12.setText("ACCESO INDEPENDIENTE:");

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel47.setText("No. DE HOGARES QUE HABITAN LA VIVIENDA:");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel43.setText("No. DE PISOS:");

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel45.setText("No. DE BAÑOS:");

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel44.setText("No. DE ALCOBAS:");

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel46.setText("No. DE COCINAS:");

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel48.setText("No. PERSONAS QUE HABITAN LA VIVIENDA: ");

        tipovi.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        tipovi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipovi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtotrotipo.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtotrotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtotrotipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        condicionesvi.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        condicionesvi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        condicionesvi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        matpared.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        matpared.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matpared.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        matpiso.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        matpiso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matpiso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtotrotecho.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtotrotecho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtotrotecho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        mattecho.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        mattecho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mattecho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtotropiso.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtotropiso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtotropiso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtotropared.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtotropared.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtotropared.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        espacios.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        espacios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espacios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        acceso.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        acceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acceso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtnumbaños.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnumbaños.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnumbaños.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtnumpisos.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnumpisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnumpisos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtnumcocinas.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnumcocinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnumcocinas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtnumalcobas.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnumalcobas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnumalcobas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtnumhogares.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnumhogares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnumhogares.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtnumpersonas.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtnumpersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnumpersonas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel50.setText("ENERGÍA ELÉCTRICA:");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel51.setText("ALCANTARILLADO:");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel52.setText("OBTENCIÓN AGUA PARA CONSUMO:");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel53.setText("COMBUSTIBLE PARA COCINAR:");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel55.setText("ELIMINACIÓN DE BASURAS:");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel57.setText("SERVICIO SANITARIO USADO:");

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel59.setText("UBICACIÓN DEL SERVICIO SANITARIO:");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel49.setText("CUAL:");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel54.setText("CUAL:");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel56.setText("CUAL:");

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel58.setText("CUAL:");

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel60.setText("VIVIENDA:");

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel61.setText("CUAL:");

        energiaelectrica.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        energiaelectrica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        energiaelectrica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        alcantarillado.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        alcantarillado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alcantarillado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        obtenagua.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        obtenagua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        obtenagua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        combustible.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        combustible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        combustible.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        basuras.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        basuras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basuras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        serviciosan.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        serviciosan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serviciosan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtagua.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtagua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtagua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtcombustible.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtcombustible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcombustible.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        vivienda.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        vivienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vivienda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        ubicacionvivienda.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        ubicacionvivienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ubicacionvivienda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtsanitario.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtsanitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtsanitario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtbasuras.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtbasuras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbasuras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtvivienda.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtvivienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtvivienda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel63.setText("TIPO DE POBLACIÓN:");

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel64.setText("AFILIACIÓN EN SALUD:");

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel67.setText("QUE EPS LO ASISTE:");

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel66.setText("TIPO DE AFILIACIÓN:");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel68.setText("QUE IPS LE PRESTA SUS SERVICIOS:");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel62.setText("CUAL:");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel65.setText("PRESENTA DISPACIDAD:");

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel69.setText("PARTICIPA EN ESTILOS DE VIDA SALUDABLE:");

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel70.setText("PERTENECE A UN GRUPO DE ADULTO MAYOR:");

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel72.setText("PERTENECE A UNA ORGANIZACION COMUNITARIA, SOCIAL:");

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel71.setText("CUAL:");

        tipopoblacion.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        tipopoblacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipopoblacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        salud.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        salud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salud.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        tipoafiliacion.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        tipoafiliacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoafiliacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txteps.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txteps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txteps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtips.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtips.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtips.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        discapacidad.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        discapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        discapacidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtdiscapacidad.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtdiscapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdiscapacidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        vidasaludable.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        vidasaludable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vidasaludable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        adultomayor.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        adultomayor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adultomayor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtadultomayor.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtadultomayor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtadultomayor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        organizacion.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        organizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        organizacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel73.setText("OCUPACIÓN:");

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel78.setText("EN QUE:");

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel74.setText("RECIBE INGRESOS:");

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel76.setText("DE DONDE PROVIENEN:");

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel77.setText("SUS INGRESOS MENSUALES ESTAN ENTRE:");

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel75.setText("PERTENECE AL PROGRAMA COLOMBIA MAYOR:");

        jLabel79.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel79.setText("USA AYUDA TÉCNICA:");

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel80.setText("CUENTA CON AYUDA TÉCNICA:");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel81.setText("REQUIERE AYUDA TÉCNICA:");

        ocupacion.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        ocupacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocupacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        tipoocupacion.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        tipoocupacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoocupacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        ingresos.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        ingresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtingresos.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        txtingresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        ingresomensual.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        ingresomensual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresomensual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        programacolmayor.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        programacolmayor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        programacolmayor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        usatec.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        usatec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usatec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        cuentatec.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        cuentatec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuentatec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        requieretec.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        requieretec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requieretec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("FICHA POBLACIÓN ADULTO MAYOR");

        javax.swing.GroupLayout fichaLayout = new javax.swing.GroupLayout(ficha);
        ficha.setLayout(fichaLayout);
        fichaLayout.setHorizontalGroup(
            fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fichaLayout.createSequentialGroup()
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(programacolmayor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usatec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuentatec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requieretec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addComponent(jLabel65)
                                        .addGap(3, 3, 3)
                                        .addComponent(discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel52))
                                .addGap(24, 24, 24)
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(obtenagua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combustible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(basuras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(serviciosan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addComponent(jLabel54)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtsanitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addComponent(jLabel58)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtcombustible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addComponent(jLabel61)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtagua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addComponent(jLabel56)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtbasuras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel64)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel63)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tipopoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fichaLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel66)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tipoafiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel67)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txteps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fichaLayout.createSequentialGroup()
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel68)
                                            .addGroup(fichaLayout.createSequentialGroup()
                                                .addComponent(jLabel62)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(fichaLayout.createSequentialGroup()
                                                        .addComponent(jLabel71)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtadultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel69))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtips, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vidasaludable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(fichaLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tipovi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel41)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addGroup(fichaLayout.createSequentialGroup()
                                    .addComponent(jLabel50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(energiaelectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel51)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(alcantarillado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel59)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ubicacionvivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(fichaLayout.createSequentialGroup()
                                    .addGap(234, 234, 234)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtotrotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(matpared, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(matpiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mattecho, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(22, 22, 22)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fichaLayout.createSequentialGroup()
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel23)
                                                .addComponent(jLabel42)
                                                .addComponent(jLabel22))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtotropared, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtotropiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtotrotecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(condicionesvi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(fichaLayout.createSequentialGroup()
                                                    .addComponent(jLabel45)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtnumbaños, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(fichaLayout.createSequentialGroup()
                                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel44)
                                                        .addComponent(jLabel43))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtnumpisos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtnumalcobas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(fichaLayout.createSequentialGroup()
                                                    .addComponent(jLabel46)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtnumcocinas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(fichaLayout.createSequentialGroup()
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(espacios, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(27, 27, 27)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel48)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtnumpersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addGap(229, 229, 229)
                                            .addComponent(txtnumhogares, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel47)))
                                .addGroup(fichaLayout.createSequentialGroup()
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel24)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel28))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(fichaLayout.createSequentialGroup()
                                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(fichaLayout.createSequentialGroup()
                                                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(32, 32, 32)
                                                            .addComponent(jLabel35))
                                                        .addGroup(fichaLayout.createSequentialGroup()
                                                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(29, 29, 29)
                                                            .addComponent(jLabel32)))
                                                    .addGap(13, 13, 13)
                                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(fechana, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                                        .addComponent(estadociv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(fichaLayout.createSequentialGroup()
                                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(fichaLayout.createSequentialGroup()
                                                            .addGap(150, 150, 150)
                                                            .addComponent(jLabel29)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtnumid, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tipod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(32, 32, 32)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel31)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(depna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel33)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(depex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(munex, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel30)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(munna, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(fichaLayout.createSequentialGroup()
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel40)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(escolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(depgeo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel38)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(grupoconvi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel39)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtbar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(estrato, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addComponent(jLabel37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txthijos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(fichaLayout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sector, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(fichaLayout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(mungeo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(organizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        fichaLayout.setVerticalGroup(
            fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fichaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(tipod, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel35))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fichaLayout.createSequentialGroup()
                                            .addComponent(jLabel24)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel27))
                                        .addGroup(fichaLayout.createSequentialGroup()
                                            .addComponent(txtnumid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)
                                            .addComponent(fechana, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)))
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29))
                                        .addGap(13, 13, 13)
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(estadociv, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel28)
                                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33)
                            .addComponent(depex, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(munex, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depna, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(munna, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(grupoconvi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39)
                    .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txthijos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(escolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(mungeo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depgeo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtbar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estrato, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sector, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))))
                .addGap(19, 19, 19)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtotrotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tipovi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(matpared, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel10))
                            .addComponent(matpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(mattecho, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(condicionesvi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(txtotropared, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(txtnumpisos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(txtotropiso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)
                            .addComponent(txtnumalcobas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtotrotecho, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(txtnumbaños, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(espacios, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(txtnumhogares, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)
                            .addComponent(txtnumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(txtnumcocinas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(energiaelectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(alcantarillado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ubicacionvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59)))
                .addGap(18, 18, 18)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obtenagua, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel53)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fichaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combustible, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(basuras, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serviciosan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtagua, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel61))
                                        .addGap(21, 21, 21))
                                    .addGroup(fichaLayout.createSequentialGroup()
                                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel63)
                                            .addComponent(tipopoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel64)
                                    .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(18, 18, 18)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addComponent(txtbasuras, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(txtsanitario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fichaLayout.createSequentialGroup()
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(tipoafiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67))))))
                .addGap(13, 13, 13)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel60)
                        .addComponent(vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fichaLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(2, 2, 2)))
                        .addComponent(jLabel68))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addComponent(txtips, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(20, 20, 20)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel65)
                    .addComponent(discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(vidasaludable, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel70)
                    .addComponent(adultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel71)
                        .addComponent(txtadultomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(organizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73)
                        .addComponent(jLabel78)
                        .addComponent(jLabel76))
                    .addComponent(ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(txtingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel77)
                        .addComponent(ingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel75))
                    .addGroup(fichaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(programacolmayor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel79)
                        .addComponent(jLabel80))
                    .addComponent(usatec, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuentatec, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(requieretec, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 53, -1, -1));
        getContentPane().add(fechaprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 15, 5, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("INGRESE No. IDENTIFICACIÓN:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, -1, -1));

        txtbuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 15, 132, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Boton2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono20.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono20.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 7, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_fich1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setLabel("");
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_fich3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_fich2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 15, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped

        char c = evt.getKeyChar();

        if ((c < '0' || c > '9') && (c < ' ' || c > ' ')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String[] datos = new String[17];
        String[] datos1 = new String[6];
        String[] datos2 = new String[17];
        String[] datos3 = new String[13];
        String[] datos4 = new String[11];
        String[] datos5 = new String[9];
        
        int id = 0;

        if (txtbuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número de identificación", "CAMPO VACÍO", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                        Statement ts;
                        ts = cn.createStatement();
                        ResultSet rel = ts.executeQuery("SELECT id FROM personas WHERE numero_identificacion = '"+ txtbuscar.getText() +"'");
                        while (rel.next()) {
                            id = rel.getInt("id");
                        }
                    } catch (Exception e) {
                    }
            
            try {
                Statement ts;
                ts = cn.createStatement();
                ResultSet rel = ts.executeQuery("SELECT * FROM personas p WHERE p.numero_identificacion = '" + txtbuscar.getText() + "'");
                if (!rel.next()) {
                    JOptionPane.showMessageDialog(null, "Número de identificación incorrecto", "IDENTIFICACIÓN INVÁLIDA", JOptionPane.WARNING_MESSAGE);
                } else {
                    
                    try {

                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT p.nombres,p.apellidos,p.numero_identificacion,p.genero,p.edad,p.fecha_nacimiento,ti.tipo_identificacion,ec.estado_civil,gc.grupo,p.otro_grupo_conviviente,es.escolaridad,p.hijos,p.nro_hijos,d1.departamento,m1.municipio,d2.departamento,m2.municipio FROM personas p INNER JOIN tipos_identificacion ti ON ti.id=p.id_tipo_identificacion INNER JOIN estados_civiles ec ON ec.id=p.id_estado_civil INNER JOIN  grupos_convivientes gc ON gc.id=p.id_grupo_conviviente INNER JOIN tipos_escolaridad es ON es.id=p.id_escolaridad INNER JOIN municipios m1 ON m1.id=p.id_lugar_expedicion INNER JOIN municipios m2 ON m2.id=p.id_lugar_nacimiento INNER JOIN departamentos d1 ON d1.id=m1.id_departamento INNER JOIN departamentos d2 ON d2.id=m2.id_departamento WHERE p.numero_identificacion='" + txtbuscar.getText() + "'");
                        while (rs.next()) {
                            datos[0] = rs.getString(1);
                            datos[1] = rs.getString(2);
                            datos[2] = rs.getString(3);
                            datos[3] = rs.getString(4);
                            datos[4] = rs.getString(5);
                            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
                            String fecha = datos[5] = rs.getString(6);
                            Date dato = null;
                            try {

                                dato = formatoDelTexto.parse(fecha);

                            } catch (ParseException ex) {

                            }
                            datos[6] = rs.getString(7);
                            datos[7] = rs.getString(8);
                            datos[8] = rs.getString(9);
                            datos[9] = rs.getString(10);
                            datos[10] = rs.getString(11);
                            datos[11] = rs.getString(12);
                            datos[12] = rs.getString(13);
                            datos[13] = rs.getString(14);
                            datos[14] = rs.getString(15);
                            datos[15] = rs.getString(16);
                            datos[16] = rs.getString(17);

                            txtnom.setText(datos[0]);
                            txtape.setText(datos[1]);
                            txtnumid.setText(datos[2]);
                            genero.setText(datos[3]);
                            txtedad.setText(datos[4]);
                            fechaprueba.setDate(dato);
                            String dia = Integer.toString(fechaprueba.getCalendar().get(Calendar.DAY_OF_MONTH));
                            String mes = Integer.toString(fechaprueba.getCalendar().get(Calendar.MONTH) + 1);
                            String año = Integer.toString(fechaprueba.getCalendar().get(Calendar.YEAR));
                            String fecha_nacimiento = (dia + "/" + mes + "/" + año);
                            fechana.setText(fecha_nacimiento);
                            tipod.setText(datos[6]);
                            estadociv.setText(datos[7]);
                            grupoconvi.setText(datos[8]);
                            txtotro.setText(datos[9]);
                            escolaridad.setText(datos[10]);
                            hijos.setText(datos[11]);
                            txthijos.setText(datos[12]);
                            depex.setText(datos[13]);
                            munex.setText(datos[14]);
                            depna.setText(datos[15]);
                            munna.setText(datos[16]);

                        }
                    } catch (SQLException ex) {
                    }
                    
                    try {
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT d.departamento,m.municipio,pv.sector,pv.barrio_vereda,pv.estrato,pv.celular FROM persona_vivienda pv INNER JOIN municipios m ON m.id=pv.id_municipio INNER JOIN departamentos d ON d.id=m.id_departamento WHERE id_persona = '" + id + "'");
                        while (rs.next()) {
                            datos1[0] = rs.getString(1);
                            datos1[1] = rs.getString(2);
                            datos1[2] = rs.getString(3);
                            datos1[3] = rs.getString(4);
                            datos1[4] = rs.getString(5);
                            datos1[5] = rs.getString(6);

                            depgeo.setText(datos1[0]);
                            mungeo.setText(datos1[1]);
                            sector.setText(datos1[2]);
                            txtbar.setText(datos1[3]);
                            estrato.setText(datos1[4]);
                            txtcelular.setText(datos1[5]);
                        }

                    } catch (SQLException ex) {

                    }
                    
                    try {
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT tv.tipo_vivienda,pv.otro_tipo_vivienda,pv.condicion_vivienda,mt.material,pv.otro_material_pared,mtp.material,pv.otro_material_piso,mtt.material,pv.otro_material_techo,pv.espacios_separados,pv.acceso_independiente,pv.nro_pisos,pv.nro_alcobas,pv.nro_banos,pv.nro_cocinas,pv.nro_hogares,pv.total_personas FROM persona_vivienda pv INNER JOIN tipos_vivienda tv ON tv.id=pv.id_tipo_vivienda INNER JOIN materiales mt ON mt.id=pv.id_material_pared INNER JOIN materiales mtp ON mtp.id=pv.id_material_piso INNER JOIN materiales mtt ON mtt.id=pv.id_material_techo WHERE id_persona = '" + id + "'");
                        while (rs.next()) {
                            datos2[0] = rs.getString(1);
                            datos2[1] = rs.getString(2);
                            datos2[2] = rs.getString(3);
                            datos2[3] = rs.getString(4);
                            datos2[4] = rs.getString(5);
                            datos2[5] = rs.getString(6);
                            datos2[6] = rs.getString(7);
                            datos2[7] = rs.getString(8);
                            datos2[8] = rs.getString(9);
                            datos2[9] = rs.getString(10);
                            datos2[10] = rs.getString(11);
                            datos2[11] = rs.getString(12);
                            datos2[12] = rs.getString(13);
                            datos2[13] = rs.getString(14);
                            datos2[14] = rs.getString(15);
                            datos2[15] = rs.getString(16);
                            datos2[16] = rs.getString(17);

                            tipovi.setText(datos2[0]);
                            txtotrotipo.setText(datos2[1]);
                            condicionesvi.setText(datos2[2]);
                            matpared.setText(datos2[3]);
                            txtotropared.setText(datos2[4]);
                            matpiso.setText(datos2[5]);
                            txtotropiso.setText(datos2[6]);
                            mattecho.setText(datos2[7]);
                            txtotrotecho.setText(datos2[8]);
                            espacios.setText(datos2[9]);
                            acceso.setText(datos2[10]);
                            txtnumpisos.setText(datos2[11]);
                            txtnumalcobas.setText(datos2[12]);
                            txtnumbaños.setText(datos2[13]);
                            txtnumcocinas.setText(datos2[14]);
                            txtnumhogares.setText(datos2[15]);
                            txtnumpersonas.setText(datos2[16]);
                        }

                    } catch (SQLException ex) {

                    }
                    
                    try {
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT pv.energia_electrica,pv.alcantarillado,ag.descripcion,pv.otro_obtencion_agua,cm.descripcion,pv.otro_combustible_cocina,eb.descripcion,pv.otro_elm_basura,ss.descripcion,pv.otro_servicio_sanitario,pv.ubicacion_serv_sanitario,t.tipo_tenencia,pv.otro_tenencia_vivienda FROM persona_vivienda pv INNER JOIN servicios ag ON ag.id=pv.id_obtencion_agua INNER JOIN servicios cm ON cm.id=pv.id_combustible_cocina INNER JOIN servicios eb ON eb.id=pv.id_elm_basura INNER JOIN servicios ss ON ss.id=pv.id_servicio_sanitario INNER JOIN tenencia_vivienda t ON t.id=pv.id_tenencia_vivienda WHERE id_persona = '" + id + "'");
                        while (rs.next()) {
                            datos3[0] = rs.getString(1);
                            datos3[1] = rs.getString(2);
                            datos3[2] = rs.getString(3);
                            datos3[3] = rs.getString(4);
                            datos3[4] = rs.getString(5);
                            datos3[5] = rs.getString(6);
                            datos3[6] = rs.getString(7);
                            datos3[7] = rs.getString(8);
                            datos3[8] = rs.getString(9);
                            datos3[9] = rs.getString(10);
                            datos3[10] = rs.getString(11);
                            datos3[11] = rs.getString(12);
                            datos3[12] = rs.getString(13);

                            energiaelectrica.setText(datos3[0]);
                            alcantarillado.setText(datos3[1]);
                            obtenagua.setText(datos3[2]);
                            txtagua.setText(datos3[3]);
                            combustible.setText(datos3[4]);
                            txtcombustible.setText(datos3[5]);
                            basuras.setText(datos3[6]);
                            txtbasuras.setText(datos3[7]);
                            serviciosan.setText(datos3[8]);
                            txtsanitario.setText(datos3[9]);
                            ubicacionvivienda.setText(datos3[10]);
                            vivienda.setText(datos3[11]);
                            txtvivienda.setText(datos3[12]);
                        }
                    } catch (SQLException ex) {

                    }
                    
                    try {
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT tp.tipo,p.afiliacion_salud,p.tipo_salud,p.eps,p.ips,p.discapacidad,p.caract_discapacidad,p.estilo_vida_saludable,p.adulto_mayor,p.grupo_adulto_mayor,p.organizacion_comun FROM personas p INNER JOIN  tipos_poblacion tp ON tp.id=p.id_tipo_poblacion WHERE p.numero_identificacion='" + txtbuscar.getText() + "'");
                        while (rs.next()) {
                            datos4[0] = rs.getString(1);
                            datos4[1] = rs.getString(2);
                            datos4[2] = rs.getString(3);
                            datos4[3] = rs.getString(4);
                            datos4[4] = rs.getString(5);
                            datos4[5] = rs.getString(6);
                            datos4[6] = rs.getString(7);
                            datos4[7] = rs.getString(8);
                            datos4[8] = rs.getString(9);
                            datos4[9] = rs.getString(10);
                            datos4[10] = rs.getString(11);

                            tipopoblacion.setText(datos4[0]);
                            salud.setText(datos4[1]);
                            tipoafiliacion.setText(datos4[2]);
                            txteps.setText(datos4[3]);
                            txtips.setText(datos4[4]);
                            discapacidad.setText(datos4[5]);
                            txtdiscapacidad.setText(datos4[6]);
                            vidasaludable.setText(datos4[7]);
                            adultomayor.setText(datos4[8]);
                            txtadultomayor.setText(datos4[9]);
                            organizacion.setText(datos4[10]);
                        }

                    } catch (SQLException ex) {

                    }
                }
            } catch (Exception e) {
            }
            
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT p.ocupacion,p.tipo_ocupacion,p.ingresos,p.fuente_ingresos,im.ingresos_rango,p.prog_colombia_mayor,p.ayuda_tecnica_usa,p.ayuda_tecnica,p.ayuda_tecnica_requiere FROM personas p INNER JOIN ingresos_mensuales im ON im.id=p.id_ingreso_mensual WHERE p.numero_identificacion='" + txtbuscar.getText() + "'");
                while (rs.next()) {
                    datos5[0] = rs.getString(1);
                    datos5[1] = rs.getString(2);
                    datos5[2] = rs.getString(3);
                    datos5[3] = rs.getString(4);
                    datos5[4] = rs.getString(5);
                    datos5[5] = rs.getString(6);
                    datos5[6] = rs.getString(7);
                    datos5[7] = rs.getString(8);
                    datos5[8] = rs.getString(9);

                    ocupacion.setText(datos5[0]);
                    tipoocupacion.setText(datos5[1]);
                    ingresos.setText(datos5[2]);
                    txtingresos.setText(datos5[3]);
                    ingresomensual.setText(datos5[4]);
                    programacolmayor.setText(datos5[5]);
                    usatec.setText(datos5[6]);
                    cuentatec.setText(datos5[7]);
                    requieretec.setText(datos5[8]);
                }

            } catch (SQLException ex) {

            }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
       
       
       fechaprueba.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         try {
                PrinterJob gap = PrinterJob.getPrinterJob();
                gap.setPrintable(this);
                boolean top = gap.printDialog();
                if (top) {
                    gap.print();
                }

            } catch (PrinterException pex) {
                JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA", "Error\n" + pex, JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceso;
    private javax.swing.JLabel adultomayor;
    private javax.swing.JLabel alcantarillado;
    private javax.swing.JLabel basuras;
    private javax.swing.JLabel combustible;
    private javax.swing.JLabel condicionesvi;
    private javax.swing.JLabel cuentatec;
    private javax.swing.JLabel depex;
    private javax.swing.JLabel depgeo;
    private javax.swing.JLabel depna;
    private javax.swing.JLabel discapacidad;
    private javax.swing.JLabel energiaelectrica;
    private javax.swing.JLabel escolaridad;
    private javax.swing.JLabel espacios;
    private javax.swing.JLabel estadociv;
    private javax.swing.JLabel estrato;
    private javax.swing.JLabel fechana;
    private com.toedter.calendar.JDateChooser fechaprueba;
    private javax.swing.JPanel ficha;
    private javax.swing.JLabel genero;
    private javax.swing.JLabel grupoconvi;
    private javax.swing.JLabel hijos;
    private javax.swing.JLabel ingresomensual;
    private javax.swing.JLabel ingresos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel matpared;
    private javax.swing.JLabel matpiso;
    private javax.swing.JLabel mattecho;
    private javax.swing.JLabel munex;
    private javax.swing.JLabel mungeo;
    private javax.swing.JLabel munna;
    private javax.swing.JLabel obtenagua;
    private javax.swing.JLabel ocupacion;
    private javax.swing.JLabel organizacion;
    private javax.swing.JLabel programacolmayor;
    private javax.swing.JLabel requieretec;
    private javax.swing.JLabel salud;
    private javax.swing.JLabel sector;
    private javax.swing.JLabel serviciosan;
    private javax.swing.JLabel tipoafiliacion;
    private javax.swing.JLabel tipod;
    private javax.swing.JLabel tipoocupacion;
    private javax.swing.JLabel tipopoblacion;
    private javax.swing.JLabel tipovi;
    private javax.swing.JLabel txtadultomayor;
    private javax.swing.JLabel txtagua;
    private javax.swing.JLabel txtape;
    private javax.swing.JLabel txtbar;
    private javax.swing.JLabel txtbasuras;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel txtcelular;
    private javax.swing.JLabel txtcombustible;
    private javax.swing.JLabel txtdiscapacidad;
    private javax.swing.JLabel txtedad;
    private javax.swing.JLabel txteps;
    private javax.swing.JLabel txthijos;
    private javax.swing.JLabel txtingresos;
    private javax.swing.JLabel txtips;
    private javax.swing.JLabel txtnom;
    private javax.swing.JLabel txtnumalcobas;
    private javax.swing.JLabel txtnumbaños;
    private javax.swing.JLabel txtnumcocinas;
    private javax.swing.JLabel txtnumhogares;
    private javax.swing.JLabel txtnumid;
    private javax.swing.JLabel txtnumpersonas;
    private javax.swing.JLabel txtnumpisos;
    private javax.swing.JLabel txtotro;
    private javax.swing.JLabel txtotropared;
    private javax.swing.JLabel txtotropiso;
    private javax.swing.JLabel txtotrotecho;
    private javax.swing.JLabel txtotrotipo;
    private javax.swing.JLabel txtsanitario;
    private javax.swing.JLabel txtvivienda;
    private javax.swing.JLabel ubicacionvivienda;
    private javax.swing.JLabel usatec;
    private javax.swing.JLabel vidasaludable;
    private javax.swing.JLabel vivienda;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
     public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        
        if(index > 0){
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX() + 0, pagfor.getImageableY() + 0);
        hub.scale(0.73, 0.75);
        ficha.printAll(graf);
        return PAGE_EXISTS;
    }
}
