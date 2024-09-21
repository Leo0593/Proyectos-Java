
package cadena12;

import java.util.Scanner;


public class Cadena12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESA LA PRIMERA FRASE");
        String texto1 = leer.nextLine();
        System.out.println("INGRESA LA SEGUNDA FRASE");
        String texto2 = leer.nextLine();
        
        String texto3 = texto1 + texto2;
        System.out.println(texto3);

        
    }
    
}
