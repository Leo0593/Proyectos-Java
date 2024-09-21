
package cadena6;
       
import java.util.Scanner;

public class Cadena6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA FRASE");
        String frase = leer.nextLine();
        System.out.println("\nINGRESE EL CARACTER QUE LE GUSTARIA SABER LAS VECES QUE SE REPITE");
        String caracter = leer.nextLine();
        char letra = caracter.charAt(0);
        
            int cont = 0;
            for(int i = 0; i < frase.length(); i++)
            {
                    if(frase.charAt(i) == letra)
                    {
                        cont++;
                    }
            }
            System.out.println("El caracter '"+letra+"' se repite "+cont+" veces.");
}    
}
