
package examen5a_2023_2024;

import java.util.Scanner;


public class Examen5A_2023_2024 {

    //LEANDRO CLAVIJO
    
    public static void main(String[] args) {
        Examen5A_2023_2024 programa = new Examen5A_2023_2024();
        programa.Inicio();
    }
    
    public void Inicio()
    {
        Scanner reader = new Scanner(System.in);
        double precio_final = 0;
        int repetir;
        
        do{
            int tip = tipus();
            int preu = preu();
            double descuento = calcular_preu_venda(tip, preu);
            precio_final = precio_final + descuento;
            repetir = repetir();
        }while(repetir == 1);
        System.out.println("EL PRECIO FINAL CON DESCUENTOS ES DE: "+precio_final);
        
    }
    
    public int tipus()
    {
        Scanner reader = new Scanner(System.in);
        int tipus = 0;
        boolean fin = false;
        System.out.println("*************************************");
        System.out.println("INGRESE EL TIPUS DEL ARTICULO (1 o 2)");
        do
        {
            if(reader.hasNextInt())
            {
                tipus = reader.nextInt();
                    if( (tipus >= 1) && (tipus <=2) )
                    {
                        fin = true;
                    }
                    else
                    {
                        System.out.println("**********************************");
                        System.out.println("VALOR INCORRECTO, VUELVE A ESCOGER");
                        System.out.println("**********************************");
                    }
                
            }else{
                System.out.println("*****************************");
                System.out.println("VALOR NULO, VOLVER A INGRESAR");
                System.out.println("*****************************");
                reader.next();
            }
        }while(!fin);
        
        return tipus;
    }
    
    public int preu()
    {
        Scanner reader = new Scanner(System.in);
        int preu = 0;
        boolean fin = false;
        
        System.out.println("*************************************");
        System.out.println("INGRESE EL PRECIO DEL ARTICULO");
        do
        {
            if(reader.hasNextInt())
            {
                preu = reader.nextInt();
                
                    if(preu > 0)
                    {
                        fin = true;
                    }
                    else
                    {
                        System.out.println("**********************************");
                        System.out.println("VALOR NEGATIVO, NO ACEPTADO");
                        System.out.println("**********************************");
                    }
                
            }else{
                System.out.println("*****************************");
                System.out.println("VALOR NULO, VOLVER A INGRESAR");
                System.out.println("*****************************");
                reader.next();
            }
        }while(!fin);
        return preu;
    }
    
    public double calcular_preu_venda(int tip, int pre)
    {
        double descuento = 0;
        
            if(tip == 1)
            {
                descuento = pre * 0.92;
            }
            else
            {
                descuento = pre * 0.90;
            }
            
        return descuento;
    }
    
    public int repetir()
        {
            Scanner reader = new Scanner(System.in);
            boolean fin = false;
            int respuesta = 0;
            System.out.println("*************************************");
            System.out.println("PRESIONA '0' PARA SALAIR");
            System.out.println("PRESIONA '1' PARA INGRESAR OTRO PRECIO");
            do{
                System.out.print("CUAL ES TU ELECCION: ");
                if (reader.hasNextInt() )
                {
                    respuesta = reader.nextInt();
                    if (respuesta >= 0 && respuesta <= 1)
                    {
                        fin = true;
                    }

                }else
                {
                    reader.next();
                }
            }while(!fin);
            return respuesta;
        }
    
}
