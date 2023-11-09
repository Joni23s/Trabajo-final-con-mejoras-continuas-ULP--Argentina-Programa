package restorant_v3.Vistas;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
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

    DefaultTableModel jtNueva = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    
    public void setEstilo(){
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        Color colorFondo = new Color(214,93,10);      
        renderer.setBackground(colorFondo);
        renderer.setForeground(Color.BLACK);
        renderer.setFont(new Font("Montserrat", Font.BOLD,12));

              for (int i = 0; i < jtNueva.getColumnCount(); i++) {
             jtVieja.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    private final JDesktopPane escritorio;

    public GestionPedido(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        initComponents();
        armarCabecera();
        setEstilo();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbNoCobrado = new javax.swing.JRadioButton();
        jrbCobrado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jcbMesero = new javax.swing.JComboBox<>();
        jcbMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVieja = new javax.swing.JTable();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 93, 10));
        jLabel1.setText("GESTION  DE  PEDIDO");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por Fecha");

        jrbNoCobrado.setBackground(new java.awt.Color(0, 0, 0));
        jrbNoCobrado.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbNoCobrado.setForeground(new java.awt.Color(255, 255, 255));
        jrbNoCobrado.setText("No Cobrados");
        jrbNoCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCobradoActionPerformed(evt);
            }
        });

        jrbCobrado.setBackground(new java.awt.Color(0, 0, 0));
        jrbCobrado.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbCobrado.setForeground(new java.awt.Color(255, 255, 255));
        jrbCobrado.setText("Cobrados");
        jrbCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Por Estado");

        jcbMesero.setBackground(new java.awt.Color(214, 93, 10));
        jcbMesero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jcbMesero.setForeground(new java.awt.Color(0, 0, 0));
        jcbMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeseroActionPerformed(evt);
            }
        });

        jcbMesa.setBackground(new java.awt.Color(214, 93, 10));
        jcbMesa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jcbMesa.setForeground(new java.awt.Color(0, 0, 0));
        jcbMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesaActionPerformed(evt);
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
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtVieja);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Por Mesa");

        jbNuevoPedido.setBackground(new java.awt.Color(214, 93, 10));
        jbNuevoPedido.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbNuevoPedido.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevoPedido.setText("Nuevo Pedido");
        jbNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoPedidoActionPerformed(evt);
            }
        });

        jbLimpiar.setBackground(new java.awt.Color(214, 93, 10));
        jbLimpiar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(214, 93, 10));
        jbModificar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbModificar.setText("Modificar Pedido");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(214, 93, 10));
        jbSalir.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Por Mesero");

        jrbTodosLosPedidos.setBackground(new java.awt.Color(0, 0, 0));
        jrbTodosLosPedidos.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbTodosLosPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jrbTodosLosPedidos.setText("Todos los pedidos");
        jrbTodosLosPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodosLosPedidosActionPerformed(evt);
            }
        });

        jrbPorMesa.setBackground(new java.awt.Color(0, 0, 0));
        jrbPorMesa.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbPorMesa.setForeground(new java.awt.Color(255, 255, 255));
        jrbPorMesa.setText("Por Mesa");
        jrbPorMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorMesaActionPerformed(evt);
            }
        });

        jrbPorMesero.setBackground(new java.awt.Color(0, 0, 0));
        jrbPorMesero.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbPorMesero.setForeground(new java.awt.Color(255, 255, 255));
        jrbPorMesero.setText("Por Mesero");
        jrbPorMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorMeseroActionPerformed(evt);
            }
        });

        jrbPorFecha.setBackground(new java.awt.Color(0, 0, 0));
        jrbPorFecha.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbPorFecha.setForeground(new java.awt.Color(255, 255, 255));
        jrbPorFecha.setText("Por Fecha");
        jrbPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorFechaActionPerformed(evt);
            }
        });

        jrbPorEstado.setBackground(new java.awt.Color(0, 0, 0));
        jrbPorEstado.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbPorEstado.setForeground(new java.awt.Color(255, 255, 255));
        jrbPorEstado.setText("Por Estado");
        jrbPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPorEstadoActionPerformed(evt);
            }
        });

        jlImporteTotal.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jlImporteTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlImporteTotal.setText("Importe total: $");

        jdcFecha.setBackground(new java.awt.Color(214, 93, 10));
        jdcFecha.setForeground(new java.awt.Color(0, 0, 0));
        jdcFecha.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("**********************************");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filtros de Busqueda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jrbPorMesero)
                                    .addComponent(jrbPorMesa)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbPorFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbPorEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbTodosLosPedidos))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel5)))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(270, 270, 270)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(jlImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbNoCobrado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbCobrado)))
                                .addGap(314, 314, 314)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbNoCobrado)
                                .addComponent(jLabel6)
                                .addComponent(jrbCobrado))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbPorEstado)
                                .addComponent(jrbTodosLosPedidos)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbPorMesa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbPorMesero))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbPorFecha)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jbLimpiar))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(184, 184, 184)
                .addComponent(jlImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbNuevoPedido)
                        .addComponent(jbModificar))
                    .addComponent(jbSalir))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(263, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(111, 111, 111)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        int filaSeleccionada = jtVieja.getSelectedRow();

        if (filaSeleccionada != -1) {

            int nPediSelec = (int) jtNueva.getValueAt(filaSeleccionada, 0);

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTable jtVieja;
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
        jtNueva.addColumn("ID");
        jtNueva.addColumn("Mesa");
        jtNueva.addColumn("Mesero");
        jtNueva.addColumn("Fecha-Hora");
        jtNueva.addColumn("Importe");
        jtNueva.addColumn("Cobrada");
        jtVieja.setModel(jtNueva);
    }

    public void cargarTabla(List<Pedido> listaPedidos) {
        if (listaPedidos != null) {
            int acumulador = 0;
            for (Pedido p : listaPedidos) {
                String estado = p.isCobrada() ? "Cobrado" : "No cobrado";
                jtNueva.addRow(new Object[]{
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
        jtNueva.setRowCount(0);
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
