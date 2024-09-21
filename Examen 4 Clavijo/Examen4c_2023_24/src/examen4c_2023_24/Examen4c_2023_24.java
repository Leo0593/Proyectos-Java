
package examen4c_2023_24;

import java.util.Scanner;

public class Examen4c_2023_24 {

    
    public static void main(String[] args) {
         
        //LEANDRO CLAVIJO//
                    
           
         Scanner scanner = new Scanner(System.in);
         
         int num = 0;
         boolean fin = false;
         
         System.out.println("Ingrese una cadena de numeros");
         
        
         
         while (!fin)
         {
             String texto = scanner.next();
             if (Integer.parseInt(texto) == -1)
             {
                 fin = true;
             }
             else
             {
             String [] subtexto = texto.split(" ");
             for (int i =  subtexto.length - 1; i >= 0; i--)
             {
               num = num + Integer.parseInt(subtexto[i]);
             }
             }
             
         
         }
            System.out.println("La suma de los valores ingresados es: "+num);
         
    }

    }
    


