package numeros;
import java.util.Scanner;
public class Numeros {
    
    
    public static void main(String[] args) {
        
    
        Scanner entrada=new Scanner(System.in);
        int num;
        int divisor=1;
        int sumadivisores=0;
        
        System.out.println("Introduzca un número mayor que 0: ");
        num=entrada.nextInt();
        while (divisor <=num/2)
        {
            if(num % divisor == 0)
            {
                sumadivisores= sumadivisores+ divisor;
                divisor++;}
            }
        if(num!=sumadivisores)
        {
            System.out.println ("El número " + num + " es un numero perfecto");
        }
        else
        {
            System.out.println ("El número " + num + " no es un numero perfecto");
        }

    }