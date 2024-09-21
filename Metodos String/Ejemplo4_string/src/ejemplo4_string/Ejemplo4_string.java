
package ejemplo4_string;

import java.util.Arrays;
import java.util.Scanner;


public class Ejemplo4_string {



    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
        String oculta = "java";
        int i = 0;
        boolean correcto = false;
        String recolector [] = new String[] { "", "", "", "", "", ""};
         
        System.out.println("\t ADIVINA LA PALABRA");
        System.out.println("RECUERDA QUE LAS PALABRAS ERRONEAS SE IRAN GUARDANDO EN UN ORDEN RESPECTIVO");

        while((!correcto) && (i < recolector.length))
        {
          
            System.out.print("Ingrese la palabra: ");
            recolector[i] = scanner.next();
            
            int posicion = recolector[i].compareTo(oculta);
            
            if(posicion < 0)
            {
                System.out.println("La palabra ingresada esta despues");
            }
            else if(posicion > 0)
            {
               System.out.println("La palabra ingresada esta antes");
            }
            else
            {
                correcto = true;
            } 
            i++; 
        }
        
        Arrays.sort(recolector);
        
        System.out.println("Palabras en el array:");
        for (i=0; i < recolector.length; i++ ) 
        {
           System.out.println(recolector[i]);
        }
    }
}