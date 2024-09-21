
package encuesta;

import java.util.Scanner;


public class Encuesta {

    
    public static void main(String[] args) {
        
                       
                       Scanner reader = new Scanner(System.in);
                       
                       int cont = 0 ;
                       int aciertos = 0;
                       int fallas = 0;
                      
                       
                       System.out.println("Cual es el pais mas grande del mundo");
                       System.out.println("a) Rusia");
                       System.out.println("b) España");
                       System.out.println("a) Ecuador");
                       System.out.println("a) Peru");
                       System.out.print("Ingresa tu opcion: ");
                       String respuesta = reader.next();
                       char res = respuesta.charAt(0);
                       if(res == 'a'){
                           System.out.println("CORRECTO");
                           cont++;
                           aciertos++;
                       }else{
                           System.out.println("INCORRECTO");
                           cont--;
                           fallas++;
                       }
                     
                       System.out.println("Ganador del mundial 2014");
                       System.out.println("a) Alemania");
                       System.out.println("b) Argentina");
                       System.out.println("a) Brazil");
                       System.out.println("a) Inglaterra");
                       System.out.print("Ingresa tu opcion: ");
                       String respuesta1 = reader.next();
                       char res1 = respuesta1.charAt(0);
                       if(res1 == 'a'){
                           System.out.println("CORRECTO");
                           cont++;
                           aciertos++;
                       }else{
                           System.out.println("INCORRECTO");
                           cont--;
                           fallas++;
                       }
                       
                       if (cont > 0)
                       {
                       System.out.println("Tuviste " +aciertos+ " acietos");
                       System.out.println("Tuviste " +fallas+ " fallas");
                       System.out.println("Tu puntuacion total es de: " +cont+ " puntos");
                       }else 
                       {
                        System.out.println("Tu puntuacion total es de: 0");
                       }
    }
}

