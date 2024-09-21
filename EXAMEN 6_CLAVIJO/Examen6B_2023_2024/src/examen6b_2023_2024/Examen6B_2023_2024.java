
package examen6b_2023_2024;

import java.util.Scanner;


public class Examen6B_2023_2024 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        trabajador datos[]= new trabajador[2];
        
        for(int i= 0; i < datos.length; i++)
        {
            System.out.println("INGRESA TU NOMBRE");
            String nombre = scanner.nextLine();
            System.out.println("INGRESA EL NUMERO DE HORAS TRABAJADAS");
            int hora = scanner.nextInt();
            System.out.println("INGRESA TU JORNADA DE TRABAJO");
            String jornada = scanner.next();
            scanner.nextLine();
            System.out.println("**************************************");
            datos[i] = new trabajador (nombre, hora,jornada);
        }
        
        for(int i= 0 ;i < datos.length; i++)
      {
        System.out.println(datos[i].toString());
        System.out.println("************************");
      }
    }
    
}
