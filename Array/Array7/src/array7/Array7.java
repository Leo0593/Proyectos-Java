package array7;
import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        
        int origen [] = {10,25,26,40,37,45,90,76,78,81,58,32};
        int destino[] = new int [origen.length]; 
        int i;
        System.out.print("Valores de la array original \n");
        for (i = 0; i < destino.length ; i++)
        {
            destino[i] = origen [i];
            System.out.print( +destino[i]+"-");
        }
        
        System.out.println("\nLos valores superiores a 25 son:" );
        
        for (i = 0; i < destino.length ; i++)
        {
             if (destino[i]>25)
            {
                System.out.print(+destino[i]+"-");
                
            }
        }
        
    }
    
}
