
package pkg4.proyecto_poo;


public class Suma {
    
    public static final Suma ZERO = new Suma(0.0, 0.0);
   

    private double real;
    private double imaginary;

    public Suma(double real, double i) {
        this.real = real;
        this.imaginary = i;
    }

    public Double getReal() {

        return this.real;
    }

    public Double getImaginary(){
        return this.imaginary;
    }

    //suma//
    
    public Suma add(Suma c) 
    {
        Suma resultat = new Suma(this.real + c.getReal(),   this.imaginary+c.getImaginary());
        return resultat;
    }


    public String toString( ) {

        String resultat = this.real + " ";
        if (this.imaginary >= 0.0) {
        resultat += "+" + this.imaginary + "i";
        } 
        else {
        resultat += this.imaginary + "i";
        }
        return resultat;
    }
    
    public Suma subtract(Suma d) 
    {
        Suma resul = new Suma(this.real - d.getReal(),   this.imaginary - d.getImaginary());
        return resul;
    }


    public String resultado( ) {

        String resul = this.real + " ";
        if (this.imaginary >= 0.0) {
        resul += "+" + this.imaginary + "i";
        } 
        else {
        resul += this.imaginary + "i";
        }
        return resul;
       }
    
    public Suma multiply(Suma e) 
    {
        Suma resulm = new Suma(this.real * e.getReal(),   this.imaginary * e.getImaginary());
        return resulm;
    }


    public String resultadom( ) {

        String resul = this.real + " ";
        if (this.imaginary >= 0.0) {
        resul += "+" + this.imaginary + "i";
        } 
        else {
        resul += this.imaginary + "i";
        }
        return resul;
       }
}
