package proyecto7;
import java.util.Scanner;
public class Proyecto7 
{

    
    public static void main(String[] args) {
        
    Scanner reader = new Scanner(System.in);
    int num1;
    float cuadra,cubo;
    double raiz,raizcu;
    int contador = 0;
    while (contador<15)
    {
     System.out.println("Ingresa tu valor N " +contador);
     num1=reader.nextInt();
     contador = contador + 1;
     cuadra = num1*num1;
     cubo = num1*num1*num1;
     raiz = Math.sqrt(num1);
     raizcu = Math.cbrt(num1);
     
     System.out.println("El cuadrado de " +num1+ " es: "  +cuadra);
     System.out.println("El cubo de " +num1+ " es: "  +cubo);
     System.out.println("La raiz cuadra de " +num1+ " es: "  +raiz);
     System.out.println("La raiz cubica de " +num1+ " es: "  +raizcu+ "\n");

    }
    
    
    
    }
    
}
