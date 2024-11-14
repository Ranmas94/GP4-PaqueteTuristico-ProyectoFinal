
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

        setBackground(new java.awt.Color(39, 134, 188));
        setTitle("Paquete Turístico");
        setPreferredSize(new java.awt.Dimension(819, 664));

        contenedor.setBackground(new java.awt.Color(39, 134, 188));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un alojamiento  ");

        jcbAlojamiento.setBackground(new java.awt.Color(255, 255, 255));
        jcbAlojamiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcbAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlojamientoActionPerformed(evt);
            }
        });

        tfDireccion.setBackground(new java.awt.Color(255, 255, 255));
        tfDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCapacidad.setBackground(new java.awt.Color(255, 255, 255));
        tfCapacidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfAmbientes.setBackground(new java.awt.Color(255, 255, 255));
        tfAmbientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCantidadCamas.setBackground(new java.awt.Color(255, 255, 255));
        tfCantidadCamas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCantidadBanios.setBackground(new java.awt.Color(255, 255, 255));
        tfCantidadBanios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfPrecio.setBackground(new java.awt.Color(255, 255, 255));
        tfPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Capacidad:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Número de ambientes:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad de camas:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad de baños:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Precio por noche:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Check In: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Check Out:");

        CheckIn.setBackground(new java.awt.Color(255, 255, 255));
        CheckIn.setForeground(new java.awt.Color(0, 0, 0));

        CheckOut.setBackground(new java.awt.Color(255, 255, 255));
        CheckOut.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Indique la capacidad de alojamiento deseada");

        jcbCapacidad.setBackground(new java.awt.Color(255, 255, 255));
        jcbCapacidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcbCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCapacidadActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hotelverde(1).png"))); // NOI18N

        jbAgregar.setBackground(new java.awt.Color(51, 255, 153));
        jbAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbAgregar.setText("AGREGAR AL PAQUETE");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbSiguiente.setBackground(new java.awt.Color(51, 255, 153));
        jbSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        jbSiguiente.setText("SIGUIENTE");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hotelicon(1).png"))); // NOI18N
        jLabel3.setText("SELECCIONE SU ESTADIA");
        jLabel3.setIconTextGap(10);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAmbientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(tfCantidadCamas, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfCantidadBanios)
                                    .addComponent(tfCapacidad))
                                .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(contenedorLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel11))
                                        .addGap(330, 330, 330))
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorLayout.createSequentialGroup()
                                .addGap(534, 534, 534)
                                .addComponent(jcbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(157, 157, 157))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbCapacidad))
                .addGap(15, 15, 15)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(tfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCantidadCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfCantidadBanios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(CheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)))
                .addGap(34, 34, 34)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        guardar();
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jcbCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCapacidadActionPerformed
       cargarComboBoxAlojamiento();
    }//GEN-LAST:event_jcbCapacidadActionPerformed

    private void jcbAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlojamientoActionPerformed
     cargarAlojamiento();
    }//GEN-LAST:event_jcbAlojamientoActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        vistaMenuPension v = new vistaMenuPension();
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
  
 private void cargarAlojamiento(){
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
 }
 
 private void guardar(){
      Date fechaCheckIn =  CheckIn.getDate();
        Date fechaCheckOut = CheckOut.getDate();
  
     if (validarCamposVacios(contenedor)) {
         JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.");
         return;
     } else if (fechInicio.compareTo(fechaCheckIn) > 0 || fechFin.compareTo(fechaCheckOut) > 0 || fechFin.before(fechaCheckOut) || fechaCheckOut.before(fechaCheckIn)) {
         JOptionPane.showMessageDialog(this, "Ingrese una fecha válida.");
         return;

     } else {
         jbSiguiente.setEnabled(true);
         JOptionPane.showMessageDialog(this, "Datos agregados al paquete.");

            Alojamiento aloj = (Alojamiento) jcbAlojamiento.getSelectedItem();
            alojamientoSeleccionado = alData.buscarAlojamientoID(aloj.getIdAlojamiento());
            
            double precioporNoche = alojamientoSeleccionado.getPrecioPorNoche();
            
           LocalDate inicio = fechaCheckIn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           LocalDate fin = fechaCheckOut.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           long diasEntre = ChronoUnit.DAYS.between(inicio, fin);
            
            double Total = precioporNoche * diasEntre;
            
            estadiaSeleccionada = new Estadia(alojamientoSeleccionado,fechaCheckIn, fechaCheckOut, Total); 
         
            jbAgregar.setEnabled(false);
          }
 }
}
