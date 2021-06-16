/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesChekin;

/**
 *
 * @author Ragna
 */
public class Habitacion {
    int numero;
    int piso;
    int ocupacion;
    String tipo;

    public Habitacion(int numero, int piso, int ocupacion, String tipo) {
        this.numero = numero;
        this.piso = piso;
        this.ocupacion = ocupacion;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public String getTipo() {
        return tipo;
    }
    
}
