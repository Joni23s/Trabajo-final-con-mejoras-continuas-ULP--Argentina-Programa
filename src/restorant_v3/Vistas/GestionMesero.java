package restorant_v3.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import restorant_v3.AccesoDatos.MeseroData;
import restorant_v3.Entidades.Mesero;

/**
 *
 * @author franc
 */
public class GestionMesero extends javax.swing.JInternalFrame {

    MeseroData meseroData = new MeseroData();

    public GestionMesero() {
        initComponents();
        cargarComboMesero();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbMeseros = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNombreMesero = new javax.swing.JTextField();
        jrbActivo = new javax.swing.JRadioButton();
        jrbInactivo = new javax.swing.JRadioButton();
        jbActualizar = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jbNuevoMesero = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setText("Modificar Mesero");

        jcbMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeserosActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar mesero:");

        jLabel3.setText("ID:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jrbActivo.setText("Activo");
        jrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivoActionPerformed(evt);
            }
        });

        jrbInactivo.setText("Inactivo");
        jrbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivoActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbNuevoMesero.setText("Nuevo Mesero");
        jbNuevoMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoMeseroActionPerformed(evt);
            }
        });

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcbMeseros, 0, 173, Short.MAX_VALUE)
                        .addComponent(jtfNombreMesero)
                        .addComponent(jlId))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbNuevoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jrbActivo)
                            .addGap(18, 18, 18)
                            .addComponent(jrbInactivo))))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlId))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombreMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbActivo)
                        .addComponent(jrbInactivo)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevoMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbNuevoMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoMeseroActionPerformed
        if (rootPaneCheckingEnabled) {

        }
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del nuevo Mesero");
        Mesero meseroNuevo = new Mesero(nombre, true);
        meseroData.agregarMesero(meseroNuevo);

        jcbMeseros.addItem(meseroNuevo);
    }//GEN-LAST:event_jbNuevoMeseroActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed

        if (jtfNombreMesero.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Ingrese valores validos");

        }else {
            Mesero mesero = (Mesero) jcbMeseros.getSelectedItem();

            mesero.setIdMesero(mesero.getIdMesero());
            mesero.setNombre(jtfNombreMesero.getText());
            mesero.setEstado(jrbActivo.isSelected());

            meseroData.modificarMesero(mesero);
        }

    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jrbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivoActionPerformed

        if (jrbInactivo.isSelected()) {
            jrbActivo.setSelected(false);
        }
    }//GEN-LAST:event_jrbInactivoActionPerformed

    private void jrbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivoActionPerformed

        if (jrbActivo.isSelected()) {
            jrbInactivo.setSelected(false);
        }
    }//GEN-LAST:event_jrbActivoActionPerformed

    private void jcbMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeserosActionPerformed

        Mesero mesero = (Mesero) jcbMeseros.getSelectedItem();

        jlId.setText(mesero.getIdMesero() + "");
        jtfNombreMesero.setText(mesero.getNombre());
        if (mesero.isEstado()) {
            jrbActivo.setSelected(true);
            jrbInactivo.setSelected(false);
        } else {
            jrbActivo.setSelected(false);
            jrbInactivo.setSelected(true);
        }

    }//GEN-LAST:event_jcbMeserosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbNuevoMesero;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Mesero> jcbMeseros;
    private javax.swing.JLabel jlId;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JTextField jtfNombreMesero;
    // End of variables declaration//GEN-END:variables
        
    public void cargarComboMesero() {

        List<Mesero> listaMesero = meseroData.listarTodosMeseros();

        for (Mesero mesero : listaMesero) {
            jcbMeseros.addItem(mesero);
        }
    }

}
