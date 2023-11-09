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

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 93, 10));
        jLabel1.setText("MODIFICAR MESERO");

        jcbMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeserosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccionar mesero:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");

        jrbActivo.setBackground(new java.awt.Color(0, 0, 0));
        jrbActivo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbActivo.setForeground(new java.awt.Color(255, 255, 255));
        jrbActivo.setText("Activo");
        jrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivoActionPerformed(evt);
            }
        });

        jrbInactivo.setBackground(new java.awt.Color(0, 0, 0));
        jrbInactivo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbInactivo.setForeground(new java.awt.Color(255, 255, 255));
        jrbInactivo.setText("Inactivo");
        jrbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivoActionPerformed(evt);
            }
        });

        jbActualizar.setBackground(new java.awt.Color(214, 93, 10));
        jbActualizar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jlId.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jlId.setForeground(new java.awt.Color(214, 93, 10));

        jbNuevoMesero.setBackground(new java.awt.Color(214, 93, 10));
        jbNuevoMesero.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbNuevoMesero.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevoMesero.setText("Nuevo Mesero");
        jbNuevoMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoMeseroActionPerformed(evt);
            }
        });

        jbVolver.setBackground(new java.awt.Color(214, 93, 10));
        jbVolver.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(0, 0, 0));
        jbVolver.setText("Salir");
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
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombreMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jbNuevoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jrbActivo)
                            .addGap(18, 18, 18)
                            .addComponent(jrbInactivo))))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombreMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivo)
                    .addComponent(jrbInactivo)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jbActualizar)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoMesero)
                    .addComponent(jbVolver))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
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
