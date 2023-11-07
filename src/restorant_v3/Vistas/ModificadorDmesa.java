package restorant_v3.Vistas;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import restorant_v3.AccesoDatos.MesaData;
import restorant_v3.Entidades.Mesa;
/**
 *
 * @author jonat
 */
public class ModificadorDmesa extends javax.swing.JInternalFrame {
    private Mesa mesasa;
    MesaData md = new MesaData();
    private final JDesktopPane e;
    
    public ModificadorDmesa(JDesktopPane e) {
        this.e = e;
        initComponents();
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCapacidad = new javax.swing.JTextField();
        jtNumero = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jrbServicio = new javax.swing.JRadioButton();
        jrbFuera = new javax.swing.JRadioButton();
        jltitle = new javax.swing.JLabel();

        jLabel1.setText("Capacidad");

        jLabel2.setText("Numero");

        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado");

        jrbServicio.setText("En servicio");
        jrbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbServicioActionPerformed(evt);
            }
        });

        jrbFuera.setText("Fuera de servicio");
        jrbFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFueraActionPerformed(evt);
            }
        });

        jltitle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jltitle.setText("Modificando Mesa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jltitle)
                            .addGap(60, 60, 60))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrbServicio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jrbFuera))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jbGuardar)
                                    .addGap(95, 95, 95)
                                    .addComponent(jbVolver)))
                            .addGap(16, 16, 16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbServicio)
                            .addComponent(jrbFuera))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar)
                            .addComponent(jbVolver))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroActionPerformed
        
    }//GEN-LAST:event_jtNumeroActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
             GestionMesa cm= new GestionMesa(e);
        
        int newNum = Integer.parseInt(jtNumero.getText());
        int newCapacidad = Integer.parseInt(jtCapacidad.getText());
        boolean estadoMesa = false;

        if (jrbFuera.isSelected()) {
            estadoMesa = false;
        } else if (jrbServicio.isSelected()) {
            estadoMesa = true;
        }
        int newId = mesasa.getIdMesa();

        Mesa m = new Mesa(newId, newNum, estadoMesa, newCapacidad);
        
        
        md.modificarMesa(m);
        cm.recibeDato(newNum);
        e.removeAll();
        e.repaint();
        
        cm.setVisible(true);
        e.add(cm);
        
        dispose();
        } catch ( NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Datos erróneos");
        }
       
        
    }//GEN-LAST:event_jbGuardarActionPerformed
  
    public void setDato(Mesa mesasa){
        this.mesasa = mesasa;
        jltitle.setText("Modificando Mesa Id: "+ mesasa.getIdMesa());

        jtNumero.setText(""+mesasa.getNumero());
        jtCapacidad.setText(""+mesasa.getCapacidad());
        if (mesasa.isEstadoM() == true) {
            jrbFuera.setSelected(false);
            jrbServicio.setSelected(true);
        }else{
            jrbFuera.setSelected(true);
            jrbServicio.setSelected(false);
        }
    }
    

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jrbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbServicioActionPerformed

        jrbFuera.setSelected(false);
        jrbServicio.setSelected(true);
    }//GEN-LAST:event_jrbServicioActionPerformed

    private void jrbFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFueraActionPerformed

        jrbFuera.setSelected(true);
        jrbServicio.setSelected(false);

    }//GEN-LAST:event_jrbFueraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jltitle;
    private javax.swing.JRadioButton jrbFuera;
    private javax.swing.JRadioButton jrbServicio;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtNumero;
    // End of variables declaration//GEN-END:variables
}
