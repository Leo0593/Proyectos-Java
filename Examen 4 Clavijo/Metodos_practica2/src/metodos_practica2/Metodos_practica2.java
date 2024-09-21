
package metodos_practica2;

import java.util.Random;

public class Metodos_practica2 {

    
    public static void main(String[] args) {
        
        Metodos_practica2 programa = new Metodos_practica2 ();
        programa.inicio();
    }
    public void inicio ()
    {
       opciones();
    }
    
    public int tirada_dados()
    {
        Random num = new Random();
        
        int dado1 =num.nextInt(6)+1; 
        int dado2 =num.nextInt(6)+1; 
        int total = dado1 + dado2;
        return total;
    }
    
    public int opciones()
    {
        int total;
        int cont = 1;
        boolean fin = false;
        int primero = 0;
        
        do{ 
        
        total = tirada_dados();
        System.out.println("Tirada "+cont+" te salio : " + total);
        
        if (cont == 1 && (total == 7 || total == 11))
        {
            System.out.println("Has ganado");
            fin = true;
        }
        else if(cont == 1 && (total == 2 || total == 3 || total==12))
        {
            System.out.println("Has perdido");
            fin = true;
        }
        else if (cont == 1)
        {
            primero = total;
        }
        else
        {
            if (total == primero) {
                    System.out.println("Has ganado!");
                    fin = true;
                } else if (total == 7) {
                    System.out.println("Has perdido.");
                    fin = true;
                }   
        }
        cont++;
        }while(!fin);
        
        return primero;
    }
   
    
    
}
