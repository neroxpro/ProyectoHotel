/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import clasesChekin.Altas;
import clasesChekin.Mapa;
import controlMySql.MySqlConn;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Fer
 */
public class Checkin extends javax.swing.JFrame {

    /**
     * Creates new form Checkin
     */
    public Checkin() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxCiudad = new javax.swing.JComboBox<>();
        jSpinnerHabitacion = new javax.swing.JSpinner();
        jSpinnerPiso = new javax.swing.JSpinner();
        jRadioButtonHabSencilla = new javax.swing.JRadioButton();
        jRadioButtonHabDeluxe = new javax.swing.JRadioButton();
        jRadioButtonHabSuits = new javax.swing.JRadioButton();
        jComboBoxTotOcupantes = new javax.swing.JComboBox<>();
        jComboBoxPerExtra = new javax.swing.JComboBox<>();
        jButtonRecibo = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jDateChooserIngreso = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jTextFielDias = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(91, 67, 60, 19);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("CHECK-IN ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(302, 13, 121, 29);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Ciudad:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(96, 118, 55, 19);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Fecha de Ingreso:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 180, 125, 19);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Habitacion:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(72, 229, 79, 19);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Total de Ocupantes:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(12, 329, 139, 19);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Habitacion:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 280, 136, 19);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Piso:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(409, 229, 36, 19);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setText("Personas Extra:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(348, 329, 111, 19);
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(185, 66, 394, 20);

        jComboBoxCiudad.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jComboBoxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Ensenada", "Mexicali", "Tijuana", "La Paz", "Los Cabos", "Campeche", "Ciudad del Carmen", "Tapachula", "Tuxtla Gutiérrez", "Chihuahua", "Juárez", "La Laguna", "Monclova-Frontera", "Piedras Negras", "Saltillo", "Colima-Villa de Álvarez", "Manzanillo", "Tecomán", "Valle de México", "Durango", "Celaya", "Guanajuato", "Irapuato", "La Piedad-Pénjamo", "León", "Salamanca", "San Francisco del Rincón", "Acapulco", "Chilpancingo", "Pachuca", "Tula", "Tulancingo", "Guadalajara", "Ocotlán", "Puerto Vallarta", "Morelia", "Uruapan", "Zamora-Jacona", "Cuautla", "Cuernavaca", "Toluca", "Tepic", "Monterrey", "Oaxaca", "Tehuantepec-Salina Cruz", "Puebla-Tlaxcala", "Tehuacán", "Querétaro", "San Juan del Río", "Cancún", "Chetumal", "Rioverde-Ciudad Fernández", "San Luis Potosí-Soledad", "Culiacán", "Los Mochis", "Mazatlán", "Ciudad Obregón", "Guaymas", "Hermosillo", "Cárdenas", "Villahermosa", "Ciudad Victoria", "Matamoros", "Nuevo Laredo", "Reynosa-Río Bravo", "Tampico-Pánuco", "Tlaxcala-Apizaco", "Coatzacoalcos", "Córdoba", "Minatitlán", "Orizaba", "Poza Rica", "Veracruz", "Xalapa", "Mérida", "Zacatecas-Guadalupe", "Otra" }));
        jPanel1.add(jComboBoxCiudad);
        jComboBoxCiudad.setBounds(169, 118, 197, 21);

        jSpinnerHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinnerHabitacionMouseClicked(evt);
            }
        });
        jPanel1.add(jSpinnerHabitacion);
        jSpinnerHabitacion.setBounds(244, 222, 47, 34);
        jPanel1.add(jSpinnerPiso);
        jSpinnerPiso.setBounds(530, 222, 47, 34);

        buttonGroup2.add(jRadioButtonHabSencilla);
        jRadioButtonHabSencilla.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jRadioButtonHabSencilla.setText("Sencilla");
        jPanel1.add(jRadioButtonHabSencilla);
        jRadioButtonHabSencilla.setBounds(216, 274, 71, 23);

        buttonGroup2.add(jRadioButtonHabDeluxe);
        jRadioButtonHabDeluxe.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jRadioButtonHabDeluxe.setText("Deluxe");
        jPanel1.add(jRadioButtonHabDeluxe);
        jRadioButtonHabDeluxe.setBounds(348, 274, 65, 23);

        buttonGroup2.add(jRadioButtonHabSuits);
        jRadioButtonHabSuits.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jRadioButtonHabSuits.setText("Suit");
        jPanel1.add(jRadioButtonHabSuits);
        jRadioButtonHabSuits.setBounds(530, 274, 49, 23);

        jComboBoxTotOcupantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", " " }));
        jPanel1.add(jComboBoxTotOcupantes);
        jComboBoxTotOcupantes.setBounds(257, 328, 31, 20);

        jComboBoxPerExtra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", " " }));
        jPanel1.add(jComboBoxPerExtra);
        jComboBoxPerExtra.setBounds(547, 328, 31, 20);

        jButtonRecibo.setText("RECIBO");
        jPanel1.add(jButtonRecibo);
        jButtonRecibo.setBounds(130, 430, 71, 23);

        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMousePressed(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar);
        jButtonRegistrar.setBounds(330, 430, 89, 23);

        jButtonSalir.setText("SALIR");
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSalir);
        jButtonSalir.setBounds(540, 430, 61, 23);
        jPanel1.add(jDateChooserIngreso);
        jDateChooserIngreso.setBounds(350, 180, 108, 20);

        jLabel11.setText("Días que se va a quedar: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(158, 379, 140, 14);
        jPanel1.add(jTextFielDias);
        jTextFielDias.setBounds(317, 376, 76, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 770, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerHabitacionMouseClicked
        // TODO add your handling code here:
        String tipo="";
        int p;
        Mapa ma ;
        p = (int)this.jSpinnerPiso.getValue();
                
        if(this.jRadioButtonHabSencilla.isSelected()){
            tipo = "sencilla";
        }else if(this.jRadioButtonHabDeluxe.isSelected()){
            tipo = "deluxe";
        }else if (this.jRadioButtonHabSuits.isSelected()){
            tipo = "suit";
        }
        
        ma = new Mapa(p,tipo);
        ma.setVisible(true);
    }//GEN-LAST:event_jSpinnerHabitacionMouseClicked

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void jButtonRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMousePressed
        // TODO add your handling code here:
        Altas a;
        String nom,tham="",origen;
        LocalDate ingreso;
        int piso,lp=0,total,pextras,nhab,dias,cu=0;
        nom = this.jTextFieldNombre.getText();
        
        if(this.jRadioButtonHabSencilla.isSelected()){
            tham = "sencilla";
            lp = 1;
        }else if(this.jRadioButtonHabDeluxe.isSelected()){
            tham = "deluxe";
            lp = 2;
        }else if (this.jRadioButtonHabSuits.isSelected()){
            tham = "suit";
            lp = 3;
        }
        origen = (String)this.jComboBoxCiudad.getSelectedItem();
        Date temp = this.jDateChooserIngreso.getDate();
        ingreso=temp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        piso = (int)this.jSpinnerPiso.getValue();
        pextras = Integer.parseInt(this.jComboBoxPerExtra.getSelectedItem().toString());
        //pextras = (int)this.jComboBoxPerExtra.getSelectedItem();
        total = lp+pextras;
        nhab = (int)this.jSpinnerHabitacion.getValue();
        dias = Integer.parseInt(this.jTextFielDias.getText());
        
        
        a = new Altas(nom,tham,origen,ingreso,piso,lp,total,pextras,nhab,dias,cu);
        a.darAlta(new  MySqlConn());
    }//GEN-LAST:event_jButtonRegistrarMousePressed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonRecibo;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxCiudad;
    private javax.swing.JComboBox<String> jComboBoxPerExtra;
    private javax.swing.JComboBox<String> jComboBoxTotOcupantes;
    private com.toedter.calendar.JDateChooser jDateChooserIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonHabDeluxe;
    private javax.swing.JRadioButton jRadioButtonHabSencilla;
    private javax.swing.JRadioButton jRadioButtonHabSuits;
    private javax.swing.JSpinner jSpinnerHabitacion;
    private javax.swing.JSpinner jSpinnerPiso;
    private javax.swing.JTextField jTextFielDias;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
