
package metodos_reto5;

import java.util.Scanner;

public class Metodos_Reto5 {

   
    public static void main(String[] args) {
        Metodos_Reto5 programa = new Metodos_Reto5();
        programa.inicio();
    }
    
    public void inicio()
    {        
        Scanner leer = new Scanner(System.in);
        int repe;
        do{
        int horas = horas();
        int jornada = torn();
        double salario = calculo(horas, jornada);
        double salario_fin = impuesto(salario);
        System.out.println("*************************************");
        System.out.println("TU SALARIO BRUTO ES DE : "+salario);
        System.out.println("TU SALARIO NETO ES DE : "+salario_fin);
        repe = repetir();
        }while(repe == 1);
    }
    
    public int horas()
    {
        Scanner leer = new Scanner(System.in);
        boolean fin = false;
        int hora = 0;
        System.out.print("HORAS TRABAJADAS DURANTE EL MES: ");

        do{
            if(leer.hasNextInt())
            {
                hora = leer.nextInt();
                fin = true;            }
            else
            {
                leer.next();
            }
        }while(!fin);
        
        return hora;
    }
    
    public int torn()
    {
        Scanner leer = new Scanner(System.in);
        boolean fin = false;
        int torn = 0;
        System.out.println("*************************************");
        System.out.println("ESCOJA SU TORNO DE TRABAJO");
        System.out.println("1) Mati");
        System.out.println("2) Tarda");
        System.out.println("3) Nit");
        do{
            System.out.print("CUAL ES US TORNO: ");
            if(leer.hasNextInt())
            {
                torn = leer.nextInt();
                if (torn >= 1 && torn <= 3)
                {
                   fin = true;
                }
            }
            else
            {
             leer.next();
            }
        }while(!fin);
        
        return torn;
    }
    
    public double calculo(int hora, int jornada)
    {
        double salario = 0;
        
        if(jornada == 1)
        {
            salario = hora * 5;
            
        }else if(jornada == 2)
        {
            salario = hora * (5*1.2); 
            
        }else if(jornada == 3)
        {
             salario = hora * (5*1.5);
        }
        return salario;
    }
    
    public double impuesto(double salario)
    {
        double descuento = 0;
        double salario_fin = 0;
        
        if(salario < 1200)
        {
            descuento = salario * 0.08;
            salario_fin = salario - descuento;
            
        }else if(salario >=1200 && salario <=2000)
        {
            descuento = salario * 0.1;
            salario_fin = salario - descuento;            
        }else if(salario > 2000)
        {
            descuento = salario * 0.12;
            salario_fin = salario - descuento;
        }
        return salario_fin;
    }
    
    public int repetir()
    {
        Scanner leer = new Scanner(System.in);
        boolean fin = false;
        int respuesta = 0;
        System.out.println("*************************************");
        System.out.println("PRESIONA '0' PARA SALAIR");
        System.out.println("PRESIONA '1' PARA SACAR OTRO SALARIO");
        do{
            System.out.print("CUAL ES TU ELECCION: ");
            if (leer.hasNextInt() )
            {
                respuesta = leer.nextInt();
                if (respuesta >= 0 && respuesta <= 1)
                {
                    fin = true;
                }

            }else
            {
                leer.next();
            }
        }while(!fin);
        return respuesta;
    }
    
    
}
