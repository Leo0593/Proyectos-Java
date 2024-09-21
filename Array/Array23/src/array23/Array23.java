package array23;
import java.util.Scanner;
public class Array23 {
    public static void main(String[] args) {
            int [] num = new int [2];
            Scanner reader = new Scanner(System.in);
            int valor = 0;
            int suma = 0;
            
            for (int i = 0; i <num.length ;i++)
            {
                System.out.println("Ingrese su primer valor");
                num[i] = reader.nextInt();
                valor = num[0];
            }
           
              for (int i = 0; i < num [1];i++)
            {
                suma = suma + valor;
            }
              
            System.out.println("El resultado de tu producto mediante suma es: "+suma);
    }
    
}
