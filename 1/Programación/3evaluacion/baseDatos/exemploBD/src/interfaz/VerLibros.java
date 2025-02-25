/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import javax.swing.JPanel;
import postgressql.ConexionSQL;

/**
 *
 * @author dam1
 */
public class VerLibros extends javax.swing.JPanel {

    ConexionSQL obxC = new ConexionSQL();
    
    JPanel pMenu;
    
    /**
     * Creates new form VerLibros
     */
    public VerLibros() {
        initComponents();
        eError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eBuscar = new javax.swing.JLabel();
        opciones = new javax.swing.JComboBox<>();
        lTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bVolver = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        eError = new javax.swing.JLabel();
        bBuscarTodos = new javax.swing.JButton();

        eBuscar.setText("¿Por que quieres buscar?");

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "titulo" }));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        bVolver.setText("VOLVER");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        bBuscar.setText("BUSCAR");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        eError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bBuscarTodos.setText("BUSCAR TODOS");
        bBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(bVolver)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBuscarTodos)
                .addGap(35, 35, 35)
                .addComponent(bBuscar)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(eError, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eBuscar)
                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBuscar)
                    .addComponent(bBuscarTodos))
                .addGap(18, 18, 18)
                .addComponent(eError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVolver)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void recogerPanelMenu(JPanel panel){
        pMenu = panel;
    }
    
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        pMenu.setVisible(true);
    }//GEN-LAST:event_bVolverActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        eError.setVisible(false);
        if(opciones.getSelectedIndex()==0){
            obxC.selectLibrosID(Integer.parseInt(lTexto.getText()), tabla,eError);
        }
        else{
            if(lTexto.getText().equals("")){
                eError.setText("El titulo no puede ser vacio");
            }else{
                obxC.selectLibrosTitulo(lTexto.getText(), tabla,eError);
            }
            
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarTodosActionPerformed
        // TODO add your handling code here:
        eError.setVisible(false);
        obxC.selectLibros(tabla, eError);
    }//GEN-LAST:event_bBuscarTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bBuscarTodos;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel eBuscar;
    private javax.swing.JLabel eError;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lTexto;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
