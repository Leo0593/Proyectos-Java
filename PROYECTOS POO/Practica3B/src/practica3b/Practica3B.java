
package practica3b;

import java.util.Scanner;


public class Practica3B {

    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        Ventas empleados[] = new Ventas[2];
        
       
        
        for(int i = 0; i < empleados.length; i++)
        {
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa tu primer apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingresa tu zona: ");
            String zona = scanner.nextLine();
            
            double ventas[] = new double[4];
            for(int j = 0; j < ventas.length; j++)
            {
                System.out.print(j+") Ingresa tus importes de venta: ");
                ventas[j]=scanner.nextDouble();
            }
            scanner.nextLine();
            System.out.println("***********************************");
            empleados[i] = new Ventas(nombre,apellido,zona, ventas);
        }
        
        
        
        for (int l = 0; l < empleados.length; l++) 
        {
          double[] importesVentas = empleados[l].getImpor_ventas(); 
          double suma = 0;
          double promedio = 0;
            for (int e = 0; e < importesVentas.length; e++) {
                suma += importesVentas[e]; 
                promedio = suma/importesVentas.length;
            }
          System.out.println(promedio);
        }
       
        
        
       
    }
    
}
