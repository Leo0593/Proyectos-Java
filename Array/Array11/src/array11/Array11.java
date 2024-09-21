package array11;
import java.util.Scanner;
public class Array11 {

    public static void main(String[] args) {
        
         float numeros [] = new float [5];
         Scanner leer = new Scanner(System.in);
         
         int i;
         float pos = numeros [0];
         float numeromayor = numeros [0]  ;
         
         for( i=0;i<numeros.length;i++)
         {
             System.out.print("Ingresa un valor: ");
             numeros[i] = leer.nextFloat();
         }
         
         for( i=0;i<numeros.length;i++)
         {
             pos=i;
             System.out.println("El valor de la componenete "+pos+": "+numeros[i]);
             
         }
         
         for( i=0;i<numeros.length;i++)
         {   
                if(numeros[i] > numeromayor)
                { 
                    pos = i;
                    numeromayor = numeros[i];  
                    
                }
         }
        System.out.println("El numero mas grande es: "+numeromayor+ " y esta en la posicio "+pos);  
    }
    
}
