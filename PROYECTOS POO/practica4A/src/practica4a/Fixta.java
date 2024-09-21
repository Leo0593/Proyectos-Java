
package practica4a;


public class Fixta {
    protected String referencia;
    protected String titulo;
    

    public Fixta() {
    }

    public Fixta(String referencia, String titulo) {
        this.referencia = referencia;
        this.titulo = titulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String toString()
    {
        return   
                "Titulo: "+titulo+"\n"+
                "Referencia:"+referencia+"\n";
                
    }
    
}
