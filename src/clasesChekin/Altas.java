package clasesChekin;

import controlMySql.MySqlConn;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Altas {
    String nom,thab,origen;
    LocalDate ingreso,salida;
    int piso,lp,total,pextras,nhab,dias,cu,costo,gastoEx;
    MySqlConn conn;

    public Altas(String nom, String thab, String origen, LocalDate ingreso, int piso, int lp, int total, int pextras, int nhab, int dias,int cu,int costo) {
        this.nom = nom;
        this.thab = thab;
        this.origen = origen;
        this.ingreso = ingreso;
        this.piso = piso;
        this.lp = lp;
        this.total = total;
        this.pextras = pextras;
        this.nhab = nhab;
        this.dias = dias;
        this.cu = cu;
        this.costo=costo;
        this.gastoEx=500*pextras;
        //calculando la salida
        salida = this.ingreso.plusDays(dias);
    }

    public boolean tipoDisponible(int n){
        if(n>0)
            return false;
        else
            return true;
    }
    
    public boolean ocupantes(){
        if(this.lp > this.total)
            return true;
        else
            return false;
    }
    
    public boolean extras(){
        if(this.pextras == 1 || this.pextras == 2)
            return true;
        else
            return false;
        
    }
    
    public void darAlta(MySqlConn conn){
        String in,sa;
        this.conn = conn;
        
//        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
 //       in = dFormat.format(ingreso);
  //      sa = dFormat.format(salida);
        
//        String parte1 = "Insert into usuarios(nombre, cdOrigen, ingreso, salida, noHab, piso, tbHab, totper, perex,cuenta) VALUES (";
//        String parte2 = "'"+nom+"','"+origen+"','"+in+"','"+sa+"','"+nhab+"','"+piso+"','"+thab+"','"+total+"','"+pextras+"','"+cu+"')";
//        String query = parte1+parte2;
        
        String usuarios1="insert into usuarios(nombre,cdOrigen) values(";
        String usuarios2="'"+nom+"','"+origen+"')";
        String query1=usuarios1+usuarios2;
        
//        String ocup1="insert into ocupaciones(noPersonas,persExtra,ingreso,salida,Ventas_id,usuarios_id,habitaciones_numero,empleados_id) values (";
//        String ocup2="idOcupaciones,"+total+","+pextras+",'"+ingreso+"','"+salida+"',last_insert_id(),last_insert_id(),"+nhab+"1)";
//        String query2=ocup1+ocup2;
        String ocup1="insert into ocupaciones(idOcupaciones, noPersonas,persExtra,ingreso,salida,Ventas_id,usuarios_id,habitaciones_numero,empleados_id) values (";
        String ocup2="idOcupaciones, "+total+","+pextras+",'"+ingreso+"','"+salida+"',last_insert_id(),last_insert_id()"+","+nhab+",1)";
        String query2=ocup1+ocup2;
        
        
        
        String hab="update habitaciones set ocupacion=1 where numero=" + nhab;
        String query3=hab;
        
        String vents="insert into ventas(cuenta,gastosExtras) values("+costo+","+gastoEx+")";
        String query4=vents;
        
        
        //String ocupaciones1="insert into ocupaciones(noPersonas,persExtra,ingreso,salida,
        
        int j = this.conn.Update(query1);
        
        int j2 = this.conn.Update(query3);
        int j3 = this.conn.Update(query4);
        
        int j1 = this.conn.Update(query2);
    }
}
