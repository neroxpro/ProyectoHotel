/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import controlMySql.MySqlConn;
import java.applet.AudioClip;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Fer
 */
public class Login extends javax.swing.JFrame {
    MySqlConn conn=new MySqlConn();
    /**
     * Creates new form Login
     */
    public Login() {
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
        jButtonEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldcontra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonMUSICA = new javax.swing.JButton();
        jButtonSTOP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonEntrarMousePressed(evt);
            }
        });
        jPanel1.add(jButtonEntrar);
        jButtonEntrar.setBounds(360, 540, 73, 23);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 400, 100, 19);
        jPanel1.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(260, 400, 231, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 490, 110, 17);
        jPanel1.add(jPasswordFieldcontra);
        jPasswordFieldcontra.setBounds(260, 490, 231, 20);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 220, 0, 0);

        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegistrar);
        jButtonRegistrar.setBounds(560, 220, 120, 30);

        jButtonMUSICA.setText("MUSICA");
        jButtonMUSICA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMUSICAMouseClicked(evt);
            }
        });
        jButtonMUSICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMUSICAActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMUSICA);
        jButtonMUSICA.setBounds(580, 110, 90, 23);

        jButtonSTOP.setText("STOP");
        jButtonSTOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSTOPMouseClicked(evt);
            }
        });
        jButtonSTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSTOPActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSTOP);
        jButtonSTOP.setBounds(590, 170, 59, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user-login.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 60, 500, 510);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco5.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 750, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonEntrarMousePressed

    private void jButtonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseClicked
        // TODO add your handling code here:
        String cuenta, contraseña, query;
        cuenta = this.jTextFieldUsuario.getText().trim();
        query = "select * from empleados where usuario = "+"'"+cuenta+"'";
        this.conn.Consult(query);
        try{
            String contraseñaMySql = this.conn.rs.getString(3);
            char [] passw = this.jPasswordFieldcontra.getPassword();
            contraseña = new String(passw);
            String contraseñaencriptada = DigestUtils.md5Hex(contraseña);
            if(contraseñaMySql.equals(contraseñaencriptada)){
                JOptionPane.showMessageDialog(this, "Bienvenido "+this.conn.rs.getString(2)+" al sistema"); 
                Menu m = new Menu();
                m.setVisible(true);
                
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Error en la contraseña");
                Login l = new Login();
                l.setVisible(true);
                this.dispose();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "No existe la cuenta");
            System.out.println("No existe la cuenta");
            Login l = new Login();
            l.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonEntrarMouseClicked

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        // TODO add your handling code here:
        AltasRegistro al = new AltasRegistro();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void jButtonMUSICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMUSICAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMUSICAActionPerformed

    private void jButtonMUSICAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMUSICAMouseClicked
        // TODO add your handling code here:
        AudioClip piano2;
        piano2=java.applet.Applet.newAudioClip(getClass().getResource("/Jframes/piano2.wav"));
        piano2.play();
    }//GEN-LAST:event_jButtonMUSICAMouseClicked

    private void jButtonSTOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSTOPMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonSTOPMouseClicked

    private void jButtonSTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSTOPActionPerformed
        // TODO add your handling code here:
        AudioClip piano2;
        piano2=java.applet.Applet.newAudioClip(getClass().getResource("/Jframes/piano2.wav"));
        piano2.stop();
    }//GEN-LAST:event_jButtonSTOPActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonMUSICA;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSTOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldcontra;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
