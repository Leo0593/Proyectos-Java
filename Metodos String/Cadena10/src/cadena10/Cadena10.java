
package cadena10;

import java.util.Scanner;


public class Cadena10 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        System.out.println("INGRESA UNA FRASE");
        String texto = leer.nextLine();
        
        char letra = texto.charAt(0);
     
        for (int i = 1; i <texto.length();i++)
        {
               if(Character.isLetter(letra)){
                       cont++;
               }
        }
        System.out.println("LA FRASE QUE USTED INGRESO CONSTA DE "+cont+" PALABRAS");
    }
    
}
