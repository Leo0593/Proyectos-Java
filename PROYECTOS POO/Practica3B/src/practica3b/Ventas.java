
package practica3b;


public class Ventas {
    private String nombre;
    private String apellido;
    private String zona;
    private double[] impor_ventas;

    public Ventas(String nombre, String apellido, String zona, double[] impor_ventas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.zona = zona;
        this.impor_ventas = impor_ventas;
    }

    public Ventas(String nombre, String apellido, String zona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.zona = zona;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getZona() {
        return zona;
    }

    public double[] getImpor_ventas() {
        return impor_ventas;
    }
    
    
}
