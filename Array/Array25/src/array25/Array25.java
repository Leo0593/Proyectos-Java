package array25;

import java.util.Scanner;

public class Array25 {

    public static void main(String[] args) {

        int[] valor = new int[30];

        Scanner reader = new Scanner(System.in);
        int i = 0;
        boolean cor = false;

        do {
            System.out.println("Ingrese su valor");
            cor = reader.hasNextInt();
            do{
            if (cor) {
                valor[i] = reader.nextInt();
                reader.nextLine();
                i++;
            } else {
                System.out.println("El número no es entero.");
                reader.nextLine();
            }
             
            }while (!cor);

        } while (i < 30 || i == 't');

        // Aquí puedes realizar cualquier operación adicional con el arreglo 'valor'.

    }
}