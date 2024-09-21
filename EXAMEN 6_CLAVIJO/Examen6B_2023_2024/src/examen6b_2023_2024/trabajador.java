
package examen6b_2023_2024;


public class trabajador {
    
    private String nombre;
    private int horas;
    private String turno;
    private int bruto;
    private double neto;

    public trabajador(String nombre, int horas, String turno) {
        this.nombre = nombre;
        
        if(horas < 200)
        {
          this.horas = horas;
        }else
        {
            this.horas = 0;
        }
       
        this.turno = turno;
        this.bruto = cotizacion();
        this.neto = neto(this.bruto);
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public String getTurno() {
        return turno;
    }
    
    public int cotizacion()
    {
        int valor = 0;
        
        if(turno.equals("Mati"))
        {
           valor = horas * 10;
        }else if (turno.equals("Tarda"))
        {
            valor = horas * 15;
        }else if (turno.equals("Nit"))
        {
            valor = horas * 20;
        }
        
        return valor;   
    }
    
    public double neto(int valor)
    {
        double neto = 0;
        if(valor < 1100)
        {
            neto = valor * 0.97;
            
        }else if(valor > 1100 && valor <= 1700){
            neto = valor * 0.88;
        }else if(valor > 1700 && valor <= 2000){
            neto = valor * 0.83;
        }else if(valor > 2000){
            neto = valor * 0.78;
        }

        return neto;
    }
    
    public String toString()
    {
        return "Nombre: " + nombre+"\n"+
                "Numero de horas: "+horas+"\n"+
                "Turno: "+turno+"\n"+
                "Suleto bruto: "+bruto+"\n"+
                 "Suleto bruto: "+neto+"\n";
        
    }
    
    
}
