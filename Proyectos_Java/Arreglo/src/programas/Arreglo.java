package programas;
import java.util.Scanner;
public class Arreglo {
    
    public static void main(String[] args){
        int num;
        int divisor=1;
        int sumadivisores=0;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Introduzca un número mayor que 0: ");
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
    }

 