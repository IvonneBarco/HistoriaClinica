
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
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class reportes extends javax.swing.JDialog implements Printable {
DateFormat df = DateFormat.getDateInstance();

    public reportes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(780,778);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
        total_area();
        total_discapacidad();
        total_estilo();
        total_genero();
        total_grupo();
        total_poblacion();
        tabarea.setEnabled(false);
        tabgenero.setEnabled(false);
        tabgrupo.setEnabled(false);
        tabdiscapacidad.setEnabled(false);
        tabpoblacion.setEnabled(false);
        tabestilo.setEnabled(false);
        Date FechaActual = new Date();
        txtfecha.setText(df.format(FechaActual));
    }

    void total_genero(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("GÉNERO");
        modelo.addColumn("TOTAL");
        tabgenero.setModel(modelo);
        
        String []datos = new String[2];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM total_genero");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo.addRow(datos);   
            } 
            tabgenero.setModel(modelo);
        } catch (SQLException ex) {
            
        }
    }
    
    void total_area(){
        
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("SECTOR");
        modelo1.addColumn("TOTAL");
        tabarea.setModel(modelo1);
        
        String []datos = new String[2];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM total_area");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo1.addRow(datos);   
            } 
            tabarea.setModel(modelo1);
        } catch (SQLException ex) {
            
        }
    }
    
    void total_discapacidad(){
        
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("DISCAPACIDAD");
        modelo2.addColumn("TOTAL");
        tabdiscapacidad.setModel(modelo2);
        
        String []datos = new String[2];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM total_discapacidad WHERE caract_discapacidad IS NOT NULL");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo2.addRow(datos);   
            } 
            tabdiscapacidad.setModel(modelo2);
        } catch (SQLException ex) {
            
        }
    }
    
    void total_estilo(){
        
        DefaultTableModel modelo3 = new DefaultTableModel();
        modelo3.addColumn("ESTILO");
        modelo3.addColumn("TOTAL");
        tabestilo.setModel(modelo3);
        
        String []datos = new String[2];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM total_estilo_vida WHERE estilo_vida_saludable IS NOT NULL");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo3.addRow(datos);   
            } 
            tabestilo.setModel(modelo3);
        } catch (SQLException ex) {
            
        }
    }
    
    void total_grupo(){
        
        DefaultTableModel modelo4 = new DefaultTableModel();
        modelo4.addColumn("GRUPO");
        modelo4.addColumn("TOTAL");
        tabgrupo.setModel(modelo4);
        
        String []datos = new String[2];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM total_grupo");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo4.addRow(datos);   
            } 
            tabgrupo.setModel(modelo4);
        } catch (SQLException ex) {
            
        }
    }

    void total_poblacion(){
        
        DefaultTableModel modelo5 = new DefaultTableModel();
        modelo5.addColumn("POBLACIÓN");
        modelo5.addColumn("TOTAL");
        tabpoblacion.setModel(modelo5);
        
        String []datos = new String[2];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM total_poblacion");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo5.addRow(datos);   
            } 
            tabpoblacion.setModel(modelo5);
        } catch (SQLException ex) {
            
        }
    }  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_reporte = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabgenero = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabarea = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabestilo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabgrupo = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabpoblacion = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabdiscapacidad = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnreporte = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REPORTES POBLACIÓN ADULTO MAYOR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_reporte.setBackground(new java.awt.Color(255, 255, 255));
        panel_reporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel14.setText("REPORTES POBLACIÓN ADULTO MAYOR");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("TOTAL GÉNERO:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("TOTAL ÁREA:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("TOTAL ESTILO DE VIDA:");

        tabgenero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabgenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabgenero);

        tabarea.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabarea);

        tabestilo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabestilo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabestilo);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("TOTAL GRUPO CONVIVIENTE:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL TIPO DE POBLACIÓN:");

        tabgrupo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabgrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tabgrupo);

        tabpoblacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabpoblacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tabpoblacion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        tabdiscapacidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabdiscapacidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabdiscapacidad);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("TOTAL DISCAPACIDAD:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addGap(20, 20, 20))
        );

        txtfecha.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        txtfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("FECHA:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_escudo.png"))); // NOI18N

        javax.swing.GroupLayout panel_reporteLayout = new javax.swing.GroupLayout(panel_reporte);
        panel_reporte.setLayout(panel_reporteLayout);
        panel_reporteLayout.setHorizontalGroup(
            panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_reporteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_reporteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_reporteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(panel_reporteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(46, 46, 46))
        );
        panel_reporteLayout.setVerticalGroup(
            panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_reporteLayout.createSequentialGroup()
                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_reporteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(panel_reporteLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_reporteLayout.createSequentialGroup()
                        .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(panel_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, 660));

        btnreporte.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_gene.png"))); // NOI18N
        btnreporte.setBorder(null);
        btnreporte.setBorderPainted(false);
        btnreporte.setContentAreaFilled(false);
        btnreporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnreporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_gene2.png"))); // NOI18N
        btnreporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_gene1.png"))); // NOI18N
        btnreporte.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnreporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
       
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
    }//GEN-LAST:event_btnreporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panel_reporte;
    private javax.swing.JTable tabarea;
    private javax.swing.JTable tabdiscapacidad;
    private javax.swing.JTable tabestilo;
    private javax.swing.JTable tabgenero;
    private javax.swing.JTable tabgrupo;
    private javax.swing.JTable tabpoblacion;
    private javax.swing.JLabel txtfecha;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        
        if(index > 0){
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX() + 0, pagfor.getImageableY() + 0);
        hub.scale(0.81, 0.8);
        panel_reporte.printAll(graf);
        return PAGE_EXISTS;
    }
}
