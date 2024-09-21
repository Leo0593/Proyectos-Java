
package proyecto4;

import java.util.Scanner;


public class Proyecto4 {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double edad;
        double primero= 0;
        double segundo= 0;
        double tercero = 0;
       
        
        for(int i=0;i<=5;i++)
        {
           System.out.println("Ingrese un numero: ");
           edad = reader.nextDouble();
            
          
            if (edad  < 15) {
               System.out.println("La edad que ingreso es muy joven o muy vieja"); 
            } else if (edad  < 30) {
                primero++;
            } else if (edad >30 && edad < 55) {
                segundo++;
            } else if (edad >55 && edad < 67) {
                tercero++;
            }         
            else
            {
             
            }
        }
        System.out.println("Cantidad de trabajadores por su edad");
        System.out.println("Trabajadores mayores de 15 y menores de 30: " + primero);
        System.out.println("Trabajadores mayores de 30 y menores de 55: " + segundo);
        System.out.println("Trabajadores mayores de 55 y menores de 67: " + tercero);
    }
    
}
