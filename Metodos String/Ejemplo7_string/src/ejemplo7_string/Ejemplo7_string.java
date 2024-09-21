package ejemplo7_string;
import java.util.Scanner;

public class Ejemplo7_string {

    public static void main(String[] args) {

         Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa un texto");
        String num1 = lector.nextLine().trim();
        System.out.println("Ingresa un texto");
        String num2 = lector.nextLine().trim();
        
        int numero1=Integer.parseInt(num1);
        int numero2=Integer.parseInt(num2);
        
        int total = numero1 / numero2;
        System.out.println("Tu respuesta es: "+total);

    }
}
