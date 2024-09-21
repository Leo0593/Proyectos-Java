
package examen3b;


public class Examen3B {

    
    public static void main(String[] args) {
          int [] arrayA = {11, 21, 31, 41, 51, 65, 75, 85};
          int [] arrayB = {1, 2, 3, 4, 5, 6, 7, 8};
          int [] arrayC = new int[16];
          
          int i = 0;
          
          for (i =0; i<arrayC.length;i++)
          {
              arrayC = arrayB;
              
              System.out.print( arrayC[i]+"-");
          }
          for (i =0; i<arrayC.length;i++)
          {
              arrayC = arrayA;
              
              System.out.print( arrayC[i]+"-");
          }
          
          
          
    }
    
}
