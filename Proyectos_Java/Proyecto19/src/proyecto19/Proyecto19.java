
package proyecto19;




public class Proyecto19 {

   
    public static void main(String[] args) {
        
        double val = 600;
        double por = 0.1;
        double total=0;
        
        for (double i = 1; i<25; i++)
        {
          total = val*Math.pow(1+por,i);
        }
       System.out.print("Lo que debe tener en su cuenta es de: " +total+" euros");
        
        
    }
    
}
