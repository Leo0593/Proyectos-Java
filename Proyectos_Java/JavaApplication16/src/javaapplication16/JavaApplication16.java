package javaapplication16;
public class JavaApplication16 {

  public static void main(String[] args) {
        
        
        float x = 1;
        float e =1;
        float num = 0;
        float res1 = 0;
        float res2 = 0;
        double res3 = 0;
        double res4 = 1;
        double res5 = 1;
        double fin = 1;
        
        /*Ejercicio 1*/
        for (int i = 1; i<100;i++)
        {
           res1 = res1+(x/i);
        }
        /*Ejercicio 2*/
        for (int a = 1; a<100;a++)
        {
            a=a+1;
            res2 = res2 + (x/a); 
        }
        /*Ejercicio 3*/
        while ( e < 512)
        {
            e=e*2;   
            res3 = (x/e)+res3; 
        }
        
        for (double u = 10; u > 0; u-- )
        {
            res4=res4*u;
        }
        for (double l =1;l<=4;l++)
        {
             res5 *=l;
             fin += x /res5;
        }
        System.out.println("La resspuesta del ejercicio 1 es :" +res1);  
        System.out.println("La resspuesta del ejercicio 2 es :" +res2); 
        System.out.println("La resspuesta del ejercicio 3 es :" +res3);
        System.out.println("La resspuesta del ejercicio 4 es :" +res4);
        System.out.println("La resspuesta del ejercicio 5 es :" +fin);
  }
    
}
