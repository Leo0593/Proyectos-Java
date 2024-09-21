package practica2;
import java.util.Scanner;
public class Practica2 {

 
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingresa el primer valor:");
        num1 = reader.nextInt();
        System.out.println("Ingresa el segundo valor:");
        num2 = reader.nextInt();
        if((num1==0)||(num2==0)){
            System.out.println("Porfavor Ingrese calores que no sean cero");
        }
        else{
            if(num1 % 2 == 0){
            System.out.println("El numero: " +num1+ " es par");
            }
            else{
            System.out.println("El numero: " +num1+ " es impar");

            }
            if(num2 % 2 == 0){
            System.out.println("El numero: " +num2+ " es par");
            }
            else{
            System.out.println("El numero: " +num2+ " es impar");

            }
        }
    }
    
}
