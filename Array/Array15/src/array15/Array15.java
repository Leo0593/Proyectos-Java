package array15;
import java.util.Scanner;
public class Array15 {
    public static void main(String[] args) {

         int[][] datos = new int [10][10];
         Scanner reader = new Scanner(System.in);
         int sumafi = 0;
         int sumaco = 0;
        for (int i = 0; i < datos.length;i++)
        {
            for(int j = 0; j < datos[i].length; j++)
            {
                datos [i][j] = j;
            } 
        }
        
        System.out.println ("\nEstos valores son los que escribio en la array\n");
        
        for (int i = 0; i < datos.length;i++)
        {
            for(int j = 0; j < datos[i].length; j++)
            {
               System.out.print( "{"+datos[i][j]+"}");   
            }
         System.out.println ();  
        }
        
        
        //suma de fila //
        System.out.println("\nLos resultados de las sumas de las filas es\n");  
         for (int i = 0; i < datos.length;i++)
        {
            for(int j = 0; j < datos[i].length; j++)
            {
               sumafi = sumafi + datos [i][j];   
            }
            System.out.print("La suma de la fila es: "+sumafi);  
            sumafi = 0;
            System.out.println ();  
        }
         
        // suma de columnas
        System.out.println("\nLos resultados de las sumas de las columnas es\n");  
         for (int i = 0; i < datos.length;i++)
            {
                for(int j = 0; j < datos[i].length; j++)
                {
                    sumaco = sumaco + datos [j][i];   
                }
                System.out.print("La suma de las columnas es: "+sumaco);  
                sumaco = 0;
                System.out.println ();  
            }
    }
    
}
