package restorant_v3.Vistas;

import java.util.List;
import javax.swing.JDesktopPane;
import restorant_v3.AccesoDatos.CategoriaData;
import restorant_v3.AccesoDatos.ProductoData;
import restorant_v3.Entidades.Categoria;
import restorant_v3.Entidades.Producto;

public class ModificadorDproducto extends javax.swing.JInternalFrame {

    private Producto produ;
    private ProductoData pd =new ProductoData(); 
    private CategoriaData cd = new CategoriaData();
    private final JDesktopPane esc;

    public ModificadorDproducto(JDesktopPane esc) {
        this.esc = esc;
        initComponents();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbModi = new javax.swing.JButton();
        jBVolver = new javax.swing.JButton();
        jlTitle = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jcRubro = new javax.swing.JComboBox<>();
        jrbServicio = new javax.swing.JRadioButton();
        jrbFuera = new javax.swing.JRadioButton();
        jlIdProducto = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("NOMBRE:");

        jLabel5.setText("PRECIO:");

        jLabel6.setText("STOCK:");

        jLabel7.setText("RUBRO:");

        jLabel8.setText("ESTADO");

        jbModi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbModi.setText("EJECUTAR MODIFICACION");
        jbModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModiActionPerformed(evt);
            }
        });

        jBVolver.setText("VOLVER");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        jlTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTitle.setText("MODIFICANDO PRODUCTO");

        jrbServicio.setText("En servicio");
        jrbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbServicioActionPerformed(evt);
            }
        });

        jrbFuera.setText("Fuera de servicio");
        jrbFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFueraActionPerformed(evt);
            }
        });

        jlIdProducto.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlIdProducto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbModi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jBVolver))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtStock)
                                    .addComponent(jtPrecio)
                                    .addComponent(jtNombre)
                                    .addComponent(jcRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbServicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbFuera)))))
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitle)
                    .addComponent(jlIdProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbServicio)
                        .addComponent(jrbFuera))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVolver))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModiActionPerformed
        
        int nuevoId = Integer.parseInt(jlIdProducto.getText());
        String nuevonombre = jtNombre.getText();
        double nuevoPrecio = Double.parseDouble(jtPrecio.getText());
        
        int nuevoStock = Integer.parseInt(jtStock.getText());
        boolean nuevoEstado= true;

        if (jrbFuera.isSelected()) {
            nuevoEstado = false;
        } else if (jrbServicio.isSelected()) {
            nuevoEstado = true;
        }
        
        Categoria cat = (Categoria) jcRubro.getSelectedItem();
        
        Producto p = new Producto(nuevoId, nuevonombre, nuevoPrecio, nuevoStock, nuevoEstado, cat);
        
        pd.ModificarProdu(p);

    }//GEN-LAST:event_jbModiActionPerformed

    private void jrbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbServicioActionPerformed

        jrbFuera.setSelected(false);
        jrbServicio.setSelected(true);
    }//GEN-LAST:event_jrbServicioActionPerformed

    private void jrbFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFueraActionPerformed

        jrbFuera.setSelected(true);
        jrbServicio.setSelected(false);
    }//GEN-LAST:event_jrbFueraActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed
    public void setDato(Producto produ) {
        this.produ = produ;
              
        jlIdProducto.setText(produ.getIdProd()+"");
        jtNombre.setText(produ.getNombreProd());
        jtPrecio.setText(produ.getPrecio()+"");
        jtStock.setText(produ.getStock()+"");
        
        int nuevaCat = cd.devolverIdCat(produ.getRubro().getNombre());
        jcRubro.setSelectedIndex(nuevaCat);       
        
         
        if (produ.isEstado()) {
            jrbServicio.setSelected(true);
        } else if (!produ.isEstado()) {
            jrbFuera.setSelected(true);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbModi;
    private javax.swing.JComboBox<Categoria> jcRubro;
    private javax.swing.JLabel jlIdProducto;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JRadioButton jrbFuera;
    private javax.swing.JRadioButton jrbServicio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jcRubro.addItem(null);
        List<Categoria> cat = cd.mostrarCategoria();

        for (Categoria c : cat) {
            jcRubro.addItem(c);
        }

    }
}
