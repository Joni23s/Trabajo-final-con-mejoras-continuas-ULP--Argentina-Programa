package restorant_v3.Vistas;

import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restorant_v3.AccesoDatos.MesaData;
import restorant_v3.AccesoDatos.MeseroData;
import restorant_v3.AccesoDatos.PedidoData;
import restorant_v3.Entidades.Mesa;
import restorant_v3.Entidades.Mesero;
import restorant_v3.Entidades.Pedido;

/**
 *
 * @author Jonathan Araujo
 */
public class GestionPedido extends javax.swing.JInternalFrame {

    MesaData mesaData = new MesaData();
    MeseroData meseroData = new MeseroData();
    PedidoData pedidoData = new PedidoData();

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    private final JDesktopPane escritorio;

    public GestionPedido(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        initComponents();
        armarCabecera();
        cargarComboMesa();
        cargarComboMesero();

        jcbMesa.setEnabled(false);

        jcbMesero.setEnabled(false);

        jdcFecha.setEnabled(false);

        jrbCobrado.setEnabled(false);
        jrbNoCobrado.setEnabled(false);

    }

    ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbNoCobrado = new javax.swing.JRadioButton();
        jrbCobrado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jcbMesero = new javax.swing.JComboBox<>();
        jcbMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jbNuevoPedido = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jrbTodosLosPedidos = new javax.swing.JRadioButton();
        jrbPorMesa = new javax.swing.JRadioButton();
        jrbPorMesero = new javax.swing.JRadioButton();
        jrbPorFecha = new javax.swing.JRadioButton();
        jrbPorEstado = new javax.swing.JRadioButton();
        jlImporteTotal = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("GESTION   PEDIDO");

        jLabel3.setText("Por Fecha");

        jrbNoCobrado.setText("No Cobrados");
        jrbNoCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCobradoActionPerformed(evt);
            }
        });

        jrbCobrado.setText("Cobrados");
        jrbCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradoActionPerformed(evt);
            }
        });

        jLabel6.setText("Por Estado");

        jcbMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeseroActionPerformed(evt);
            }
        });

        jcbMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesaActionPerformed(evt);
            }
        });

        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPedidos);

        jLabel9.setText("Por Mesa");

        jbNuevoPedido.setText("Nuevo Pedido");
        jbNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoPedidoActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar Pedido");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel4.setText("Por Mesero");

        jrbTodosLosPedidos.setText("Todos los pedidos");
        jrbTodosLosPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodosLosPedidosActionPerformed(evt);
            }
        });

        jrbPorMesa.setText("Por Mesa");
        jrbPorMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorMesaActionPerformed(evt);
            }
        });

        jrbPorMesero.setText("Por Mesero");
        jrbPorMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorMeseroActionPerformed(evt);
            }
        });

        jrbPorFecha.setText("Por Fecha");
        jrbPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorFechaActionPerformed(evt);
            }
        });

        jrbPorEstado.setText("Por Estado");
        jrbPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorEstadoActionPerformed(evt);
            }
        });

        jlImporteTotal.setText("Importe total: $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbMesero, javax.swing.GroupLayout.Alignment.LEADING, 0, 288, Short.MAX_VALUE)
                                    .addComponent(jcbMesa, javax.swing.GroupLayout.Alignment.LEADING, 0, 288, Short.MAX_VALUE)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addComponent(jrbNoCobrado)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbPorFecha)
                            .addComponent(jrbPorEstado)
                            .addComponent(jrbPorMesa)
                            .addComponent(jrbPorMesero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbTodosLosPedidos)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(291, 299, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbCobrado)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbNoCobrado)
                    .addComponent(jLabel6)
                    .addComponent(jrbCobrado)
                    .addComponent(jrbPorEstado))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbPorMesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbPorMesero)
                    .addComponent(jrbTodosLosPedidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbPorFecha)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlImporteTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbNoCobradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoCobradoActionPerformed
        jrbNoCobrado.setSelected(true);
        jrbCobrado.setSelected(false);
        jrbTodosLosPedidos.setSelected(false);

        List<Pedido> pedidosNoCobrados = pedidoData.listarPedidosPorCobro(false);
        limpiarTabla();
        cargarTabla(pedidosNoCobrados);


    }//GEN-LAST:event_jrbNoCobradoActionPerformed

    private void jrbCobradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCobradoActionPerformed
        jrbCobrado.setSelected(true);
        jrbNoCobrado.setSelected(false);
        jrbTodosLosPedidos.setSelected(false);

        List<Pedido> pedidosCobrados = pedidoData.listarPedidosPorCobro(true);
        limpiarTabla();
        cargarTabla(pedidosCobrados);


    }//GEN-LAST:event_jrbCobradoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        limpiarFiltros();
        
        jrbTodosLosPedidos.setSelected(true);

        List<Pedido> pedidosCobrados = pedidoData.listarPedidos();
        limpiarTabla();
        cargarTabla(pedidosCobrados);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoPedidoActionPerformed
        NuevoPedido np = new NuevoPedido(escritorio);
        escritorio.add(np);
        np.setVisible(true);
    }//GEN-LAST:event_jbNuevoPedidoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        ModificadorDpedido mdp = new ModificadorDpedido(escritorio);
        escritorio.add(mdp);

        int filaSeleccionada = jtPedidos.getSelectedRow();

        if (filaSeleccionada != -1) {

            int nPediSelec = (int) modelo.getValueAt(filaSeleccionada, 0);

            Pedido nPedi = pedidoData.buscarPedidoPorId(nPediSelec);
            mdp.recibeDato(nPedi);

            mdp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un pedido a editar.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jrbTodosLosPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTodosLosPedidosActionPerformed
        // TODO add your handling code here:

        limpiarFiltros();
        jrbTodosLosPedidos.setSelected(true);

        List<Pedido> pedidosCobrados = pedidoData.listarPedidos();
        limpiarTabla();
        cargarTabla(pedidosCobrados);

    }//GEN-LAST:event_jrbTodosLosPedidosActionPerformed

    private void jcbMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeseroActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        cargarTabla(administrarFiltros());
    }//GEN-LAST:event_jcbMeseroActionPerformed

    private void jcbMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesaActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        cargarTabla(administrarFiltros());
    }//GEN-LAST:event_jcbMesaActionPerformed

    private void jdcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaPropertyChange
        // TODO add your handling code here:
        limpiarTabla();
        cargarTabla(administrarFiltros());
    }//GEN-LAST:event_jdcFechaPropertyChange

    private void jrbPorMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPorMesaActionPerformed
        // TODO add your handling code here:

        limpiarFiltros();

        jrbPorMesa.setSelected(true);
        jcbMesa.setEnabled(true);

        limpiarTabla();
        cargarTabla(administrarFiltros());

    }//GEN-LAST:event_jrbPorMesaActionPerformed

    private void jrbPorMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPorMeseroActionPerformed
        // TODO add your handling code here:
        limpiarFiltros();

        jrbPorMesero.setSelected(true);
        jcbMesero.setEnabled(true);

        limpiarTabla();
        cargarTabla(administrarFiltros());

    }//GEN-LAST:event_jrbPorMeseroActionPerformed

    private void jrbPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPorFechaActionPerformed
        // TODO add your handling code here:
//        if (jrbPorFecha.isSelected()) {
//            jrbPorEstado.setSelected(false);
//            jrbPorFecha.setSelected(true);
//            jrbPorMesa.setSelected(false);
//            jrbPorMesero.setSelected(false);
//            jdcFecha.setEnabled(true);
//        }

        limpiarFiltros();
        jrbPorFecha.setSelected(true);
        jdcFecha.setEnabled(true);

        limpiarTabla();
        cargarTabla(administrarFiltros());

    }//GEN-LAST:event_jrbPorFechaActionPerformed

    private void jrbPorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPorEstadoActionPerformed
        // TODO add your handling code here:
        limpiarFiltros();
        jrbPorEstado.setSelected(true);
        jrbCobrado.setEnabled(true);
        jrbNoCobrado.setEnabled(true);
        jrbCobrado.setSelected(true);

        List<Pedido> pedidosCobrados = pedidoData.listarPedidosPorCobro(true);
        limpiarTabla();
        cargarTabla(pedidosCobrados);

    }//GEN-LAST:event_jrbPorEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevoPedido;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Mesa> jcbMesa;
    private javax.swing.JComboBox<Mesero> jcbMesero;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlImporteTotal;
    private javax.swing.JRadioButton jrbCobrado;
    private javax.swing.JRadioButton jrbNoCobrado;
    private javax.swing.JRadioButton jrbPorEstado;
    private javax.swing.JRadioButton jrbPorFecha;
    private javax.swing.JRadioButton jrbPorMesa;
    private javax.swing.JRadioButton jrbPorMesero;
    private javax.swing.JRadioButton jrbTodosLosPedidos;
    private javax.swing.JTable jtPedidos;
    // End of variables declaration//GEN-END:variables

    public void cargarComboMesa() {

        List<Mesa> listaMesas = mesaData.mostrarMesas();

        for (Mesa m : listaMesas) {
            jcbMesa.addItem(m);
        }
    }

    public void cargarComboMesero() {
        List<Mesero> listaMesero = meseroData.listarMeserosActivos();

        for (Mesero mesero : listaMesero) {
            jcbMesero.addItem(mesero);
        }
    }

    public void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("Fecha-Hora");
        modelo.addColumn("Importe");
        modelo.addColumn("Cobrada");
        jtPedidos.setModel(modelo);
    }

    public void cargarTabla(List<Pedido> listaPedidos) {
        if (listaPedidos != null) {
            int acumulador = 0;
            for (Pedido p : listaPedidos) {
                String estado = p.isCobrada() ? "Cobrado" : "No cobrado";
                modelo.addRow(new Object[]{
                    p.getIdPedido(),
                    p.getMesa().getNumero(),
                    p.getMesero().getNombre(),
                    p.getFechaHora(),
                    p.getImporte(),
                    estado,});
                acumulador += p.getImporte();
            }
            jlImporteTotal.setText("Importe total: $" + acumulador);
        }

    }

    public void limpiarTabla() {
        modelo.setRowCount(0);
    }

    public void limpiarFiltros() {
        jrbCobrado.setSelected(false);
        jrbCobrado.setEnabled(false);
        jrbNoCobrado.setSelected(false);
        jrbNoCobrado.setEnabled(false);
        jrbPorEstado.setSelected(false);
        jrbPorMesa.setSelected(false);
        jcbMesa.setEnabled(false);
        jrbPorMesero.setSelected(false);
        jcbMesero.setEnabled(false);
        jrbPorFecha.setSelected(false);
        jdcFecha.setEnabled(false);
        jrbTodosLosPedidos.setSelected(false);
    }

    public List<Pedido> administrarFiltros() {
        boolean checkMesas = jrbPorMesa.isSelected();
        boolean checkMeseros = jrbPorMesero.isSelected();
        boolean checkFecha = jrbPorFecha.isSelected();
        List<Pedido> listaVacia = null;

        if (checkMesas) {
            Mesa mesa = (Mesa) jcbMesa.getSelectedItem();

            return pedidoData.listarPedidosPorIdMesa(mesa.getIdMesa());
        } else if (checkMeseros) {

            Mesero mesero = (Mesero) jcbMesero.getSelectedItem();
            return pedidoData.listarPedidosPorIdMesero(mesero.getIdMesero());
        } else if (checkFecha) {
            String fecha;
            if (jdcFecha.getDate() != null) {
                String[] fechaString;
                fechaString = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toString().split("T");
                fecha = fechaString[0];
            } else {
                fecha = "";
            }
            return pedidoData.listarPedidoPorFecha(fecha);
        } else {
            return listaVacia;
        }
    }
}
