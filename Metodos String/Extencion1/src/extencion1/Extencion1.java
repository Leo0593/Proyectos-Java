
package extencion1;

import java.util.Scanner;


public class Extencion1 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String numeros [] = new String [5];
            
            int i = 0;
            int mayor = 0;
            int menor = 0;
            int posMAYOR = 0;
            int posMENOR = 0;
             
           
            
            for(i = 0; i < numeros.length;i++)
            {
                
                System.out.println("Ingresa un numero");
                numeros[i] = scanner.nextLine();
                
                if(Integer.parseInt(numeros[i]) > mayor)
                {
                    mayor = Integer.parseInt(numeros[i]);
                    posMAYOR = i;
                }
                
                
               if (Integer.parseInt(numeros[i]) < menor || i == 0) {
                menor = Integer.parseInt(numeros[i]);
                posMENOR = i;
            }
               
            }
        
         
           
            System.out.println("El numero mayor es: "+mayor+ " y la posicion es: "+posMAYOR);
            System.out.println("El numero mayor es: "+menor+ " y la posicion es: "+posMENOR);
    }
   }

