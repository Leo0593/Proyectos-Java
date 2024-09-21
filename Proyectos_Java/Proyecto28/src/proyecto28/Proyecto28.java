package proyecto28;
import java.util.Scanner;
public class Proyecto28 {

    
    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        
        int kilo;
        double pre;
        double valor;
        
        System.out.println("Ingresa cuantos kilogramos de fruta lleva: ");
        kilo=leer.nextInt();
        if (kilo <= 2)
        {
           valor = kilo * 1.5;
          System.out.println("Usted tiene que pagar: "+valor);
        }
        else
        {
            if((kilo>2)||(kilo<5))
            {
                valor = kilo * 1.5;
                pre = valor - (valor*0.10);
                System.out.println("Usted tiene que pagar: "+pre);     
            }
            else
            {
                if((kilo>5)||(kilo<10))
                {
                    valor = kilo * 1.5;
                    pre = valor - (valor*0.15);
                    System.out.println("Usted tiene que pagar: "+pre);     
                }
                else 
                {
                    if(kilo>10)
                        {
                            valor = kilo * 1.5;
                            pre = valor - (valor*0.20);
                            System.out.println("Usted tiene que pagar: "+pre);     
                        }
                }
            }
        }
    }
    
}
