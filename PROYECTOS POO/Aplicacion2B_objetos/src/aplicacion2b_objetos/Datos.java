package aplicacion2b_objetos;

import java.util.Random;


public class Datos {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private boolean esmayor;
    
    //METODOS CONSTRUCTORES//
    public Datos() {
        this.nombre = " ";
        this.apellido = " ";
        this.edad = 0;
        this.sexo = ComprobarSexo();
        this.altura = 0;
        this.peso = 0;
        this.DNI = Generar();
        this.esmayor = Mayor();
        
    }

    public Datos(String nombre, String apellido, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = ComprobarSexo();
        this.altura = 0;
        this.peso = 0;
        this.DNI = Generar();
        this.esmayor = Mayor();
        
    }

    public Datos(String nombre, String apellido, int edad, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = ComprobarSexo();
        this.altura = altura;
        this.peso = peso;
        this.DNI = Generar();
        this.esmayor = Mayor();
    }
    
            // GET//
    
    public String getNombre() {
        return nombre;
    }
   
    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
                //SET//
    
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
      this.apellido = apellido;
    }

    public void setEdad(int edad) {   
        this.edad = edad;  
    }

    public void setSexo(char sexo) {
        this.sexo = sexo; 
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
            //METODOS//
    
    public int CalcularIMC()
    {
        double alturaMetrosCuadrados = altura * altura;
        double imc = peso/alturaMetrosCuadrados;
        int resultado_imc;
        if(imc < 18.5){
            resultado_imc = -1;
        }else if(imc >= 18.5 && imc <= 24.9){
            resultado_imc = 0;
        }else{
            resultado_imc = 1;
        }
        return resultado_imc;
    }
    
    public boolean Mayor()
    {
        boolean respuesta = false;
        
        if(edad >= 18){
            respuesta = true;   
        }
        else if(edad >= 0 && edad < 18){
            respuesta = false;
        }
        return respuesta;
    }
    
    public char ComprobarSexo()
    {
       char respuesta = ' ';
       if(sexo!= 'H' && sexo!='M'){
            respuesta = 'H';
        }else{
           respuesta = sexo;
       }
       return respuesta;
    }
    
    public String Generar()
    {
        Random rand = new Random();
        String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numeroDNI = rand.nextInt(99999999) + 1; 
        int indiceLetra = numeroDNI % 23;
        char letra = Letras.charAt(indiceLetra);
        String documento = numeroDNI + String.valueOf(letra);
        return documento;
    }
    
    
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Edad: " + edad + "\n" +
               "DNI: " + DNI + "\n" +
               "Sexo: " + sexo + "\n" +
               "Peso: " + altura + "\n" +
               "Altura: " + peso+"\n" +
               "Es mayor de: " + esmayor;
    }
    public String toString1() {
        return "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Edad: " + edad + "\n" +
               "DNI: " + DNI + "\n" +
               "Sexo: " + sexo + "\n" +
               "Es mayor de: " + esmayor;
    } 
}
