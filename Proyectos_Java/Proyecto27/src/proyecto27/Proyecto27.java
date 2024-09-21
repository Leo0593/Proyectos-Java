package proyecto27;
import java.util.Scanner;
public class Proyecto27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        float eur;
        float dol;
        float lib;
       
        System.out.println("Ingrese su valor en euros: ");
        eur=leer.nextFloat();
        
        dol = (float) (eur * 1.08) ;
        lib = (float) (eur * 0.87);
         
        System.out.println("Tines un valor de " +dol+ " dolares");
        System.out.println("Tines un valor de " +lib+ " libras esterlinas");
        
    }
    
}
