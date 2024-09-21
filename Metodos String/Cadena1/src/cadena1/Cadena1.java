
package cadena1;

import java.util.Scanner;


public class Cadena1 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        String frase = "En las calles de New York ha nevado casi un metro y por las calles solo pasan los quitanieves";
        
        int i;
        int inicio = frase.indexOf("calles");
        int fin = frase.lastIndexOf("solo"); 
        
        System.out.println("\t"+frase+"\n");
        
            String mayus = frase.toUpperCase();
            System.out.println("a) "+mayus);
        
            for (i = 0; i < frase.length();i++)
            {
                if(i == 7)
                {
                    char caracter = frase.charAt(7);
                    System.out.println("b) El septimo caracter de tu palabra es: "+caracter);
                }
            }

            System.out.println("c) La longitud de la frase es: "+i);

            if( inicio == fin )
            {
                System.out.print("d) Error ");

            }else{
                String textoFinal = frase.substring(inicio, fin);
                System.out.println("d) "+textoFinal);
            }
            
            char vocal = frase.charAt(0);
            if (vocal == 'E')
            {
                System.out.println("e) La primera letra de tu texto es la E mayuscula\n");
            }
            else{
                System.out.println("e) La primera letra de tu texto no es la E mayuscula\n");
            }
            
            System.out.println("Ingrese el caracter que le gustaria saber su indice de inicio y fin: ");
            String letra = leer.nextLine();
            
                    char cerca = letra.charAt(0);
                    int indiceini = frase.indexOf(cerca);
                    int indicefin = frase.lastIndexOf(cerca); 
            
            if (letra.length() == 1)
            {
                    if (indiceini > -1)
                    {
                        System.out.println("La aparicion del caracter '"+cerca+"' es: ");
                        System.out.println("Inicio del indice: "+indiceini);
                        System.out.println("Fin del indice: "+indicefin);
                    }
                    else
                    {
                        System.out.println("El caracter ingresado no se registra en la frase");
                    }
            }else
            {
                System.out.println("ERROR NO INGRESE UN CARACTER");
            }       
}    
}
