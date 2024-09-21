
package ejercicio_prueba_2;

import java.util.Scanner;


public class Ejercicio_Prueba_2 {

       //LEANDRO CLAVIJO LOPEZ//

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int horas;
        float cal;
        float des1;
        float des2;
        float des3;
        System.out.println("LEANDRO CLAVIJO LOPEZ");
        System.out.println("Ingrese el numero de horas trabajadas");
        horas=reader.nextInt();
        
        cal = horas*15;
        
        System.out.println("Su salario bruto es de: "+cal);
        
        if(cal<1025)
        {
            des1 =(float) (cal - (cal*0.05));
            System.out.println("Su salario con el descuento es de: "+des1);
        }else if((cal>1025)||(cal<1800) )
        {
            des2 =(float) (cal - (cal*0.10));
            System.out.println("Su salario con el descuento es de: "+des2);
        }
        else
        {
            des3 =(float) (cal - (cal*0.20));
            System.out.println("Su salario con el desceunto es de: "+des3);
        }


    }
    
}
