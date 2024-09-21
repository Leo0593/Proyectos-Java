package extencion2;

import java.util.Random;
import java.util.Scanner;

public class Extencion2 {

    
    public static void main(String[] args) {
        
       Random num = new Random();
       Scanner lector = new Scanner(System.in);
       
       int dau=0;
       int i = 0;
       int numeros [] = new int[20];
      
        

       for(i = 0;i<numeros.length;i++)
       {
           dau=num.nextInt(99);    
           numeros[i]=dau; 		
       }
                       
       System.out.print(" Estos son los numeros primos de tu array: ");
       
       for(i = 1 ; i <numeros.length; i++)
       {
           if( numeros[i] % i == 0)
           {
              
                System.out.print( numeros[i]+" ");
           }
       }
       
        System.out.println();
    }  
    
}
