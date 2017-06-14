
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class cuestionario extends javax.swing.JFrame {
    
    public InputStream foto1 = this.getClass().getResourceAsStream("/images/JAVA.jpg");

    
    public cuestionario() {
        initComponents();
        this.setSize(1200,680);
        this.setResizable(false); 
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/caña.png")).getImage());
        cargarImagen(pantalla1, foto1);
    }
    
    public void cargarImagen(javax.swing.JDesktopPane jDeskp,InputStream fileImagen){
        
        try {
            BufferedImage image = ImageIO.read(fileImagen);
            jDeskp.setBorder(new fondo_pantalla_principal(image));
        } catch (Exception e) { 
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        pantalla1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        in = new javax.swing.JMenu();
        inicio = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        admin = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        nuevo = new javax.swing.JMenu();
        cuestionario = new javax.swing.JMenuItem();
        consultar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        close = new javax.swing.JMenuItem();
        sesion = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MENU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pantalla1.setLayout(new java.awt.BorderLayout());

        in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_32.png"))); // NOI18N
        in.setText("INICIO");
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_16.png"))); // NOI18N
        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        in.add(inicio);

        jMenuBar1.add(in);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono2_11.png"))); // NOI18N
        jMenu1.setText("USUARIO");

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono2_1.png"))); // NOI18N
        admin.setText("Nuevo Administrador");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jMenu1.add(admin);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono2_3.png"))); // NOI18N
        jMenuItem4.setText("Activación de Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard_32.png"))); // NOI18N
        nuevo.setText("CUESTIONARIO");

        cuestionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard_16.png"))); // NOI18N
        cuestionario.setText("Nuevo Cuestionario");
        cuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuestionarioActionPerformed(evt);
            }
        });
        nuevo.add(cuestionario);

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono20.png"))); // NOI18N
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        nuevo.add(consultar);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono10.png"))); // NOI18N
        jMenuItem2.setText("Actualizar Supervivencia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        nuevo.add(jMenuItem2);

        jMenuBar1.add(nuevo);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono20_1.png"))); // NOI18N
        jMenu2.setText("REPORTES");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono21.png"))); // NOI18N
        jMenuItem1.setText("Reportes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono7.png"))); // NOI18N
        jMenuItem3.setText("Ficha Completa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_33.png"))); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono8.png"))); // NOI18N
        close.setText("Salir");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        salir.add(close);

        sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono5.png"))); // NOI18N
        sesion.setText("Cerrar Sesion");
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });
        salir.add(sesion);

        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        
        registro dialog = new registro(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        
        
    
    }//GEN-LAST:event_adminActionPerformed

    private void cuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuestionarioActionPerformed
        
        modificar md = new modificar();
        menu_preguntas m = new menu_preguntas();
        pantalla1.add(m);
        m.show();
        if(m.isShowing()){
            pantalla1.remove(md);
            cuestionario.setEnabled(false);
        }
    }//GEN-LAST:event_cuestionarioActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        
    }//GEN-LAST:event_salirActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?","Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
        
        login l = new login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sesionActionPerformed

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
      
         
    }//GEN-LAST:event_inActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        
        pantalla1.removeAll();
        pantalla1.updateUI();
        cuestionario.setEnabled(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
    
        consultar dialog = new consultar(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        
        
    }//GEN-LAST:event_consultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        reportes dialog = new reportes(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?","Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        supervivencia dialog = new supervivencia(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        ficha_completa dialog = new ficha_completa(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        activacion_usuarios dialog = new activacion_usuarios(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admin;
    private javax.swing.JMenuItem close;
    private javax.swing.JMenuItem consultar;
    private javax.swing.JMenuItem cuestionario;
    private javax.swing.JMenu in;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenu nuevo;
    private javax.swing.JDesktopPane pantalla1;
    private javax.swing.JMenu salir;
    private javax.swing.JMenuItem sesion;
    // End of variables declaration//GEN-END:variables
}
