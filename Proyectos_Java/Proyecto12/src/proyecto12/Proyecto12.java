package proyecto12;
import java.util.Scanner;
public class Proyecto12 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        int cont;
        int multi = 1 ;
   
        
        System.out.println("Ingrese un numero: ");
        num = reader.nextInt();
        if (num <=30)
        {
            for(int i = num; i>1 ; i--)
            {
             cont = i;
             multi = multi*cont;
             
            }
        System.out.println("El factorial de tu numero es: "+multi);
      
    }
    
}
}
