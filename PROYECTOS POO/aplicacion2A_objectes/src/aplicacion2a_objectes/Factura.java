
package aplicacion2a_objectes;


public class Factura {
    private double cantidad;
    private double precio;

    public Factura() {
    }

    public Factura(double cantidad, double precio) 
    {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    public double calcular()
    {
        double subtotal = cantidad * precio;
        double iva = subtotal * 0.21;
        double total = subtotal + iva;
        return total;
    }
    
    
}
