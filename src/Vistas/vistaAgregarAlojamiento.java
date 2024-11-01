/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlojamientoData;
import AccesoADatos.DestinoData;
import Entidades.Alojamiento;
import Entidades.Destino;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Lourdes
 */
public class vistaAgregarAlojamiento extends javax.swing.JInternalFrame {
AlojamientoData alojData = new AlojamientoData();
DestinoData destData = new DestinoData();
    /**
     * Creates new form vistaAgregarAlojamiento
     */
    public vistaAgregarAlojamiento() {
        initComponents();
        cargarComboBox();
        jbModificar.setEnabled(false);
        jbBaja.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbDestino = new javax.swing.JComboBox<>();
        tfNombre = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfCapacidad = new javax.swing.JTextField();
        jsAmbiente = new javax.swing.JSpinner();
        jsCamas = new javax.swing.JSpinner();
        jsBanios = new javax.swing.JSpinner();
        tfPrecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        checkVigente = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBaja.setText("Dar baja");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Destino: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Capacidad:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Cantidad de ambientes:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Cantidad de camas:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Cantidad de baños:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Precio por noche:");

        cbDestino.setSelectedIndex(-1);
        cbDestino.setToolTipText("");
        cbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDestinoItemStateChanged(evt);
            }
        });
        cbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDestinoActionPerformed(evt);
            }
        });

        jsAmbiente.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jsAmbiente.setName(""); // NOI18N

        jsCamas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jsBanios.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel10.setText("Vigente:");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfDireccion)
                                .addComponent(tfCapacidad)
                                .addComponent(tfPrecio)
                                .addComponent(jsBanios, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbDestino, javax.swing.GroupLayout.Alignment.TRAILING, 0, 221, Short.MAX_VALUE))
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jsAmbiente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addComponent(jsCamas, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkVigente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jsAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jsCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jsBanios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(checkVigente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Ingrese ID: ");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbModificar)
                        .addGap(51, 51, 51)
                        .addComponent(jbBaja)
                        .addGap(57, 57, 57)
                        .addComponent(jbAgregar)
                        .addGap(48, 48, 48)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbBuscar)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        mostrarDatos();
        jbModificar.setEnabled(true);
        jbBaja.setEnabled(true);
        jbAgregar.setEnabled(false);
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if(validarCamposVacios(contenedor)){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }else{
             modificarAlojamiento();
             limpiarCampos(contenedor);
             tfID.setText("");
             jbModificar.setEnabled(false);
             jbAgregar.setEnabled(true);
        jbBaja.setEnabled(false);
        }
       
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
       int id = Integer.parseInt(tfID.getText());
       alojData.darBajaAlojamiento(id);
       limpiarCampos(contenedor);
       tfID.setText("");
       jbModificar.setEnabled(false);
        jbBaja.setEnabled(false);
        jbAgregar.setEnabled(true);
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
         if(validarCamposVacios(contenedor)){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }else{
             guardar();
             limpiarCampos(contenedor);
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDestinoActionPerformed

    private void cbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDestinoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDestinoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Destino> cbDestino;
    private javax.swing.JCheckBox checkVigente;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JSpinner jsAmbiente;
    private javax.swing.JSpinner jsBanios;
    private javax.swing.JSpinner jsCamas;
    private javax.swing.JTextField tfCapacidad;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables

private void mostrarDatos(){
    try{
    int id = Integer.parseInt(tfID.getText());
    Alojamiento al = new Alojamiento();
    
    al = alojData.buscarAlojamientoID(id);
    cbDestino.setSelectedIndex(al.getIdDestino().getIdDestino() -1);
    tfNombre.setText(al.getNombre());
    tfDireccion.setText(al.getDireccion());
    tfCapacidad.setText(String.valueOf(al.getCapacidad()));
    jsAmbiente.setValue(al.getNroAmbientes());
    jsCamas.setValue(al.getCamas());
    jsBanios.setValue(al.getBanios());
    tfPrecio.setText(String.valueOf(al.getPrecioPorNoche()));
    checkVigente.setSelected(al.isVigente());
    }catch(NullPointerException ex){
        JOptionPane.showMessageDialog(this, "Ingrese un ID existente");
        limpiarCampos(contenedor);
    }catch(NumberFormatException ex){
       JOptionPane.showMessageDialog(this, "LLene el campo ID.");
   }
}

 private void limpiarCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                t.setText("");
            }
            
            if(c instanceof JCheckBox){
                JCheckBox t = (JCheckBox) c;
                t.setSelected(false);
            }
            
            if(c instanceof JComboBox){
                JComboBox t = (JComboBox) c;
                t.setSelectedIndex(-1);
                t.setSelectedItem(null);
            }
            
            if(c instanceof JSpinner ){
                JSpinner t = (JSpinner) c;
                t.setValue(1);
            } 
        }
    }
 
private boolean validarCamposVacios(JPanel jpanel) {
    for (Component c : jpanel.getComponents()) {
        if (c instanceof JTextField) {
            JTextField t = (JTextField) c;
            if (t.getText().trim().isEmpty()) {  // Verifica si el campo está vacío
                return true;
            }
        }
        
        if (c instanceof JComboBox) {
            JComboBox<?> combo = (JComboBox<?>) c;
            if (combo.getSelectedItem() == null || combo.getSelectedIndex() == -1) { // Verifica si no hay selección
                return true;
            }
        }
        
    }
    return false; // No hay campos vacíos
}
 
 private void bloquearCampos(JPanel jpanel) {
    for (Component c : jpanel.getComponents()) {
        if (c instanceof JTextField) {
            JTextField t = (JTextField) c;
            t.setEnabled(false); // Deshabilita el JTextField
        }
        
        if (c instanceof JComboBox) {
            JComboBox<?> combo = (JComboBox<?>) c;
            combo.setEnabled(false); // Deshabilita el JComboBox
        }
        
        if (c instanceof JCheckBox) {
            JCheckBox checkBox = (JCheckBox) c;
            checkBox.setEnabled(false); // Deshabilita el JCheckBox
        }
    }
}
 
 private void modificarAlojamiento(){
   try{
   
     Destino dest = (Destino) cbDestino.getSelectedItem();
     
    int id = Integer.parseInt(tfID.getText());
    String nombre = tfNombre.getText();
    String direccion = tfDireccion.getText();
    int capacidad = Integer.parseInt(tfCapacidad.getText());
    int ambientes = (int) jsAmbiente.getValue();
    int camas = (int) jsCamas.getValue();
    int banios = (int) jsBanios.getValue();
    double precio = Double.parseDouble(tfPrecio.getText());
    boolean vigente = checkVigente.isSelected();
      Alojamiento aloj = new Alojamiento(id,dest,nombre,direccion,capacidad,ambientes,camas,banios,precio,vigente);
      alojData.modificarAlojamiento(aloj);
   
   }catch(NumberFormatException ex){
       JOptionPane.showMessageDialog(this, "Ingrese un ID para buscar un alojamiento existente y modificarlo.");
   }
 }
 
 private void cargarComboBox(){
     for (Destino dest : destData.listarDestinos() ) {
         cbDestino.addItem(dest);
     }
     
     
 }
 
    private void guardar() {
        
            try{
            Destino dest = (Destino) cbDestino.getSelectedItem();
            String nombre = tfNombre.getText();
            String direccion = tfDireccion.getText();
            int capacidad = Integer.parseInt(tfCapacidad.getText());
            int ambientes = (int) jsAmbiente.getValue();
            int camas = (int) jsCamas.getValue();
            int banios = (int) jsBanios.getValue();
            double precio = Double.parseDouble(tfPrecio.getText());
            boolean vigente = checkVigente.isSelected();
            Alojamiento aloj = new Alojamiento(dest, nombre, direccion, capacidad, ambientes, camas, banios, precio, vigente);
            alojData.guardarAlojamiento(aloj);
        
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Ingrese datos válidos.");
            }
        
       
    }
}