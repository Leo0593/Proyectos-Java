package Practica;
import java.util.Scanner;
public class Practica {
 
    public static void main(String[] args) {
        int num;
        int cont_pos = 0;
        int cont_neg = 0;
        int suma_pos = 0;
        int suma_neg = 0;
        float media_pos;
        float media_neg;
 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Introduzca un numero: ");
        num = scanner.nextInt(); // Leer un número entero del usuario
 
        while (num != 0) {
            if (num > 0) {
                cont_pos++;
                suma_pos = suma_pos + num;
            } else {
                cont_neg++;
                suma_neg = suma_neg + num;
            }
            System.out.print("Introduzca otro numero (o 0 para salir): ");
            num = scanner.nextInt(); // Leer otro número entero del usuario
        }
 
        if (cont_pos != 0) {
            media_pos = (float) suma_pos / cont_pos; // Calcular la media de los positivos
            System.out.println("Media de los positivos: " + media_pos);
        }
 
        if (cont_neg != 0) {
            media_neg = (float) suma_neg / cont_neg; // Calcular la media de los negativos
            System.out.println("Media de los negativos: " + media_neg);
        }
 
       
    }
}