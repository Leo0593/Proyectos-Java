package ejemplo1_string;

import java.util.Scanner;

public class Ejemplo1_String {

    public static void main(String[] args) {
        
        
       Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE UNA FRASE CUALQUIERA:");
        String texto = leer.nextLine();

       

        System.out.println("EL TEXTO INVERTIDO ES:");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
        
        
    }
    
}
