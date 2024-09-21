package proyecto5;
import java.util.Scanner;
public class Proyecto5 {

    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
         int num1;
         int num2;
         int suma;
         System.out.println("Ingresa tu primer valor impar: ");
         num1 = reader.nextInt();
         System.out.println("Ingresa tu segundo valor impar: ");
         num2 = reader.nextInt();
         if ((num1 % 2 != 0 ) && (num2 % 2 != 0 ))
         {
           if((num1>0)&&(num2>0))
           {
            suma=num1+num2;
            System.out.println("El resultado de la suma es: " +suma);
           }
           else
           {
             System.out.println("Un numero es negativo, porfavor ingresa valores validos");

           }          
         }
         else
         {
            System.out.println("Un numero es par, porfavor ingresa valores validos");

         }
         


     }
    
}
