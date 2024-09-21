package array13;
public class Array13 {

    
    public static void main(String[] args) {
        
        int[][] datos = new int [10][10];
       
        for (int i = 0; i< datos.length;i++)
        {
            for(int j = 0; j < datos[i].length; j++)
            {
                datos[i][j] = i+0;
            }
        }
        
        for (int i = 0; i< datos.length;i++)
        {
            for(int j = 0; j < datos[i].length; j++)
            {
               System.out.print( datos[i][j]+" ");     
            }
         System.out.println ();  
        }
    } 
}
