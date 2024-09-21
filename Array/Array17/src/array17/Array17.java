package array17;
import java.util.Scanner;
public class Array17 {

    
    public static void main(String[] args) {
        
        
        int [] numero = new int [2];
        Scanner reader = new Scanner(System.in);
        int pos;
        int mult = 0;
        
        for (int i = 0 ;i<numero.length;i++)
        {
            pos=i;
            System.out.println("Ingresa un numero "+pos);
            numero[i] = reader.nextInt();
            
            mult = numero[0]* numero[1];
        }
    
        System.out.println("El producto de los 2 numeros es: "+mult);
    }
    
}
