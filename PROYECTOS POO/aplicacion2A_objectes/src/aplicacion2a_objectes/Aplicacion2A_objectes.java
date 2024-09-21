
package aplicacion2a_objectes;

import java.util.Scanner;


public class Aplicacion2A_objectes {

    
    public static void main(String[] args) 
    {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad solicitada: ");
        double cantidad = reader.nextDouble();
        System.out.println("********************************");
        System.out.print("Ingresa el precio del producto: ");
        double precio = reader.nextDouble();
        System.out.println("********************************");
        Factura impresion = new Factura(cantidad,precio);
        System.out.println("Su total a pagar es de: "+impresion.calcular());
    }
    
}
