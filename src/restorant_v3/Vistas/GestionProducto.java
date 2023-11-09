package restorant_v3.Vistas;

import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restorant_v3.AccesoDatos.CategoriaData;
import restorant_v3.AccesoDatos.ProductoData;
import restorant_v3.Entidades.Categoria;
import restorant_v3.Entidades.Producto;

public class GestionProducto extends javax.swing.JInternalFrame {

    private final JDesktopPane escritorio;

    ProductoData pd = new ProductoData();
    CategoriaData cd = new CategoriaData();
    DefaultTableModel jtNueva = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public void setEstilo() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        Color colorFondo = new Color(214, 93, 10);
        renderer.setBackground(colorFondo);
        renderer.setForeground(Color.BLACK);
        renderer.setFont(new Font("Montserrat", Font.BOLD, 12));

        for (int i = 0; i < jtNueva.getColumnCount(); i++) {
            jtVieja.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    public GestionProducto(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        initComponents();
        armarCabecera();
        jtVieja.setModel(jtNueva);
        setEstilo();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombreProdu = new javax.swing.JTextField();
        jTPrecioProdu = new javax.swing.JTextField();
        jTStockProdu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcomboRubro = new javax.swing.JComboBox<>();
        jBLimpiar = new javax.swing.JButton();
        jBAgregarProdu = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVieja = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jbAgregarRubro = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 93, 10));
        jLabel1.setText("GESTION DE PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria:");

        jcomboRubro.setBackground(new java.awt.Color(214, 93, 10));
        jcomboRubro.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jcomboRubro.setForeground(new java.awt.Color(0, 0, 0));
        jcomboRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboRubroActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(214, 93, 10));
        jBLimpiar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBAgregarProdu.setBackground(new java.awt.Color(214, 93, 10));
        jBAgregarProdu.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jBAgregarProdu.setForeground(new java.awt.Color(0, 0, 0));
        jBAgregarProdu.setText("Agregar Producto");
        jBAgregarProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarProduActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(214, 93, 10));
        jBSalir.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(214, 93, 10));
        jbModificar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbModificar.setText("Modificar Selección");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jtVieja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Stock", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jtVieja);

        jbBuscar.setBackground(new java.awt.Color(214, 93, 10));
        jbBuscar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbBuscar.setText("Buscar");
        jbBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbAgregarRubro.setBackground(new java.awt.Color(214, 93, 10));
        jbAgregarRubro.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbAgregarRubro.setForeground(new java.awt.Color(0, 0, 0));
        jbAgregarRubro.setText("Agregar Categoria");
        jbAgregarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarRubroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombreProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTPrecioProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTStockProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcomboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbAgregarRubro)
                                            .addComponent(jBAgregarProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTPrecioProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAgregarProdu))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTStockProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcomboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbAgregarRubro))))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBAgregarProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarProduActionPerformed

        try {
            Producto produnuevo = new Producto();

            int stock = Integer.parseInt(jTStockProdu.getText());
            Double precio = Double.valueOf(jTPrecioProdu.getText());
            String nombre = jtNombreProdu.getText();
            Categoria rubro = (Categoria) jcomboRubro.getSelectedItem();

            produnuevo.getIdProd();
            produnuevo.setNombreProd(nombre);
            produnuevo.setPrecio(precio);
            produnuevo.setStock(stock);
            produnuevo.setRubro(rubro);
            produnuevo.setEstado(true);

            if (nombre.length() >= 4) {
                pd.AgregarProductos(produnuevo);
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese nombre correcto");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingresar los datos correctamente");
            jTPrecioProdu.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No debe haber campos vacios");
        }


    }//GEN-LAST:event_jBAgregarProduActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarPizarra();


    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jcomboRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboRubroActionPerformed

    }//GEN-LAST:event_jcomboRubroActionPerformed


    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        jtNueva.setRowCount(0);
        List<Producto> productos = pd.ListaProducto();

        String nombreText = jtNombreProdu.getText();
        String precioText = jTPrecioProdu.getText();
        String stockText = jTStockProdu.getText();
        String rubroSelect = jcomboRubro.getSelectedItem() != null ? jcomboRubro.getSelectedItem().toString() : null;

        for (Producto pr : productos) {

            if (nombreText.isEmpty() && precioText.isEmpty() && stockText.isEmpty() && rubroSelect == null) {
                JOptionPane.showMessageDialog(null, "Debe ingresar al menos un parametro de busqueda");

            } else if ((pr.getNombreProd().equals(nombreText))
                    || (!precioText.isEmpty() && pr.getPrecio() == Double.parseDouble(precioText))
                    || (!stockText.isEmpty() && pr.getStock() == Integer.parseInt(stockText))
                    || (rubroSelect != null && pr.getRubro().getNombre().equals(rubroSelect))) {
                llenarTabla(pr);
            }
        }

        if (jtNueva.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay coincidencias");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed


    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        ModificadorDproducto mdp = new ModificadorDproducto(escritorio);
        escritorio.add(mdp);

        int fSelec = jtVieja.getSelectedRow();
        if (fSelec != -1) {
            String produSelec = jtNueva.getValueAt(fSelec, 1).toString();
            Producto p = pd.buscarProduxnombre(produSelec);
            mdp.setDato(p);
            mdp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un producto");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbAgregarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarRubroActionPerformed
        CategoriaData cd = new CategoriaData();

        cd.agregarCategoriaxNombre(JOptionPane.showInputDialog(this, "Ingrese un nuevo Rubro"));
        limpiarPizarra();

    }//GEN-LAST:event_jbAgregarRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarProdu;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPrecioProdu;
    private javax.swing.JTextField jTStockProdu;
    private javax.swing.JButton jbAgregarRubro;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<Categoria> jcomboRubro;
    private javax.swing.JTextField jtNombreProdu;
    private javax.swing.JTable jtVieja;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jcomboRubro.addItem(null);
        List<Categoria> cat = cd.mostrarCategoria();

        for (Categoria c : cat) {
            jcomboRubro.addItem(c);
        }

    }

    private void armarCabecera() {

        jtNueva.addColumn("Nombre");
        jtNueva.addColumn("Precio");
        jtNueva.addColumn("Stock");
        jtNueva.addColumn("Categoria");

        jtVieja.setModel(jtNueva);
    }

    private void limpiarPizarra() {
        jtNueva.setRowCount(0);
        jcomboRubro.removeAllItems();
        jtNombreProdu.setText("");
        jTPrecioProdu.setText("");
        jTStockProdu.setText("");
        cargarCombo();
    }

    private void llenarTabla(Producto p) {

        jtNueva.addRow(new Object[]{
            p.getNombreProd(),
            p.getPrecio(),
            p.getStock(),
            p.getRubro(),});
    }

}
