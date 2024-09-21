
package array16;

import java.util.Scanner;


public class Array16 {

    
    public static void main(String[] args) {
        
        
        int[][] numeros = new int [3][3];
         Scanner reader = new Scanner(System.in);
       

       
                System.out.println ("Ingresa los valores dentro de la array");
                for (int i = 0; i < numeros.length;i++)
                {
                    for(int j = 0; j < numeros[i].length; j++)
                    {
                        numeros [i][j] = reader.nextInt();
                    } 
                }
                
                System.out.println ("\nLos valores ingresados son pares\n");
                
                for (int i = 0; i < numeros.length;i++)
                {
                    for(int j = 0; j < numeros[i].length; j++)
                    {
                        if ( numeros [i][j] %2 == 0)
                        {
                            System.out.print (+numeros [i][j]+" ");
                        }
                    } 
                }
                
                System.out.println ("\n\nLos valores ingresados son impares\n");
                
                for (int i = 0; i < numeros.length;i++)
                {
                    for(int j = 0; j < numeros[i].length; j++)
                    {
                        if ( numeros [i][j] % 2 == 1)
                        {
                            System.out.print (+numeros [i][j]+" ");
                        }
                    } 
                }
        
    }
    
}
