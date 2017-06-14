
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class modificar extends javax.swing.JInternalFrame {

    
    public modificar() {
        initComponents();
        actualizarsec1();
        actualizarsec2();
        actualizarsec3();
        actualizarsec4();
        actualizarsec5();
        actualizarsec6();
        

    }
    
    void actualizarsec1(){
        
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("NOMBRE");
        modelo1.addColumn("APELLIDOS");
        modelo1.addColumn("TIPO.DOC");
        modelo1.addColumn("NÚMERO");
        modelo1.addColumn("DEP.EXP");
        modelo1.addColumn("MUN.EXP");
        modelo1.addColumn("GÉNERO");
        modelo1.addColumn("EDAD");
        modelo1.addColumn("FECHA.NA");
        modelo1.addColumn("DEP.NA");
        modelo1.addColumn("MUN.NA");
        modelo1.addColumn("ESTADO.C");
        modelo1.addColumn("G.CONVIV");
        modelo1.addColumn("OTRO");
        modelo1.addColumn("ESCOLARIDAD");
        modelo1.addColumn("HIJOS");
        modelo1.addColumn("CUANTOS");
        tabsec1.setModel(modelo1);
        
        String []datos = new String[17];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT p.nombres,p.apellidos,ti.tipo_identificacion,p.numero_identificacion,d1.departamento,m1.municipio,p.genero,p.edad,p.fecha_nacimiento,d2.departamento,m2.municipio,ec.estado_civil,gc.grupo,p.otro_grupo_conviviente,es.escolaridad,p.hijos,p.nro_hijos FROM personas p INNER JOIN tipos_identificacion ti ON ti.id=p.id_tipo_identificacion INNER JOIN estados_civiles ec ON ec.id=p.id_estado_civil INNER JOIN  grupos_convivientes gc ON gc.id=p.id_grupo_conviviente INNER JOIN tipos_escolaridad es ON es.id=p.id_escolaridad INNER JOIN municipios m1 ON m1.id=p.id_lugar_expedicion INNER JOIN municipios m2 ON m2.id=p.id_lugar_nacimiento INNER JOIN departamentos d1 ON d1.id=m1.id_departamento INNER JOIN departamentos d2 ON d2.id=m2.id_departamento");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
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
                modelo1.addRow(datos);   
            } 
            tabsec1.setModel(modelo1);
        } catch (SQLException ex) {
            
        }
    }
    
    void actualizarsec2(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("DEPARTAMENTO");
        modelo.addColumn("MUNICIPIO");
        modelo.addColumn("SECTOR");
        modelo.addColumn("BARRIO/VEREDA");
        modelo.addColumn("ESTRATO");
        modelo.addColumn("CELULAR");
        tabsec2.setModel(modelo);
        
        String []datos = new String[6];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT d.departamento,m.municipio,pv.sector,pv.barrio_vereda,pv.estrato,pv.celular FROM persona_vivienda pv INNER JOIN municipios m ON m.id=pv.id_municipio INNER JOIN departamentos d ON d.id=m.id_departamento");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            } 
            tabsec2.setModel(modelo);
        } catch (SQLException ex) {
            
        }
    }
    
    void actualizarsec3(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("TIPO.VIV");
        modelo.addColumn("OTRO");
        modelo.addColumn("COND.VIV");
        modelo.addColumn("MAT.PARED");
        modelo.addColumn("OTRO");
        modelo.addColumn("MAT.PISO");
        modelo.addColumn("OTRO");
        modelo.addColumn("MAT.TECHO");
        modelo.addColumn("OTRO");
        modelo.addColumn("ESP.SEP");
        modelo.addColumn("ACC.INDEP");
        modelo.addColumn("N.PISOS");
        modelo.addColumn("N.ALCOBAS");
        modelo.addColumn("N.BAÑOS");
        modelo.addColumn("N.COCINAS");
        modelo.addColumn("N.HOGARES");
        modelo.addColumn("N.PERSONAS");
        tabsec3.setModel(modelo);

        String[] datos = new String[17];

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT tv.tipo_vivienda,pv.otro_tipo_vivienda,pv.condicion_vivienda,mt.material,pv.otro_material_pared,mtp.material,pv.otro_material_piso,mtt.material,pv.otro_material_techo,pv.espacios_separados,pv.acceso_independiente,pv.nro_pisos,pv.nro_alcobas,pv.nro_banos,pv.nro_cocinas,pv.nro_hogares,pv.total_personas FROM persona_vivienda pv INNER JOIN tipos_vivienda tv ON tv.id=pv.id_tipo_vivienda INNER JOIN materiales mt ON mt.id=pv.id_material_pared INNER JOIN materiales mtp ON mtp.id=pv.id_material_piso INNER JOIN materiales mtt ON mtt.id=pv.id_material_techo");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
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
                modelo.addRow(datos);
            }
            tabsec3.setModel(modelo);
        } catch (SQLException ex) {

        }
    }
    
    void actualizarsec4(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ENER.ELÉCTRICA");
        modelo.addColumn("ALCANTARILLADO");
        modelo.addColumn("AGUA CONSUMO");
        modelo.addColumn("CUAL");
        modelo.addColumn("COMBUSTIBLE");
        modelo.addColumn("CUAL");
        modelo.addColumn("ELM.BASURAS");
        modelo.addColumn("CUAL");
        modelo.addColumn("SERV.SANITARIO");
        modelo.addColumn("CUAL");
        modelo.addColumn("UBICACIÓN SANITARIO");
        modelo.addColumn("VIVIENDA");
        modelo.addColumn("CUAL");
        tabsec4.setModel(modelo);
        
        String[] datos = new String[13];

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT pv.energia_electrica,pv.alcantarillado,ag.descripcion,pv.otro_obtencion_agua,cm.descripcion,pv.otro_combustible_cocina,eb.descripcion,pv.otro_elm_basura,ss.descripcion,pv.otro_servicio_sanitario,pv.ubicacion_serv_sanitario,t.tipo_tenencia,pv.otro_tenencia_vivienda FROM persona_vivienda pv INNER JOIN servicios ag ON ag.id=pv.id_obtencion_agua INNER JOIN servicios cm ON cm.id=pv.id_combustible_cocina INNER JOIN servicios eb ON eb.id=pv.id_elm_basura INNER JOIN servicios ss ON ss.id=pv.id_servicio_sanitario INNER JOIN tenencia_vivienda t ON t.id=pv.id_tenencia_vivienda");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                modelo.addRow(datos);
            }
            tabsec4.setModel(modelo);
        } catch (SQLException ex) {

        }
    }
    
    void actualizarsec5(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("TIPO POBLACIÓN");
        modelo.addColumn("SALUD");
        modelo.addColumn("TIPO AFILIACIÓN");
        modelo.addColumn("EPS");
        modelo.addColumn("IPS");
        modelo.addColumn("DISCAPACIDAD");
        modelo.addColumn("CUAL");
        modelo.addColumn("VIDA SALUDABLE");
        modelo.addColumn("ADULTO MAYOR");
        modelo.addColumn("CUAL");
        modelo.addColumn("ORG.COMUNITARIA");
        tabsec5.setModel(modelo);
        
        String[] datos = new String[11];

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT tp.tipo,p.afiliacion_salud,p.tipo_salud,p.eps,p.ips,p.discapacidad,p.caract_discapacidad,p.estilo_vida_saludable,p.adulto_mayor,p.grupo_adulto_mayor,p.organizacion_comun FROM personas p INNER JOIN  tipos_poblacion tp ON tp.id=p.id_tipo_poblacion");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                modelo.addRow(datos);
            }
            tabsec5.setModel(modelo);
        } catch (SQLException ex) {

        }
    }
    
    void actualizarsec6(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("OCUPACIÓN");
        modelo.addColumn("TIPO OCUPACIÓN");
        modelo.addColumn("RECIBE INGRESOS");
        modelo.addColumn("FUENTE DE INGRESOS");
        modelo.addColumn("INGR.MENSUALES");
        modelo.addColumn("PROG.COLOMBIA MAYOR");
        modelo.addColumn("USA A.TÉCNICA");
        modelo.addColumn("CUENTA CON A.TÉCNICA");
        modelo.addColumn("REQUIERE A.TÉCNICA");
        tabsec6.setModel(modelo);
        
        String[] datos = new String[9];

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT p.ocupacion,p.tipo_ocupacion,p.ingresos,p.fuente_ingresos,im.ingresos_rango,p.prog_colombia_mayor,p.ayuda_tecnica_usa,p.ayuda_tecnica,p.ayuda_tecnica_requiere FROM personas p INNER JOIN ingresos_mensuales im ON im.id=p.id_ingreso_mensual");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                modelo.addRow(datos);
            }
            tabsec6.setModel(modelo);
        } catch (SQLException ex) {

        }
    }
    
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Actualizar = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabsec1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabsec2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabsec3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabsec4 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabsec5 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabsec6 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();

        Actualizar.setText("jMenuItem1");
        jPopupMenu1.add(Actualizar);

        setTitle("ACTUALIZACIÓN DE CUESTIONARIO");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabsec1.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        tabsec1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabsec1);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel15.setText("ACTUALIZACIÓN DE DATOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1.1. Datos Generales", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabsec2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tabsec2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabsec2);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel16.setText("ACTUALIZACIÓN DE DATOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1.2. Identificación Geográfica de la Vivienda", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tabsec3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tabsec3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabsec3);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel17.setText("ACTUALIZACIÓN DE DATOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel17))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel17)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2.1. Características", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tabsec4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tabsec4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabsec4);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel18.setText("ACTUALIZACIÓN DE DATOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel18)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2.2. Servicios con que cuenta la Vivienda", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tabsec5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tabsec5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tabsec5);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel19.setText("ACTUALIZACIÓN DE DATOS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel19)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("3.1. Características", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tabsec6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tabsec6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tabsec6);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel14.setText("ACTUALIZACIÓN DE DATOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("4.1. Características", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 119, 1266, 622));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        buscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Boton2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Boton1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, -1, -1));

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        actualizarsec1();
        actualizarsec2();
        actualizarsec3();
        actualizarsec4();
        actualizarsec5();
        actualizarsec6();
        
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actualizar;
    private javax.swing.JTextField buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabsec1;
    private javax.swing.JTable tabsec2;
    private javax.swing.JTable tabsec3;
    private javax.swing.JTable tabsec4;
    private javax.swing.JTable tabsec5;
    private javax.swing.JTable tabsec6;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}

