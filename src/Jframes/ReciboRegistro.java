/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

/**
 *
 * @author Fer
 */
public class ReciboRegistro extends javax.swing.JFrame {

    /**
     * Creates new form Recibo
     */
    public ReciboRegistro() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldfechaing = new javax.swing.JTextField();
        jTextFieldfechasal = new javax.swing.JTextField();
        jTextFieldnumhab = new javax.swing.JTextField();
        jTextFieldtipohab = new javax.swing.JTextField();
        jTextFieldpiso = new javax.swing.JTextField();
        jTextFieldtotocu = new javax.swing.JTextField();
        jTextFieldperextra = new javax.swing.JTextField();
        jTextFieldlimite = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("RECIBO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(465, 275, 91, 29);

        jLabel2.setText("Ubicacion:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(149, 128, 49, 14);

        jLabel3.setText("Hombre del Huesped:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(84, 162, 103, 14);

        jLabel4.setText("Ciudad de origen:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(106, 202, 85, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de ingreso:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(105, 237, 86, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de salida:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(114, 271, 78, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numero de habitacion:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(78, 314, 108, 14);

        jLabel8.setText("piso:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(590, 360, 23, 14);

        jLabel9.setText("Tipo de habitacion:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(98, 354, 91, 14);

        jLabel10.setText("Total de ocupantes de la habitacion:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 389, 174, 14);

        jLabel11.setText("personas extra:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(118, 424, 77, 14);

        jLabel12.setText("Registro completado");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(320, 461, 98, 14);

        jLabel13.setText("Limite:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(289, 424, 31, 14);

        jLabel14.setText("Huesped");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(388, 424, 42, 14);

        jLabel15.setText("Calle Caguama 6, 77310, Isla de Holbox, Cancún-Riviera Maya, Quintana Roo, MÉXICO.");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(226, 128, 424, 14);

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(226, 159, 317, 20);

        jTextFieldCiudad.setEditable(false);
        jPanel1.add(jTextFieldCiudad);
        jTextFieldCiudad.setBounds(226, 199, 317, 20);

        jTextFieldfechaing.setEditable(false);
        jPanel1.add(jTextFieldfechaing);
        jTextFieldfechaing.setBounds(213, 234, 182, 20);

        jTextFieldfechasal.setEditable(false);
        jPanel1.add(jTextFieldfechasal);
        jTextFieldfechasal.setBounds(213, 268, 182, 20);

        jTextFieldnumhab.setEditable(false);
        jPanel1.add(jTextFieldnumhab);
        jTextFieldnumhab.setBounds(213, 311, 58, 20);

        jTextFieldtipohab.setEditable(false);
        jPanel1.add(jTextFieldtipohab);
        jTextFieldtipohab.setBounds(213, 351, 58, 20);

        jTextFieldpiso.setEditable(false);
        jPanel1.add(jTextFieldpiso);
        jTextFieldpiso.setBounds(630, 360, 45, 20);

        jTextFieldtotocu.setEditable(false);
        jPanel1.add(jTextFieldtotocu);
        jTextFieldtotocu.setBounds(213, 386, 58, 20);

        jTextFieldperextra.setEditable(false);
        jPanel1.add(jTextFieldperextra);
        jTextFieldperextra.setBounds(213, 421, 58, 20);

        jTextFieldlimite.setEditable(false);
        jPanel1.add(jTextFieldlimite);
        jTextFieldlimite.setBounds(333, 421, 50, 20);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco5.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(-10, 0, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public void agrega(String nom,String ciudad,String entrada,String salida,String numH,String tipoH,String totalP,String perEx,String lim,String piso){
        this.jTextFieldNombre.setText(nom);
        this.jTextFieldCiudad.setText(ciudad);
        this.jTextFieldfechaing.setText(entrada);
        this.jTextFieldfechasal.setText(salida);
        this.jTextFieldnumhab.setText(numH);
        this.jTextFieldtipohab.setText(tipoH);
        this.jTextFieldtotocu.setText(totalP);
        this.jTextFieldperextra.setText(perEx);
        this.jTextFieldlimite.setText(lim);
        this.jTextFieldpiso.setText(piso);
    }
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
            java.util.logging.Logger.getLogger(ReciboRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReciboRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReciboRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReciboRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReciboRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldfechaing;
    private javax.swing.JTextField jTextFieldfechasal;
    private javax.swing.JTextField jTextFieldlimite;
    private javax.swing.JTextField jTextFieldnumhab;
    private javax.swing.JTextField jTextFieldperextra;
    private javax.swing.JTextField jTextFieldpiso;
    private javax.swing.JTextField jTextFieldtipohab;
    private javax.swing.JTextField jTextFieldtotocu;
    // End of variables declaration//GEN-END:variables
}
