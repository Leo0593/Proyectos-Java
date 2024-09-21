
package cadena7;

import java.util.Scanner;


public class Cadena7 {

    
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESA UNA PALABRA");
        
        String texto = leer.nextLine();
        texto = texto.toLowerCase();
        texto = texto.replace(" ", "");
        
        char [] letra = texto.toCharArray();
        int izqui = 0;
        int dere =letra.length - 1;
       
        while (izqui < dere)
        {
           
            if(letra[izqui] == letra[dere])
            {
                dere--;
                izqui++;
            }else
            {
              System.out.println("La palabra no es palindroma");
              break;
            }
        }
        
        if(izqui == dere)
        {
            System.out.println("La palabra '" +texto+ "' si es palindroma");
        }
       

        
    }
    
}
