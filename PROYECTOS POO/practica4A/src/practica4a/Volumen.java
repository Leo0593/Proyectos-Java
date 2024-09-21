
package practica4a;


public class Volumen extends Obra {
    int Nvolumen;

    public Volumen(int Nvolumen, String autor, int Npaginas, String referencia, String titulo) {
        super(autor, Npaginas, referencia, titulo);
        this.Nvolumen = Nvolumen;
    }

    public Volumen() {
    }

    
    public int getNvolumen() {
        return Nvolumen;
    }

    public void setNvolumen(int Nvolumen) {
        this.Nvolumen = Nvolumen;
    }
    
    public String toString()
    {
        return   
                "Titulo: "+titulo+"\n"+
                "Autor: "+autor+"\n"+
                "Referencia:"+referencia+"\n"+
                "Numero de Paginas: : "+Npaginas+"\n"+    
                "Numero de volumen: "+Nvolumen+"\n";
    }
}
