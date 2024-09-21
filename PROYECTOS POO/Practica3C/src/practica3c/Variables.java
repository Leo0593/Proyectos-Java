
package practica3c;


public class Variables {
    private String nombre;
    private String direccion;
    private int telefono;

    public Variables() {
        this.nombre = "";
        this.direccion = "";
        this.telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nonbre) {
        this.nombre = nonbre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
