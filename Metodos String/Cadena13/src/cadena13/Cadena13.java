
package cadena13;

import java.util.Scanner;


public class Cadena13 {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("Ingrese una Frase");
         String texto = scanner.nextLine();
         String [] subtexto = texto.split(" ");
          for (int i = 0 ; i < subtexto.length; i++)
         {
            if (i % 2 == 1)
            {
                 System.out.print(subtexto[i]+" ");
            }
         }
    }
    
}
