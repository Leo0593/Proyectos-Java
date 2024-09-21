
package metodos_reto1;

import java.util.Scanner;


public class Metodos_Reto1 {

    int[] llistaEnters = new int[10];
    public static void main(String[] args) {
        Metodos_Reto1 programa = new Metodos_Reto1();
        programa.inici();
    }
    public void inici() 
    {
        llegirLlista();
        ordenarLlista();
        mostrarLlista();
        mostrarLlistamitad();
    }
    public void llegirLlista() 
    {
        System.out.println("Escriu 10 valors enters i prem retorn.");
        Scanner lector = new Scanner(System.in);
        int index = 0;
        while (index < llistaEnters.length) {
        if (lector.hasNextInt()) {
        llistaEnters[index] = lector.nextInt();
        index++;
        } else {
        lector.next();
        }
        }
        lector.nextLine();
    }
    
    public double numero_mayor()
    {
        double mayor = 0;
        double mitad = 0;
        
        for(int i = 0; i <llistaEnters.length;i++)
        {
            if(mayor < llistaEnters[i])
            {
                mayor = llistaEnters[i];
                mitad = mayor / 2;
            }
        }
        System.out.println("El numero mas grande es: "+mayor);
        System.out.println("La mitad del numero mas grande es: "+mitad);
        return mitad;
    }
    
    public void ordenarLlista() 
    {
        int i;
        int j;
        
        for (i = 0; i < llistaEnters.length - 1 ; i++) {
        for(j = i + 1; j < llistaEnters.length; j++) {

        if (llistaEnters[i] > llistaEnters[j]) {
        int canvi = llistaEnters[i];
        llistaEnters[i] = llistaEnters[j];
        llistaEnters[j] = canvi;
        }
        }
        }
    }
    
    public void mostrarLlistamitad() 
    {
      double mitad = numero_mayor();
      int contador = 0;
        System.out.print("Estos son los valores inferiores a la mitad del numero mas grande[ ");
        for (int i = 0; i < llistaEnters.length;i++) {
            if( llistaEnters[i] < mitad )
            {
                System.out.print(llistaEnters[i] + " ");
                contador++;
            }
        }
        System.out.println("]");
        System.out.println("En total "+contador+" numeros son menores a la mitad del numero mas grande");
    }
    
    public void mostrarLlista() 
    {
        System.out.print("L’array ordenat és: [ ");
        for (int i = 0; i < llistaEnters.length;i++) {
        System.out.print(llistaEnters[i] + " ");
        }
        System.out.println("]");
    }

}
