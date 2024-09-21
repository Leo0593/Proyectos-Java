package array10;
import java.util.Scanner;
public class Array10 {
    public static void main(String[] args) {
        int respuesta [] = new int [10];
        int positivos [] = new int [respuesta.length]; 
        int negativos [] = new int [respuesta.length];
        Scanner reader = new Scanner(System.in);
        int i;
        for (i=0;i<respuesta.length;i++)
        {
            System.out.println("Ingresa un valor");
            respuesta[i] = reader.nextInt();
            positivos [i] = respuesta [i];
            negativos [i] = respuesta [i];   
        }
        System.out.println("Los valores positivos son positivos");

         for (i=0;i<positivos.length;i++)
        {
           if (  positivos[i] > 1)
           {
                System.out.println(+positivos[i]);
           }
        }
         System.out.println("Los valores negativos son ");
         for (i=0;i<negativos.length;i++)
        {
           if ( negativos[i]< 0)
           {
                System.out.println(+negativos [i]);
           }
        }
    } 
}
