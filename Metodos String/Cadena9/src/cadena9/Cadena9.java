
package cadena9;

import java.util.Scanner;


public class Cadena9 {

  
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESA UNA FRASE");
        String texto = leer.nextLine();
        
        String respuesta = texto.replace(" ", "");
        
        System.out.println("SU TEXTO SIN ESPACIOS");
        System.out.println(respuesta);



    }
    
}
