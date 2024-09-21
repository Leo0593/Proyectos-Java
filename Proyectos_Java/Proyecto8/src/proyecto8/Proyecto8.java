package proyecto8;
import java.util.Scanner;
public class Proyecto8 {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;
        int i;
        int producto =0;
        System.out.println("Ingresa tu valor 1");
        num1 = reader.nextInt();
        System.out.println("Ingresa tu valor 2");
        num2 = reader.nextInt();
        for (i=1; i<=num2;i++)
        {
         producto = producto + num1; 
         
        }
         System.out.println("El producto de la suma procesiva es: " +producto);   
    }
    
}
