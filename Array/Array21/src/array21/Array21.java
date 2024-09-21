
package array21;

import java.util.Scanner;


public class Array21 {

   
    public static void main(String[] args) {
        
        int [] num = new int [30];
        int suma = 0;
        for (int i =0; i<num.length;i++)
        {
            num[i] = i;
            suma = suma + i;
            System.out.println(""+ num[i]);
            
        }
        System.out.println("La suma de todos los numeros es: "+ suma);
    }
    
}
