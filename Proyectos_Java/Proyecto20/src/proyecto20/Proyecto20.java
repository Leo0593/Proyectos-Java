package proyecto20;
import java.util.Scanner;
public class Proyecto20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.print("Ingrsa un valor: ");
        num = leer.nextInt();
        for (int i = 1; i <=num ; i++)
        {
            if (num % i == 0)
            {
                System.out.print("Estos numeros son divisores de tu numero: " +i+ "\n");
            }
        }
    }
    
}
