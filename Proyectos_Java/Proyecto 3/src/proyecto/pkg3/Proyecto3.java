package proyecto.pkg3;
import java.util.Scanner;
public class Proyecto3 {

    
    public static void main(String[] args) 
    {
        int num1;
        int contador = 1;
        Scanner reader = new Scanner(System.in);
        
       
        
        while (contador <= 5)
        {
           System.out.println("Ingresa una nota: " +contador );
           num1=reader.nextInt();
           contador = contador + 1 ;
       
         if (num1 % 3 == 0)
         {
          System.out.println( +num1+" Es multiplo de 3"  );
         }
        }
        
    }
    }
