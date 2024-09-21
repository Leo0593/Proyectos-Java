package proyecto10;
import java.util.Scanner;
public class Proyecto10 {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1;
        int contador = 1;
        int mayor=0;
        while(contador<10)
        {
            System.out.println("Ingrese un valor: " );
            num1 = reader.nextInt();
            contador = contador + 1;
            
            if(num1>mayor)
            {
                mayor=num1;
            }
        }
         System.out.println("El numero mas grande es: " +mayor );
    }
    
}
