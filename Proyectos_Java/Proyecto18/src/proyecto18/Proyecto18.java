package proyecto18;
import java.util.Scanner;
public class Proyecto18 {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i ;
        int sum = 0;
        for (i=0;i<100;i++)
        {
         i = i+1;
         sum = sum + i;
        }
        System.out.println("La suma de los 100 primeros numero impares es de: "+sum);
    }
    
}
