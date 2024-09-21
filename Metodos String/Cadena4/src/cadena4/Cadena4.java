package cadena4;
import java.util.Scanner;
public class Cadena4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE SU NIF");
        String NIF = leer.nextLine();
        
        if(NIF.length() == 9)
        {
            char letra = NIF.charAt(8);
            
            if(Character.isLetter(letra))
            {
                int inicio = 0;
                int fin = NIF.length()- 1;

                
                if (inicio <= fin) {
                    String textfinal = NIF.substring(inicio, fin );
                    System.out.println( NIF+ " es un NIF valido");
                    System.out.println("Parte numerica del NIF es: " + textfinal);
                } 
            }
            else
            {
                System.out.println( NIF+" no es un NIF valido");
            }
        }
        else
        {
            System.out.println("NIF INVALIDO, NO CONTIENE LOS 9 CARACTERES CORESPONDIENTES");
        }

    }
    
}
