
package proyecto_poo_2;


public class Datos 
{
    private String nombre;
    private String autor;
    private int duradaSegons;
    
    public Datos() 
    {
        this.autor = "Santiago de la Cruz";
        this.nombre = "La lagrima de un buñuelo";
        this.duradaSegons = 3850;
    }
    
    public String getnombre()
    {
        return nombre;
    }
    
    public String getautor()
    {
        return autor;
    }
    
    public int getduradaSegons()
    {
        return duradaSegons;
    }
    
    public void setDuradaSegons(int nuevaDurada) {
        this.duradaSegons = nuevaDurada;
    }
      public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
       public void setAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }

   
}
