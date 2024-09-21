package ejemplo4_string;

public class Datos {
    
    private int codigo;
    private String titulo;
    private String  autor;
    private String editor;
    private double precio;

    public Datos(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    
    public Datos(int codigo, String titulo, String autor, String editor, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editor = editor;
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

    public String getEditor() {
        return editor;
    }

    public double getPrecio() {
        return precio;
    }

    
}
