package metodos_reto6;

import java.util.Scanner;

public class Metodos_Reto6 {

   
    public static void main(String[] args) {
        Metodos_Reto6 programa = new Metodos_Reto6();
        programa.inicio();
    }
    
    public void inicio()
    {
        int [] dinero = {500,200,100,50,20,10,5,2,1};
        double diferencia = valores();
        vuelto(diferencia, dinero);
    }
    
    public double valores ()
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("INGRESA EL PRECIO DEL PRODUCTO: ");
        double ventas = leer.nextDouble();
        
        System.out.print("INGRESA EL PAGO DEL COMPRADOR:");
        double pagar = leer.nextDouble();
        
        double diferencia = pagar - ventas;
        
        return diferencia;
    }
    
    public void vuelto (double diferencia, int [] dinero)
    {
         for (int i = 0; i < dinero.length; i++) 
         {
            if (diferencia >= dinero[i]) {
                int cantidad = (int) (diferencia / dinero[i]);
                System.out.println(cantidad + " billetes/monedas de " + dinero[i] + " €");
                diferencia = diferencia % dinero[i];
            }
         }
         
    }
}
