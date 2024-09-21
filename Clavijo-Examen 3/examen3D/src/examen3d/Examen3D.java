
package examen3d;

import java.util.Scanner;


public class Examen3D {

    
    public static void main(String[] args) {
       int[][] alumnes = new int [3][5];
         Scanner reader = new Scanner(System.in);
         boolean corec = false;
         int contI = 0;
         int conts = 0;
         int contb = 0;
         int contn = 0;
         int conte = 0;
         int aprm1 = 0;
         int susm1 = 0;
         int cont = 0;
         
        for (int i = 0; i < alumnes.length;i++)
        {
            for(int j = 0; j < alumnes[i].length; j++)
            {
                corec = reader.hasNextInt();
             if(corec)
             {
                 alumnes[i][j] = reader.nextInt();
             }
             else
             {
                 System.out.println ("Error");
                 reader.next();
             }
             reader.nextLine();
            } 
        }
        
        
         System.out.println ("\nEstos valores son los que escribio en la array\n");
        
        for (int i = 0; i < alumnes.length;i++)
        {
            for(int j = 0; j < alumnes[i].length; j++)
            {
               System.out.print( "{"+alumnes[i][j]+"}");   
            }
         System.out.println ();  
        }
        
        for (int i = 0; i < alumnes.length;i++)
        {
            for(int j = 0; j < alumnes[i].length; j++)
            {
                cont = i;
             if (alumnes[i][j] < 10 || alumnes[i][j] > 10)
             {
               if (alumnes[i][j] < 5)
               {
                   contI++;
               } else if (alumnes[i][j] >= 5 && alumnes[i][j]<6)
               {
                 conts++;
               }else if (alumnes[i][j] >= 6 && alumnes[i][j]<7)
               {
                 contb++;
               }else if (alumnes[i][j] >= 7 && alumnes[i][j]<9)
               {
                 contn++;
               }else if (alumnes[i][j] >= 9 && alumnes[i][j]<10)
               {
                 conte++;
               }
             }else
             {
                 System.out.println ("Error al ingresar una nota "+alumnes[i][j]+" en la posicion" +cont);  
             }
            }
         System.out.println ();  
        }
        
        
        for (int i = 0; i < alumnes.length;i++)
        {
            for(int j = 0; j < alumnes[i].length; j++)
            {
                if (alumnes[i][j]> 5)
                {
                    aprm1 = aprm1 + alumnes[0][j];
                }
                else
                {
                    susm1 = susm1 + alumnes[0][j]; 
                }
            }
          aprm1 = 0;
          susm1 = 0;
          System.out.println ();  
         
        }
        
       
  
        System.out.println ("\nDATOS DE APROVADOS");
        System.out.println ("Estos son insuficientes: "+contI);
        System.out.println ("Estos son insuficientes: "+conts);
        System.out.println ("Estos son insuficientes: "+contb);
        System.out.println ("Estos son insuficientes: "+contn);
        System.out.println ("Estos son insuficientes: "+conte);
        
        System.out.println ("\nDATOS DE APROVADOS POR M");
        System.out.println ("Aprovados de la M1: "+aprm1);
        System.out.println ("Suspendidos de la M1: "+ susm1);
        
        
    }
    
}
