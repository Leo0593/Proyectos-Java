
package practica3c;

import java.util.ArrayList;
import java.util.Scanner;


public class Metodos {
   ArrayList<Variables> empresas = new ArrayList<>();

    public void addVariables() {
        Scanner scanner = new Scanner(System.in);
        Variables datos = new Variables();

        System.out.println("INGRESA EL NOMBRE DE LA EMPRESA");
        String nombre = scanner.nextLine().toLowerCase().trim();
        datos.setNombre(nombre);

        System.out.println("INGRESA LA DIRECCION");
        String direccion = scanner.nextLine();
        datos.setDireccion(direccion);

        System.out.println("INGRESA TU NUMERO TELEFONICO");
        int telefono = scanner.nextInt();
        datos.setTelefono(telefono);
        

        empresas.add(datos);
    }

    public void getDatos() {
        String texto = "";
        for (int i = 0; i < empresas.size(); i++) {
            texto += "Nombre: " + empresas.get(i).getNombre() + "\n";
            texto += "Direccion: " + empresas.get(i).getDireccion() + "\n";
            texto += "Telefono: " + empresas.get(i).getTelefono() + "\n";
            texto += "****************************\n";
        }
        System.out.println(texto);
    }
    
    public void BuscarEspecifico()
    {
        Scanner scanner = new Scanner(System.in);
        String texto = "";
        System.out.println("INGRESA EL NOMBRE DE LA EMPRESA");
        String nombre = scanner.nextLine().toLowerCase().trim();
        System.out.println("*******************************");
        System.out.println("\t TU EMPRESA BUSCADA ES");

        for(int i = 0; i < empresas.size(); i++)
        {
         if (empresas.get(i).getNombre().equals(nombre)) {
            texto += "Nombre: " + empresas.get(i).getNombre() + "\n";
            texto += "Direccion: " + empresas.get(i).getDireccion() + "\n";
            texto += "Telefono: " + empresas.get(i).getTelefono() + "\n";
            texto += "****************************\n";
            }
        }
        System.out.println(texto);
    }
    
    public void borrarEspecifico()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA EL NOMBRE DE LA EMPRESA");
        String nombre = scanner.nextLine().toLowerCase().trim();
        for (int i = 0; i < empresas.size(); i++) {
        if (empresas.get(i).getNombre().equals(nombre)) {
            empresas.remove(i); 
            System.out.println("La empresa '" + nombre + "' ha sido eliminada.");
        }
    }
        
    }
    public void borrarLista()
    {
        empresas.clear();
    }
}
