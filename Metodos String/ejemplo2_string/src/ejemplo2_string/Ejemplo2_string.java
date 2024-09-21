package ejemplo2_string;
import java.util.Scanner;

public class Ejemplo2_string {

    public static final char  RESPOSTA_CORRECTA = 'b';
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cont = 3;
        boolean correc = false;
        System.out.println ("Endevina la pregunta");
        System.out.println ("Quin dels seguents no es un tipus primitiu?");
        System.out.println ("a) Enter");
        System.out.println ("b) Scanner");
        System.out.println ("c) Caracter");
        System.out.println ("d) Boolea");
        
        do{
        System.out.println ("La teva resposta es l option: ");
        String palabra = leer.nextLine();
        
        if (palabra.length() == 1)
        {
            char caracter = palabra.charAt(0);
            
            if((caracter >= 'a')&&(caracter <= 'd'))
            {
                if(caracter == RESPOSTA_CORRECTA)
                {
                    System.out.println ("Efectivamente, la respuesta era '" +RESPOSTA_CORRECTA+ "'.");
                    correc = true;
                }else{
                    cont--;
                }
            }
            else {
                System.out.println ("'" +caracter+ "' es una opcion incorrecta");
            }
        }
        else 
        {
           System.out.println ("'" +palabra+ "' no es un caracter individual");
        }
        }while((cont > 0) && (!correc));
        
    }
    
}
