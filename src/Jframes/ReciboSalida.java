/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;


import controlMySql.MySqlConn;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.ChronoUnit.DAYS;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Fer
 */
public class ReciboSalida extends javax.swing.JFrame {

    int hab;
    MySqlConn conn=new MySqlConn();
    /**
     * Creates new form Recibo
     */
    public ReciboSalida(){
        initComponents();
    }
    
    public ReciboSalida(int hab) {
        initComponents();
        int costo;
                try {

            String query= "SELECT  habitaciones.numero,habitaciones.tipo,ocupaciones.habitaciones_numero,ocupaciones.ingreso,ocupaciones.salida,usuarios.nombre,usuarios.cdOrigen,ventas.cuenta,ventas.gastosExtras from habitaciones,ocupaciones,usuarios,ventas WHERE habitaciones.numero=ocupaciones.habitaciones_numero and usuarios.id=ocupaciones.usuarios_id and ventas.id=ocupaciones.Ventas_id AND ocupaciones.habitaciones_numero="+hab+" AND habitaciones.ocupacion=1";
            PreparedStatement pstmt=conn.conn.prepareStatement(query);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                
                String s1=rs.getString(2);
                Date s2=rs.getDate(4);//fecha entrada
                LocalDate lDate =  s2.toLocalDate();                
                Date s3=rs.getDate(5);// salida
                
                LocalDate SDate = s3.toLocalDate();
                String s4=rs.getString(6);//nombre
                String s5=rs.getString(7);//ciudad
                int s6=rs.getInt(8);//cuenta sin gastos extras
                long diff = DAYS.between(lDate,SDate);
                if(s1.equalsIgnoreCase("sencilla")){
                    costo=2000;
                    this.jTextFieldcosto.setText(String.valueOf(costo));
                }else if(s1.equalsIgnoreCase("deluxe")){
                    costo=3200;
                    this.jTextFieldcosto.setText(String.valueOf(costo));
                }else if (s1.equalsIgnoreCase("suite")){
                    costo=4500;
                    this.jTextFieldcosto.setText(String.valueOf(costo));
                }
                int s7=rs.getInt(9);//gastos extras
                int sumaGastos=s6+s7;
                
                this.jTextFieldcostoconextra.setText(String.valueOf(sumaGastos));
                this.jTextFieldtipohab.setText(s1);
                this.jTextFieldfechaing.setText(lDate.toString());
                this.jTextFieldfechasal.setText(SDate.toString());
                this.jTextFieldNombre.setText(s4);
                this.jTextFieldCiudad.setText(s5);
                this.jTextFieldcostosinextra.setText(String.valueOf(s6).trim());
                this.jTextFieldfechadia.setText(LocalDate.now().toString());
                this.jTextFielddiasquequedo.setText(String.valueOf(diff));
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Habitacion no ocupada " + hab);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        String au [] = new String[13];
        au[0] = "Punta Coco";
        au[1] = "Paraiso con aroma a coco";
        au[2] = "Fecha del dia: "+this.jTextFieldfechadia.getText();
        au[3] = "Ubicacion: "+this.jLabelUbicacion.getText();
        au[4] = "Nombre del huesped:"+this.jTextFieldNombre.getText();
        au[5] = "Ciudad de origen: "+this.jTextFieldCiudad.getText();
        au[6] = "Fecha de ingreso: "+this.jTextFieldfechaing.getText();
        au[7] = "Fecha de salida: "+this.jTextFieldfechasal.getText();
        au[8] = "Tipo de habitacion: "+this.jTextFieldtipohab.getText();
        au[9] = "Costo: "+this.jTextFieldcosto.getText();
        au[10] = "Dias que se quedo en el hotel: "+this.jTextFielddiasquequedo.getText();
        au[11] = "Total a pagar sin costos extras: $"+this.jTextFieldcostosinextra.getText();
        au[12] = "Total a pagar con costos extras: $"+this.jTextFieldcostoconextra.getText();
        
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldfechaing = new javax.swing.JTextField();
        jTextFieldfechasal = new javax.swing.JTextField();
        jTextFieldcosto = new javax.swing.JTextField();
        jTextFieldtipohab = new javax.swing.JTextField();
        jTextFielddiasquequedo = new javax.swing.JTextField();
        jTextFieldcostosinextra = new javax.swing.JTextField();
        jTextFieldcostoconextra = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldfechadia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("RECIBO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(640, 10, 91, 29);

        jLabel2.setText("Ubicacion:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 140, 49, 14);

        jLabel3.setText("Hombre del Huesped:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(84, 162, 103, 14);

        jLabel4.setText("Ciudad de origen:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(106, 202, 85, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de ingreso:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(105, 237, 120, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de salida:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(114, 271, 78, 14);

        jLabel7.setText("Costo:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(170, 320, 50, 14);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de habitacion:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 270, 91, 14);

        jLabel10.setText("Dias que se quedo en el hotel:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 320, 190, 14);

        jLabel11.setText("Total a pagar sin costos extra:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(110, 350, 200, 14);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("Salida Completada.                                                        VUELVA PRONTO");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(110, 460, 570, 21);

        jLabel13.setText("Total a pagar con costos extra:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(390, 350, 151, 14);

        jLabelUbicacion.setText("Calle Caguama 6, 77310, Isla de Holbox, Cancún-Riviera Maya, Quintana Roo, MÉXICO.");
        jPanel1.add(jLabelUbicacion);
        jLabelUbicacion.setBounds(210, 140, 424, 14);

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(210, 160, 317, 20);
        jPanel1.add(jTextFieldCiudad);
        jTextFieldCiudad.setBounds(210, 200, 317, 20);
        jPanel1.add(jTextFieldfechaing);
        jTextFieldfechaing.setBounds(213, 234, 182, 20);
        jPanel1.add(jTextFieldfechasal);
        jTextFieldfechasal.setBounds(213, 268, 182, 20);
        jPanel1.add(jTextFieldcosto);
        jTextFieldcosto.setBounds(220, 320, 58, 20);
        jPanel1.add(jTextFieldtipohab);
        jTextFieldtipohab.setBounds(540, 270, 58, 20);
        jPanel1.add(jTextFielddiasquequedo);
        jTextFielddiasquequedo.setBounds(480, 320, 58, 20);
        jPanel1.add(jTextFieldcostosinextra);
        jTextFieldcostosinextra.setBounds(300, 350, 80, 20);
        jPanel1.add(jTextFieldcostoconextra);
        jTextFieldcostoconextra.setBounds(580, 350, 70, 20);

        jLabel17.setText("Fecha del dia:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(140, 110, 90, 14);
        jPanel1.add(jTextFieldfechadia);
        jTextFieldfechadia.setBounds(230, 110, 150, 20);

        jLabel14.setText("Gerente: Victor Fernando Ramirez Padilla");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(280, 470, 250, 14);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(260, 380, 300, 140);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

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
                new ReciboSalida().setVisible(true);
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldcosto;
    private javax.swing.JTextField jTextFieldcostoconextra;
    private javax.swing.JTextField jTextFieldcostosinextra;
    private javax.swing.JTextField jTextFielddiasquequedo;
    private javax.swing.JTextField jTextFieldfechadia;
    private javax.swing.JTextField jTextFieldfechaing;
    private javax.swing.JTextField jTextFieldfechasal;
    private javax.swing.JTextField jTextFieldtipohab;
    // End of variables declaration//GEN-END:variables
}
