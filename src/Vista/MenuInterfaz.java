/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Funciones.Funciones;

/**
 *
 * @author sofia
 */
public class MenuInterfaz extends javax.swing.JFrame {

    private Funciones prueba;
    private int Comando = 0 ;
    /**
     * Creates new form Menu
     */
      
    public MenuInterfaz(){
        
    }
    
    public MenuInterfaz(Funciones prueba) {
        initComponents();
        this.prueba = new Funciones();
        this.prueba = prueba;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_Terminar = new javax.swing.JButton();
        Boton_Mostrar = new javax.swing.JButton();
        Boton_Generar = new javax.swing.JButton();
        Boton_Agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton_Terminar.setText("Terminar Programa");
        Boton_Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_TerminarActionPerformed(evt);
            }
        });

        Boton_Mostrar.setText("Mostrar Elemento");
        Boton_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_MostrarActionPerformed(evt);
            }
        });

        Boton_Generar.setText("Generar Reporte");
        Boton_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GenerarActionPerformed(evt);
            }
        });

        Boton_Agregar.setText("Agregar Elemento");
        Boton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Men?? Principal");

        jLabel2.setText("??Qu?? desea hacer?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton_Terminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton_Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton_Generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(Boton_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Generar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_TerminarActionPerformed
        this.Comando = 4 ;
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_Boton_TerminarActionPerformed

    private void Boton_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_MostrarActionPerformed
        this.Comando = 2 ;
        this.setVisible(false);
        
    }//GEN-LAST:event_Boton_MostrarActionPerformed

    private void Boton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AgregarActionPerformed
        this.Comando = 1 ;
        this.setVisible(false);
    }//GEN-LAST:event_Boton_AgregarActionPerformed

    private void Boton_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GenerarActionPerformed
        this.Comando = 3 ;
        this.setVisible(false);
    }//GEN-LAST:event_Boton_GenerarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInterfaz().setVisible(true);
            }
        });
    }

    public int getComando() {
        return Comando;
    }

    public void resetComando(){
        this.Comando = 0 ;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Agregar;
    private javax.swing.JButton Boton_Generar;
    private javax.swing.JButton Boton_Mostrar;
    private javax.swing.JButton Boton_Terminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
