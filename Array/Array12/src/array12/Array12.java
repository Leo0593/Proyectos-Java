
package array12;


public class Array12 {

    
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
      
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 1)
                {
                    matriz[i][j] = 1;
                }
            }
        }

        
           System.out.println("Matriz bidimensional:");
            for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                       System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }  
    }    
}
