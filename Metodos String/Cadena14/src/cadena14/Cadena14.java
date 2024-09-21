
package cadena14;

import java.util.Scanner;

public class Cadena14 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean siguiente = false;

        String palabra = "";
        String ultimaPalabra = "";

        System.out.println("Ingrese palabras (escriba 'fin' para terminar):");

        while (!siguiente) 
        {
            palabra = scanner.next();

            if (palabra.equals("fin") || palabra.equals("FIN")  ) 
            {
                siguiente = true;
            }
          
            if (palabra.compareTo(ultimaPalabra) > 0) 
            {
                ultimaPalabra = palabra;
            }
        }
     
        System.out.println("Tu palabra en posicion lexicografica es: "+ultimaPalabra);
        
    }
}
