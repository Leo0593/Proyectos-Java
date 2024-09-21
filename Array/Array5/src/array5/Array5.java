package array5;
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        int vector [] = new int[5];
        Scanner reader = new Scanner(System.in);
        int num;
        int num1;
        int i ;
        int sum = 0;
         for( i = 0; i < vector.length;i++)
         {
            System.out.println("Ingrese un numero: ");
            vector[i] = reader.nextInt();
         }
         
         System.out.println("Cuantos valores quiere sumar: ");
         num = reader.nextInt();
         
         for( i = 0; i < num; i++)
         {
            num1 = vector[i];
            sum+=num1;
         }
         System.out.println("Respuesta "+sum);
    }
}
