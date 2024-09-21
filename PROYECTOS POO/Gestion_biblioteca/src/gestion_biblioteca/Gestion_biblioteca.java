
package gestion_biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Gestion_biblioteca {
    
        ArrayList<Volumen> obra = new ArrayList<>();
        ArrayList<Revista> revista = new ArrayList<>();

    public static void main(String[] args) {
       
        Gestion_biblioteca programa = new Gestion_biblioteca();
        int eleccion;
        do{
        eleccion = programa.Menu();
        
        if(eleccion == 1){
           programa.Cantidad_Elementos();
        }else if (eleccion == 2){
           programa.Ingresar_Obra();
        }else if (eleccion == 3){
           programa.Ingresar_Revista();
        }else if (eleccion == 4){
           programa.Buscardor_Obra();
        }else if (eleccion == 5){
            programa.Buscardor_Revista();
        }else if (eleccion == 6){
            programa.Eliminar_Obra();
        }else if (eleccion == 7){
            programa.Eliminar_Revista();
        }else if (eleccion == 8){
            programa.Posicion_Obra();
        }else if (eleccion == 9){
            programa.Posicion_Revista();
        }else if (eleccion == 10){
            programa.ImprimirTodo();
        }else if (eleccion == 11){
            System.out.println("Adios");
        }else
        {
            System.out.println("INGRESA UN VALOR DENTRO DEL RANGO");
        }
        
        }while(eleccion !=11);
    }
    
    public int Menu()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("\tMENU PRINCIPAL");
        System.out.println("-------------------------------");
        System.out.println("1)NUMERO DE LIBROS EXISTENTES");
        System.out.println("2)INGRESAR DATOS DE UNA OBRA");
        System.out.println("3)INGRESAR DATOS DE UNA REVISTA");
        System.out.println("4)BUSCAR UNA OBRA POR SU REFERENCIA");
        System.out.println("5)BUSCAR UNA REVISTA POR SU REFERENCIA");
        System.out.println("6)ELIMINAR UNA OBRA POR SU REFERENCIA");
        System.out.println("7)ELIMINAR UNA REVISTA POR SU REFERENCIA");
        System.out.println("8)BUSCAR INDICE DE UNA OBRA");
        System.out.println("9)BUSCAR INDICE DE UNA REVISTA");
        System.out.println("10)IMPRIMIR TODA LA LIBRERIA");
        System.out.println("11)SALIR");
        System.out.print("CUAL ES TU ELEECION: ");
        int elecciones = verificar();
        return elecciones;
    }
    
     public void Cantidad_Elementos()
    { 
        int total = obra.size() + revista.size();
        System.out.println("*******************************");
        System.out.println("EL NUMERO DE LIBROS QUE DISPONEMOS ES DE: " + total);
    }
    
    public void Ingresar_Obra()
    {
        Scanner reader = new Scanner(System.in);
       
            System.out.println("*******************************");
            System.out.print("INGRESAR TITULO: ");
            String titulo = reader.nextLine();
            System.out.print("INGRESAR EL NOMBRE DEL AUTOR: ");
            String nombre = reader.nextLine();
            System.out.print("CUAL EL NUMERO DE PAGINAS: ");
            int paginas = verificar();
            System.out.print("CUAL EL NUMERO DE VOLUMEN: ");
            int volume = verificar();
            Volumen datos = new Volumen(volume,nombre,paginas,titulo ); 
            obra.add(datos );
            System.out.println("*******************************");
            System.out.println("\t INGRESO EXITOSO");
            System.out.println("*******************************");

    }
    
    public void Ingresar_Revista()
    {
        Scanner reader = new Scanner(System.in);
        
            System.out.println("*******************************");
            System.out.print("INGRESAR TITULO: ");
            String titulo = reader.nextLine();
            System.out.print("AÑO DE PUBLICACION: ");
            int año = verificar();
            System.out.print("CUAL EL NUMERO DE VOLUMEN: ");
            int volume = verificar();
            
            Revista datos = new Revista(año, volume,titulo); 
            revista.add(datos );
            System.out.println("*******************************");
            System.out.println("\t INGRESO EXITOSO");
            System.out.println("*******************************");
    }
    
    public void Buscardor_Obra()
    {
        Scanner reader = new Scanner(System.in);
        boolean encontrado = false;
       
        System.out.println("*******************************");
        System.out.print("BUSQUEDA POR NUMERO DE REFERENCIA:");
        int referencia = verificar();
        System.out.println("*******************************");
        
        System.out.println("--------------------------------------------");
        System.out.println("OBRAS QUE TIENEN RELACION CON TU BUSQUEDA");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < obra.size(); i++) 
        {
          Obra busqueda = obra.get(i);
            if (busqueda.getReferencia() == referencia) 
            {
                System.out.println(busqueda.toString());
                System.out.println("*******************************");
                encontrado = true;
            }
        }
        
        if (!encontrado) 
        {
            System.out.println("No se encontró ninguna obra con la referencia buscada.");
            System.out.println("*******************************");

        }
    }
    
    public void Buscardor_Revista()
    {
        Scanner reader = new Scanner(System.in);
        boolean encontrado = false;
       
        System.out.println("*******************************");
        System.out.print("BUSQUEDA POR NUMERO DE REFERENCIA:");
        int referencia = verificar();
        System.out.println("*******************************");
        
        System.out.println("--------------------------------------------");
        System.out.println("REVISTAS QUE TIENEN RELACION CON TU BUSQUEDA");
        System.out.println("--------------------------------------------");
        
        for (int j = 0; j < revista.size(); j++) 
        {
          Revista busqueda = revista.get(j);
            if (busqueda.getReferencia() == referencia) 
            {
                System.out.println(busqueda.toString());
                System.out.println("*******************************");
                encontrado = true;
            }
        }

        if (!encontrado) 
        {
            System.out.println("No se encontró ninguna revista con la referencia buscada.");
            System.out.println("*******************************");

        }
    }
    
    public void Eliminar_Obra()
    {
        Scanner reader = new Scanner(System.in);
        boolean encontrado = false;
        int obraseliminadas = 0;
        System.out.println("*******************************");
        System.out.print("BUSQUEDA POR NUMERO DE REFERENCIA:");
        int referencia = verificar();
        System.out.println("*******************************");
        
        for ( int i = 0; i < obra.size(); i++) 
        {
          Obra busqueda = obra.get(i);
            if (busqueda.getReferencia() == referencia) 
            {
                obra.remove(i);
                obraseliminadas++;
                encontrado = true;
            }
        }
        
        if(obraseliminadas > 0)
        {
            System.out.println("--------------------------------------------");
            System.out.println("OBRAS ELIMINADAS: "+obraseliminadas);
            System.out.println("--------------------------------------------");
        }
        
        if (!encontrado) 
        {
            System.out.println("No se encontró ninguna libro con la referencia buscada.");
            System.out.println("*******************************");
        }
    }
    
     public void Eliminar_Revista()
    {
        Scanner reader = new Scanner(System.in);
        boolean encontrado = false;
        int revistaseliminadas = 0;
        System.out.println("*******************************");
        System.out.print("BUSQUEDA POR NUMERO DE REFERENCIA:");
        int referencia = verificar();
        System.out.println("*******************************");
        
        for (int j = 0; j < revista.size(); j++) 
        {
          Revista busqueda = revista.get(j);
            if (busqueda.getReferencia()== referencia) 
            {
               revista.remove(j);
               revistaseliminadas++;
               encontrado = true;
            }
        }
        
        if(revistaseliminadas > 0)
        {
            System.out.println("--------------------------------------------");
            System.out.println("REVISTAS ELIMINADAS: "+revistaseliminadas);
            System.out.println("--------------------------------------------");
        }
        
        if (!encontrado) 
        {
            System.out.println("No se encontró ninguna libro con la referencia buscada.");
            System.out.println("*******************************");
        }
    }
    
    public void ImprimirTodo()
    {
        System.out.println("--------------------------------------------");
        System.out.println("OBRAS DISPONIBLES:");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < obra.size(); i++) {
            System.out.println(i+")"+obra.get(i)); 
            System.out.println("*******************************");
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("REVISTAS DISPONIBLES:");
        System.out.println("--------------------------------------------");
        for (int j = 0; j < revista.size(); j++) {
            System.out.println(j+")"+revista.get(j));
            System.out.println("*******************************");
        }
    }
    
    public void Posicion_Obra()
    {
        Scanner reader = new Scanner(System.in);
        boolean fin = false;
        System.out.println("*******************************");
        System.out.print("BUSQUEDA INDICE DE UNA OBRA:");
        int indice = verificar();
        System.out.println("*******************************");
        for(int i = 0 ; i < obra.size(); i++)
        {
            Obra indi = obra.get(i);
            if(i == indice)
            {
                System.out.print(indi.toString());
            }
            else{
                System.out.println("ESE INDICE NO EXISTE");
            }
        }
    }
     
    public void Posicion_Revista()
    {
        Scanner reader = new Scanner(System.in);
        boolean fin = false;
        System.out.println("*******************************");
        System.out.print("BUSQUEDA INDICE DE UNA REVISTA:");
        int indice = verificar();
        System.out.println("*******************************");
        for(int i = 0 ; i < revista.size(); i++)
        {
            Revista indi = revista.get(i);
            if(i == indice)
            {
                System.out.print(indi.toString());
            }
            else{
                System.out.println("ESE INDICE NO EXISTE");
            }
        }
    }
    
    private int verificar() {
        Scanner reader = new Scanner(System.in);
        boolean fin = false;
        int indice = 0;
        do {
            if (reader.hasNextInt()) {
                indice = reader.nextInt();
                if(indice > -1){
                    fin = true;
                }else{
                System.out.println("--------------------------------------------");
                System.out.print("NUMERO NEGATIVO, NO VALIDO: ");
                
                }
            } else {
                System.out.println("--------------------------------------------");
                System.out.print("ERROR, VULELVA A INGRESAR: "); 
                reader.next();
                
            }
        } while (!fin);
        return indice;
    }
}
    

