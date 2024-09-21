package cadena15;
import java.util.Scanner;

public class Cadena15 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num = 0;
         System.out.println("Ingrese una cadena de numeros");
         String texto = scanner.nextLine();
         String [] subtexto = texto.split(",");
         
         for (int i =  subtexto.length - 1; i >= 0; i--)
         {
            num = num + Integer.parseInt(subtexto[i]);
         }
         
         System.out.println("La suma de los valores ingresados es: "+num);
         
    }
    
}
