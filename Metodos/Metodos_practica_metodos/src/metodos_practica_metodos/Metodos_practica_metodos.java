package metodos_practica_metodos;

import java.util.Random;
import java.util.Scanner;

public class Metodos_practica_metodos {
    
    int primerNumero = 0;
    
    public static void main(String[] args) {
        Metodos_practica_metodos programa = new Metodos_practica_metodos();
        programa.inicio();
    }
    
   public void inicio() {
        int contador = 1;
        boolean fin = false;

        do {
            int total = tirarDados();
            System.out.println("Tirada " + contador + ": " + total);
            fin = verificar(total, contador);
            contador++;
        } while (!fin);
    }

    public int tirarDados() {
        Random rand = new Random();

        int dado1 = rand.nextInt(6) + 1;
        int dado2 = rand.nextInt(6) + 1;
        return dado1 + dado2;
    }

    public boolean verificar(int total, int contador) {
        boolean fin = false;

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

        return fin;
    }
}
    
    
    
