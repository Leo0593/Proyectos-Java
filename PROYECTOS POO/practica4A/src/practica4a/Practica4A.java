
package practica4a;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica4A {
    
    ArrayList<Volumen> obra = new ArrayList<>();
    ArrayList<Revista> revista = new ArrayList<>();
    
        
     
    public static void main(String[] args) {
        
        Practica4A programa = new Practica4A();
        int eleccion;
        do{
        eleccion = programa.Menu();
        
        if(eleccion == 1){
            programa.obra();
        }else if (eleccion == 2){
            programa.revista();
        }else if (eleccion == 3){
            programa.imprimir_obra();
        }else if (eleccion == 4){
            programa.imprimir_revista();
        }else if (eleccion == 5){
            programa.imprimir_todo();
        }else if (eleccion == 6){
            System.out.println("Adios");
        }else
        {
            System.out.println("INGRESA UN VALOR DENTRO DEL RANGO");
        }
        
        }while(eleccion !=6);
    }
    
    public int Menu()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("\tMENU PRINCIPAL");
        System.out.println("*******************************");
        System.out.println("1)INGRESAR DATOS DE UNA OBRA");
        System.out.println("2)INGRESAR DATOS DE UNA REVISTA");
        System.out.println("3)IMPRIMIR LAS OBRAS INGRESADAS");
        System.out.println("4)IMPRIMIR LAS REVISTAS INGRESADAS");
        System.out.println("5)VERIFICAR SI SON VALORES IGUALES");
        System.out.println("6)SALIR");
        System.out.print("CUAL ES TU ELEECION: ");
        int elecciones = reader.nextInt();
        return elecciones;
    }
    
    public void obra()
    {
        Scanner reader = new Scanner(System.in);
        Volumen datos = new Volumen(); 
       
            System.out.print("INGRESAR TITULO: ");
            String titulo = reader.nextLine();
            datos.setTitulo(titulo);
            System.out.print("INGRESAR LA REFERENCIA: ");
            String referencia = reader.nextLine();
            datos.setReferencia(referencia);
            System.out.print("INGRESAR EL NOMBRE DEL AUTOR: ");
            String nombre = reader.nextLine();
            datos.setAutor(nombre);
            System.out.print("CUAL EL NUMERO DE PAGINAS: ");
            int paginas = reader.nextInt();
            datos.setNpaginas(paginas);
            System.out.print("CUAL EL NUMERO DE VOLUMEN: ");
            int volume = reader.nextInt();
            datos.setNvolumen(volume);
            obra.add(datos );
    }
    
    public void revista()
    {
        Scanner reader = new Scanner(System.in);
        Revista datos = new Revista(); 
        
            System.out.print("INGRESAR TITULO: ");
            String titulo = reader.nextLine();
            datos.setTitulo(titulo);
            System.out.print("INGRESAR LA REFERENCIA: ");
            String referencia = reader.nextLine();
            datos.setReferencia(referencia);
            System.out.print("AÑO DE PUBLICACION: ");
            int año = reader.nextInt();
            datos.setAny(año);
            System.out.print("CUAL EL NUMERO DE VOLUMEN: ");
            int volume = reader.nextInt();
            datos.setNvolumen(volume);
            revista.add(datos );
    }
    
    public void imprimir_obra()
    {
        for(int i = 0; i < obra.size();i++)
        {
            System.out.println("*******************************");
            System.out.print(obra.get(i).toString());
            System.out.println("*******************************");
        }
    }
    
    public void imprimir_revista()
    {
        for(int i = 0; i < revista.size();i++)
        {
            System.out.println("*******************************");
            System.out.print(revista.get(i).toString());
            System.out.println("*******************************");
        }
    }
    
    public void imprimir_todo()
    {
       Scanner reader = new Scanner(System.in);
       for (int i = 0; i < obra.size(); i++) {
            Volumen obraActual = obra.get(i);
            for (int j = 0; j < revista.size(); j++) {
                Revista revistaActual = revista.get(j);
                if (obraActual.getReferencia().equals(revistaActual.getReferencia())) {
                    System.out.println("*******************************");
                    System.out.println("Referencias iguales encontradas:");
                    System.out.println("*******************************");
                    System.out.println("Obra: " + obraActual);
                    System.out.println("*******************************");
                    System.out.println("Revista: " + revistaActual);
                    System.out.println("*******************************");
                    System.out.println("Cambiando la referencia en la revista...");
                    String referencianueva = reader.nextLine();
                    revistaActual.setReferencia(referencianueva); 
                    System.out.println("Referencia cambiada en la revista: " + revistaActual);
                }
            }
        }
    }
    
    
}
