
package ejemplo5_string;

import java.util.Scanner;


public class Ejemplo5_string {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una Frase");
        String texto = leer.nextLine();
        String [] subtexto = texto.split(" ");
        
        for (int i = 0 ; i < subtexto.length; i++)
        {
            System.out.println(subtexto[i]);
        }
    }
    
}
