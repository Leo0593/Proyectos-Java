
package practica3a;

import java.util.Scanner;


public class Practica3A {

   
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        
       Catalogo informacion[] = new Catalogo[3];
       
       for (int i = 0; i < informacion.length; i++)
        {
            
            System.out.print("Ingresa el codigo del Libro: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingresa el Titulo: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingresa el Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Ingresa la Editorial: ");
            String editorial = scanner.nextLine();
            System.out.print("Ingresa el Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("***************************");
            
            informacion[i] = new Catalogo (codigo,titulo,autor,editorial,precio);
        }
       
       for(int i = 0; i < informacion.length; i++)
       {
           System.out.println(informacion[i].toString());
           System.out.println("***********************");
       }
       
       System.out.print("Ingresa el autor que te gustaria buscar: ");
       String buscar = scanner.nextLine().toLowerCase().trim();
       boolean encontrado = false;

    for (int i = 0; i < informacion.length; i++) {
        if (buscar.equals(informacion[i].getAutor().toLowerCase().trim())) {
            System.out.println(informacion[i].toString());
            System.out.println("***********************");
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("El autor ingresado no se encuentra");
    }

        

    }
}
