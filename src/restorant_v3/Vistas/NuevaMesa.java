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

        jPanel1 = new javax.swing.JPanel();
        jbVolver = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jrbServicio = new javax.swing.JRadioButton();
        jrbFuera = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTCapacidad = new javax.swing.JTextField();
        jTnumMesa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jbVolver.setBackground(new java.awt.Color(214, 93, 10));
        jbVolver.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(0, 0, 0));
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jbAgregar.setBackground(new java.awt.Color(214, 93, 10));
        jbAgregar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbAgregar.setText("Guardar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jrbServicio.setBackground(new java.awt.Color(0, 0, 0));
        jrbServicio.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbServicio.setForeground(new java.awt.Color(255, 255, 255));
        jrbServicio.setText("En servicio");
        jrbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbServicioActionPerformed(evt);
            }
        });

        jrbFuera.setBackground(new java.awt.Color(0, 0, 0));
        jrbFuera.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbFuera.setForeground(new java.awt.Color(255, 255, 255));
        jrbFuera.setText("Fuera de servicio");
        jrbFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFueraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacidad ");

        jTnumMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnumMesaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 93, 10));
        jLabel1.setText("MESA NUEVA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addGap(151, 151, 151)
                        .addComponent(jbVolver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbServicio)
                        .addGap(18, 18, 18)
                        .addComponent(jrbFuera)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbFuera)
                    .addComponent(jrbServicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVolver))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTnumMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnumMesaActionPerformed
       
    }//GEN-LAST:event_jTnumMesaActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCapacidad;
    private javax.swing.JTextField jTnumMesa;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JRadioButton jrbFuera;
    private javax.swing.JRadioButton jrbServicio;
    // End of variables declaration//GEN-END:variables
}
