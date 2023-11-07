package restorant_v3.Vistas;

import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restorant_v3.AccesoDatos.CategoriaData;
import restorant_v3.AccesoDatos.ProductoData;
import restorant_v3.Entidades.Categoria;
import restorant_v3.Entidades.Producto;

public class NuevoProducto extends javax.swing.JInternalFrame {
    private final JDesktopPane escritorio;
    
    ProductoData pd = new ProductoData();
    CategoriaData cd = new CategoriaData();
    DefaultTableModel jtNueva = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public NuevoProducto(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        initComponents();
        armarCabecera();
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
        jrbMostrarLista = new javax.swing.JRadioButton();
        jbAgregarRubro = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("GESTION DE PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Stock:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Rubro:");

        jcomboRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboRubroActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBAgregarProdu.setText("Agregar Producto");
        jBAgregarProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarProduActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
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

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrbMostrarLista.setText("Lista de Productos");
        jrbMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMostrarListaActionPerformed(evt);
            }
        });

        jbAgregarRubro.setText("Agregar Rubro");
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
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNombreProdu)
                            .addComponent(jTPrecioProdu)
                            .addComponent(jTStockProdu)
                            .addComponent(jcomboRubro, 0, 172, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAgregarProdu)
                            .addComponent(jBLimpiar)
                            .addComponent(jbBuscar)
                            .addComponent(jbAgregarRubro))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbMostrarLista)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBAgregarProdu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTPrecioProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBLimpiar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTStockProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jbAgregarRubro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jrbMostrarLista)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jBSalir))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jrbMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMostrarListaActionPerformed
        jtNueva.setRowCount(0);
        if (jrbMostrarLista.isSelected()) {

            List<Producto> pr = pd.ListaProducto();
            for (Producto p : pr) {
                jtNueva.addRow(new Object[]{
                    p.getIdProd(),
                    p.getNombreProd(),
                    p.getPrecio(),
                    p.getStock(),
                    p.getRubro(),
                    p.isEstado()});

            }

        } else if (!jrbMostrarLista.isSelected()) {
            jtNueva.setRowCount(0);
        }
    }//GEN-LAST:event_jrbMostrarListaActionPerformed

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
    private javax.swing.JRadioButton jrbMostrarLista;
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
        jtNueva.addColumn("Id");
        jtNueva.addColumn("Nombre");
        jtNueva.addColumn("Precio");
        jtNueva.addColumn("Stock");
        jtNueva.addColumn("Categoria");
        jtNueva.addColumn("Estado");
        jtVieja.setModel(jtNueva);
    }

    private void limpiarPizarra() {
        jtNueva.setRowCount(0);
        jcomboRubro.removeAllItems();
        jtNombreProdu.setText("");
        jTPrecioProdu.setText("");
        jTStockProdu.setText("");
        jrbMostrarLista.setSelected(false);
        cargarCombo();
    }

    private void llenarTabla(Producto p) {

        jtNueva.addRow(new Object[]{
            p.getIdProd(),
            p.getNombreProd(),
            p.getPrecio(),
            p.getStock(),
            p.getRubro(),
            p.isEstado()

        });
    }

}
