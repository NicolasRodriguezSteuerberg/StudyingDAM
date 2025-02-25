/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import java.sql.Connection;
import javax.swing.JPanel;
import postgressql.ConexionSQL;

/**
 *
 * @author dam1
 */
public class Menu2 extends javax.swing.JPanel {
    JPanel pCrear, pVer, pActualizar, pEliminar;
    /**
     * Creates new form Menu2
     */
    public Menu2() {
        initComponents();
    }
    
    public void recogerPaneles(JPanel crear, JPanel ver, JPanel actualizar, JPanel eliminar){
        pCrear=crear;
        pVer = ver;
        pActualizar = actualizar;
        pEliminar = eliminar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCrear = new javax.swing.JButton();
        bVer = new javax.swing.JButton();
        bDesconectar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();

        bCrear.setText("CREAR LIBROS");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        bVer.setText("VER LIBROS");
        bVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerActionPerformed(evt);
            }
        });

        bDesconectar.setText("DESCONECTAR");
        bDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDesconectarActionPerformed(evt);
            }
        });

        bModificar.setText("MODIFICAR");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bBorrar.setText("BORRAR");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bCrear)
                .addGap(34, 34, 34)
                .addComponent(bVer)
                .addGap(36, 36, 36)
                .addComponent(bModificar)
                .addGap(35, 35, 35)
                .addComponent(bBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(bDesconectar)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        pCrear.setVisible(true);
    }//GEN-LAST:event_bCrearActionPerformed

    private void bVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        pVer.setVisible(true);
    }//GEN-LAST:event_bVerActionPerformed

    private void bDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDesconectarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bDesconectarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        pActualizar.setVisible(true);
    }//GEN-LAST:event_bModificarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        pEliminar.setVisible(true);
    }//GEN-LAST:event_bBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bDesconectar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bVer;
    // End of variables declaration//GEN-END:variables
}
