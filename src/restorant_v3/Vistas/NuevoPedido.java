package restorant_v3.Vistas;

import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restorant_v3.AccesoDatos.MesaData;
import restorant_v3.AccesoDatos.MeseroData;
import restorant_v3.AccesoDatos.PedProdData;
import restorant_v3.AccesoDatos.PedidoData;
import restorant_v3.AccesoDatos.ProductoData;
import restorant_v3.Entidades.Mesa;
import restorant_v3.Entidades.Mesero;
import restorant_v3.Entidades.PedProd;
import restorant_v3.Entidades.Pedido;
import restorant_v3.Entidades.Producto;


/**
 *
 * @author Jonathan Araujo
 */
public class NuevoPedido extends javax.swing.JInternalFrame {

    MesaData md = new MesaData();
    ProductoData productoData = new ProductoData();
    MeseroData meseroData = new MeseroData();
    PedidoData pedidoData = new PedidoData();
    PedProdData pedProdData = new PedProdData();

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    private final JDesktopPane escritorio;

  
    public NuevoPedido(JDesktopPane escritorio) {
        this.escritorio=escritorio;
        initComponents();
        cargarComboMesa();
        cargarComboProducto();
        cargarComboMesero();
        armarCabecera();

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbMesas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jlPrecioUnitario = new javax.swing.JLabel();
        jlPrecioTotal = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jcbMeseros = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jbGuardarPedido = new javax.swing.JButton();
        jbNuevoPedido = new javax.swing.JButton();
        jbEliminarProducto = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("GESTION PEDIDOS");

        jLabel2.setText("Mesa");

        jLabel3.setText("Mesero");

        jLabel4.setText("Producto");

        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione items");

        jlPrecioUnitario.setText("Precio Unitario: $");

        jlPrecioTotal.setText("Precio Total: $ 0");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtProductos);

        jLabel11.setText("Cantidad");

        jsCantidad.setValue(1);

        jbGuardarPedido.setText("Guardar Pedido");
        jbGuardarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarPedidoActionPerformed(evt);
            }
        });

        jbNuevoPedido.setText("Nuevo Pedido");
        jbNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoPedidoActionPerformed(evt);
            }
        });

        jbEliminarProducto.setText("Eliminar producto");
        jbEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarProductoActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(165, 165, 165))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcbMesas, 0, 180, Short.MAX_VALUE)
                                            .addComponent(jcbProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcbMeseros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jbAgregar)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jlPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jbEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        Producto productoSeleccionado = (Producto) jcbProductos.getSelectedItem();
        String nombre = productoSeleccionado.getNombreProd();
        double precio = productoSeleccionado.getPrecio();
        int stock = productoSeleccionado.getStock();
        
        int cantidad = (Integer) jsCantidad.getValue();
        if (cantidad > 0){
             for (int i = 0; i < cantidad; i++) {
            modelo.addRow(new Object[]{
                nombre,
                precio,
                stock,
                cantidad,});

        }
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad erronea");
        }
       

        jsCantidad.setValue(1);

        obtenerPrecioTotal();
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbGuardarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarPedidoActionPerformed
        
        Mesa mesaSeleccionada = (Mesa) jcbMesas.getSelectedItem();

        Mesero meseroSeleccionado = (Mesero) jcbMeseros.getSelectedItem();

        int filas = jtProductos.getRowCount();

        Pedido pedido = new Pedido(mesaSeleccionada, meseroSeleccionado, LocalDateTime.now(), obtenerPrecioTotal(), false);

        pedido.setImporte(obtenerPrecioTotal());

        pedidoData.agregarPedido(pedido);
        //for para tabla pedidoproducto
        for (int i = 0; i < filas; i++) {
            String nombre = jtProductos.getValueAt(i, 0).toString();
            Producto producto = productoData.buscarProduxnombre(nombre);
            PedProd pedidoProducto = new PedProd(pedido, producto, 1);
            pedProdData.guardarPedidoProducto(pedidoProducto);
        }

        limpiarTodo();

    }//GEN-LAST:event_jbGuardarPedidoActionPerformed

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed
        
        Producto productoSeleccionado = (Producto) jcbProductos.getSelectedItem();

        double precioUnitario = productoSeleccionado.getPrecio();
        jlPrecioUnitario.setText("Precio Unitario: $" + precioUnitario);
    }//GEN-LAST:event_jcbProductosActionPerformed

    private void jbNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoPedidoActionPerformed
        
        limpiarTodo();
        jlPrecioTotal.setText("Precio Total: $ 0");
    }//GEN-LAST:event_jbNuevoPedidoActionPerformed

    private void jbEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarProductoActionPerformed
       
        int filaSeleccionada = jtProductos.getSelectedRow();

        if (filaSeleccionada != -1) {
            modelo.removeRow(filaSeleccionada);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla.");
        }

        obtenerPrecioTotal();
    }//GEN-LAST:event_jbEliminarProductoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
                this.dispose();
        escritorio.removeAll();
        escritorio.repaint();
        GestionPedido gp = new GestionPedido(escritorio);
        gp.setVisible(true);
        escritorio.add(gp);
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminarProducto;
    private javax.swing.JButton jbGuardarPedido;
    private javax.swing.JButton jbNuevoPedido;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Mesa> jcbMesas;
    private javax.swing.JComboBox<Mesero> jcbMeseros;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JLabel jlPrecioTotal;
    private javax.swing.JLabel jlPrecioUnitario;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables

    public void cargarComboMesa() {

        List<Mesa> listaMesas = md.mostrarMesas();

        for (Mesa m : listaMesas) {
            jcbMesas.addItem(m);
        }
    }

    public void cargarComboProducto() {
        List<Producto> listaProductos = productoData.ListaProducto();

        for (Producto p : listaProductos) {
            jcbProductos.addItem(p);
        }
    }

    public void cargarComboMesero() {
        List<Mesero> listaMesero = meseroData.listarMeserosActivos();

        for (Mesero mesero : listaMesero) {
            jcbMeseros.addItem(mesero);
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtProductos.setModel(modelo);
    }

    private void limpiarTodo() {
        int filas = (jtProductos.getRowCount()) - 1;

        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }

    private double obtenerPrecioTotal() {
        int filas = (jtProductos.getRowCount()) - 1;
        double precioTotal = 0;

        for (int i = filas; i >= 0; i--) {

            double precio = (Double) modelo.getValueAt(i, 1);
           
            precioTotal += precio;
        }
        jlPrecioTotal.setText("Precio Total: $" + precioTotal);
        return precioTotal;
    }
}
