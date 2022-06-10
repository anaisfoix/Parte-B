/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author franm
 */
public class MenuAgregarElementos extends javax.swing.JFrame {
    
    private int Comando = 0 ;
    /**
     * Creates new form MenuAgregarElementos
     */
    public MenuAgregarElementos() {
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

        jLabel1 = new javax.swing.JLabel();
        Boton_Curso = new javax.swing.JButton();
        Boton_Profesor = new javax.swing.JButton();
        Boton_Estudiante = new javax.swing.JButton();
        Boton_OfertaLaboral = new javax.swing.JButton();
        Boton_Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Que decea agregar?");

        Boton_Curso.setText("Curso");
        Boton_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CursoActionPerformed(evt);
            }
        });

        Boton_Profesor.setText("Profesor");
        Boton_Profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ProfesorActionPerformed(evt);
            }
        });

        Boton_Estudiante.setText("Estudiante");
        Boton_Estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EstudianteActionPerformed(evt);
            }
        });

        Boton_OfertaLaboral.setText("Oferta Laboral");
        Boton_OfertaLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_OfertaLaboralActionPerformed(evt);
            }
        });

        Boton_Menu.setText("Volver al menu principal");
        Boton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_Curso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_Profesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_OfertaLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_Estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton_Menu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Boton_Curso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Profesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Estudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_OfertaLaboral)
                .addGap(18, 18, 18)
                .addComponent(Boton_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_EstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EstudianteActionPerformed
        this.Comando = 3 ;
        this.dispose();
    }//GEN-LAST:event_Boton_EstudianteActionPerformed

    private void Boton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_MenuActionPerformed
        this.Comando = 5 ;
        this.dispose();
    }//GEN-LAST:event_Boton_MenuActionPerformed

    private void Boton_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CursoActionPerformed
        this.Comando = 1 ;
        this.dispose();
    }//GEN-LAST:event_Boton_CursoActionPerformed

    private void Boton_ProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ProfesorActionPerformed
        this.Comando = 2 ;
        this.dispose();
    }//GEN-LAST:event_Boton_ProfesorActionPerformed

    private void Boton_OfertaLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_OfertaLaboralActionPerformed
        this.Comando = 4 ;
        this.dispose();
    }//GEN-LAST:event_Boton_OfertaLaboralActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAgregarElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAgregarElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAgregarElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAgregarElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAgregarElementos().setVisible(true);
            }
        });
    }

    public int getComando() {
        return Comando;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Curso;
    private javax.swing.JButton Boton_Estudiante;
    private javax.swing.JButton Boton_Menu;
    private javax.swing.JButton Boton_OfertaLaboral;
    private javax.swing.JButton Boton_Profesor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
