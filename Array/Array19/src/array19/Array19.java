
package array19;

import java.util.Scanner;


public class Array19 {

    
    public static void main(String[] args) {
        int num [] = new int [3];
        Scanner reader = new Scanner(System.in);
        int mayor = 0;
        for (int i = 0; i<num.length;i++)
        {
            int pos = i;
            System.out.println("Ingresa un valor "+pos);
            num [i] = reader.nextInt();  
        }
        
        for (int i = 0; i<num.length;i++)
        {
            if (num [i] > mayor)
          {
              mayor = num [i];
          }
        }
        
        System.out.println("El numero mayor es: "+mayor);

          
    }
    
}
