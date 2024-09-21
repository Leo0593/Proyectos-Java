
package examen3a;

import java.util.Scanner;


public class Examen3A {

   
    public static void main(String[] args) {
        
        int taula [] = new int[3];
         Scanner reader = new Scanner(System.in);
         int numero;
         int cont=0;
         int pos = 0;
         int num = 0;
         int i = 0;
         boolean corec = false;
         boolean corec1 = false;
         
         for (i = 0; i<taula.length;i++)
         {
             System.out.println ("Ingresa un valor: ");
             corec = reader.hasNextInt();
             if(corec)
             {
                 taula [i] = reader.nextInt();
             }
             else
             {
                 System.out.println ("Error");
                 reader.next();
             }
             reader.nextLine();
         }
         
         System.out.println ("Valores mas grandes que 25 y pares");
         
          for (i = 0; i<taula.length;i++)
         {
            if (taula [i] > 25)
            {
                if (taula [i] % 2 == 0)
                {
                    pos = i;
                    System.out.println ("Taula "+pos+"="+taula[i]);
                }
            }      
         }
          
          
        System.out.println ("Ingrese un valor a buscar: ");
             corec1 = reader.hasNextInt();
             if(corec1)
             {
                 num = reader.nextInt();
             }
             else
             {
                 System.out.println ("Error");
                 reader.next();
             }
             reader.nextLine();
             
         for (i = 0; i<taula.length;i++)
         {
            if (num == taula [i])
            {
                  cont++;
            }  
         }
         
        System.out.println ("el valor pedido se repite " +cont+ "veces");
       

        
    }
    
}
