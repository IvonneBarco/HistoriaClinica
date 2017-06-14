
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;


public class menu_preguntas extends javax.swing.JInternalFrame {
    public InputStream foto1 = this.getClass().getResourceAsStream("/images/JAVA.jpg");

    public menu_preguntas() {
        initComponents();
        cargarImagen(pantalla2, foto1);
        //this.setSize(800,890);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cuestionario = new javax.swing.JTree();
        pantalla2 = new javax.swing.JDesktopPane();

        setResizable(true);
        setTitle("CUESTIONARIO");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CUESTIONARIO");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("1. INFORMACION GENERAL");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1.1. Datos Generales");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1.2 . Identificacion Geografica de la Vivienda");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("2. CARACTERISTICAS DE LA VIVIENDA");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("2.1. Caracteristicas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("2.2. Servicios con que cuenta la Vivienda");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("3. CARACTERISTICAS SOCIALES Y DE SALUD");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("3.1. Caracteristicas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("4. CARACTERISTICAS ECONOMICAS");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("4.1. Caracteristicas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        cuestionario.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        cuestionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuestionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cuestionario);

        pantalla2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addComponent(pantalla2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuestionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuestionarioMouseClicked

        String opcion = cuestionario.getLastSelectedPathComponent().toString();

        String a, b, c, d, e, f, g;
        a = "1.1. Datos Generales";
        b = "1.2 . Identificacion Geografica de la Vivienda";
        c = "2.1. Caracteristicas";
        d = "2.2. Servicios con que cuenta la Vivienda";
        f = "3.1. Caracteristicas";
        g = "4.1. Caracteristicas";

        if (opcion.equals(a)) {
            seccion1a s = new seccion1a();
            pantalla2.add(s);
            s.setVisible(true);
        } else if (opcion.equals(b)) {
            seccion1b s = new seccion1b();
            pantalla2.add(s);
            s.setVisible(true);
        } else if (opcion.equals(c)) {
            seccion2a s = new seccion2a();
            pantalla2.add(s);
            s.setVisible(true);
        } else if (opcion.equals(d)) {
            seccion2b s = new seccion2b();
            pantalla2.add(s);
            s.setVisible(true);
        } else if (opcion.equals(f)) {
            seccion3a s = new seccion3a();
            pantalla2.add(s);
            s.setVisible(true);
        } else if (opcion.equals(g)) {
            seccion4a s = new seccion4a();
            pantalla2.add(s);
            s.setVisible(true);
        }

    }//GEN-LAST:event_cuestionarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree cuestionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane pantalla2;
    // End of variables declaration//GEN-END:variables
}
