
package ejercicio_prueba_3;

import java.util.Scanner;


public class Ejercicio_Prueba_3 {

    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        double nota;
        double insuficientes = 0;
        double suficientes = 0;
        double bien = 0;
        double notables = 0;
        double excelentes = 0;
        double apro = 0;
        double susp = 0;
        double cont=0;
        double med = 0;
        double proa=0;
        double proa1=0;
        double pror =0;
        double pror1 =0;
        for(int i=1;i<=10;i++)
        {
           
           System.out.println("Ingrese un numero: ");
           nota = reader.nextDouble();
           cont = cont+nota;
           med = cont/10;
         if(nota >= 0 && nota <= 10)
           {
            if (nota >= 0 && nota < 5) {
                insuficientes++;
            } else if (nota >= 5 && nota < 6) {
                suficientes++;
            } else if (nota >= 6 && nota < 7) {
                bien++;
            } else if (nota >= 7 && nota < 9) {
                notables++;
            } else if (nota >= 9 && nota <= 10) {
                excelentes++;
            } else
            {
             System.out.println("Nota invalida. Introduce una nota entre 0 y 10.");
            }
            
            if (nota >= 7 && nota <= 10)
            {
                apro++;
                proa = 100*apro;
                proa1 = proa/10;
            }
            else
            {
                susp++;
                pror = 100*susp;
                pror1 = pror/10;
            }
         }
         else
           {
                   System.out.println("Nota invalida");
           }
           
           
        }
        System.out.println("Cantidad de alumnos por notas:");
        System.out.println("Excelentes: " + excelentes);
        System.out.println("Notables: " + notables);
        System.out.println("Bien: " + bien);
        System.out.println("Suficientes: " + suficientes);
        System.out.println("Insuficientes: " + insuficientes);
        System.out.println("El numero de aprovados es de: " + apro);
        System.out.println("El numero de reprobados es de: " + susp);
        System.out.println("la nota media es:" + med);
        System.out.println("el porcentaje de aprovados es del: " + proa1+"%");
        System.out.println("el porcentaje de reporbados es del: " + pror1+"%");

    }
    
}
