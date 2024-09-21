package proyecto13;
import java.util.Scanner;

public class Proyecto13 {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         int num;
         double cont=0;
         double i;
         
         
         System.out.println("Ingrese un numero: ");
         num = reader.nextInt();
         
            for (i = 1; i<=num ; i++)
            {
              cont= Math.pow(i, 2) + cont;
            } 
            
             System.out.println("El resultado de la suma de "+num+ " al cuadrado es de: "+cont+ " y se a repetido: "+i );
             
    }
    
}

