package array4;
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        
         int tabla [] = new int[5];
         Scanner reader = new Scanner(System.in);
         int numero;
         int cont=0;
         for (int i = 0; i<tabla.length;i++)
         {
             System.out.println ("Ingresa un valor: ");
             tabla [i] = reader.nextInt();
             
         }
         
          for (int i = 0; i<tabla.length;i++)
         {
            if (tabla [i] > 0)
            {
                if (tabla [i] % 2 == 0)
                {
                    cont++;
                }
            }      
         }
        System.out.println ("Totla de numero postivos y pares son: "+cont);
    }   
}
