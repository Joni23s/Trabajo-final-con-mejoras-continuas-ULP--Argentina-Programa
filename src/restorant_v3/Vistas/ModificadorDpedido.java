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

        jlTitulo.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(102, 153, 255));
        jlTitulo.setText("MODIFICAR PEDIDO");

        jrbCobradas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jrbCobradas.setText("Cobradas");
        jrbCobradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Mesa Nro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Mesero");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Importe");

        jbGuardar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jrbNoCobradas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jrbNoCobradas.setText("No Cobradas");
        jrbNoCobradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCobradasActionPerformed(evt);
            }
        });

        jbVolver.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jbVolver.setText("VOLVER");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jlIdPedido.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlIdPedido.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(jtfImporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                    .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jrbCobradas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jrbNoCobradas)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbCobradas)
                    .addComponent(jrbNoCobradas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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
