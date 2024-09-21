package proyecto15;
import java.util.Scanner;
public class Proyecto15 
{

   
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        double nota;
        double insuficientes = 0;
        double suficientes = 0;
        double bien = 0;
        double notables = 0;
        double excelentes = 0;
        
        for(int i=0;i<=5;i++)
        {
           System.out.println("Ingrese un numero: ");
           nota = reader.nextDouble();
            
               if (nota < 5) {
                insuficientes++;
            } else if (nota >= 5 && nota < 6) {
                suficientes++;
            } else if (nota >= 6 && nota < 7) {
                bien++;
            } else if (nota >= 7 && nota < 9) {
                notables++;
            } else if (nota >= 9 && nota <= 10) {
                excelentes++;
            } else
            {
             System.out.println("Nota inválida. Introduce una nota entre 0 y 10.");
            }
        }
        System.out.println("Cantidad de alumnos por notas:");
        System.out.println("Excelentes: " + excelentes);
        System.out.println("Notables: " + notables);
        System.out.println("Bien: " + bien);
        System.out.println("Suficientes: " + suficientes);
        System.out.println("Insuficientes: " + insuficientes);
        
        
    }
}



