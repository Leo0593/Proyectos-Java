
package practica3c;

import java.util.Scanner;


public class Practica3C {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos menu = new Metodos();
        int eleccion = 0;
        boolean fin = false;
        
        System.out.println("\t\tMENU PRINCIPAL");
        do{
        System.out.println("*************************************************");
        System.out.println("1) INGRESA LOS DATOS DE UNA EMPRESA");
        System.out.println("2) VISUALIZAR LOS DATOS DE LAS EMPRESAS");
        System.out.println("3) VISUALIZAR DATOS DE UNA EMPRESA DETERMINADA");
        System.out.println("4) BORRAR DATOS DE UNA EMPRESA DETERMINADA");
        System.out.println("5) BORRAR TODOS LOS DATOS DE UNA EMPRESA");
        System.out.println("6) EXIT");
        System.out.print("CUAL ES TU ELECCION: ");
        do {
            if (scanner.hasNextInt()) {
                eleccion = scanner.nextInt();
                if (eleccion >= 1 && eleccion <= 6) {
                    fin = true;
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                }
            } else {
                System.out.println("-------------------------------------------------------------------------------------------------------");
                System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                scanner.next();
            }
        } while (!fin);
        
        System.out.println("*************************************************");
        
        if(eleccion == 1){
            menu.addVariables();
        }else if(eleccion == 2){
            menu.getDatos();
        }else if(eleccion == 3){
            menu.BuscarEspecifico();
        }else if(eleccion == 4){
            menu.borrarEspecifico();
        }else if(eleccion == 5){
            menu.borrarLista();
            System.out.println("BORRASTTE TODO");
        }else if(eleccion == 6){
            System.out.println("ADIOS");
        }

        }while(eleccion !=6);

    }
    
}
