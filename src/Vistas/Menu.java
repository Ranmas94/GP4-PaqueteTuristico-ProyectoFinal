/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form MenuPension
     */
    public Menu() {
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

        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g) {
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jbMendoza = new javax.swing.JButton();
        jbGramado = new javax.swing.JButton();
        jbCamboriu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbCrearPaquete = new javax.swing.JButton();
        jbCataratas = new javax.swing.JButton();
        jbBariloche = new javax.swing.JButton();
        jbMardePlata = new javax.swing.JButton();
        jbPaisajesNorte = new javax.swing.JButton();
        jbBuenosAires = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAlojamiento = new javax.swing.JMenuItem();
        itemDestino = new javax.swing.JMenuItem();
        itemMenu = new javax.swing.JMenuItem();
        itemTransporte = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemEstadisticaTemporada = new javax.swing.JMenuItem();
        itemPaquetesComprados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setToolTipText("Empresa de Viajes");

        jbMendoza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7.jpg"))); // NOI18N
        jbMendoza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMendozaActionPerformed(evt);
            }
        });

        jbGramado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/11.jpg"))); // NOI18N
        jbGramado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGramadoActionPerformed(evt);
            }
        });

        jbCamboriu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.jpg"))); // NOI18N
        jbCamboriu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCamboriuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("NUESTRAS PROMOCIONES");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("¡EXPLORA EL MUNDO CON NOSOTROS!");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Paquetes Turísticos");

        jbCrearPaquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbCrearPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N
        jbCrearPaquete.setText("Crear Nuevo");
        jbCrearPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearPaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCrearPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCrearPaquete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbCataratas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.jpg"))); // NOI18N
        jbCataratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCataratasActionPerformed(evt);
            }
        });

        jbBariloche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8.jpg"))); // NOI18N
        jbBariloche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBarilocheActionPerformed(evt);
            }
        });

        jbMardePlata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.jpg"))); // NOI18N
        jbMardePlata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMardePlataActionPerformed(evt);
            }
        });

        jbPaisajesNorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10.jpg"))); // NOI18N
        jbPaisajesNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaisajesNorteActionPerformed(evt);
            }
        });

        jbBuenosAires.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9.jpg"))); // NOI18N
        jbBuenosAires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuenosAiresActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        escritorio.setLayer(jbMendoza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbGramado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbCamboriu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbCataratas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBariloche, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbMardePlata, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbPaisajesNorte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBuenosAires, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jbMardePlata, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbMendoza, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jbCamboriu, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(341, 341, 341))
                            .addComponent(jbBariloche, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jbCataratas, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPaisajesNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jbGramado, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuenosAires, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(344, 344, 344))))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbCataratas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGramado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPaisajesNorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuenosAires))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCamboriu)
                            .addComponent(jbBariloche))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbMendoza)
                            .addComponent(jbMardePlata))))
                .addGap(84, 84, 84))
        );

        jMenu1.setText("Administrativo");

        itemAlojamiento.setText("Alojamientos");
        itemAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlojamientoActionPerformed(evt);
            }
        });
        jMenu1.add(itemAlojamiento);

        itemDestino.setText("Destinos");
        itemDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDestinoActionPerformed(evt);
            }
        });
        jMenu1.add(itemDestino);

        itemMenu.setText("Menú");
        itemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenu);

        itemTransporte.setText("Transporte");
        itemTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTransporteActionPerformed(evt);
            }
        });
        jMenu1.add(itemTransporte);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Datos");

        itemEstadisticaTemporada.setText("Estadisticas por temporada");
        itemEstadisticaTemporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEstadisticaTemporadaActionPerformed(evt);
            }
        });
        jMenu2.add(itemEstadisticaTemporada);

        itemPaquetesComprados.setText("Paquetes recientes");
        itemPaquetesComprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPaquetesCompradosActionPerformed(evt);
            }
        });
        jMenu2.add(itemPaquetesComprados);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlojamientoActionPerformed
       
        escritorio.repaint();
        vistaAgregarAlojamiento v = new vistaAgregarAlojamiento();
        escritorio.add(v);
        v.setVisible(true);
        escritorio.moveToFront(v);
       
        
    }//GEN-LAST:event_itemAlojamientoActionPerformed

    private void itemDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDestinoActionPerformed
        
        escritorio.repaint();
        vistaAgregarDestino v = new vistaAgregarDestino();
        escritorio.add(v);
        v.setVisible(true);
        escritorio.moveToFront(v);
         
    }//GEN-LAST:event_itemDestinoActionPerformed

    private void itemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuActionPerformed
       
        escritorio.repaint();
        vistaModificarMenu v = new vistaModificarMenu();
        escritorio.add(v);
        v.setVisible(true);
        escritorio.moveToFront(v);
        
    }//GEN-LAST:event_itemMenuActionPerformed

    private void jbCrearPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearPaqueteActionPerformed
       
        escritorio.repaint();
        vistaDestino v = new vistaDestino();
        escritorio.add(v);
        v.setVisible(true);
        escritorio.moveToFront(v);
    }//GEN-LAST:event_jbCrearPaqueteActionPerformed

    private void jbCamboriuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCamboriuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCamboriuActionPerformed

    private void jbBarilocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBarilocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBarilocheActionPerformed

    private void jbCataratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCataratasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCataratasActionPerformed

    private void jbPaisajesNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaisajesNorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPaisajesNorteActionPerformed

    private void jbMardePlataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMardePlataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMardePlataActionPerformed

    private void jbMendozaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMendozaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMendozaActionPerformed

    private void jbGramadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGramadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGramadoActionPerformed

    private void jbBuenosAiresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuenosAiresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuenosAiresActionPerformed

    private void itemTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTransporteActionPerformed
        escritorio.repaint();
        vistaAgregarTransporte v = new vistaAgregarTransporte();
        escritorio.add(v);
        v.setVisible(true);
        escritorio.moveToFront(v);
    }//GEN-LAST:event_itemTransporteActionPerformed

    private void itemPaquetesCompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPaquetesCompradosActionPerformed
       escritorio.repaint();
        VistaPaqueteDetalle v = new  VistaPaqueteDetalle();
        escritorio.add(v);
        v.setVisible(true);
        escritorio.moveToFront(v);
    }//GEN-LAST:event_itemPaquetesCompradosActionPerformed

    private void itemEstadisticaTemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEstadisticaTemporadaActionPerformed
        escritorio.repaint();
        VistaEstadisticaTemporada v = new   VistaEstadisticaTemporada();
        escritorio.add(v);
        v.setVisible(true);
        escritorio.moveToFront(v);
    }//GEN-LAST:event_itemEstadisticaTemporadaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemAlojamiento;
    private javax.swing.JMenuItem itemDestino;
    private javax.swing.JMenuItem itemEstadisticaTemporada;
    private javax.swing.JMenuItem itemMenu;
    private javax.swing.JMenuItem itemPaquetesComprados;
    private javax.swing.JMenuItem itemTransporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbBariloche;
    private javax.swing.JButton jbBuenosAires;
    private javax.swing.JButton jbCamboriu;
    private javax.swing.JButton jbCataratas;
    private javax.swing.JButton jbCrearPaquete;
    private javax.swing.JButton jbGramado;
    private javax.swing.JButton jbMardePlata;
    private javax.swing.JButton jbMendoza;
    private javax.swing.JButton jbPaisajesNorte;
    // End of variables declaration//GEN-END:variables
}
