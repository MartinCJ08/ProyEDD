/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author jonha
 */
public class ESTRUCTURA extends javax.swing.JFrame {

    /**
     * Creates new form ESTRUCTURA
     */
    public ESTRUCTURA() {
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

        ComboDirec = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboDirec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIRECCIONES", "CHAVEZ GARCIA JOSE LUIS", "BICICLETAS NAHEL", "RAPHA BIKE SHOP", "BICICLETAS CANO", " " }));
        ComboDirec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboDirecItemStateChanged(evt);
            }
        });
        ComboDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDirecActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ComboDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 389, Short.MAX_VALUE))
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDirecActionPerformed


    }//GEN-LAST:event_ComboDirecActionPerformed

    private void ComboDirecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboDirecItemStateChanged
        int ipos;
        String slugimag;
        URL url = null;
        ipos = ComboDirec.getSelectedIndex();

        switch (ipos) {
            
            case 0:
                slugimag = "/edd/IMAGENES/UBICACION.PNG";
                url = this.getClass().getResource(slugimag);
                ImageIcon imagen = new ImageIcon(url);
                img.setIcon(imagen);
                break;
            case 1:
                slugimag = "/edd/IMAGENES/CHAVEZGARCIAJOSELUIS.PNG";
                url = this.getClass().getResource(slugimag);
                ImageIcon imagen1 = new ImageIcon(url);
                img.setIcon(imagen1);
                break;
            case 2:
                slugimag = "/edd/IMAGENES/BICICLETASNAHEL.PNG";
                url = this.getClass().getResource(slugimag);
                ImageIcon imagen2 = new ImageIcon(url);
                img.setIcon(imagen2);
                break;
            case 3:
                slugimag = "/edd/IMAGENES/RAPHABIKESHOP.PNG";
                url = this.getClass().getResource(slugimag);
                ImageIcon imagen3 = new ImageIcon(url);
                img.setIcon(imagen3);
                break;
            case 4:
                slugimag = "/edd/IMAGENES/BICICLETASCANO.PNG";
                url = this.getClass().getResource(slugimag);
                ImageIcon imagen4 = new ImageIcon(url);
                img.setIcon(imagen4);
                break;

        }

    }//GEN-LAST:event_ComboDirecItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ESTRUCTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESTRUCTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESTRUCTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESTRUCTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ESTRUCTURA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDirec;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
