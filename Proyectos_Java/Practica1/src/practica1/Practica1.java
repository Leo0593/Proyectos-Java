package practica1;
import java.util.Scanner;
public class Practica1 
{
  
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int n;
        int n2;
        int resultado;
        System.out.println("Ingresa el primer valor:");
        n = reader.nextInt();
        System.out.println("Ingresa el segundo valor:");
        n2 = reader.nextInt();
        if(n == n2){
        System.out.println("Los 2 valores son iguales");
        }
        else
        {
            if(n > n2){
                    System.out.println("El numero mayor es: "+n);
        }
            else{
                    System.out.println("El numero mayor es: "+n2);

            }
     }
    }
    
}
