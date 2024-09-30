/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanainicial;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author galog
 */
public class Saluda extends javax.swing.JFrame {

    /**
     * Creates new form Saluda
     */
    public Saluda() {
        initComponents();
        setTitle("saluda");
        setLocation(700, 290);
        setResizable(false);
        
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSaludar = new javax.swing.JButton();
        TextoNombreUsuario = new javax.swing.JTextField();
        TextoIndicador = new javax.swing.JLabel();
        inconoSaludar = new javax.swing.JLabel();
        TextoIndicadorApellido = new javax.swing.JLabel();
        TextoApellidoUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSaludar.setText("Saluda");
        BotonSaludar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSaludarMouseClicked(evt);
            }
        });
        BotonSaludar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSaludarActionPerformed(evt);
            }
        });
        BotonSaludar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BotonSaludarKeyTyped(evt);
            }
        });

        TextoNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreUsuarioActionPerformed(evt);
            }
        });

        TextoIndicador.setText("Escribe el nombre de usuario");

        inconoSaludar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanainicial/saluda.png"))); // NOI18N

        TextoIndicadorApellido.setText("Escribe el apellido del usuario");

        TextoApellidoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoApellidoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(TextoIndicador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(inconoSaludar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(TextoIndicadorApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(BotonSaludar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(inconoSaludar)
                .addGap(27, 27, 27)
                .addComponent(TextoIndicador)
                .addGap(33, 33, 33)
                .addComponent(TextoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoIndicadorApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BotonSaludar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSaludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSaludarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSaludarActionPerformed

    private void TextoNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreUsuarioActionPerformed

    private void BotonSaludarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSaludarMouseClicked
        
        
        if (TextoNombreUsuario.getText().isEmpty() || TextoIndicadorApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Error, escriba nombre y apellido del usuario.\n No pueden estar vacios.", getTitle(), JOptionPane.ERROR_MESSAGE);
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
        }
        if (TextoNombreUsuario.getText().length() < 5 || TextoApellidoUsuario.getText().length() < 5){
            JOptionPane.showMessageDialog(rootPane, "Cuidado, escriba nombre y apellido del usuario con almenos 5 caracteres en cada campo", getTitle(), JOptionPane.WARNING_MESSAGE);
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
        
        } 
     
        if (TextoNombreUsuario.getText().matches(".*\\d.*") || TextoApellidoUsuario.getText().matches(".*\\d.*")){
                JOptionPane.showMessageDialog(rootPane, "Cuidado, escribar un nombre y un apellido sin incluir numeros.", getTitle(), JOptionPane.WARNING_MESSAGE);
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
            } else {
       JOptionPane.showMessageDialog(rootPane, "¡Hola " + TextoNombreUsuario.getText() + " " + TextoApellidoUsuario.getText() + "!", getTitle(), JOptionPane.INFORMATION_MESSAGE);
       
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
        }
    }//GEN-LAST:event_BotonSaludarMouseClicked

    private void TextoApellidoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoApellidoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoApellidoUsuarioActionPerformed

    private void BotonSaludarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonSaludarKeyTyped
        
        if (TextoNombreUsuario.getText().isEmpty() || TextoIndicadorApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Error, escriba nombre y apellido del usuario.\n No pueden estar vacios.", getTitle(), JOptionPane.ERROR_MESSAGE);
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
        }
        if (TextoNombreUsuario.getText().length() < 5 || TextoApellidoUsuario.getText().length() < 5){
            JOptionPane.showMessageDialog(rootPane, "Cuidado, escriba nombre y apellido del usuario con almenos 5 caracteres en cada campo", getTitle(), JOptionPane.WARNING_MESSAGE);
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
        
        } 
     
        if (TextoNombreUsuario.getText().matches(".*\\d.*") || TextoApellidoUsuario.getText().matches(".*\\d.*")){
                JOptionPane.showMessageDialog(rootPane, "Cuidado, escribar un nombre y un apellido sin incluir numeros.", getTitle(), JOptionPane.WARNING_MESSAGE);
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
            } else {
       JOptionPane.showMessageDialog(rootPane, "¡Hola " + TextoNombreUsuario.getText() + " " + TextoApellidoUsuario.getText() + "!", getTitle(), JOptionPane.INFORMATION_MESSAGE);
       
            TextoNombreUsuario.setText("");
            TextoApellidoUsuario.setText("");
            return;
        }
    }//GEN-LAST:event_BotonSaludarKeyTyped

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
            java.util.logging.Logger.getLogger(Saluda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saluda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saluda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saluda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saluda().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSaludar;
    private javax.swing.JTextField TextoApellidoUsuario;
    private javax.swing.JLabel TextoIndicador;
    private javax.swing.JLabel TextoIndicadorApellido;
    private javax.swing.JTextField TextoNombreUsuario;
    private javax.swing.JLabel inconoSaludar;
    // End of variables declaration//GEN-END:variables
}
