
package ultimo_programa;


class Ciclo_Formativo {
    private String Nombre;
    private String Descripcion;
    private int Horas_Totales;

    public Ciclo_Formativo() {
    }

    public Ciclo_Formativo(String Nombre, String Descripcion, int Horas_Totales) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Horas_Totales = Horas_Totales;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getHoras_Totales() {
        return Horas_Totales;
    }

    public void setHoras_Totales(int Horas_Totales) {
        this.Horas_Totales = Horas_Totales;
    }
    
   
}
