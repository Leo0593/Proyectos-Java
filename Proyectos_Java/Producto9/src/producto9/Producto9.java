package producto9;
import java.util.Scanner;
public class Producto9 
{

    
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int hora;
        int cp = 0;
        int res = 0;
        int cp1=156;
        int n=0;  
        int n2=0;
        int sum=0;
        int fin = 0;
        int fin1=0;
        
         System.out.println("Ingresa una hora del dia");
         hora = reader.nextInt(); 
         if (hora>24 )
         {
            System.out.println("Error el dia tiene 24 horas nomas");
         }
         else{
                if(hora<=12)
                   {
                      for (int i=0;i<=hora;i++)
                      {
                       cp = cp + i;
                       res = 156 - cp;

                      }

                   System.out.println("Faltan "+res+ " campanadas para que sean las 24 horas");

                   }
                else if (hora > 13)
                   {
                       for (int a=12;a<hora;a++) 
                       {
                           n = a+1;
                           n2 =n2+n-a;
                           sum = sum +n2;
                           fin = 78+sum;
                           fin1 = 156 - fin;
                       }
                           System.out.println("Faltan " +fin1+ " campanadas para que sean las 24 horas");

                    }
         }
         
         
         
        

    }
    
}
    
