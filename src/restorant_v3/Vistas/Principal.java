package restorant_v3.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1200, 800);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono= new ImageIcon(getClass().getResource("/Restorant_v3/Imagen/restorant.png"));
        Image miImagen= icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiGestionDePedidos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMGestionProductos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMGestionMesas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiGestionMesero = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jMenu1.setText("PEDIDOS");

        jmiGestionDePedidos.setText("Gestion de Pedidos");
        jmiGestionDePedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionDePedidosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiGestionDePedidos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(" PRODUCTOS");

        jMGestionProductos.setText("Gestion de Productos");
        jMGestionProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGestionProductosActionPerformed(evt);
            }
        });
        jMenu2.add(jMGestionProductos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("MESAS");

        jMGestionMesas.setText("Gestion de Mesas");
        jMGestionMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGestionMesasActionPerformed(evt);
            }
        });
        jMenu3.add(jMGestionMesas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("MESEROS");

        jmiGestionMesero.setText("Gestion mesero");
        jmiGestionMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionMeseroActionPerformed(evt);
            }
        });
        jMenu4.add(jmiGestionMesero);

        jMenuBar1.add(jMenu4);

        jMSalir.setText("SALIR");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiGestionMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionMeseroActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionMesero gm = new GestionMesero();
        gm.setVisible(true);
       
        escritorio.add(gm);
    }//GEN-LAST:event_jmiGestionMeseroActionPerformed

    private void jMGestionProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGestionProductosActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();
        NuevoProducto gp = new NuevoProducto(escritorio);
        gp.setVisible(true);
        escritorio.add(gp);
    }//GEN-LAST:event_jMGestionProductosActionPerformed

    private void jMGestionMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGestionMesasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionMesa gm = new GestionMesa(escritorio);
        gm.setVisible(true);
        escritorio.add(gm);
    }//GEN-LAST:event_jMGestionMesasActionPerformed

    private void jmiGestionDePedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionDePedidosActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionPedido gp = new GestionPedido(escritorio);
        gp.setVisible(true);
        escritorio.add(gp);
    }//GEN-LAST:event_jmiGestionDePedidosActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMGestionMesas;
    private javax.swing.JMenuItem jMGestionProductos;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiGestionDePedidos;
    private javax.swing.JMenuItem jmiGestionMesero;
    // End of variables declaration//GEN-END:variables
}
