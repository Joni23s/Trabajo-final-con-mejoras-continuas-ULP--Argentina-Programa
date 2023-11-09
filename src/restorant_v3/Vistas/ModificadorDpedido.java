package restorant_v3.Vistas;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import restorant_v3.AccesoDatos.MesaData;
import restorant_v3.AccesoDatos.MeseroData;
import restorant_v3.AccesoDatos.PedidoData;
import restorant_v3.Entidades.Mesa;
import restorant_v3.Entidades.Mesero;
import restorant_v3.Entidades.Pedido;

/**
 *
 * @author Nicolas Giunta
 */
public class ModificadorDpedido extends javax.swing.JInternalFrame {

    private Pedido pedido;
    private PedidoData pedidoData = new PedidoData();
    private MesaData mesaData = new MesaData();
    private MeseroData meseroData = new MeseroData();

    private final JDesktopPane escritorio;

    public ModificadorDpedido(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        initComponents();
        
        cargarComboMesero();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jrbCobradas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfMesa = new javax.swing.JTextField();
        jtfImporte = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jrbNoCobradas = new javax.swing.JRadioButton();
        jbVolver = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jcbMeseros = new javax.swing.JComboBox<>();
        jlIdPedido = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jlTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(214, 93, 10));
        jlTitulo.setText("MODIFICAR PEDIDO");

        jrbCobradas.setBackground(new java.awt.Color(0, 0, 0));
        jrbCobradas.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbCobradas.setForeground(new java.awt.Color(255, 255, 255));
        jrbCobradas.setText("Cobradas");
        jrbCobradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesa Nro");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mesero");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Importe");

        jbGuardar.setBackground(new java.awt.Color(214, 93, 10));
        jbGuardar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jrbNoCobradas.setBackground(new java.awt.Color(0, 0, 0));
        jrbNoCobradas.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbNoCobradas.setForeground(new java.awt.Color(255, 255, 255));
        jrbNoCobradas.setText("No Cobradas");
        jrbNoCobradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCobradasActionPerformed(evt);
            }
        });

        jbVolver.setBackground(new java.awt.Color(214, 93, 10));
        jbVolver.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(0, 0, 0));
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jcbMeseros.setBackground(new java.awt.Color(214, 93, 10));
        jcbMeseros.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jcbMeseros.setForeground(new java.awt.Color(0, 0, 0));

        jlIdPedido.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlIdPedido.setForeground(new java.awt.Color(214, 93, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jrbCobradas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbNoCobradas))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jcbMeseros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9)))
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfImporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCobradas)
                    .addComponent(jrbNoCobradas))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            int idPedido = Integer.parseInt(jlIdPedido.getText());

            String nombreMeseroNuevo = jcbMeseros.getSelectedItem().toString();

            Mesa mesaNueva = mesaData.mostrarMesaSegunNumero(Integer.parseInt(jtfMesa.getText()));

            Mesero meseroNuevo = meseroData.mostrarMeseroPorNombre(nombreMeseroNuevo);

            LocalDateTime fecha = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

            double importe = Double.parseDouble(jtfImporte.getText());

            boolean estado;

            if (jrbCobradas.isSelected()) {
                estado = true;
            } else {
                estado = false;
            }

            Pedido pedidoModificado = new Pedido(idPedido, mesaNueva, meseroNuevo, fecha, importe, estado);

            pedidoData.modificarPedido(pedidoModificado);

            this.dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos");
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    public void recibeDato(Pedido pedd) {
        this.pedido = pedd;

        jlTitulo.setText("Modificando Pedido nro: ");
        jlIdPedido.setText("" + pedd.getIdPedido());

        jtfMesa.setText("" + pedd.getMesa().getNumero());

        Mesero meseroSeleccionado = pedd.getMesero();
        jcbMeseros.setSelectedIndex(pedd.getMesero().getIdMesero() - 1);

        String fecha = pedd.getFechaHora().toString();

        String[] fechaCorta = fecha.split("T");
        String fechaString = fechaCorta[0];

        Date date = (Date) Date.valueOf(fechaString);
        jdcFecha.setDate(date);
        jtfImporte.setText("" + pedd.getImporte());

        if (pedd.isCobrada() == true) {
            jrbNoCobradas.setSelected(false);
            jrbCobradas.setSelected(true);
        } else {
            jrbNoCobradas.setSelected(true);
            jrbCobradas.setSelected(false);
        }
    }
    private void jrbCobradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCobradasActionPerformed
        jrbNoCobradas.setSelected(false);
        jrbCobradas.setSelected(true);

    }//GEN-LAST:event_jrbCobradasActionPerformed

    private void jrbNoCobradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoCobradasActionPerformed
        jrbNoCobradas.setSelected(true);
        jrbCobradas.setSelected(false);
    }//GEN-LAST:event_jrbNoCobradasActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbVolver;
    public javax.swing.JComboBox<Mesero> jcbMeseros;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlIdPedido;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbCobradas;
    private javax.swing.JRadioButton jrbNoCobradas;
    private javax.swing.JTextField jtfImporte;
    private javax.swing.JTextField jtfMesa;
    // End of variables declaration//GEN-END:variables



    public void cargarComboMesero() {

        List<Mesero> listaMesero = meseroData.listarMeserosActivos();

        for (Mesero mesero : listaMesero) {
            jcbMeseros.addItem(mesero);
        }
    }

}
