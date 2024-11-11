
package Vistas;

import AccesoADatos.AlojamientoData;
import AccesoADatos.EstadiaData;
import Entidades.Alojamiento;
import Entidades.Destino;
import Entidades.Estadia;
import static Vistas.vistaDestino.destinoSeleccionado;
import static Vistas.vistaDestino.fechFin;
import static Vistas.vistaDestino.fechInicio;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Lourdes
 */
public class vistaEstadia extends javax.swing.JInternalFrame {
public static  Alojamiento alojamientoSeleccionado ;
public static Estadia estadiaSeleccionada;
 private final AlojamientoData alData = new AlojamientoData();
 private final EstadiaData estData = new EstadiaData();

 
    /**
     * Creates new form vistaEstadia
     */
    public vistaEstadia() {
        initComponents();
        cargarComboBoxCapacidad();
        jbSiguiente.setEnabled(false);
        bloquearCampos(contenedor);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlojamiento = new javax.swing.JComboBox<>();
        tfDireccion = new javax.swing.JTextField();
        tfCapacidad = new javax.swing.JTextField();
        tfAmbientes = new javax.swing.JTextField();
        tfCantidadCamas = new javax.swing.JTextField();
        tfCantidadBanios = new javax.swing.JTextField();
        tfPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CheckIn = new com.toedter.calendar.JDateChooser();
        CheckOut = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jcbCapacidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbSiguiente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setTitle("Paquete Turístico");
        setPreferredSize(new java.awt.Dimension(800, 600));

        contenedor.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione un alojamiento : ");

        jcbAlojamiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcbAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlojamientoActionPerformed(evt);
            }
        });

        tfDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCapacidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfAmbientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCantidadCamas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCantidadBanios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Capacidad:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Número de ambientes:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cantidad de camas:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Cantidad de baños:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Precio por noche:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Check In: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Check Out:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Indique la capacidad de alojamiento deseada:");

        jcbCapacidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcbCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCapacidadActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hospedaje6.jpg"))); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(25, 25, 25))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(CheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfDireccion)
                        .addComponent(tfCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addComponent(tfAmbientes, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfCantidadCamas, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfCantidadBanios)
                        .addComponent(tfPrecio))
                    .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(tfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCantidadCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCantidadBanios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(CheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jbAgregar.setBackground(new java.awt.Color(255, 255, 153));
        jbAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAgregar.setText("AGREGAR AL PAQUETE");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbSiguiente.setBackground(new java.awt.Color(255, 102, 51));
        jbSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSiguiente.setText("SIGUIENTE");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("SELECCIONE SU ESTADIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        Date fechaCheckIn =  CheckIn.getDate();
        Date fechaCheckOut = CheckOut.getDate();
        
        
        if(validarCamposVacios(contenedor) ){
            JOptionPane.showMessageDialog(this,"Todos los campos deben estar llenos.");
            return;
        }else if(fechInicio.after(fechaCheckIn) || fechFin.before(fechaCheckOut)){
             JOptionPane.showMessageDialog(this,"Ingrese una fecha valida.");
            return;
  
}           else{
                   jbSiguiente.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Datos agregados al paquete.");
            
            alojamientoSeleccionado = (Alojamiento) jcbAlojamiento.getSelectedItem();
            
            
            double precioporNoche = alojamientoSeleccionado.getPrecioPorNoche();
            
           LocalDate inicio = fechaCheckIn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           LocalDate fin = fechaCheckOut.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           long diasEntre = ChronoUnit.DAYS.between(inicio, fin);
            
            double Total = precioporNoche * diasEntre;
            
            estadiaSeleccionada = new Estadia(alojamientoSeleccionado,fechaCheckIn, fechaCheckOut, Total); 
            estData.guardarEstadia(estadiaSeleccionada);
            jbAgregar.setEnabled(false);
          }
        
        
        
        //validar si check in y check out están dentro de los parametros de fecha inicio, fecha fin
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jcbCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCapacidadActionPerformed
       cargarComboBoxAlojamiento();
      
    
    }//GEN-LAST:event_jcbCapacidadActionPerformed

    private void jcbAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlojamientoActionPerformed
      try{
        Alojamiento aloj = (Alojamiento) jcbAlojamiento.getSelectedItem();
       tfDireccion.setText(aloj.getDireccion());
        tfCapacidad.setText(String.valueOf(aloj.getCapacidad())); 
        tfAmbientes.setText(String.valueOf(aloj.getNroAmbientes())); 
        tfCantidadCamas.setText(String.valueOf(aloj.getCamas())); 
        tfCantidadBanios.setText(String.valueOf(aloj.getBanios())); 
        tfPrecio.setText(String.valueOf(aloj.getPrecioPorNoche())); 
      }catch(NullPointerException ex){
          limpiarCampos(contenedor);
      }
    }//GEN-LAST:event_jcbAlojamientoActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        seleccionarMenu v = new seleccionarMenu();
        v.setVisible(true);
       Menu.escritorio.add(v);
       this.dispose();
    }//GEN-LAST:event_jbSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CheckIn;
    private com.toedter.calendar.JDateChooser CheckOut;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JComboBox<Alojamiento> jcbAlojamiento;
    private javax.swing.JComboBox<Integer> jcbCapacidad;
    private javax.swing.JTextField tfAmbientes;
    private javax.swing.JTextField tfCantidadBanios;
    private javax.swing.JTextField tfCantidadCamas;
    private javax.swing.JTextField tfCapacidad;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables

private void cargarComboBoxCapacidad(){
    
    for(int i = 1; i <=  10 ; i++){
    jcbCapacidad.addItem(i);
}
}

private void cargarComboBoxAlojamiento(){
   jcbAlojamiento.removeAllItems();
   int capacidad = (int) jcbCapacidad.getSelectedItem();
   
   List<Alojamiento> lista = alData.buscarAlojamientoCapacidad(capacidad,destinoSeleccionado.getIdDestino());
   
   if(lista.isEmpty()){
       JOptionPane.showMessageDialog(this, "No hay alojamientos disponibles.");
   }else{
   for(Alojamiento alo : lista){ //el 1 se intercambia por getDestino.
       jcbAlojamiento.addItem(alo);
   } 
   
   }
  
}

 private void limpiarCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                t.setText("");
            }
        }
    }
 
 private void bloquearCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                t.setEditable(false);
            }
        }
    }
 
  private boolean validarCamposVacios(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                if (t.getText().trim().isEmpty()) {
                    return true; //devuelve true si hay algun campo vacio
                }
               
            }
            if(c instanceof JDateChooser){
                    JDateChooser d = (JDateChooser) c;
                    if(d.getDate() == null){
                        return true;
                    }
                }

        }
        return false; //devuelve false todos los campos estan llenos
    }
  
 
}
