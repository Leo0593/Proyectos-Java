
package proyecto26;
import java.util.Scanner;
public class Proyecto26 {

    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);   
        int n1;
        int n2;
        
        System.out.println("Ingresa tu primer valor");
        n1 = leer.nextInt();
        System.out.println("Ingresa tu primer valor");
        n2 = leer.nextInt();
        
        double mult = Math.pow(n1, n2);
        System.out.println("Ingresa tu primer valor: "+mult);

    }
    
}
