package examen5b_2023_2024;

import java.util.Scanner;
import java.util.Random;

public class Examen5B_2023_2024 {

    //LEANDRO CLAVIJO
    
    public static void main(String[] args) {
        Examen5B_2023_2024 programa = new Examen5B_2023_2024();
        programa.inicio();
    }
    
    public void inicio()
    {
        int contador = 1;
        boolean fin = false;

        do {
            
            int total = tirarDados();
            System.out.println("Tirada " + contador + ": " + total);
            fin = verificar(total, contador);
            contador++;
            
        } while (!fin);
    }

    public int tirarDados() 
    {
        Random rand = new Random();

        int dado1 = rand.nextInt(6) + 1;
        int dado2 = rand.nextInt(6) + 1;
        int total = dado1 + dado2;
        return total;
    }

    public boolean verificar(int total, int contador) 
    {
        boolean fin = false;

        if ((total == 5 || total == 6)) {
            System.out.println("Has ganado!");
            fin = true;
        } else if ((total == 2 || total == 3)) {
            System.out.println("Has perdido.");
            fin = true;
        } 

        return fin;
    }
    
}
