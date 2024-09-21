
package cadena11;

import java.util.Scanner;


public class Cadena11 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabras = "";
        System.out.println("Ingrese una frase");
        String texto = leer.nextLine();
        String [] subtexto = texto.split(" ");
        
        for (int i = 0; i < subtexto.length; i++)
        {
            if(subtexto[i].length() % 2 == 0)
            {
                palabras = subtexto[i].substring(0,subtexto[i].length()/2 ) ;
            
            } else if (subtexto[i].length() % 2 == 1)
            {
                palabras = subtexto[i].substring(0,subtexto[i].length()/2 + 1 ) ; 
            }
            
            System.out.println(palabras);
        }
        
    }
    
}
