package proyecto_poo_2;

import java.util.Scanner;

public class Proyecto_POO_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Datos a = new Datos();
        
        System.out.println(a.getnombre());
        System.out.println(a.getautor());
        System.out.println(a.getduradaSegons());
        
        System.out.println("****************************************");
      
        a.setNombre("El milagro del barcelona");
        a.setAutor("Luis Guardilo");
        a.setDuradaSegons(1200);
        
        
        System.out.println(a.getnombre());
        System.out.println(a.getautor());
        System.out.println(a.getduradaSegons());
        
    }
    
}
