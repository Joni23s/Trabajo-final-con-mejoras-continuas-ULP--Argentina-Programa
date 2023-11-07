package restorant_v3.Vistas;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import restorant_v3.AccesoDatos.MesaData;
import restorant_v3.Entidades.Mesa;

/**
 *
 * @author Jonathan Araujo
 */
public class NuevaMesa extends javax.swing.JInternalFrame {

    private final JDesktopPane escritorio;
    MesaData md = new MesaData();

    public NuevaMesa(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTnumMesa = new javax.swing.JTextField();
        jTCapacidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrbFuera = new javax.swing.JRadioButton();
        jrbServicio = new javax.swing.JRadioButton();
        jbAgregar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();

        jLabel1.setText("Crear Mesa Nueva");

        jLabel2.setText("Numero de la mesa");

        jTnumMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnumMesaActionPerformed(evt);
            }
        });

        jLabel3.setText("Capacidad ");

        jLabel4.setText("Estado");

        jrbFuera.setText("Fuera de servicio");
        jrbFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFueraActionPerformed(evt);
            }
        });

        jrbServicio.setText("En servicio");
        jrbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbServicioActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTnumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jrbServicio))
                                    .addComponent(jbAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTCapacidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbVolver, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbFuera, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel4)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbFuera)
                    .addComponent(jrbServicio))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbVolver))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFueraActionPerformed

        jrbFuera.setSelected(true);
        jrbServicio.setSelected(false);


    }//GEN-LAST:event_jrbFueraActionPerformed

    private void jrbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbServicioActionPerformed

        jrbFuera.setSelected(false);
        jrbServicio.setSelected(true);
    }//GEN-LAST:event_jrbServicioActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            int numMesa = Integer.parseInt(jTnumMesa.getText());
            int capacidad = Integer.parseInt(jTCapacidad.getText());
            boolean estadoMesa = true ? jrbServicio.isSelected() : jrbFuera.isSelected();

            if (md.buscarNumMesa(numMesa)) {
                if (jrbFuera.isSelected() || jrbServicio.isSelected()) {
                    Mesa nm = new Mesa();
                    nm.setNumero(numMesa);
                    nm.setCapacidad(capacidad);
                    nm.setEstadoM(estadoMesa);
                    md.agregarMesa(nm);
                    JOptionPane.showMessageDialog(this, "Se agregó una mesa");

                    jTCapacidad.setText("");
                    jTnumMesa.setText("");
                    jrbFuera.setSelected(false);
                    jrbServicio.setSelected(false);

                    GestionMesa gm = new GestionMesa(escritorio);
                    gm.recibeDato(nm.getNumero());
                    escritorio.removeAll();
                    escritorio.repaint();
                    gm.setVisible(true);
                    escritorio.add(gm);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "La mesa debe contener un estado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Intente con otro número");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revise que la mesa contenga número, capacidad y estado");
        }


    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed

        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jTnumMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnumMesaActionPerformed
       
    }//GEN-LAST:event_jTnumMesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTCapacidad;
    private javax.swing.JTextField jTnumMesa;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JRadioButton jrbFuera;
    private javax.swing.JRadioButton jrbServicio;
    // End of variables declaration//GEN-END:variables
}
