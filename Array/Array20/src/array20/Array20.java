
package array20;

import java.util.Scanner;


public class Array20 {

    
    public static void main(String[] args) {
        
        int [] num = new int [1];
        Scanner reader = new Scanner(System.in);
        int mult =0;
        
        System.out.println("INGRESE EL NUMERO QUE DESEA SABER SU TABLA DE MULTIPLICAR");
        for (int i=0; i < num.length ; i++)
        {
            num [i]= reader.nextInt();
            System.out.println("La tabla de multiplicar del "+num [i]+" es:");
            for (int j = 1; j < 11; j++)
            {
               mult = num [i] * j;
               
               System.out.println(+num [i]+"*" +j+ "=" +mult);
            }
        }
        
    }
    
}
