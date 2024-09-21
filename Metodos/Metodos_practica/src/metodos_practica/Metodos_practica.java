
package metodos_practica;

import java.util.Random;
import java.util.Scanner;

public class Metodos_practica 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        
        boolean fin = false;
        int contador = 1;
        int primerNumero = 0;

        do {
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;
            int total = dado1 + dado2;

            System.out.println("Tirada " + contador + ": " + total);

            if (contador == 1 && (total == 7 || total == 11)) {
                System.out.println("Has ganado!");
                fin = true;
            } else if (contador == 1 && (total == 2 || total == 3 || total == 12)) {
                System.out.println("Has perdido.");
                fin = true;
            } else if (contador == 1) {
                primerNumero = total;
            } else {
                if (total == primerNumero) {
                    System.out.println("Has ganado!");
                    fin = true;
                } else if (total == 7) {
                    System.out.println("Has perdido.");
                    fin = true;
                }
            }

            contador++;
        } while (!fin);
    }
}
