
package pkg4.proyecto_poo;


public class Proyecto_POO {

    
    public static void main(String[] args) {
        Suma c1 = new Suma(1.0,2.0);
        Suma c2 = new Suma(4.0,5.0);

        Suma zero = Suma.ZERO;
        

        System.out.println("\nNUMERO COMPLEJO C1:");
        System.out.println("\t Parte real = " + c1.getReal());
        System.out.println("\t Parte imaginaria = " + c1.getImaginary());

        System.out.println("\nNUMERO COMPLEJO C1:");
        System.out.println("\t Parte real = " + c2.getReal());
        System.out.println("\t Parte imaginaria = " + c2.getImaginary());
        
        System.out.println("*********************************************************");
                            
        System.out.println("\nOperacion de suma (c1 + ZERO):");
        Suma suma = c1.add(zero);
        System.out.println("\t Part real = " + suma.getReal());
        System.out.println("\t Part imaginària = " + suma.getImaginary());

        System.out.println("\nOperacion de suma (c1 + c2):");
        suma = c1.add(c2);
        System.out.println("\t Parte real = " + suma.getReal());
        System.out.println("\t Parte imaginaria = " + suma.getImaginary());

        System.out.println("\nOperaciones Realizadas: ");
        System.out.println("(" + c1 + ") + (" + c2 + ") = (" + suma + ")");
                            
        System.out.println("*********************************************************");
        
        System.out.println("\nOperacion de  (c1 + ZERO):");
        Suma resta = c1.subtract(zero);
        System.out.println("\t Parte real = " + resta.getReal());
        System.out.println("\t Parte imaginaria = " + resta.getImaginary());

        System.out.println("\nOperacion de suma (c1 + c2):");
        resta = c1.subtract(c2);
        System.out.println("\t Parte real = " + resta.getReal());
        System.out.println("\t Parte imaginaria = " + resta.getImaginary());

        System.out.println("\nOperaciones Realizadas: ");
        System.out.println("(" + c1 + ") + (" + c2 + ") = (" + resta + ")");
        
        System.out.println("*********************************************************");

        System.out.println("\nOperacion de  (c1 + ZERO):");
        Suma multiplicacion = c1.multiply(zero);
        System.out.println("\t Parte real = " + multiplicacion.getReal());
        System.out.println("\t Parte imaginaria = " + multiplicacion.getImaginary());

        System.out.println("\nOperacion de suma (c1 + c2):");
        multiplicacion = c1.multiply(c2);
        System.out.println("\t Parte real = " + multiplicacion.getReal());
        System.out.println("\t Parte imaginaria = " + multiplicacion.getImaginary());

        System.out.println("\nOperaciones Realizadas: ");
        System.out.println("(" + c1 + ") + (" + c2 + ") = (" + multiplicacion + ")");
        

    }
    
}
