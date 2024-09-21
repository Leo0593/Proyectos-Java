package metodos_reto4;

import java.util.Scanner;

public class Metodos_Reto4 {

    
    public static void main(String[] args) 
    {
        Metodos_Reto4 programa = new Metodos_Reto4();  
        programa.inicio();
    }
    
    public void inicio()
    {
        int [] numeros = agregar();
        int num = numero(numeros);
        contador(num, numeros);
    }
    
    public int[] agregar()
    {
        Scanner leer = new Scanner(System.in);
        int [] numeros= new int[10]; 
        System.out.println("Ingresa numeros: ");
        for(int i = 0; i < numeros.length; i++)
        {
            numeros[i] = leer.nextInt();    
        } 
        return numeros;
    }
    
    public int numero(int numeros [])
    {       
        Scanner leer = new Scanner(System.in);
        System.out.print("Que numero te gustaria buscar: ");
        int num = leer.nextInt();
        return num;
     
    }
    
    public void contador(int num, int numeros[])
    {
        int contador = 0;
        for(int i = 0; i < numeros.length; i++)
        {
            if (num == numeros[i])
            {
                contador++;
            }
        }
        System.out.print ("El numero "+num+" se repite "+contador+" veces");
    }
    
}
