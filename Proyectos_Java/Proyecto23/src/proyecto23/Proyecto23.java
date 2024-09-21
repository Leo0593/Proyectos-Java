
package proyecto23;
import java.util.Scanner;
public class Proyecto23 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int n1;
        System.out.println("Ingresa un numero: ");
        n1 = leer.nextInt();
        for (int fac = 2;fac<=n1;fac++)
        {
            while(n1%fac==0)
            {
                System.out.println("Los factores tu numero son: "+fac);
                n1/=fac;
            }
        }
    

    }
}
    
    
