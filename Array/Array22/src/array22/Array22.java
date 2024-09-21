package array22;

import java.util.Scanner;


public class Array22 {

  
    public static void main(String[] args) {
        
        int[] secuen = new int [10];
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        do
        {
                System.out.print("Ingresa un valor: ");
                secuen[i] = reader.nextInt();
                if (secuen[i] > 0)
                {
                    suma = suma + secuen[i]; 
                }  
        }while (secuen[i] > 0);
        
        System.out.print("La suma de los valores ingresados es: "+suma);

    }
    
}
