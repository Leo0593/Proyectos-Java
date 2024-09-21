
package proyecto17;

import java.util.Scanner;


public class Proyecto17 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int n;
        int p;
        float formu1 = 0;
        float formu2 = 0;
        int plus = 1;
        int fac1 = 1;
        int fac2= 1;
        int res;
        
        System.out.println("Ingrese su valor n: ");
        n = leer.nextInt();
        System.out.println("Ingrese su valor p ");
        p = leer.nextInt();
        
        formu1 = n/p;
        formu2 = plus/fac1*fac2;
        res = n-p;
        //factorial de N
        for ( int a = n; a > 0; a-- )
        {
           plus=plus*a;
        }
        //Factorial de (n-p)
          for (int e = res; e > 0; e-- )
        {
          fac1 = fac1*e;
        }
        //Factorial de p
        for (int i = p; i > 0; i-- )
         {
            fac2 = fac2*i;
         }
        System.out.println("La respuesta de n/p es: "+formu1);
        System.out.println("Facorial de N: "+plus);
        System.out.println("Facorial de (N-P): "+fac1);
        System.out.println("Facorial de P: "+fac2);
        System.out.println("La respuesta de la formula n!/(n-p)!*p! es: "+formu2);
    }
    
}
