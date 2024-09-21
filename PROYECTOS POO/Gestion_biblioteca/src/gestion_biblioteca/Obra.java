
package gestion_biblioteca;


public class Obra extends Ficha {
    
    String autor;
    int Npaginas;

    public Obra() {
    }

    public Obra(String autor, int Npaginas, String titulo) {
        super(titulo);
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
