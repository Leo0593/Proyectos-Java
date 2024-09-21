
package javaapplication21;

import java.util.Scanner;
public class JavaApplication21 {

    
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          
          int a = 0; 
          int i;
          int num;
          System.out.println("Ingresa un numero:");
          num = leer.nextInt();
          
          for (i=1; i<=num; i++)
          {
              if (num % i == 0)
              {
                a++;  
              }
          }
          if (a!=2){
            System.out.println("El numero no es primo");
          } else
          {
            System.out.println("El numero es primo");
          }
         }
         
}


