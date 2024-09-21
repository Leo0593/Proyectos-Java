package metodos_reto7;

import java.util.Scanner;

public class Metodos_Reto7 {

   
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int [] dinero = {500,200,100,50,20,10,5,2,1};
        
        System.out.print("INGRESA EL PRECIO DEL PRODUCTO: ");
        double ventas = leer.nextDouble();
        
        System.out.print("INGRESA EL PAGO DEL COMPRADOR:");
        double pagar = leer.nextDouble();
        
        double diferencia = pagar - ventas;
        
        for (int i = 0; i < dinero.length; i++) {
            if (diferencia >= dinero[i]) {
                int cantidad = (int) (diferencia / dinero[i]);
                System.out.println(cantidad + " billetes/monedas de " + dinero[i] + " €");
                diferencia = diferencia % dinero[i];
            }
        }

    }
    
}
