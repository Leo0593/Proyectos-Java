
package examen3c;


public class Examen3C {

    
    public static void main(String[] args) {
        int[][] taula2 = new int [10][10];
       
        for (int i = 0; i< taula2.length;i++)
        {
            for(int j = 0; j < taula2[i].length; j++)
            {
                taula2[i][j] = i+1;
                taula2[9][j] = 20;
                taula2[i][9] = 10;
                
            }
        }
        
        for (int i = 0; i< taula2.length;i++)
        {
            for(int j = 0; j < taula2[i].length; j++)
            {
               System.out.print( taula2[i][j]+" ");     
            }
         System.out.println ();  
        }
    }
    
}
