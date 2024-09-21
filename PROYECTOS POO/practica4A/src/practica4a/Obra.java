
package practica4a;


public class Obra extends Fixta {
    
    String autor;
    int Npaginas;

    public Obra() {
    }

    public Obra(String autor, int Npaginas, String referencia, String titulo) {
        super(referencia, titulo);
        this.autor = autor;
        this.Npaginas = Npaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return Npaginas;
    }

    public void setNpaginas(int Npaginas) {
        this.Npaginas = Npaginas;
    }
    
    
}
