package array14;
public class Array14 {   
    public static void main(String[] args) {
        int[][] datos = new int [10][10];
        for (int i = 0; i < datos.length;i++)
        {
            for(int j = 0; j < datos[i].length; j++)
            {
                if (i + j == datos.length - 1) 
                {
                    datos[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < datos.length;i++)
        {
            for(int j = 0; j < datos[i].length; j++)
            {
               System.out.print( datos[i][j]+" ");     
            }
         System.out.println ();  
        }
    }
    
}
