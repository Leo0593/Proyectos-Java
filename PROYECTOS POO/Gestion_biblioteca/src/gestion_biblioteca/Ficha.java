
package gestion_biblioteca;

public class Ficha {
    
    protected int referencia;
    protected String titulo;
    
    static int codigo = 0;
    
    public Ficha() {
    }

    public Ficha(String titulo) {
        this.referencia = codigo;
        this.titulo = titulo;
        contador(); 
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    static public void contador() {
        codigo++;
    }
    
}
