package array2;

import java.util.Scanner;


public class Array2 {

   
    public static void main(String[] args) {
            

            int [] numero;
            numero = new int [20];
            int n1=0;
            
            for (int i = 0 ;i < numero.length; i++)
            {
               numero [i] = n1;
               n1 = n1+1;
               System.out.println(numero[i]);
            }       
    }
}
