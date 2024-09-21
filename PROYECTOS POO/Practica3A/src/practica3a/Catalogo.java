
package practica3a;


public class Catalogo {
    
    private int codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private double precio;

    public Catalogo(int codigo, String titulo, String autor, String editorial, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public double getPrecio() {
        return precio;
    }
    
    public String toString()
    {
        return 
        "Codigo: "+codigo+"\n"+
        "Titulo: "+titulo+"\n"+
        "Autor: "+autor+"\n"+
        "Editorial: "+editorial+"\n"+
        "Precio: "+precio+"\n";
    }
}
