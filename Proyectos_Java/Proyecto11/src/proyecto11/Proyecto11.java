package proyecto11;
import java.util.Scanner;
public class Proyecto11 {

   
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int menor;
    int num;
  
    
    
    System.out.println("Digite numero: ");
    num = reader.nextInt();
    menor = num;
    
    for(int i=1; i<=10; i++)
    {
        System.out.println("Digite numero: ");
        num = reader.nextInt();
        if(num < menor){
            menor = num;
        }            
    }
    
    //Luego simplemente imprimimos el mayor y el menor
    System.out.println("El numero menor es: " + menor);
}   
             
}
