
package extencion3;
import java.util.Random;
import java.util.Scanner;

public class Extencion3 {

    
    public static void main(String[] args) {
        
        Random num = new Random();
        int numeros[][] = new int[6][5];
        int nume = 0;
        int sumafi[6][5] = 0;
        
        for (int i = 0; i < 4;i++)
        {
            for(int j = 0; j < 3;j++)
            {
                nume=num.nextInt(9);    
                numeros[i][j]=nume; 	
            }
        }
        
        for (int i = 0; i< 5;i++)
        {
            for(int j = 0; j < 4;j++)
            {
               
               System.out.print( numeros[i][j]+" ");	
               
            }
            System.out.println( );
        }
        
        
         for (int i = 0; i < numeros.length;i++)
        {
            for(int j = 0; j < numeros[i].length; j++)
            {
               sumafi  = sumafi + numeros [i][j];   
            }
            System.out.print(sumafi);  
            sumafi = 0;
            System.out.println ();  
        }
        

    }
    
}
