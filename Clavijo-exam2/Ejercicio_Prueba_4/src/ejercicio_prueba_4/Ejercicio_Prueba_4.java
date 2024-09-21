
package ejercicio_prueba_4;

import java.util.Scanner;


public class Ejercicio_Prueba_4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int kilo;
        double cos;
        double pre;
        double valor;
        double cont = 0;
        double cont1 = 0;
        do{
        System.out.println("Ingresa cuantos kilogramos de fruta lleva: ");
        kilo=leer.nextInt();
        cont = cont + kilo;
        System.out.println("Ingrese el costo de la fruta por kilogramo: ");
        cos=leer.nextDouble();
        cont1=cont1 +cos;
        }while(kilo!=0 || cos!=0);
        
        if (cont <= 2)
        {
          valor = cont * cont1;
          System.out.println("Usted tiene que pagar: "+valor);
          System.out.println("Usted tiene que pagar: "+valor+" ya contando el descuento");
        }
        else
        {
            if((cont>2)||(cont<5))
            {
                valor = cont * cont1;
                pre = valor - (valor*0.10);
                System.out.println("Usted tiene que pagar: "+valor);
                System.out.println("Usted tiene que pagar: "+pre+" ya contando el descuento");     
            }
            else
            {
                if((cont>5)||(cont<10))
                {
                    valor = cont * cont1;
                    pre = valor - (valor*0.15);
                    System.out.println("Usted tiene que pagar: "+valor);
                    System.out.println("Usted tiene que pagar: "+pre+" ya contando el descuento");     
                }
                else 
                {
                    if(cont>10)
                        {
                            valor = cont * cont1;
                            pre = valor - (valor*0.20);
                            System.out.println("Usted tiene que pagar: "+valor);
                            System.out.println("Usted tiene que pagar: "+pre+" ya contando el descuento");     
                        }
                }
            }
        }
    }
    
}
