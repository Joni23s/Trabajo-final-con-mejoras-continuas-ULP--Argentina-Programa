package restorant_v3.Vistas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restorant_v3.AccesoDatos.MesaData;
import restorant_v3.Entidades.Mesa;

/**
 *
 * @author Jonathan Araujo
 */
public class GestionMesa extends javax.swing.JInternalFrame {

    private final JDesktopPane escritorio;
    MesaData md = new MesaData();
    DefaultTableModel jtablaNew = new DefaultTableModel() {
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

              for (int i = 0; i < jtablaNew.getColumnCount(); i++) {
             jtVieja.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }
    
    
    

    public GestionMesa(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        
        initComponents();
        armarCabecera();
         jtVieja.setModel(jtablaNew);
         setEstilo();
        cargarComboBox();
        //Los botones de buscar y de limpiar, inician no seleccionables, hasta que se den parametros para buscar o borrar
        jbBuscar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        //lo mismo para el boton de modificar
        jbModificar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbNuevaMesa = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVieja = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jcbCapacidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jrbFuera = new javax.swing.JRadioButton();
        jrbServicio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jbNuevaMesa.setBackground(new java.awt.Color(214, 93, 10));
        jbNuevaMesa.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbNuevaMesa.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevaMesa.setText("Nueva Mesa");
        jbNuevaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMesaActionPerformed(evt);
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

        jbModificar.setBackground(new java.awt.Color(214, 93, 10));
        jbModificar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbModificar.setText("Modificar Selección");
        jbModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jtVieja.setBackground(new java.awt.Color(214, 93, 10));
        jtVieja.setForeground(new java.awt.Color(255, 255, 255));
        jtVieja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Capacidad", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jtVieja);

        jbBuscar.setBackground(new java.awt.Color(214, 93, 10));
        jbBuscar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
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

        jcbCapacidad.setBackground(new java.awt.Color(214, 93, 10));
        jcbCapacidad.setForeground(new java.awt.Color(0, 0, 0));
        jcbCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCapacidadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por Capacidad");

        jrbFuera.setBackground(new java.awt.Color(0, 0, 0));
        jrbFuera.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jrbFuera.setForeground(new java.awt.Color(255, 255, 255));
        jrbFuera.setText("Fuera de servicio");
        jrbFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFueraActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Por Estado");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(214, 93, 10));
        jLabel3.setText("Administración de Mesas");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jbModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevaMesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbServicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbFuera))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68)
                                .addComponent(jcbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbServicio)
                    .addComponent(jrbFuera)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jbLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbModificar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaMesa)
                    .addComponent(jbVolver))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        //Dejamos visibles los botones de buscar y de limpiar
        jbBuscar.setEnabled(true);
        jbLimpiar.setEnabled(true);
    }//GEN-LAST:event_jrbFueraActionPerformed

    private void jrbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbServicioActionPerformed

        jrbFuera.setSelected(false);
        jrbServicio.setSelected(true);

        //Dejamos visibles los botones de buscar y de limpiar
        jbBuscar.setEnabled(true);
        jbLimpiar.setEnabled(true);
    }//GEN-LAST:event_jrbServicioActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jcbCapacidad.setSelectedIndex(0);
        //Borramos toda seleccion o escrito en los radiobutton y textfield
        jrbFuera.setSelected(false);
        jrbServicio.setSelected(false);

        //Dejamos no visibles los botones de buscar y de limpiar
        jbBuscar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbModificar.setEnabled(false);
        //Borramos las filas de la tabla
        jtablaNew.setRowCount(0);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        ModificadorDmesa mdm = new ModificadorDmesa(escritorio);
        escritorio.add(mdm);

        int fSelec = jtVieja.getSelectedRow();
        if (fSelec != -1) {
            int nMesaSelec = (int) jtablaNew.getValueAt(fSelec, 0);
        
            Mesa m = md.mostrarMesaSegunNumero(nMesaSelec);
            mdm.setDato(m);
            mdm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado una mesa");
        }


    }//GEN-LAST:event_jbModificarActionPerformed

    public void recibeDato(int n) {
        try {
            Mesa m = md.mostrarMesaSegunNumero(n);
            jcbCapacidad.setSelectedItem(m.getCapacidad());            

            jrbServicio.setSelected(m.isEstadoM()); //si el estado de mesa es true se selecciona este radiobuton, lo mismo con false como estado
            jrbFuera.setSelected(!m.isEstadoM()); //en este caso se niega el estado de mesa. Para obtener siempre el resultado diferente del radio buton anterior
            
            jbBuscar.doClick();
            
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Linea 289 GestionMEsa");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "NumberFormatException de recibedato");
        }

    }

    private void jbNuevaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMesaActionPerformed
        NuevaMesa nm = new NuevaMesa(escritorio);
        escritorio.add(nm);
        nm.setVisible(true);      

    }//GEN-LAST:event_jbNuevaMesaActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed

        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        jtablaNew.setRowCount(0); //Esto limpia la tabla

        jbModificar.setEnabled(true); //Pone visible al boton modificar

        boolean enServicio = jrbServicio.isSelected();
        boolean fueraServicio = jrbFuera.isSelected();
        int capacidad = (int) jcbCapacidad.getSelectedItem();

        if (capacidad > 0) {
            if (fueraServicio) {
                mesasxCapacidadEstado(capacidad, false);

            } else if (enServicio) {
                mesasxCapacidadEstado(capacidad, true);

            } else if (!fueraServicio && !enServicio) {

                md.mostrarMesasxCapacidad(capacidad).stream()
                        .forEach(m -> jtablaNew.addRow(new Object[]{
                    m.getNumero(),
                    m.getCapacidad(),
                    m.isEstadoM() ? "En Servicio" : "Fuera de Servicio"
                }));
            }

        } else {
            if (fueraServicio) {
                mesasxEstado(false);

            } else if (enServicio) {
                mesasxEstado(true);
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void mesasxCapacidadEstado(int cap, boolean est) {

        md.mostrarMesasxCapacidad(cap) //este metodo se comunica con la base de datos y llama a todas las mesas con x capacidad que pasmos por parametro
                .stream() //crea un flujo de datos
                .filter(m -> m.isEstadoM() == est) //filtra las mesas dejando solo las que cumplan con el estado pasado por parametro "est"
                .forEach(m -> jtablaNew.addRow(new Object[]{
            m.getNumero(),
            m.getCapacidad(),
            m.isEstadoM() ? "En Servicio" : "Fuera de Servicio" //si el estado de mesa es true la tabla se llenara con "En Servicio" de lo contrario se llenara con "Fuera de Servicio"
        }));

    }

    private void mesasxEstado(boolean est) {

        md.mostrarMesasxServicio(est).stream()
                .map(m -> new Object[]{
            m.getNumero(),
            m.getCapacidad(),
            est ? "En Servicio" : "Fuera de Servicio"}).forEach(jtablaNew::addRow);

    }

    private void jcbCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCapacidadActionPerformed
        jbBuscar.setEnabled(true);
        jbLimpiar.setEnabled(true);
    }//GEN-LAST:event_jcbCapacidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevaMesa;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Integer> jcbCapacidad;
    private javax.swing.JRadioButton jrbFuera;
    private javax.swing.JRadioButton jrbServicio;
    private javax.swing.JTable jtVieja;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        jtablaNew.addColumn("Numero");
        jtablaNew.addColumn("Capacidad");
        jtablaNew.addColumn("Estado");
        jtVieja.setModel(jtablaNew);
        
  
    }

    private void cargarComboBox() {

        jcbCapacidad.addItem(0); //añade un 0 al combo box para evitar que el usuario seleccione una capacidad al azar y pueda antes seleccionar buscar mesas por estado
        md.mostrarMesas().stream()
                .map(m -> m.getCapacidad()) //convierte las mesas a Integer de la capacidad de mesa
                .distinct() //elimina los resultados duplicados
                .sorted() //ordena los numeros de menor a mayor
                .forEach(jcbCapacidad::addItem); //llena el combo box de capacidad

    }

}
