
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class consultar extends javax.swing.JDialog {

  
    public consultar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(1250,500);
        this.setResizable(false); 
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
        actualizar("");
    }
    
    void actualizar(String val){
        
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("IDENTIFICACIÓN");
        modelo1.addColumn("NOMBRES");
        modelo1.addColumn("APELLIDOS");
        modelo1.addColumn("GÉNERO");
        modelo1.addColumn("EDAD");
        modelo1.addColumn("FECHA.NACIMIENTO");
        modelo1.addColumn("DEP.NACIMIENTO");
        modelo1.addColumn("MUN.NACIMIENTO");
        modelo1.addColumn("ESTADO CIVIL");
        tabusqueda.setModel(modelo1);
        
        String sql = "";
        
         if (val.equals("")) {
             sql = "SELECT p.numero_identificacion,p.nombres,p.apellidos,p.genero,p.edad,p.fecha_nacimiento,d2.departamento,m2.municipio,ec.estado_civil FROM personas p  INNER JOIN municipios m2 ON m2.id=p.id_lugar_nacimiento INNER JOIN departamentos d2 ON d2.id=m2.id_departamento INNER JOIN estados_civiles ec ON ec.id=p.id_tipo_identificacion";
         } else if (cbbusqueda.getSelectedItem().toString().equals("Nombre")) {
             sql = "SELECT p.numero_identificacion,p.nombres,p.apellidos,p.genero,p.edad,p.fecha_nacimiento,d2.departamento,m2.municipio,ec.estado_civil FROM personas p  INNER JOIN municipios m2 ON m2.id=p.id_lugar_nacimiento INNER JOIN departamentos d2 ON d2.id=m2.id_departamento INNER JOIN estados_civiles ec ON ec.id=p.id_tipo_identificacion WHERE p.nombres like '%" + val + "%' ";
         } else if (cbbusqueda.getSelectedItem().toString().equals("Edad")) {
             sql = "SELECT p.numero_identificacion,p.nombres,p.apellidos,p.genero,p.edad,p.fecha_nacimiento,d2.departamento,m2.municipio,ec.estado_civil FROM personas p  INNER JOIN municipios m2 ON m2.id=p.id_lugar_nacimiento INNER JOIN departamentos d2 ON d2.id=m2.id_departamento INNER JOIN estados_civiles ec ON ec.id=p.id_tipo_identificacion WHERE p.edad like '%" + val + "%' ";
         } else if(cbbusqueda.getSelectedItem().toString().equals("Documento")) {
             sql = "SELECT p.numero_identificacion,p.nombres,p.apellidos,p.genero,p.edad,p.fecha_nacimiento,d2.departamento,m2.municipio,ec.estado_civil FROM personas p  INNER JOIN municipios m2 ON m2.id=p.id_lugar_nacimiento INNER JOIN departamentos d2 ON d2.id=m2.id_departamento INNER JOIN estados_civiles ec ON ec.id=p.id_tipo_identificacion WHERE p.numero_identificacion like '%" + val + "%' ";
         }
        
        String []datos = new String[9];
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
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
                modelo1.addRow(datos);   
            } 
            tabusqueda.setModel(modelo1);
        } catch (SQLException ex) {
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbbusqueda = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabusqueda = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItem1.setText("ACTUALIZAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CUESTIONARIOS REGISTRADOS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        txtbuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

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

        cbbusqueda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbbusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Edad", "Documento" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("BUSQUEDA POR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 38, -1, -1));

        tabusqueda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabusqueda.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 138, 1188, 303));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_escudo.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono15.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono16.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono15.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 63, 42, 50));
        jButton2.getAccessibleContext().setAccessibleParent(jPanel1);

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
       
        char c = evt.getKeyChar();
        String busqueda = "";
        busqueda = cbbusqueda.getSelectedItem().toString();
        
        if(busqueda == "Nombre"){
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) evt.consume();
        }else{
            if((c < '0' || c > '9') && (c < ' ' || c > ' ')) evt.consume();
        }
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        actualizar(txtbuscar.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea salir?","CERRAR CONSULTA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        
        actualizar dialog = new actualizar(new javax.swing.JFrame(), true);

        int fila = tabusqueda.getSelectedRow();
        int id = 0;
        int id_per = 0;
        
        if (fila >= 0) {

            String[] datos = new String[17];
            String[] datos1 = new String[6];
            String[] datos2 = new String[17];
            String[] datos3 = new String[13];
            String[] datos4 = new String[11];
            String[] datos5 = new String[9];

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT p.nombres,p.apellidos,ti.tipo_identificacion,p.numero_identificacion,d1.departamento,m1.municipio,p.genero,p.edad,p.fecha_nacimiento,d2.departamento,m2.municipio,ec.estado_civil,gc.grupo,p.otro_grupo_conviviente,es.escolaridad,p.hijos,p.nro_hijos FROM personas p INNER JOIN tipos_identificacion ti ON ti.id=p.id_tipo_identificacion INNER JOIN estados_civiles ec ON ec.id=p.id_estado_civil INNER JOIN  grupos_convivientes gc ON gc.id=p.id_grupo_conviviente INNER JOIN tipos_escolaridad es ON es.id=p.id_escolaridad INNER JOIN municipios m1 ON m1.id=p.id_lugar_expedicion INNER JOIN municipios m2 ON m2.id=p.id_lugar_nacimiento INNER JOIN departamentos d1 ON d1.id=m1.id_departamento INNER JOIN departamentos d2 ON d2.id=m2.id_departamento WHERE p.numero_identificacion='" + tabusqueda.getValueAt(fila, 0).toString() + "'");
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                    datos[7] = rs.getString(8);
                    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
                    String fecha = datos[8] = rs.getString(9);
                    Date dato = null;
                    try {

                        dato = formatoDelTexto.parse(fecha);

                    } catch (ParseException ex) {

                    }
                    datos[9] = rs.getString(10);
                    datos[10] = rs.getString(11);
                    datos[11] = rs.getString(12);
                    datos[12] = rs.getString(13);
                    datos[13] = rs.getString(14);
                    datos[14] = rs.getString(15);
                    datos[15] = rs.getString(16);
                    datos[16] = rs.getString(17);

                    dialog.txtnom.setText(datos[0]);
                    dialog.txtape.setText(datos[1]);
                    dialog.txtdocumento.setText(datos[2]);
                    dialog.txtnumid.setText(datos[3]);
                    dialog.txtdeexp.setText(datos[4]);
                    dialog.txtmunexp.setText(datos[5]);
                    dialog.genero.setSelectedItem(datos[6]);
                    dialog.txtedad.setText(datos[7]);
                    dialog.fechana.setDate(dato);
                    dialog.txtdepna.setText(datos[9]);
                    dialog.txtmunna.setText(datos[10]);
                    dialog.txtestado.setText(datos[11]);
                    dialog.txtgrupo.setText(datos[12]);
                    dialog.txtotrogrupo.setText(datos[13]);
                    dialog.txtescolaridad.setText(datos[14]);
                    dialog.hijos.setSelectedItem(datos[15]);
                    dialog.txthijos.setText(datos[16]);
                }

            } catch (SQLException ex) {

            }
            
             try {
                Statement ts;
                ts = cn.createStatement();
                ResultSet rel = ts.executeQuery("SELECT id FROM personas WHERE numero_identificacion = '"+datos[3]+"'");
                while (rel.next()) {
                    id=rel.getInt("id");
                    dialog.txtid.setText(String.valueOf(id));

                }
            } catch (Exception e) {
            }
             
             try {
                Statement ts;
                ts = cn.createStatement();
                ResultSet rel = ts.executeQuery("SELECT id_persona FROM persona_vivienda WHERE id_persona = '"+id+"'");
                while (rel.next()) {
                    id_per=rel.getInt("id_persona");
                    dialog.txtid_per.setText(String.valueOf(id_per));

                }
            } catch (Exception e) {
            }
             
             try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT d.departamento,m.municipio,pv.sector,pv.barrio_vereda,pv.estrato,pv.celular FROM persona_vivienda pv INNER JOIN municipios m ON m.id=pv.id_municipio INNER JOIN departamentos d ON d.id=m.id_departamento WHERE id_persona = '"+id+"'");
            while(rs.next()){
                datos1[0] = rs.getString(1);
                datos1[1] = rs.getString(2);
                datos1[2] = rs.getString(3);
                datos1[3] = rs.getString(4);
                datos1[4] = rs.getString(5);
                datos1[5] = rs.getString(6);
                
                dialog.txtdepvi.setText(datos1[0]);
                dialog.txtmunvi.setText(datos1[1]);
                dialog.txtsector.setText(datos1[2]);
                dialog.txtbarrio.setText(datos1[3]);
                dialog.txtestrato.setText(datos1[4]);
                dialog.txtcel.setText(datos1[5]);
            } 
            
        } catch (SQLException ex) {
            
        }
         try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT tv.tipo_vivienda,pv.otro_tipo_vivienda,pv.condicion_vivienda,mt.material,pv.otro_material_pared,mtp.material,pv.otro_material_piso,mtt.material,pv.otro_material_techo,pv.espacios_separados,pv.acceso_independiente,pv.nro_pisos,pv.nro_alcobas,pv.nro_banos,pv.nro_cocinas,pv.nro_hogares,pv.total_personas FROM persona_vivienda pv INNER JOIN tipos_vivienda tv ON tv.id=pv.id_tipo_vivienda INNER JOIN materiales mt ON mt.id=pv.id_material_pared INNER JOIN materiales mtp ON mtp.id=pv.id_material_piso INNER JOIN materiales mtt ON mtt.id=pv.id_material_techo WHERE id_persona = '"+id+"'");
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
                
                dialog.txttipovi.setText(datos2[0]);
                dialog.txtcualvi.setText(datos2[1]);
                dialog.condicionesvi.setSelectedItem(datos2[2]);
                dialog.txtpared.setText(datos2[3]);
                dialog.txtcualpared.setText(datos2[4]);
                dialog.txtpiso.setText(datos2[5]);
                dialog.txtcualpiso.setText(datos2[6]);
                dialog.txttecho.setText(datos2[7]);
                dialog.txtcualtecho.setText(datos2[8]);
                dialog.espacios.setSelectedItem(datos2[9]);
                dialog.acceso.setSelectedItem(datos2[10]);
                dialog.txtnumpiso.setText(datos2[11]);
                dialog.txtnumalcobas.setText(datos2[12]);
                dialog.txtnumbaños.setText(datos2[13]);
                dialog.txtnumcocinas.setText(datos2[14]);
                dialog.txtnumhogares.setText(datos2[15]);
                dialog.txtnumpersonas.setText(datos2[16]);
            }
           
        } catch (SQLException ex) {

        }
          try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT pv.energia_electrica,pv.alcantarillado,ag.descripcion,pv.otro_obtencion_agua,cm.descripcion,pv.otro_combustible_cocina,eb.descripcion,pv.otro_elm_basura,ss.descripcion,pv.otro_servicio_sanitario,pv.ubicacion_serv_sanitario,t.tipo_tenencia,pv.otro_tenencia_vivienda FROM persona_vivienda pv INNER JOIN servicios ag ON ag.id=pv.id_obtencion_agua INNER JOIN servicios cm ON cm.id=pv.id_combustible_cocina INNER JOIN servicios eb ON eb.id=pv.id_elm_basura INNER JOIN servicios ss ON ss.id=pv.id_servicio_sanitario INNER JOIN tenencia_vivienda t ON t.id=pv.id_tenencia_vivienda WHERE id_persona = '"+id+"'");
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
                
                dialog.energiaelectrica.setSelectedItem(datos3[0]);
                dialog.alcantarillado.setSelectedItem(datos3[1]);
                dialog.txtaguacons.setText(datos3[2]);
                dialog.txtcualagua.setText(datos3[3]);
                dialog.txtcombuscocina.setText(datos3[4]);
                dialog.txtcualcombus.setText(datos3[5]);
                dialog.txteliminacion.setText(datos3[6]);
                dialog.txtcualelimiacion.setText(datos3[7]);
                dialog.txtsanitariousado.setText(datos3[8]);
                dialog.txtcualsanitario.setText(datos3[9]);
                dialog.ubicacionvivienda.setSelectedItem(datos3[10]);
                dialog.txttenvivienda.setText(datos3[11]);
                dialog.txtcualvivienda.setText(datos3[12]);
            }
        } catch (SQLException ex) {

        }
        
          try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT tp.tipo,p.afiliacion_salud,p.tipo_salud,p.eps,p.ips,p.discapacidad,p.caract_discapacidad,p.estilo_vida_saludable,p.adulto_mayor,p.grupo_adulto_mayor,p.organizacion_comun FROM personas p INNER JOIN  tipos_poblacion tp ON tp.id=p.id_tipo_poblacion WHERE p.numero_identificacion='" + tabusqueda.getValueAt(fila, 0).toString() + "'");
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
                
                dialog.txtpoblacion.setText(datos4[0]);
                dialog.salud.setSelectedItem(datos4[1]);
                dialog.tipoafiliacion.setSelectedItem(datos4[2]);
                dialog.txteps.setText(datos4[3]);
                dialog.txtips.setText(datos4[4]);
                dialog.discapacidad.setSelectedItem(datos4[5]);
                dialog.txtdiscapacidad.setText(datos4[6]);
                dialog.vidasaludable.setSelectedItem(datos4[7]);
                dialog.adultomayor.setSelectedItem(datos4[8]);
                dialog.txtadultomayor.setText(datos4[9]);
                dialog.organizacion.setSelectedItem(datos4[10]);
            }
            
        } catch (SQLException ex) {

        }
         
          try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT p.ocupacion,p.tipo_ocupacion,p.ingresos,p.fuente_ingresos,im.ingresos_rango,p.prog_colombia_mayor,p.ayuda_tecnica_usa,p.ayuda_tecnica,p.ayuda_tecnica_requiere FROM personas p INNER JOIN ingresos_mensuales im ON im.id=p.id_ingreso_mensual WHERE p.numero_identificacion='" + tabusqueda.getValueAt(fila, 0).toString() + "'");
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
                
                dialog.ocupacion.setSelectedItem(datos5[0]);
                dialog.tipoocupacion.setSelectedItem(datos5[1]);
                dialog.ingresos.setSelectedItem(datos5[2]);
                dialog.txtingresos.setText(datos5[3]);
                dialog.txtigresosmen.setText(datos5[4]); 
                dialog.programacolmayor.setSelectedItem(datos5[5]);
                dialog.usatec.setSelectedItem(datos5[6]);
                dialog.cuentatec.setSelectedItem(datos5[7]);
                dialog.requieretec.setSelectedItem(datos5[8]);
            }
            
        } catch (SQLException ex) {

        }
          
            dialog.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        actualizar("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabusqueda;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
