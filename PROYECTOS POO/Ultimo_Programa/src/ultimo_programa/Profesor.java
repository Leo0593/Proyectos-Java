
package ultimo_programa;

import java.util.ArrayList;


public class Profesor extends Persona{
   
    protected String Codi_Prof;
    static int count;
    private ArrayList<Modulo> modulos;
    
    public Profesor(String Nombre, String Apellido, String DNI, String Sexo, int Telefono, String Correo) {
        super(Nombre, Apellido, DNI, Sexo, Telefono, Correo);
        Incrementar();
        this.Codi_Prof = "P" + count;
        this.modulos = new ArrayList<>();
    }

    static public void Incrementar()
    {
        count++;
    }

    public String getCodi_Prof() {
        return Codi_Prof;
    }
    
    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("*******************************\n");
        builder.append("\tDATOS DE LOS PROFESORES\n");
        builder.append("*******************************\n");
        builder.append("•Codi_Profesor: ").append(getCodi_Prof()).append("\n");
        builder.append("•Nombre: ").append(Nombre).append("\n");
        builder.append("•Apellido: ").append(Apellido).append("\n");
        builder.append("•DNI: ").append(DNI).append("\n");
        builder.append("•Sexo: ").append(Sexo).append("\n");
        builder.append("•Telefono: ").append(Telefono).append("\n");
        builder.append("•Correo: ").append(Correo).append("\n");
        builder.append("*******************************\n");
        builder.append("\tMODULOS QUE IMPARTE\n");
        builder.append("*******************************\n");
        for (int i = 0; i < modulos.size(); i++) {
            builder.append(i+") "+modulos.get(i).getNombre_Modulo()).append("\n");
        }
        return builder.toString();
    }

}
