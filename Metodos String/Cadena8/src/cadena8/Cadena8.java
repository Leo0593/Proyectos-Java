package cadena8;

import java.util.Scanner;

public class Cadena8 {

   
    public static void main(String[] args) {

       
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESA UNA FRASE");
        String texto = leer.nextLine();
        System.out.println("INGRESA LA LETRA QUE LE GUSTARIA TRANSFORMAR");
        String mayus = leer.nextLine();

        char caracter = mayus.charAt(0);
        
         String respuesta = null;
         
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                
                String fin = mayus.toUpperCase();
                respuesta = texto.replace(mayus, fin);
            }
        }
        
        System.out.println(respuesta);

    }
}


