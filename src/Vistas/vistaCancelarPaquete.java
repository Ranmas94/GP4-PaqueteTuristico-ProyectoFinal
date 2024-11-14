/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author fedeg
 */
import AccesoADatos.PaqueteData;
import Entidades.PaqueteDetalle;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;

public class vistaCancelarPaquete extends javax.swing.JInternalFrame {
private final PaqueteData paqueteData = new PaqueteData();
private boolean modificable = false;
    /**
     * Creates new form vistaCancelarPaquete
     */
    public vistaCancelarPaquete() {
        initComponents();
         jbModificar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jbVerificar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrativo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jLabel1.setText("INGRESE UN ID PARA COMENZAR A BUSCAR UN PAQUETE");
        jLabel1.setIconTextGap(20);

        tfID.setBackground(new java.awt.Color(255, 255, 255));
        tfID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfID.setForeground(new java.awt.Color(0, 0, 0));
        tfID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfIDKeyReleased(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Origen", "Destino", "Fecha de inicio", "Fecha Fin", "Nombre Alojamiento", "Direccion Alojamiento", "Menu", "Transporte", "Pasajeros", "Medio de pago", "Precio Total", "Pagado"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jbVerificar.setBackground(new java.awt.Color(220, 220, 220));
        jbVerificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbVerificar.setForeground(new java.awt.Color(0, 0, 0));
        jbVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificar.png"))); // NOI18N
        jbVerificar.setText("Verificar");
        jbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(220, 220, 220));
        jbModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar(1).png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(220, 220, 220));
        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jbVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
          int filaSeleccionada = tabla.getSelectedRow();
    if (filaSeleccionada >= 0) {
        // Obtener la fecha como objeto Date
        Object fechaObj = tabla.getValueAt(filaSeleccionada, 2); // Columna 2 es la fecha de inicio
        String fechaInicio = null;

        // Verificar si el objeto es de tipo Date
        if (fechaObj instanceof java.util.Date) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            fechaInicio = formatoFecha.format((java.util.Date) fechaObj);
        }

        // Validar si la conversión fue exitosa
        if (fechaInicio != null && !verificarAnticipacionDeDias(fechaInicio)) {
            JOptionPane.showMessageDialog(this, "El inicio del viaje debe ser al menos 30 días después de hoy.");
            return;
        }

        // Modificar el paquete
        JOptionPane.showMessageDialog(this, "Paquete válido para modificar. Continúa con los cambios necesarios.");
        modificable = true;
        jbModificar.setEnabled(true);
        jbVerificar.setEnabled(false);
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un paquete para modificar.");
    }
    }//GEN-LAST:event_jbVerificarActionPerformed

    private void tfIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIDKeyReleased
        mostrarPaquetes();
    }//GEN-LAST:event_tfIDKeyReleased

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if(modificable){
            int id = Integer.parseInt(tfID.getText());
             paqueteData.cancelarPaquete(id);
             jbModificar.setEnabled(false);
             jbVerificar.setEnabled(true);
             tfID.setText("");
              DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
             modeloTabla.setRowCount(0);
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaCancelarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCancelarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCancelarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCancelarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCancelarPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVerificar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
  private boolean verificarAnticipacionDeDias(String fInicio) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaInicio = formatoFecha.parse(fInicio);
            Date fechaActual = new Date();

            long diferenciaEnMilis = fechaInicio.getTime() - fechaActual.getTime();
            long diasDiferencia = TimeUnit.DAYS.convert(diferenciaEnMilis, TimeUnit.MILLISECONDS);

            return diasDiferencia >= 30;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al verificar la fecha de inicio: " + e.getMessage());
            return false;
        }
    }
  
  private void mostrarPaquetes(){
      try{
      int id = Integer.parseInt(tfID.getText());
      DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
      modeloTabla.setRowCount(0);
     for(PaqueteDetalle p : paqueteData.obtenerDetallePaquetes(id)){
         modeloTabla.addRow(new Object[]{p.getCiudadOrigen(), p.getCiudaDestino(), p.getFechaInicio(), p.getFechaFin(), p.getNombreAlojamiento(), p.getDireccionAlojamiento(),
         p.getTipoMenu(),p.getTipoTransporte(),p.getCantidadPasajeros(),p.getMedioPago(),p.getPrecioTotal(),p.isPagado()});
     }
      }catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(this, "Debe ingresar un ID válido");
      }
      
      
  }
}
