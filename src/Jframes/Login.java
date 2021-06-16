/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Fer
 */
public class Login extends javax.swing.JFrame {

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
        jLabel6 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
        jButtonEntrar.setBounds(230, 470, 73, 23);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 330, 100, 19);
        jPanel1.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(140, 330, 231, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 420, 110, 17);
        jPanel1.add(jPasswordFieldcontra);
        jPasswordFieldcontra.setBounds(140, 420, 231, 20);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 220, 0, 0);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green box2.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 0, 150, 70);

        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegistrar);
        jButtonRegistrar.setBounds(20, 20, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user-login.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -10, 500, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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
        query = "select * from cuentas where cuenta = "+"'"+cuenta+"'";
        this.conn.Consult(query);
        try{
            String contraseñaMySql = this.conn.rs.getString(2);
            char [] passw = this.jPasswordFieldcontra.getPassword();
            contraseña = new String(passw);
            String contraseñaencriptada = DigestUtils.md5Hex(contraseña);
            if(contraseñaMySql.equals(contraseñaencriptada)){
                JOptionPane.showMessageDialog(this, "Bienvenido "+this.conn.rs.getString(1)+" al sistema"); 
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
        Altas al = new Altas();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

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
    private javax.swing.JButton jButtonRegistrar;
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
