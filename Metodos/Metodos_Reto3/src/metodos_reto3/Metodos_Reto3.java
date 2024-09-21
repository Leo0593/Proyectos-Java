
package metodos_reto3;

import java.util.Scanner;

public class Metodos_Reto3 {

    
    public static void main(String[] args) {
       Metodos_Reto3 programa = new Metodos_Reto3();
       programa.inicio();
    }
    
    public void inicio()
    {
        double[]notas = ingresar();  
        double promedio = calcular(notas);
        String notafin = respuesta(promedio);
        System.out.println("SU NO ES: "+notafin);
    }
    public double[] ingresar()
    {
       Scanner leer = new Scanner(System.in);
        double [] notas= new double[5]; 
        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("Ingresa una nota");
            notas[i] = leer.nextDouble();    
        } 
        return notas;
    }
    
     public double calcular(double[] notas) 
     {
        double suma = 0;
        for (int i = 0; i < notas.length ; i++) {
            suma = suma + notas[i];
        }
        double promedio = suma / notas.length;
        System.out.println("El promedio de las notas es: "  +promedio);
        return promedio;
    }
     
    public String respuesta(double promedio) 
    {
        String text;
        
        if ((promedio >= 9)&&(promedio <= 10)) 
        {
            text = "Excel·lent";
        } else if ((promedio >= 6.5)&&(promedio < 9)) 
        {
            text = "Notable";
        } else if ((promedio >= 5)&&(promedio < 6.5)) 
        {
            text = "Aprovat";
        } else if ((promedio >= 0)&&(promedio < 5)) 
        {
            text = "Suspès";
        } else {
            text = "Nota no vàlida";
        }
        
        return text;
    }
    
    
    
    
}
