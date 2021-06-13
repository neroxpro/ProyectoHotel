package clasesChekin;

import controlMySql.MySqlConn;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Altas {
    String nom,thab,origen;
    Date ingreso,salida;
    int piso,lp,total,pextras,nhab,dias,cu;
    MySqlConn conn;

    public Altas(String nom, String thab, String origen, Date ingreso, int piso, int lp, int total, int pextras, int nhab, int dias,int cu) {
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
        //calculando la salida
        Calendar obj = Calendar.getInstance();
        Date f = this.ingreso;
        obj.setTime(f);
        obj.add(Calendar.DAY_OF_YEAR, this.dias);
        this.salida = obj.getTime();
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
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        in = dFormat.format(ingreso);
        sa = dFormat.format(salida);
        
        String parte1 = "Insert into usuarios(nombre, cdOrigen, ingreso, salida, noHab, piso, tbHab, totper, perex,cuenta) VALUES (";
        String parte2 = "'"+nom+"','"+origen+"','"+in+"','"+sa+"','"+nhab+"','"+piso+"','"+thab+"','"+total+"','"+pextras+"','"+cu+"')";
        String query = parte1+parte2;
        
        int j = this.conn.Update(query);
    }
}
