
package examen6a_2023_2024;

import java.util.Random;

public class Datos {
    private String nom_pais;
    private int temp_max;
    private int temp_min;

    public Datos(String nom_pais) {
        this.nom_pais = nom_pais;
    }

    public Datos(String nom_pais, int temp_max, int temp_min) {
        this.nom_pais = nom_pais;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
    }

    
    
   

    public String getNom_pais() {
        return nom_pais;
    }

    public int getTemp_max() {
        return temp_max;
    }

    public int getTemp_min() {
        return temp_min;
    }
    
 
    public String toString()
    {
        return "Nombre: " + nom_pais+"\n"+
                "Temperatura Maxima: "+temp_max+"\n"+
                "Temperatura Minima: "+temp_min+"\n";
    }
    
}
