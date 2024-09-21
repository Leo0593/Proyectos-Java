package pkg1.proyecto_poo;
import java.util.Scanner;

public class Proyecto_POO {


    public static void main(String[] args) {
        ClaseA a = new ClaseA();
        ClaseA b = new ClaseA(20);
        ClaseA c = new ClaseA(20, 40);
        System.out.println("La clse contiene: "+a.getValorPrimari()+" , "+a.getValorSecundari());
        System.out.println("La clse contiene: "+b.getValorPrimari()+" , "+a.getValorSecundari());
        System.out.println("La clse contiene: "+c.getValorPrimari()+" , "+c.getValorSecundari());
    } 
}
