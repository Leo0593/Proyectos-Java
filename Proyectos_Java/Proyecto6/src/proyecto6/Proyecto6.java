package proyecto6;
import java.util.Scanner;
public class Proyecto6 {

    
    public static void main(String[] args) {
       
                Scanner reader = new Scanner(System.in);
                float notas;
                int contador = 0;
                float med;
                int suma = 0;
                
                while(contador <=10)
                {
                    System.out.println("Ingresa la nota de los alumnos: "+contador);
                    notas = reader.nextFloat();
                    suma += notas;
                    contador = contador + 1;        
                    if (notas > 10) 
                        {
                         break;
                        }
                }
                med = suma/contador;
                System.out.println("La nota media es: "+med);
    }
    
}
