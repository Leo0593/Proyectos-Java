
package ultimo_programa;
import java.util.ArrayList;

public class Modulo {
    
       private int Codi_Modulo;
    private String Nombre_Modulo;
    private String Descripcion_Modulo;
    private int Horas_Totales_Modulo;
    private int UFS;
    private double Nota;

    private ArrayList<UF> listaUFs;

    static int cont = 0;

    public Modulo() {
        listaUFs = new ArrayList<>();
    }

    public Modulo(String Nombre_Modulo, String Descripcion_Modulo, int UFS, ArrayList<UF> listaUFs) {
        this.Nombre_Modulo = Nombre_Modulo;
        this.Descripcion_Modulo = Descripcion_Modulo;
        this.UFS = UFS;
        this.Codi_Modulo = cont;
        generarCodigoModulo();
        this.listaUFs = listaUFs;
        this.Nota = calcularNotaModulo();
        this.Horas_Totales_Modulo = horastotales();
    }

    public Modulo(int Codi_Modulo, String Nombre_Modulo, String Descripcion_Modulo, int UFS, ArrayList<UF> listaUFs) {
        this.Codi_Modulo = Codi_Modulo;
        this.Nombre_Modulo = Nombre_Modulo;
        this.Descripcion_Modulo = Descripcion_Modulo;
        this.Horas_Totales_Modulo = 0;
        this.UFS = UFS;
        this.listaUFs = listaUFs;
    }
    

    public int getCodi_Modulo() {
        return Codi_Modulo;
    }

    public void setCodi_Modulo(int Codi_Modulo) {
        this.Codi_Modulo = Codi_Modulo;
    }

    public String getNombre_Modulo() {
        return Nombre_Modulo;
    }

    public void setNombre_Modulo(String Nombre_Modulo) {
        this.Nombre_Modulo = Nombre_Modulo;
    }

    public String getDescripcion_Modulo() {
        return Descripcion_Modulo;
    }

    public void setDescripcion_Modulo(String Descripcion_Modulo) {
        this.Descripcion_Modulo = Descripcion_Modulo;
    }

    public int getHoras_Totales_Modulo() {
        return Horas_Totales_Modulo;
    }

    public void setHoras_Totales_Modulo(int Horas_Totales_Modulo) {
        this.Horas_Totales_Modulo = Horas_Totales_Modulo;
    }

    public int getUFS() {
        return UFS;
    }

    public void setUFS(int UFS) {
        this.UFS = UFS;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public ArrayList<UF> getListaUFs() {
        return listaUFs;
    }

    public void setListaUFs(ArrayList<UF> listaUFs) {
        this.listaUFs = listaUFs;
    }

    static public void generarCodigoModulo() {
        cont++;
    }

    public double calcularNotaModulo() {
        double sumaNotas = 0;
        for (int i = 0; i < listaUFs.size(); i++) {
            sumaNotas += listaUFs.get(i).getNota_UF();
        }
        return sumaNotas / listaUFs.size();
    }
    
    public int horastotales()
    {
        int horastotales = 0;
        for (int i = 0; i < listaUFs.size(); i++) {
            horastotales += listaUFs.get(i).getHoras();
        }
        return horastotales;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo Modulo= ").append(Codi_Modulo).append("\n");
        sb.append("Nombre Modulo = ").append(Nombre_Modulo).append("\n");
        sb.append("Descripcion Modulo = ").append(Descripcion_Modulo).append("\n");
        sb.append("Horas Totales del Modulo = ").append(Horas_Totales_Modulo).append("\n");
        sb.append("Numero de UFS del Modulo = ").append(UFS).append("\n");
        sb.append("Nota del Modulo = ").append(Nota).append("\n");
        sb.append("*******************************\n");
        sb.append("\tLista de UFS\n");
        sb.append("*******************************\n");
        for (int i = 0; i < listaUFs.size(); i++) {
            sb.append(listaUFs.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
    
    public String toString_1()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo Modulo= ").append(Codi_Modulo).append("\n");
        sb.append("Nombre Modulo = ").append(Nombre_Modulo).append("\n");
        sb.append("Descripcion Modulo = ").append(Descripcion_Modulo).append("\n");
        sb.append("Horas Totales del Modulo = ").append(Horas_Totales_Modulo).append("\n");
        sb.append("Numero de UFS del Modulo = ").append(UFS).append("\n");
        sb.append("*******************************\n");
        sb.append("\tLista de UFS\n");
        for (int i = 0; i < listaUFs.size(); i++) {
        sb.append(listaUFs.get(i).toString_1()).append("\n");
        }
        return sb.toString();
    }
}
