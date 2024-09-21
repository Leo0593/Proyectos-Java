package cadena3;

import java.util.Scanner;

public class Cadena3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase = "Mañana es sabado y voy a ir cenar con los amigos por la zona de marcha de Logroño";
        System.out.println(frase);
        
        
        int conta = 0;
        int conto = 0;
        int conte = 0;
        
        for(int i = 0; i < frase.length(); i++)
        {
            char letra = frase.charAt(i);
            
            if(letra == 'a')
            {
                conta++;
            }
            else if(letra == 'o')
            {
                conto++;
            }
            else if(letra == 'e')
            {
                conte++;
            }
        }
       //conteo de caracter a//
       if(conta <= 10)
       {
            System.out.println("El caracter 'a' aparece "+conta+" veces");
       }
       else 
       {
            System.out.println("Excesos de caracter 'a'");
       }
       //conteo de caracter e//
       if(conte <= 3)
       {
            System.out.println("El caracter 'e' aparece "+conte+" veces");
       }
       else 
       {
            System.out.println("Excesos de caracter 'e'");
       }
       //conteo de caracter o//
       if(conto <= 5)
       {
            System.out.println("El caracter 'o' aparece "+conto+" veces");
       }
       else 
       {
            System.out.println("Excesos de caracter 'o'");
       }
    }
    
}
