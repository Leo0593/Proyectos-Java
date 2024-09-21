
package examen4a_2023_24;

import java.util.Scanner;
public class Examen4a_2023_24 {

    
    public static void main(String[] args) {
        
        //lEANDRO CALVIJO LOPEZ//
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int cont1 = 0;
        boolean iguales = false;
        System.out.println("ESCRIBE UNA LINEA DE TEXTO ");
        String text = leer.nextLine();
        
        System.out.println("ESCRIBE UNA LINEA DE TEXTO ");
        String text1 = leer.nextLine();
        
        
        for (int i = 0 ; i <text.length();i++)
        {
            char letra = text.charAt(i);       
            if(letra == 'm' || letra == 'M')
            {
               cont++;
            } 
        }
        
         for (int i = 0 ; i <text1.length();i++)
        {
 
            char letra1 =text1.charAt(i);
            if(letra1 == 'm' || letra1 == 'M')
            {
               cont1++;
            } 
        }
        
        if(text.equals (text1))
        {
           System.out.println("Los 2 textos son iguales");
        }
        else 
        {
            System.out.println("los textos no son iguales");
        }
        
        
        System.out.println("Tu primer texto tiene "+cont+" 'M'" );
        System.out.println("Tu primer texto tiene "+cont1+" 'M'" );
            

    }
    
}
