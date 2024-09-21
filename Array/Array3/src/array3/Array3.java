package array3;
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
          
        int numero [] = new int[5];
        Scanner reader = new Scanner(System.in);
        int conp = 0;
        int conn = 0;
        int conc = 0;
        for (int i=0;i<numero.length;i++)
        {
            System.out.println("Ingrese un numero: ");
            numero[i] = reader.nextInt();
        }
        
       
        for(int i = 0; i<numero.length;i++)
        {
            if (numero[i] > 0)
            {
                conp++;
            }
            else if (numero[i] < 0)
            {
                conn++;
            }
            else 
            {
                conc++;
            }
        }
        
        System.out.println("Ingreso "+conp+" positivos");
        System.out.println("Ingreso "+conn+ " negativos");
        System.out.println("Ingreso "+conc+ " numero 0");
    }
}
