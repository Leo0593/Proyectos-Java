
package repte1_modular;

import java.util.Scanner;
public class Repte1_Modular {

    int[] llistaEnters = new int[10];

    public static void main(String[] args) {
        Repte1_Modular programa = new Repte1_Modular();
        programa.inici();
    }
    public void inici() 
    {
        llegirLlista();
        ordenarLlista();
        mostrarLlista();
        ordenar();
    }
    
    public void llegirLlista() 
    {
        System.out.println("Escriu 10 valors enters i prem retorn.");
        Scanner lector = new Scanner(System.in);
        int index = 0;
        while (index < llistaEnters.length) {
            if (lector.hasNextInt())
            {
            llistaEnters[index] = lector.nextInt();
            index++;
            } 
            else 
            {
            lector.next();
            }
        }
        lector.nextLine();
      }
    
     public float mayor()
    {
        int mayor = 0;
        float divi = 0;
        
        for(int i = 0; i < llistaEnters.length;i++ )
        {
            if(mayor < llistaEnters[i])
            {
                mayor = llistaEnters[i];
                divi = mayor / 2;
            }
        }   
        System.out.println ("La mitad del numero mayor es:"+divi);
        return divi;
    }
     
    public void ordenarLlista() 
    {
        int i;
        int j;
        for (i = 0; i < llistaEnters.length - 1; i++) {
            for(j = i + 1; j < llistaEnters.length; j++) 
            {

            if (llistaEnters[i] > llistaEnters[j]) {
            int canvi = llistaEnters[i];
            llistaEnters[i] = llistaEnters[j];
            llistaEnters[j] = canvi;
            }
         }
        }
     }
    
    public void mostrarLlista() 
    {
        System.out.print("L’array ordenat és: [ ");
        for (int i = 0; i < llistaEnters.length;i++) 
        {
            System.out.print(llistaEnters[i] + " ");
        }
            System.out.println("]");   
    }
    
    public void ordenar()
    {
        float resul = mayor();
        System.out.print("La array oredena basada en la mitad del numero mayor: [");
        for (int i = 0; i < llistaEnters.length;i++) 
        {
            if(llistaEnters[i] < resul)
            {
                System.out.print(llistaEnters[i] + " ");
            }
        }
            System.out.println("]");   
    }

}   
