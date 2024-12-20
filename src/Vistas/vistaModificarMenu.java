/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.MenuData;
import Entidades.MenuPension;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lourdes
 */
public class vistaModificarMenu extends javax.swing.JInternalFrame {
MenuData menuData = new MenuData();
    /**
     * Creates new form vistaModificarMenu
     */
    public vistaModificarMenu() {
        initComponents();
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
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        tfPorcentaje = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(66, 139, 212));

        contenedor.setBackground(new java.awt.Color(66, 139, 212));
        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha blanca.png"))); // NOI18N
        jLabel1.setText("INGRESE ID DEL MENU");

        tfID.setBackground(new java.awt.Color(255, 255, 255));
        tfID.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha blanca.png"))); // NOI18N
        jLabel2.setText("TIPO DE MENÚ:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha blanca.png"))); // NOI18N
        jLabel3.setText("PORCENTAJE:");

        tfTipo.setBackground(new java.awt.Color(255, 255, 255));
        tfTipo.setForeground(new java.awt.Color(0, 0, 0));

        tfPorcentaje.setBackground(new java.awt.Color(255, 255, 255));
        tfPorcentaje.setForeground(new java.awt.Color(0, 0, 0));

        jbBuscar.setBackground(new java.awt.Color(66, 139, 212));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa(1).png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(tfPorcentaje)
                        .addGap(77, 77, 77))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(tfTipo)
                        .addGap(77, 77, 77))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbBuscar)
                        .addGap(18, 18, 18)))
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTipo))
                .addGap(31, 31, 31)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jbActualizar.setBackground(new java.awt.Color(204, 204, 204));
        jbActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jbActualizar.setText("Actualizar porcentaje");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GESTIONAR MENÚ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jbActualizar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
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

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
      if(validarCamposVacios(contenedor)){
          JOptionPane.showMessageDialog(this, "Los campos deben estar llenos correctamente");
          limpiarCampos(contenedor);
          return;
      }
      try{
      tfID.setEnabled(true);
      tfTipo.setEnabled(true);
        int id = Integer.parseInt(tfID.getText());
        Double porcentaje = Double.valueOf(tfPorcentaje.getText());
        
        menuData.modificarMenuPorcentaje(porcentaje, id);
        limpiarCampos(contenedor);
      }catch(NumberFormatException ex){
       JOptionPane.showMessageDialog(this, "Ingrese datos válidos.");
         limpiarCampos(contenedor);
   }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try{
        tfID.setEnabled(false);
        tfTipo.setEnabled(false);
        int id = Integer.parseInt(tfID.getText());
        MenuPension menu = null;
        menu = menuData.buscarMenuPorId(id);
        if(menu == null){
            JOptionPane.showMessageDialog(this, "Menú inexistente");
            limpiarCampos(contenedor);
        }else{
            tfTipo.setText(menu.getTipo());
            tfPorcentaje.setText(String.valueOf(menu.getPorcentaje()));
        }
        }catch(NumberFormatException ex){
       JOptionPane.showMessageDialog(this, "Ingrese datos válidos.");
         limpiarCampos(contenedor);
         tfID.setEnabled(true);
        tfTipo.setEnabled(true);

   }
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfPorcentaje;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                t.setText("");
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
        }
        return false; //devuelve false todos los campos estan llenos
    }

}
