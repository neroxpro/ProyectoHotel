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
    int p;
    
    
    /**
     * Creates new form Mapa2
     */
    public Mapa2(int p) {
        initComponents();
        this.p = p;
        this.jRadioButton1.setOpaque(true);
        this.jRadioButton2.setOpaque(true);
        this.jRadioButton3.setOpaque(true);
        this.jRadioButton4.setOpaque(true);
        this.jRadioButton5.setOpaque(true);
        this.jRadioButton6.setOpaque(true);
        this.jRadioButton7.setOpaque(true);
        this.jRadioButton8.setOpaque(true);
        this.jRadioButton9.setOpaque(true);
        this.jRadioButton11.setOpaque(true);
        this.jRadioButton10.setOpaque(true);
        this.jRadioButton12.setOpaque(true);
        this.jRadioButton13.setOpaque(true);
        this.jRadioButton14.setOpaque(true);
        this.jRadioButton15.setOpaque(true);
        
     //  if (p == 1)
    //   {
           piso1(p,"sencilla");
  //     } else {
   //        piso2("sencillo");
   //    }
        
    }
    
    public List<Habitacion> cargaHabitaciones(int npiso){
        List <Habitacion> lista = new ArrayList<>();
        String query="Select * from habitaciones where piso="+npiso;
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
    
    public void piso1(int piso, String tipo){
        habitaciones = cargaHabitaciones(piso);

        this.jRadioButton1.setText(String.valueOf(habitaciones.get(0).getNumero()));
        this.jRadioButton2.setText(String.valueOf(habitaciones.get(1).getNumero()));
        this.jRadioButton3.setText(String.valueOf(habitaciones.get(2).getNumero()));
        this.jRadioButton4.setText(String.valueOf(habitaciones.get(3).getNumero()));
        this.jRadioButton5.setText(String.valueOf(habitaciones.get(4).getNumero()));
        this.jRadioButton6.setText(String.valueOf(habitaciones.get(5).getNumero()));
        this.jRadioButton7.setText(String.valueOf(habitaciones.get(6).getNumero()));
        this.jRadioButton8.setText(String.valueOf(habitaciones.get(7).getNumero()));
        this.jRadioButton9.setText(String.valueOf(habitaciones.get(8).getNumero()));
        this.jRadioButton10.setText(String.valueOf(habitaciones.get(9).getNumero()));
        this.jRadioButton11.setText(String.valueOf(habitaciones.get(10).getNumero()));
        this.jRadioButton12.setText(String.valueOf(habitaciones.get(11).getNumero()));
        this.jRadioButton13.setText(String.valueOf(habitaciones.get(12).getNumero()));
        this.jRadioButton14.setText(String.valueOf(habitaciones.get(13).getNumero()));
        this.jRadioButton15.setText(String.valueOf(habitaciones.get(14).getNumero()));

        if(tipo.equalsIgnoreCase("sencilla")){
            if(habitaciones.get(0).ocupacion!=1){
                
                this.jRadioButton1.setBackground(Color.orange);
            } else {
                this.jRadioButton1.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton1.setEnabled(false);
            }
            if(habitaciones.get(1).ocupacion!=1){
                this.jRadioButton2.setBackground(Color.orange);
            }else {
                this.jRadioButton2.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton2.setEnabled(false);
            }
            if(habitaciones.get(2).ocupacion!=1){
                this.jRadioButton3.setBackground(Color.orange);
            }else {
                this.jRadioButton3.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton3.setEnabled(false);
            }
            if(habitaciones.get(3).ocupacion!=1){
                this.jRadioButton4.setBackground(Color.orange);
            }else {
                this.jRadioButton4.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton4.setEnabled(false);
            }
            if(habitaciones.get(4).ocupacion!=1){
                this.jRadioButton5.setBackground(Color.orange);
            }else {
                this.jRadioButton5.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton5.setEnabled(false);
            }
            if(habitaciones.get(5).ocupacion!=1){
                this.jRadioButton6.setBackground(Color.orange);
            }else {
                this.jRadioButton6.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton6.setEnabled(false);
            }
            if(habitaciones.get(6).ocupacion!=1){
                this.jRadioButton7.setBackground(Color.orange);
            }else {
                this.jRadioButton7.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton7.setEnabled(false);
            }
            if(habitaciones.get(7).ocupacion!=1){
                this.jRadioButton8.setBackground(Color.orange);
            }else {
                this.jRadioButton8.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton8.setEnabled(false);
            }
            if(habitaciones.get(8).ocupacion!=1){
                this.jRadioButton9.setBackground(Color.orange);
            }else {
                this.jRadioButton9.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton9.setEnabled(false);
            }
            if(habitaciones.get(9).ocupacion!=1){
                this.jRadioButton10.setBackground(Color.orange);
            } else {
                this.jRadioButton10.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton10.setEnabled(false);
            }
            this.jRadioButton11.setBackground(Color.cyan);
            this.jRadioButton12.setBackground(Color.cyan);
            this.jRadioButton13.setBackground(Color.cyan);
            this.jRadioButton14.setBackground(Color.cyan);
            this.jRadioButton15.setBackground(Color.yellow);

        }else if (tipo.equalsIgnoreCase("deluxe")){
            this.jRadioButton1.setBackground(Color.orange);
            this.jRadioButton2.setBackground(Color.orange);
            this.jRadioButton3.setBackground(Color.orange);
            this.jRadioButton4.setBackground(Color.orange);
            this.jRadioButton5.setBackground(Color.orange);
            this.jRadioButton6.setBackground(Color.orange);
            this.jRadioButton7.setBackground(Color.orange);
            this.jRadioButton8.setBackground(Color.orange);
            this.jRadioButton9.setBackground(Color.orange);
            this.jRadioButton10.setBackground(Color.orange);

            

            
            if(habitaciones.get(10).ocupacion!=1){
//                this.jLabel11.setBackground(Color.cyan);
                this.jRadioButton11.setBackground(Color.cyan);
            }else {
                this.jRadioButton11.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton11.setEnabled(false);
            }
            if(habitaciones.get(11).ocupacion!=1){
//                this.jLabel12.setBackground(Color.cyan);
                this.jRadioButton12.setBackground(Color.cyan);
            }else {
                this.jRadioButton12.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton12.setEnabled(false);
            }
            if(habitaciones.get(12).ocupacion!=1){
//                this.jLabel13.setBackground(Color.cyan);
                this.jRadioButton13.setBackground(Color.cyan);
            }else {
                this.jRadioButton13.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton13.setEnabled(false);
            }
            if(habitaciones.get(13).ocupacion!=1){
//                this.jLabel14.setBackground(Color.cyan);
                this.jRadioButton14.setBackground(Color.cyan);
            }else {
                this.jRadioButton14.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton14.setEnabled(false);
            }
            
//            this.jLabel15.setBackground(Color.yellow);
            this.jRadioButton15.setBackground(Color.yellow);
        }else{
            this.jRadioButton1.setBackground(Color.orange);
            this.jRadioButton2.setBackground(Color.orange);
            this.jRadioButton3.setBackground(Color.orange);
            this.jRadioButton4.setBackground(Color.orange);
            this.jRadioButton5.setBackground(Color.orange);
            this.jRadioButton6.setBackground(Color.orange);
            this.jRadioButton7.setBackground(Color.orange);
            this.jRadioButton8.setBackground(Color.orange);
            this.jRadioButton9.setBackground(Color.orange);
            this.jRadioButton10.setBackground(Color.orange);
            this.jRadioButton11.setBackground(Color.cyan);
            this.jRadioButton12.setBackground(Color.cyan);
            this.jRadioButton13.setBackground(Color.cyan);
            this.jRadioButton14.setBackground(Color.cyan);

            
            if(habitaciones.get(14).ocupacion!=1){
//                this.jLabel15.setBackground(Color.yellow);
                this.jRadioButton15.setBackground(Color.yellow);
            }  else {
                this.jRadioButton15.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton15.setEnabled(false);
            }
        }
    }
    
    public void piso2(String tipo){
        this.jRadioButton1.setText(String.valueOf(habitaciones.get(15).getNumero()));
        this.jRadioButton2.setText(String.valueOf(habitaciones.get(16).getNumero()));
        this.jRadioButton3.setText(String.valueOf(habitaciones.get(17).getNumero()));
        this.jRadioButton4.setText(String.valueOf(habitaciones.get(18).getNumero()));
        this.jRadioButton5.setText(String.valueOf(habitaciones.get(19).getNumero()));
        this.jRadioButton6.setText(String.valueOf(habitaciones.get(20).getNumero()));
        this.jRadioButton7.setText(String.valueOf(habitaciones.get(21).getNumero()));
        this.jRadioButton8.setText(String.valueOf(habitaciones.get(22).getNumero()));
        this.jRadioButton9.setText(String.valueOf(habitaciones.get(23).getNumero()));
        this.jRadioButton10.setText(String.valueOf(habitaciones.get(24).getNumero()));
        this.jRadioButton11.setText(String.valueOf(habitaciones.get(25).getNumero()));
        this.jRadioButton12.setText(String.valueOf(habitaciones.get(26).getNumero()));
        this.jRadioButton13.setText(String.valueOf(habitaciones.get(27).getNumero()));
        this.jRadioButton14.setText(String.valueOf(habitaciones.get(28).getNumero()));
        this.jRadioButton15.setText(String.valueOf(habitaciones.get(29).getNumero()));

        if(tipo.equalsIgnoreCase("sencilla")){
            if(habitaciones.get(15).ocupacion!=1){
                this.jRadioButton1.setBackground(Color.orange);
            } else {
                this.jRadioButton1.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton1.setEnabled(false);
            }
            if(habitaciones.get(16).ocupacion!=1){

                this.jRadioButton2.setBackground(Color.orange);
            } else {
                this.jRadioButton2.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton2.setEnabled(false);
            }
            if(habitaciones.get(17).ocupacion!=1){

                this.jRadioButton3.setBackground(Color.orange);
            } else {
                this.jRadioButton3.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton3.setEnabled(false);
            }
            if(habitaciones.get(18).ocupacion!=1){

                this.jRadioButton4.setBackground(Color.orange);
            } else {
                this.jRadioButton4.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton4.setEnabled(false);
            }
            this.jRadioButton5.setBackground(Color.cyan);
            this.jRadioButton6.setBackground(Color.cyan);
            this.jRadioButton7.setBackground(Color.cyan);
            this.jRadioButton8.setBackground(Color.cyan);
            this.jRadioButton9.setBackground(Color.cyan);
            this.jRadioButton10.setBackground(Color.cyan);
            this.jRadioButton12.setBackground(Color.cyan);
            this.jRadioButton11.setBackground(Color.yellow);
            this.jRadioButton13.setBackground(Color.yellow);
            this.jRadioButton14.setBackground(Color.yellow);
            this.jRadioButton15.setBackground(Color.yellow);

            
        }else if (tipo.equalsIgnoreCase("deluxe")){
            this.jRadioButton1.setBackground(Color.orange);
            this.jRadioButton2.setBackground(Color.orange);
            this.jRadioButton3.setBackground(Color.orange);
            this.jRadioButton4.setBackground(Color.orange);

            
            if(habitaciones.get(19).ocupacion!=1){
                this.jRadioButton5.setBackground(Color.cyan);
            }else {
                this.jRadioButton5.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton5.setEnabled(false);
            }
            if(habitaciones.get(20).ocupacion!=1){
                this.jRadioButton6.setBackground(Color.cyan);
            }else {
                this.jRadioButton6.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton6.setEnabled(false);
            }
            if(habitaciones.get(21).ocupacion!=1){
                this.jRadioButton7.setBackground(Color.cyan);
            }else {
                this.jRadioButton7.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton7.setEnabled(false);
            }
            if(habitaciones.get(22).ocupacion!=1){
                this.jRadioButton8.setBackground(Color.cyan);
            }else {
                this.jRadioButton8.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton8.setEnabled(false);
            }
            if(habitaciones.get(23).ocupacion!=1){
                this.jRadioButton9.setBackground(Color.cyan);
            }else {
                this.jRadioButton9.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton9.setEnabled(false);
            }
            if(habitaciones.get(24).ocupacion!=1){
                this.jRadioButton10.setBackground(Color.cyan);
            }else {
                this.jRadioButton10.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton10.setEnabled(false);
            }
            
            if(habitaciones.get(25).ocupacion!=1){
                this.jRadioButton12.setBackground(Color.cyan);
            }else {
                this.jRadioButton12.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton12.setEnabled(false);
            }
            this.jRadioButton11.setBackground(Color.yellow);
            this.jRadioButton13.setBackground(Color.yellow);
            this.jRadioButton14.setBackground(Color.yellow);
            this.jRadioButton15.setBackground(Color.yellow);

        }else{
            this.jRadioButton1.setBackground(Color.orange);
            this.jRadioButton2.setBackground(Color.orange);
            this.jRadioButton3.setBackground(Color.orange);
            this.jRadioButton4.setBackground(Color.orange);

            this.jRadioButton5.setBackground(Color.cyan);
            this.jRadioButton6.setBackground(Color.cyan);
            this.jRadioButton7.setBackground(Color.cyan);
            this.jRadioButton8.setBackground(Color.cyan);
            this.jRadioButton9.setBackground(Color.cyan);
            this.jRadioButton10.setBackground(Color.cyan);
            this.jRadioButton12.setBackground(Color.cyan);

            
            if(habitaciones.get(26).ocupacion!=1){
                this.jRadioButton11.setBackground(Color.yellow);
            } else {
                this.jRadioButton11.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton11.setEnabled(false);
            }
            if(habitaciones.get(27).ocupacion!=1){
                this.jRadioButton13.setBackground(Color.yellow);
            } else {
                this.jRadioButton13.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton13.setEnabled(false);
            }
            if(habitaciones.get(28).ocupacion!=1){
                this.jRadioButton14.setBackground(Color.yellow);
            } else {
                this.jRadioButton14.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton14.setEnabled(false);
            }
            if(habitaciones.get(29).ocupacion!=1){
                this.jRadioButton15.setBackground(Color.yellow);
            }  else {
                this.jRadioButton15.setBackground(Color.LIGHT_GRAY);
                this.jRadioButton15.setEnabled(false);
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("jRadioButton10");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("jRadioButton6");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton7");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton8");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("jRadioButton9");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setText("jRadioButton11");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setText("jRadioButton12");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setText("jRadioButton13");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setText("jRadioButton14");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton15);
        jRadioButton15.setText("jRadioButton15");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton8)
                        .addGap(6, 6, 6))
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jRadioButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton15)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        if(p==1){
        this.selecc = 101;
        }else{
            this.selecc=201;
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(p==1){
        this.selecc = 103;
        }else{
            this.selecc=203;
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(p==1){
        this.selecc = 102;
        }else{
            this.selecc=202;
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(p==1){
        this.selecc = 104;
        }else{
            this.selecc=204;
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if(p==1){
        this.selecc = 105;
        }else{
            this.selecc=205;
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        if(p==1){
        this.selecc = 106;
        }else{
            this.selecc=206;
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        if(p==1){
        this.selecc = 107;
        }else{
            this.selecc=207;
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        if(p==1){
        this.selecc = 108;
        }else{
            this.selecc=208;
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        if(p==1){
        this.selecc = 109;
        }else{
            this.selecc=209;
        }
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        if(p==1){
        this.selecc = 110;
        }else{
            this.selecc=210;
        }
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        if(p==1){
        this.selecc = 111;
        }else{
            this.selecc=211;
        }
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
       if(p==1){
        this.selecc = 112;
        }else{
            this.selecc=212;
        }
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
       if(p==1){
        this.selecc = 113;
        }else{
            this.selecc=213;
        }
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        if(p==1){
        this.selecc = 114;
        }else{
            this.selecc=214;
        }
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        if(p==1){
        this.selecc = 115;
        }else{
            this.selecc=215;
        }
    }//GEN-LAST:event_jRadioButton15ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
