/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.MenuData;
import Entidades.MenuPension;
import javax.swing.JOptionPane;


/**
 *
 * @author I36100
 */
public class vistaMenuPension extends javax.swing.JInternalFrame {
public static MenuPension menuSeleccionado;
MenuData menuData = new MenuData();
    /**
     * Creates new form seleccionarMenu
     */
    public vistaMenuPension() {
        initComponents();
        cargarComboBox();
       tfCosto.setEditable(false);
       jbSiguiente.setEnabled(false);
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
        jbSiguiente = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        tfCosto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbtipoMenu = new javax.swing.JComboBox<>();
        jlSeleccionar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(39, 134, 188));
        setClosable(true);
        setTitle("Paquete Turístico");
        setPreferredSize(new java.awt.Dimension(667, 488));

        jPanel1.setBackground(new java.awt.Color(39, 134, 188));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jbSiguiente.setBackground(new java.awt.Color(51, 255, 153));
        jbSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        jbSiguiente.setText("SIGUIENTE");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jbAgregar.setBackground(new java.awt.Color(51, 255, 153));
        jbAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbAgregar.setText("AGREGAR AL PAQUETE");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        tfCosto.setBackground(new java.awt.Color(255, 255, 255));
        tfCosto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfCosto.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PRECIO     $");

        jcbtipoMenu.setBackground(new java.awt.Color(255, 255, 255));
        jcbtipoMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcbtipoMenu.setForeground(new java.awt.Color(0, 0, 0));
        jcbtipoMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbtipoMenuItemStateChanged(evt);
            }
        });
        jcbtipoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbtipoMenuActionPerformed(evt);
            }
        });

        jlSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        jlSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuicon.png"))); // NOI18N
        jlSeleccionar.setText("SELECCIONE SU MENÚ");
        jlSeleccionar.setIconTextGap(10);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("PENSIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98)
                        .addComponent(jlSeleccionar)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(101, 101, 101)
                                .addComponent(jcbtipoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)
                                .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlSeleccionar)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbtipoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbtipoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbtipoMenuActionPerformed
    actualizar();
    }//GEN-LAST:event_jcbtipoMenuActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
       vistaPasaje v = new vistaPasaje();
       v.setVisible(true);
       Menu.escritorio.add(v);
       this.dispose();
    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
       guardar();
       JOptionPane.showMessageDialog(this, "Datos agregados al paquete");
       jbSiguiente.setEnabled(true);
       jbAgregar.setEnabled(false);
       
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jcbtipoMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbtipoMenuItemStateChanged

        
    }//GEN-LAST:event_jcbtipoMenuItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JComboBox<MenuPension> jcbtipoMenu;
    private javax.swing.JLabel jlSeleccionar;
    private javax.swing.JTextField tfCosto;
    // End of variables declaration//GEN-END:variables

private void cargarComboBox(){
   for(MenuPension m : menuData.listarMenus()){
       jcbtipoMenu.addItem(m);
   }

    }

private void actualizar(){
   MenuPension menu = (MenuPension) jcbtipoMenu.getSelectedItem();
   tfCosto.setText(String.valueOf(menu.getPorcentaje()));
   
}

private void guardar(){
    menuSeleccionado = (MenuPension) jcbtipoMenu.getSelectedItem();
}
}

