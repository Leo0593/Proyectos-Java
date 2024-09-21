
package proyecto25;

import java.util.Scanner;

public class Proyecto25 {

    public static void main(String[] args) {
               Scanner leer = new Scanner (System.in);
               int n1,n2,n3;
               int sum;
               int mul;
               System.out.println("Ingresa el primer valor");
               n1 = leer.nextInt();
               System.out.println("Ingresa el segundo valor");
               n2 = leer.nextInt();
               System.out.println("Ingresa el tercer valor");
               n3 = leer.nextInt();
               if (n1<0)
               {
                   mul = n1*n2*n3;
                   System.out.println("La respuesta de tu multiplicacion es: "+mul);

               }
               else
               {
                   sum = n1+n2+n3;
                   System.out.println("La respuesta de tu suma es: "+sum);

               }
               

    }
    
}
