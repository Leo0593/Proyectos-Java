package array.pkg8;
import java.util.Scanner;
public class Array8 {
    public static void main(String[] args) {
        float notas [] = new float [10] ;
        Scanner reader = new Scanner(System.in);
        int i;
        float cont=0;
        float prom=0;
        
        for (i=0;i<notas.length;i++)
        {
            System.out.println("Ingresa la nota de una asignatura: ");
            notas[i] = reader.nextFloat();
        }
        
        for (i=0;i<notas.length;i++)
        {
            if (notas [i]<=10 && notas [i]> 0)
            {
                cont=cont+notas [i];
                prom = cont/10;
                
            }
            else
            {
              System.out.println("La nota "+notas[i]+" es invalida");
            }
        }
        System.out.println("La nota media es");
        System.out.println(+prom);
    }
    
}
