
package examen6a_2023_2024;

import java.util.Scanner;
import java.util.Random;

public class Examen6A_2023_2024 {
    
//LEANDRO CLAVIJO LOPEZ

    public static void main(String[] args) 
    {
        Examen6A_2023_2024 programa = new Examen6A_2023_2024();
        programa.inicio();
    }
    
    public void inicio() {
    
       
     Scanner scanner = new Scanner(System.in);
     Datos valores[] = new Datos [4];
     int total_maximo = 0;
     int total_minimo = 0;
     
     for(int i= 0; i<valores.length; i++)
     {
        System.out.println("Ingresa un pais");
        String pais = scanner.nextLine();
        int maximo = maximo();
        int minimo = minimo ();
        valores[i] = new Datos (pais, maximo,minimo);
        total_maximo = maximo / valores.length; 
     }
     
      System.out.println("TODOS LOS PAISES");
      System.out.println("************************");
      for(int i= 0 ;i < valores.length; i++)
      {
        System.out.println(valores[i].toString());
        System.out.println("************************");
      }
      
      System.out.println("TODOS CON TEMPERATURA MAXIMA A LA PROMEDIO");
      System.out.println("************************");
      for(int i= 0 ;i < valores.length; i++)
      {
        if(valores[i].getTemp_max() > total_maximo )
        {
            System.out.println(valores[i].toString());
            System.out.println("************************");
        }  
        
      }
      
      System.out.println("TODOS LOS PAISES CON TEMPERATURA MENORES A LA PROMEDIO");
      System.out.println("************************");
      for(int i= 0 ;i < valores.length; i++)
      {
        if(valores[i].getTemp_max() < total_minimo )
        {
            System.out.println(valores[i].toString());
            System.out.println("************************");
        }  
        
      }
        
    }
    
    public int maximo()
    {
        Random rand = new Random();
        int maximo = rand.nextInt(-25, 60) + 1;
        return maximo;
    }
    
    public int minimo ()
    {
         Random rand = new Random();
        int maximo = rand.nextInt(-25, 60) + 1;
        return maximo;
    }
    
    
}
