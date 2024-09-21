
package examen4b_2023_24;

import java.util.Scanner;


public class Examen4b_2023_24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //LEANDRO CLAVIJO//
        
        int i = 1;
        int a = 0;
        String palabraMayuscula = " ";
        char letra = ' ';
        
        System.out.println("ESCRIBE UNA LINEA DE TEXTO ");
        String text = leer.nextLine();
        String [] subtexto = text.split(" ");

        for (i = 1; i < subtexto.length;i++)
        {
        }
        System.out.println("Tu texto tiene "+i+" palabras");
         
        String text2 = text;
        String [] subtexto2 = text2.split(" ");
        
        for (a = 0; a < subtexto2.length;a++)
        {
            palabraMayuscula = subtexto2[a].toUpperCase();
            letra = palabraMayuscula.charAt(0);
            System.out.println ("las primeras letras en mayusculas son: "+letra);
        }
         
        
       String text3 =  text.replace(" ", "");
       System.out.println("SU TEXTO SIN ESPACIOS");
       System.out.println(text3);

       

    }
    
}
