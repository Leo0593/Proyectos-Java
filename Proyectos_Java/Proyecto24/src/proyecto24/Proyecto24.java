
package proyecto24;
import java.util.Scanner;
public class Proyecto24 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Introduce la cantidad en euros: ");
        int cantidad = leer.nextInt();

        int[] valores = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        for (int i = 0; i < valores.length; i++) {
            int cantidadBilletes = cantidad / valores[i];
            if (cantidadBilletes > 0) {
                if (valores[i] >= 5) {
                    System.out.println("Billetes de " + valores[i] + " euros: " + cantidadBilletes);
                } else {
                    System.out.println("Monedas de " + valores[i] + " euros: " + cantidadBilletes);
                }
                cantidad = cantidad % valores[i];
            }
        
}
}
}
