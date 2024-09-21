package array6;
import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        int array [] = new int[5];
        Scanner reader = new Scanner(System.in);
        int i;
        int pos = -1;
        for (i=0; i<array.length;i++)
        {
            System.out.println("Ingrese caulquier tipo de valores");
            array[i]= reader.nextInt();
        }
        for (i=0; i<array.length;i++)
        { 
            if ( array[i] > 30)
            {
              pos = i;
              System.out.println("El valor "+array[i]+ " esta guardado en el espacio numero: "+pos);
            }
            else
            {
              System.out.println("LOS ELEMENTOS GUARDADOS EN LA ARRAY SON MENORES DE 30 SON" );

            } 
        }
        }
}
    
