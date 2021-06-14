/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import controlMySql.MySqlConn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fer
 */
public class Consultas extends javax.swing.JFrame {

    MySqlConn conn=new MySqlConn();
    
    public Consultas(MySqlConn conn){
        this.conn=conn;
        
        initComponents();
        
    }
    
    
    public Consultas() {
        initComponents();
        jTextFieldHabit.setEditable(false);
        jTextFieldPiso.setEditable(false);
        jTextFieldHuesped.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonHistoricoIngresos = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonPorNombre = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldHabit = new javax.swing.JTextField();
        jTextFieldPiso = new javax.swing.JTextField();
        jButtonPorNombre1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButtonPorHabitacion = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldHuesped = new javax.swing.JTextField();
        jTextFieldHab = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultas = new javax.swing.JTable();
        jButtonHistoricoHuesped = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Historico de Ingresos:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(190, 200, 151, 19);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(360, 200, 151, 22);

        jButtonHistoricoIngresos.setText("Consultar");
        jPanel2.add(jButtonHistoricoIngresos);
        jButtonHistoricoIngresos.setBounds(340, 300, 87, 25);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("HISTORICO INGRESOS", jPanel2);

        jPanel3.setLayout(null);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel3.add(jLabel24);
        jLabel24.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("HISTORICO OCUPACION", jPanel3);

        jPanel4.setLayout(null);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel4.add(jLabel25);
        jLabel25.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("HABITACIONES", jPanel4);

        jPanel5.setLayout(null);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel5.add(jLabel26);
        jLabel26.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("OCUPACION ACTUAL", jPanel5);

        jPanel7.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(173, 107, 60, 19);

        jButtonPorNombre.setText("CONSULTAR");
        jButtonPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorNombreActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonPorNombre);
        jButtonPorNombre.setBounds(280, 190, 103, 25);
        jPanel7.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(251, 106, 285, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Habitacion:");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(300, 340, 79, 19);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Piso:");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(340, 370, 36, 19);
        jPanel7.add(jTextFieldHabit);
        jTextFieldHabit.setBounds(390, 340, 87, 22);
        jPanel7.add(jTextFieldPiso);
        jTextFieldPiso.setBounds(390, 370, 87, 22);

        jButtonPorNombre1.setText("LIMPIAR");
        jButtonPorNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorNombre1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonPorNombre1);
        jButtonPorNombre1.setBounds(410, 190, 79, 25);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel7.add(jLabel27);
        jLabel27.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("CONSULTAR POR NOMBRE", jPanel7);

        jPanel8.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel16.setText("Habitacion:");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(297, 138, 79, 19);

        jButtonPorHabitacion.setText("CONSULTAR");
        jButtonPorHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorHabitacionActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonPorHabitacion);
        jButtonPorHabitacion.setBounds(317, 207, 103, 25);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel17.setText("Huesped:");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(268, 281, 67, 19);
        jPanel8.add(jTextFieldHuesped);
        jTextFieldHuesped.setBounds(340, 280, 243, 22);
        jPanel8.add(jTextFieldHab);
        jTextFieldHab.setBounds(388, 137, 46, 22);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel8.add(jLabel28);
        jLabel28.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("CONSULTAR POR HABITACION", jPanel8);

        jPanel9.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel18.setText("Piso:");
        jPanel9.add(jLabel18);
        jLabel18.setBounds(321, 118, 36, 19);
        jPanel9.add(jSpinner2);
        jSpinner2.setBounds(396, 112, 40, 33);

        jButton1.setText("CONSULTAR");
        jPanel9.add(jButton1);
        jButton1.setBounds(321, 176, 103, 25);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Habitaciones Disponibles:");
        jPanel9.add(jLabel19);
        jLabel19.setBounds(280, 290, 183, 19);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Sencilla:");
        jPanel9.add(jLabel20);
        jLabel20.setBounds(320, 330, 59, 19);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Deluxe:");
        jPanel9.add(jLabel21);
        jLabel21.setBounds(330, 370, 52, 19);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel22.setText("Suits:");
        jPanel9.add(jLabel22);
        jLabel22.setBounds(340, 410, 39, 19);
        jPanel9.add(jTextField2);
        jTextField2.setBounds(390, 330, 39, 22);
        jPanel9.add(jTextField3);
        jTextField3.setBounds(390, 370, 39, 22);
        jPanel9.add(jTextField4);
        jTextField4.setBounds(390, 410, 39, 22);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel9.add(jLabel29);
        jLabel29.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("DISPONIBILIDAD POR PISO", jPanel9);

        jPanel10.setLayout(null);

        jTableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Habitacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableConsultas);

        jPanel10.add(jScrollPane2);
        jScrollPane2.setBounds(149, 73, 452, 402);

        jButtonHistoricoHuesped.setText("CONSULTAR");
        jButtonHistoricoHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonHistoricoHuespedMousePressed(evt);
            }
        });
        jButtonHistoricoHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistoricoHuespedActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonHistoricoHuesped);
        jButtonHistoricoHuesped.setBounds(325, 13, 103, 25);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel10.add(jLabel30);
        jLabel30.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("HISTORICO HUSPEDS", jPanel10);

        jPanel6.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Sencilla: $2000");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(40, 132, 108, 19);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Deluxe: $3200");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(47, 247, 101, 19);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Suit: $4500");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(68, 349, 80, 19);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Precios");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(327, 13, 79, 29);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Servicio a Cuarto: $300");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(439, 132, 165, 19);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setText("Servicio al Bar: $400");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(458, 189, 146, 19);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Servicio de Tintoreria: $150");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(420, 270, 193, 19);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Servicio de SPA: $1200");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(440, 310, 169, 19);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setText("Servicio de Niñera: $600");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(431, 349, 173, 19);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel14.setText("Habitaciones:");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(12, 61, 136, 26);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel15.setText("Servicios:");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(472, 61, 97, 26);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo coco6.png"))); // NOI18N
        jPanel6.add(jLabel31);
        jLabel31.setBounds(0, 0, 750, 510);

        jTabbedPane1.addTab("PRECIOS", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorNombreActionPerformed
        try {

            String query="select piso,noHab from usuarios where nombre = '"+this.jTextFieldNombre.getText().trim()+"'";
            PreparedStatement pstmt=conn.conn.prepareStatement(query);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                String s1=rs.getString(1);
                String s2=rs.getString(2);
                jTextFieldHabit.setText(s1);
                jTextFieldPiso.setText(s2);
            }
            else{
                JOptionPane.showMessageDialog(null,"huesped no registrado");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        


    }//GEN-LAST:event_jButtonPorNombreActionPerformed

    private void jButtonPorNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorNombre1ActionPerformed
        // TODO add your handling code here:
        this.jTextFieldNombre.setText("");
        this.jTextFieldPiso.setText("");
        this.jTextFieldHabit.setText("");
    }//GEN-LAST:event_jButtonPorNombre1ActionPerformed

    private void jButtonPorHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorHabitacionActionPerformed
        // TODO add your handling code here:
        try {

            String query="select nombre from usuarios where noHab = '"+this.jTextFieldHab.getText().trim()+"'";
            PreparedStatement pstmt=conn.conn.prepareStatement(query);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                String s1=rs.getString(1);
                jTextFieldHuesped.setText(s1);
            }
            else{
                JOptionPane.showMessageDialog(null,"Habitacion no ocupada");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonPorHabitacionActionPerformed

    private void jButtonHistoricoHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistoricoHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHistoricoHuespedActionPerformed

    private void jButtonHistoricoHuespedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHistoricoHuespedMousePressed
        // TODO add your handling code here:
        String query = "select * from usuarios ORDER BY nombre ASC";
        this.conn.Consult(query);
        int n = 0;
        try{
            this.conn.rs.last();//se posiciona en el ultimo de la tabla
            n = this.conn.rs.getRow();//regresa el numero actual del registro
            this.conn.rs.first();//se posiciona en el primer registro de la tabla
        }catch(Exception e){
           System.out.println("Error#1..."); 
        }
        
        if(n != 0){//hay datos
            Object datos[][] = new Object[n][2];
            for(int i=0 ; i<n ; i++){
                try{
                    datos[i][0] = this.conn.rs.getString(1);
                    datos[i][1] = this.conn.rs.getInt(5);
                    this.conn.rs.next();//avanza al siguiente registro
                }catch(Exception e){
                    System.out.println("Error#2...");
                }
            }
            String columnas[] = {"Nombre del usuario","Numero de habitacion"};
            jTableConsultas.setModel(new DefaultTableModel(datos,columnas));
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos...");
        }
    }//GEN-LAST:event_jButtonHistoricoHuespedMousePressed


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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHistoricoHuesped;
    private javax.swing.JButton jButtonHistoricoIngresos;
    private javax.swing.JButton jButtonPorHabitacion;
    private javax.swing.JButton jButtonPorNombre;
    private javax.swing.JButton jButtonPorNombre1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableConsultas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldHab;
    private javax.swing.JTextField jTextFieldHabit;
    private javax.swing.JTextField jTextFieldHuesped;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPiso;
    // End of variables declaration//GEN-END:variables
}
