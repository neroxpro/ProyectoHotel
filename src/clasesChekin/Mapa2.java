/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesChekin;

import controlMySql.MySqlConn;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author Ragna
 */
public class Mapa2 extends javax.swing.JPanel {
    List<Habitacion> habitaciones;
    MySqlConn objConn=new  MySqlConn();
    public int selecc = -1;
    /**
     * Creates new form Mapa2
     */
    public Mapa2() {
        initComponents();
        this.jRadioButton1.setOpaque(true);
        this.jRadioButton10.setOpaque(true);
        habitaciones = cargaHabitaciones();
        piso1("sencilla");
        
    }
    
    public List<Habitacion> cargaHabitaciones(){
        List <Habitacion> lista = new ArrayList<>();
        String query="Select * from habitaciones";
        objConn.execQuery(query);
        try{
            while (objConn.rs.next()){
                int numero = objConn.rs.getInt(1);
                System.out.println("numero : " + numero);
                int piso =  objConn.rs.getInt(2);
                int ocupacion =  objConn.rs.getInt(3);
                String tipo = objConn.rs.getString(4);
                lista.add(new Habitacion(numero, piso, ocupacion, tipo));
            }
        }
        catch (SQLException e) {
        }
        objConn.closeRsStmt();
        objConn.closeConnection();
        return lista; 
    }
    
    public void piso1(String tipo){
        jLabel2.setOpaque(true);
        this.jLabel2.setBackground(Color.LIGHT_GRAY);
        this.jLabel2.setForeground(Color.WHITE);
        
        this.jLabel1.setText(String.valueOf(habitaciones.get(0).getNumero()));
        this.jLabel2.setText(String.valueOf(habitaciones.get(1).getNumero()));
        this.jRadioButton1.setText(String.valueOf(habitaciones.get(0).getNumero()));
        this.jRadioButton2.setText(String.valueOf(habitaciones.get(1).getNumero()));
        this.jRadioButton3.setText(String.valueOf(habitaciones.get(2).getNumero()));
        this.jLabel3.setText("3");
        this.jLabel4.setText("4");
        this.jLabel5.setText("5");
        this.jLabel6.setText("6");
        this.jLabel7.setText("7");
        this.jLabel8.setText("8");
        this.jLabel9.setText("9");
        this.jLabel10.setText("10");
        this.jRadioButton10.setText(String.valueOf(habitaciones.get(9).getNumero()));
        this.jLabel11.setText("11");
        this.jLabel12.setText("12");
        this.jLabel13.setText("13");
        this.jLabel14.setText("14");
        this.jLabel15.setText("15");
        if(tipo.equalsIgnoreCase("sencilla")){
            if(habitaciones.get(0).ocupacion!=1){
                jLabel1.setOpaque(true);
                this.jLabel1.setBackground(Color.ORANGE);
                this.jRadioButton1.setBackground(Color.GREEN);
            } else {
                this.jRadioButton1.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton1.setEnabled(false);
            }
            if(!des(2)){
                
                this.jLabel2.setBackground(Color.ORANGE);
            }
            if(!des(3)){
                this.jLabel3.setBackground(Color.ORANGE);
            }
            if(!des(4)){
                this.jLabel4.setBackground(Color.ORANGE);
            }
            if(!des(5)){
                this.jLabel5.setBackground(Color.ORANGE);
            }
            if(!des(6)){
                this.jLabel6.setBackground(Color.ORANGE);
            }
            if(!des(7)){
                this.jLabel7.setBackground(Color.ORANGE);
            }
            if(!des(8)){
                this.jLabel8.setBackground(Color.ORANGE);
            }
            if(!des(9)){
                this.jLabel9.setBackground(Color.ORANGE);
            }
            if(habitaciones.get(9).ocupacion!=1){
                this.jRadioButton10.setBackground(Color.GREEN);
                this.jLabel10.setBackground(Color.ORANGE);
            } else {
                this.jRadioButton10.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton10.setEnabled(false);
            }
            this.jLabel11.setBackground(Color.cyan);
            this.jLabel12.setBackground(Color.cyan);
            this.jLabel13.setBackground(Color.cyan);
            this.jLabel14.setBackground(Color.cyan);
            this.jLabel15.setBackground(Color.yellow);
        }else if (tipo == "deluxe"){
            this.jLabel1.setBackground(Color.ORANGE);
            this.jLabel2.setBackground(Color.ORANGE);
            this.jLabel3.setBackground(Color.ORANGE);
            this.jLabel4.setBackground(Color.ORANGE);
            this.jLabel5.setBackground(Color.ORANGE);
            this.jLabel6.setBackground(Color.ORANGE);
            this.jLabel7.setBackground(Color.ORANGE);
            this.jLabel8.setBackground(Color.ORANGE);
            this.jLabel9.setBackground(Color.ORANGE);
            this.jLabel10.setBackground(Color.ORANGE);
            
            if(!des(11)){
                this.jLabel11.setBackground(Color.cyan);
            }
            if(!des(12)){
                this.jLabel12.setBackground(Color.cyan);
            }
            if(!des(13)){
                this.jLabel13.setBackground(Color.cyan);
            }
            if(!des(14)){
                this.jLabel14.setBackground(Color.cyan);
            }
            
            this.jLabel15.setBackground(Color.yellow);
        }else{
            this.jLabel1.setBackground(Color.ORANGE);
            this.jLabel2.setBackground(Color.ORANGE);
            this.jLabel3.setBackground(Color.ORANGE);
            this.jLabel4.setBackground(Color.ORANGE);
            this.jLabel5.setBackground(Color.ORANGE);
            this.jLabel6.setBackground(Color.ORANGE);
            this.jLabel7.setBackground(Color.ORANGE);
            this.jLabel8.setBackground(Color.ORANGE);
            this.jLabel9.setBackground(Color.ORANGE);
            this.jLabel10.setBackground(Color.ORANGE);
            
            
            this.jLabel11.setBackground(Color.cyan);
            this.jLabel12.setBackground(Color.cyan);
            this.jLabel13.setBackground(Color.cyan);
            this.jLabel14.setBackground(Color.cyan);
            
            if(!des(15)){
                this.jLabel15.setBackground(Color.yellow);
            }  
        }
    }
    
    public void piso2(String tipo){
        this.jLabel1.setText("16");
        this.jLabel2.setText("17");
        this.jLabel3.setText("18");
        this.jLabel4.setText("19");
        this.jLabel5.setText("20");
        this.jLabel6.setText("21");
        this.jLabel7.setText("22");
        this.jLabel8.setText("23");
        this.jLabel9.setText("24");
        this.jLabel10.setText("25");
        this.jLabel11.setText("26");
        this.jLabel12.setText("27");
        this.jLabel13.setText("28");
        this.jLabel14.setText("29");
        this.jLabel15.setText("30");
        if(tipo == "sencilla"){
            if(!des(16)){
                this.jLabel1.setBackground(Color.ORANGE);
            }
            if(!des(17)){
                this.jLabel2.setBackground(Color.ORANGE);
            }
            if(!des(18)){
                this.jLabel3.setBackground(Color.ORANGE);
            }
            if(!des(19)){
                this.jLabel4.setBackground(Color.ORANGE);
            }
            
            this.jLabel5.setBackground(Color.cyan);
            this.jLabel6.setBackground(Color.cyan);
            this.jLabel7.setBackground(Color.cyan);
            this.jLabel8.setBackground(Color.cyan);
            this.jLabel9.setBackground(Color.cyan);
            this.jLabel10.setBackground(Color.cyan);
            this.jLabel12.setBackground(Color.cyan);
            
            this.jLabel11.setBackground(Color.yellow);
            this.jLabel13.setBackground(Color.yellow);
            this.jLabel14.setBackground(Color.yellow);
            this.jLabel15.setBackground(Color.yellow);
            
        }else if (tipo == "deluxe"){
            this.jLabel1.setBackground(Color.ORANGE);
            this.jLabel2.setBackground(Color.ORANGE);
            this.jLabel3.setBackground(Color.ORANGE);
            this.jLabel4.setBackground(Color.ORANGE);
            
            if(!des(20)){
                this.jLabel5.setBackground(Color.cyan);
            }
            if(!des(21)){
                this.jLabel6.setBackground(Color.cyan);
            }
            if(!des(22)){
                this.jLabel7.setBackground(Color.cyan);
            }
            if(!des(23)){
                this.jLabel8.setBackground(Color.cyan);
            }
            if(!des(24)){
                this.jLabel9.setBackground(Color.cyan);
            }
            if(!des(25)){
                this.jLabel10.setBackground(Color.cyan);
            }
            
            if(!des(27)){
                this.jLabel12.setBackground(Color.cyan);
            }
            
            this.jLabel11.setBackground(Color.yellow);
            this.jLabel13.setBackground(Color.yellow);
            this.jLabel14.setBackground(Color.yellow);
            this.jLabel15.setBackground(Color.yellow);
        }else{
            this.jLabel1.setBackground(Color.ORANGE);
            this.jLabel2.setBackground(Color.ORANGE);
            this.jLabel3.setBackground(Color.ORANGE);
            this.jLabel4.setBackground(Color.ORANGE);
            
            this.jLabel5.setBackground(Color.cyan);
            this.jLabel6.setBackground(Color.cyan);
            this.jLabel7.setBackground(Color.cyan);
            this.jLabel8.setBackground(Color.cyan);
            this.jLabel9.setBackground(Color.cyan);
            this.jLabel10.setBackground(Color.cyan);
            this.jLabel12.setBackground(Color.cyan);
            
            if(!des(26)){
                this.jLabel11.setBackground(Color.yellow);
            } 
            if(!des(28)){
                this.jLabel13.setBackground(Color.yellow);
            } 
            if(!des(29)){
                this.jLabel14.setBackground(Color.yellow);
            } 
            if(!des(30)){
                this.jLabel15.setBackground(Color.yellow);
            }  
        }
    }
    
        public boolean des(int n){
        boolean r = true;
        int aux;
        //for(int i=0 ; i<desocupados.size() ; i++){
          //  aux = desocupados.get(i);
            //if (aux == n){
             //   r = false;
            //}
        //}
        return r;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel8");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("jLabel10");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel9");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("jLabel11");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("jLabel12");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel14");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("jLabel13");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("jLabel15");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton10.setText("jRadioButton10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(84, 84, 84))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jRadioButton10))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton2))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton3))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //this.jLabel1.setBorder(BorderFactory.createLineBorder(Color.black));
        //JOptionPane pane = getOptionPane((JComponent)evt.getSource());
        this.selecc =habitaciones.get(0).getNumero();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        this.selecc = 101;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        this.selecc = 103;
    }//GEN-LAST:event_jRadioButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
