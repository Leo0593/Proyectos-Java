
package pkg3.proyecto_poo;

import java.util.Scanner;


public class Proyecto_POO {

   
    public static void main(String[] args) {
        
        
        Datos datos = new Datos(31, 12, 2004);
        
        System.out.println("Nueva fecha: " + datos.getDia() + "/" + datos.getMes() + "/" + datos.getAño());
        
        Datos datosa = new Datos (1,1,1);
        datosa.setDia(28);
        datosa.setMes(2);
        datosa.setAño(2003);
        System.out.println("Nueva fecha: " + datosa.getDia() + "/" + datosa.getMes() + "/" + datosa.getAño());


        
    }

        
}

