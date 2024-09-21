
package pkg1.proyecto_poo;


public class ClaseA {
    
    //Atributos
    private int ValorPrimari ;
    private int ValorSecundari ;

    public ClaseA() {
        this.ValorPrimari = 5;
        this.ValorSecundari = 10 ;
    }

    public ClaseA(int ValorPrimari) {
        this.ValorPrimari = ValorPrimari;
    }

    public ClaseA(int ValorPrimari, int ValorSecundari) {
        this.ValorPrimari = ValorPrimari;
        this.ValorSecundari = ValorSecundari;
    }

    public int getValorPrimari() {
        return ValorPrimari;
    }

    public int getValorSecundari() {
        return ValorSecundari;
    }

}
