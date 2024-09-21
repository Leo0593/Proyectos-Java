
package ultimo_programa;


public class UF {
    private String Nombre_UF;
    private String Descripcion_UF;
    private int Horas;
     private double Nota_UF;
     
    public UF(String Nombre_UF, String Descripcion_UF, int Horas, double Nota_UF) {
        this.Nombre_UF = Nombre_UF;
        this.Descripcion_UF = Descripcion_UF;
        this.Horas = Horas;
        this.Nota_UF = Nota_UF;
    }

    public UF(String Nombre_UF, String Descripcion_UF, int Horas) {
        this.Nombre_UF = Nombre_UF;
        this.Descripcion_UF = Descripcion_UF;
        this.Horas = Horas;
    }
    
    

    public String getNombre_UF() {
        return Nombre_UF;
    }

    public void setNombre_UF(String Nombre_UF) {
        this.Nombre_UF = Nombre_UF;
    }

    public String getDescripcion_UF() {
        return Descripcion_UF;
    }

    public void setDescripcion_UF(String Descripcion_UF) {
        this.Descripcion_UF = Descripcion_UF;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    
     public double getNota_UF() {
        return Nota_UF;
    }

    public void setNota_UF(double Nota_UF) {
        this.Nota_UF = Nota_UF;
    }
   
    public String toString() {
        return   
                "*****************************"+"\n"
                +"Nombre UF=" + Nombre_UF + "\n"
                +"Descripcion UF=" + Descripcion_UF + "\n"
                +"Horas=" + Horas + "\n"
                +"Nota UF=" + Nota_UF;
    }
    
     public String toString_1() {
        return   
                "*****************************"+"\n"
                +"Nombre UF=" + Nombre_UF + "\n"
                +"Descripcion UF=" + Descripcion_UF + "\n"
                +"Horas=" + Horas;
    }
}
