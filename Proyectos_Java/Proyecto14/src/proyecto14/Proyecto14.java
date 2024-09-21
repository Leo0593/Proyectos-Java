
package proyecto14;
import java.util.Scanner;
public class Proyecto14 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int num;
        
        for(num=1;num<51;num++)
        {
            num = num + 0;
            
            if(num%3==1)
            {
             System.out.println("estos numeros son menores de 50 y no divisble entre 3: "+num);
            }
        }
    }
    
}
