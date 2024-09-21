package cadena5;

import java.util.Scanner;

public class Cadena5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA CADENA DE TEXTO");
        String texto = leer.nextLine();
        
        int conminus = 0;
        int conmayus = 0;
        
        for (int i = 0; i < texto.length();i++)
        {
            char caracter = texto.charAt(i); 
            
            if (Character.isUpperCase(caracter)) {
                conmayus++;
            } else if (Character.isLowerCase(caracter)) {
                conminus++;
            }
        }
       
        System.out.println("Numero de mayusculas: " + conmayus);
        System.out.println("Numero de minusculas: " + conminus);

    }
    
}
