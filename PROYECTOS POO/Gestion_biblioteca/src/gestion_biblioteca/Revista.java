
package gestion_biblioteca;


public class Revista extends Ficha {
    
    int any;
    int Nvolumen;

    public Revista() {
    }

    public Revista(int any, int Nvolumen, String titulo) {
        super(titulo);
        this.any = any;
        this.Nvolumen = Nvolumen;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
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
                "Tiutulo: "+titulo+"\n"+
                 "Referencia:"+getReferencia()+"\n"+
                 "Año: : "+any+"\n"+    
                 "Numero de volumen: "+Nvolumen+"\n";
    }
}
