package ejemplo3_string;
import java.util.Scanner;

public class Ejemplo3_string {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        System.out.println("ESCRIBE UNA LINEA DE TEXTO ");
        String text = leer.nextLine();
         
        
        for (int i = 0 ; i <text.length();i++)
        {
            char letra = text.charAt(i);
            if(letra == 'a' || letra == 'A')
            {
               cont++;
            } 
        }
            System.out.println("Tu texto tiene "+cont+" 'A'" );
        

        
    }
    
}
