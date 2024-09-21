
package ultimo_programa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Ultimo_Programa {
    
    ArrayList<Modulo> Modulos = new ArrayList<>();
    ArrayList<Alumno> Alumnos = new ArrayList<>();
    ArrayList<Profesor> Profesores = new ArrayList<>();
    
    public static void main(String[] args) {
        Ultimo_Programa programa = new Ultimo_Programa ();
        programa.inicio();
    }
    
    public void inicio(){
        
        Scanner reader = new Scanner(System.in);
        int eleccion = 0;
        do{
        System.out.println("*******************************");
        System.out.println("\tBIENVENIDO ");
        System.out.println("*******************************");
        System.out.println("1) INFORMACION SOBRE CICLOS");
        System.out.println("2) INGRESAR DATOS DE UN MODULO");
        System.out.println("3) REGISTRAR UN ALUMNO");
        System.out.println("4) REGISTRAR UN PROFESOR");
        System.out.println("5) ASIGNAR MODULO A UN ALUMNO");
        System.out.println("6) ASIGNAR MODULO A UN PROVESOR");
        System.out.println("7) ASIGNAR NOTA A UNA UF");
        System.out.println("8) IMPRIMIR INFORMACION DE ALUMNOS");
        System.out.println("9) IMPRIMIR INFORMACION DE PROFESOR");
        System.out.println("10) IMPRIMIR MODULOS");
        System.out.println("11) SALIR");
        System.out.println("----------------------------------");
        System.out.print("CUAL ES TU ELECCION: ");
        eleccion = verificar();
        System.out.println("--------------------------------\n");
        switch (eleccion) {
                case 1:
                    Menu_Ciclos();
                    break;
                case 2:
                    modulos_ARI();
                    break;
                case 3:
                    crearAlumno();
                    break;
                case 4:
                    crearProfesor();
                    break;
                case 5:
                    asignarModuloAlumno();
                    break;
                case 6:
                    asignarModuloProfesor();
                    break;
                case 7:
                    asignarNotaUF();
                    break;
                case 8:
                    imprimirAlumnos();
                    break;
                case 9:
                    imprimirProfesor();
                    break;
                case 10:
                    imprimirModulos();
                    break;
            }
        } while (eleccion != 11);
        
    }
    
    public void Menu_Ciclos()
    {
        System.out.println("****************************************");
        System.out.println("BIENVENIDO AL MENU DE CICLOS FORMATIVOS ");
        System.out.println("****************************************");
        System.out.println("1) Automatizacion y Robotica Industrial (ARI)");
        System.out.println("2) Desarrollo de Aplicaciones Multiplataformas (DAM)");
        System.out.println("------------------------------------");
        System.out.print("QUE CICLO FORMATIVO DESEA CONOCER: ");
        int eleccion = verificar();
        System.out.println("------------------------------------");
        if(eleccion == 1)
        {
           descripcion_ARI();
           System.out.println("------------------------------------");
           System.out.println("DESEA CONOCER LOS MODULOS:");
           System.out.println("1) SI");
           System.out.println("2) NO");
           System.out.print("CUAL ES TU ELECCION: ");
           int modulo = verificar();
           System.out.println("------------------------------------");
           if(modulo == 1){
              imprimirModulos();
           System.out.println("------------------------------------");
           }
        }else if(eleccion == 2){
            descripcion_DAM();
        }
    }
    
    public void descripcion_ARI(){
        Ciclo_Formativo descri_principal = new Ciclo_Formativo ("CFGS Automatizacion y Robotica Industrial",
                " Este programa educativo esta preparado para capacitar a los estudiantes \n"
                        + "en la instalacion, la programacion y el mantenimiento de sistemas automatizados y robots industriales \n"
                        + "asi como en el control y la supervision de procesos industriales.",
                2000);
         System.out.println("CICLO ESCOGIDO: " + descri_principal.getNombre());
         System.out.println("\nDESCRIPCION:" + descri_principal.getDescripcion());
         System.out.println("\nHORAS TOTALES: " + descri_principal.getHoras_Totales());
    }
    public void descripcion_DAM(){
        Ciclo_Formativo descri_principal = new Ciclo_Formativo ("CFGS Desarrollo de Aplicaciones Multiplataformas",
                " Es un programa educativo planteado para proporcionar a los estudiantes los conocimientos y habilidades\n"
                        + "necesarios para desarrollar aplicaciones informaticas que puedan ser ejecutadas en diferentes plataformas\n"
                        + "como dispositivos moviles, computadoras de escritorio y servidores web.",
                2000);
         System.out.println("CICLO ESCOGIDO: " + descri_principal.getNombre());
         System.out.println("\nDESCRIPCION:" + descri_principal.getDescripcion());
         System.out.println("\nHORAS TOTALES: " + descri_principal.getHoras_Totales());
    }
    
    public void modulos_ARI() {
        Scanner reader = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.print("INGRESA EL NOMBRE DEL MODULO: ");
        String nombre = reader.nextLine();
        System.out.print("INGRESA LA DESCRIPCION DEL MODULO: ");
        String Descripcion = reader.nextLine();
        int UFS = numero_Uf();
        ArrayList<UF> listaUFs = obtenerUFs(UFS);
        Modulo datos = new Modulo(nombre, Descripcion, UFS, listaUFs);
        Modulos.add(datos);
        System.out.println("*******************************");
        System.out.println("\t INGRESO EXITOSO");
        System.out.println("*******************************");
    }
    
    public int numero_Uf() {
        System.out.print("INGRESA EL NUMERO DE UFS: ");
        return verificar();
    }
    public ArrayList<UF> obtenerUFs(int UFS) {
        Scanner reader = new Scanner(System.in);
        ArrayList<UF> listaUFs = new ArrayList<>();
        for (int i = 0; i < UFS; i++) {
            System.out.println("*******************************");
            System.out.print("INGRESA EL NOMBRE DE LA UF: ");
            String nombre = reader.nextLine();
            System.out.print("INGRESA LA DESCRIPCION DE LA UF: ");
            String Descripcion = reader.nextLine();
            System.out.print("HORAS QUE TIENE LA UF: ");
            int horas_totales = verificar();
            UF uf = new UF(nombre, Descripcion, horas_totales);
            listaUFs.add(uf);
        }
        return listaUFs;
    }
    
    
    public void crearAlumno() {
        System.out.println("*******************************");
        String Nom;
        String Cognom;
        String dni;
        String sexo;
        int telf;
        String correo;
        
        Nom = VerificarPalabra("el nombre");
        Cognom = VerificarPalabra("el apellido");
        dni = generarDNI();
        sexo = VerificarSexo();
        telf = generarTelf();
        correo = generarCorreo(Nom,Cognom);        

        Alumno alumno = new Alumno(Nom, Cognom, dni, sexo, telf,correo);
        Alumnos.add(alumno);
        System.out.println("*******************************");
        System.out.println("\t INGRESO EXITOSO");
        System.out.println("*******************************");
    }
    public void crearProfesor() {
        
        System.out.println("*******************************");
        String Nom;
        String Cognom;
        String dni;
        String sexo;
        int telf;
        String correo;
        
        Nom = VerificarPalabra("el nombre");
        Cognom = VerificarPalabra("el apellido");
        dni = generarDNI();
        sexo = VerificarSexo();
        telf = generarTelf();
        correo = generarCorreo(Nom,Cognom);        

        Profesor profesor = new Profesor(Nom, Cognom, dni, sexo, telf,correo);
        Profesores.add(profesor);
        System.out.println("*******************************");
        System.out.println("\t INGRESO EXITOSO");
        System.out.println("*******************************");
    }
    
    public void asignarModuloProfesor(){
        
       Scanner reader = new Scanner(System.in);
        if (Profesores.size() == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("\tLISTA DE PROFESORES");
        System.out.println("*******************************");
        for (int i = 0; i < Profesores.size(); i++) {
            System.out.println((i + 1) + ") " + Profesores.get(i).getNombre());
        }
        System.out.print("SELECCIONA EL PROFESOR POR NUMERO: ");
        int indiceAlumno = verificar() - 1;

        if (indiceAlumno < 0 || indiceAlumno >= Profesores.size()) {
            System.out.println("Indice no valido.");
            return;
        }

        if (Modulos.size() == 0) {
            System.out.println("No hay modulos registrados.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("\tLISTA DE MODULOS");
        System.out.println("*******************************");
        for (int i = 0; i < Modulos.size(); i++) {
            System.out.println((i + 1) + ") " + Modulos.get(i).getNombre_Modulo());
        }
        System.out.print("SELECCIONA EL MODULO POR NUMERO: ");
        int indiceModulo = verificar() - 1;

        if (indiceModulo < 0 || indiceModulo >= Modulos.size()) {
            System.out.println("Indice no valido.");
            return;
        }

        Profesores.get(indiceAlumno).agregarModulo(Modulos.get(indiceModulo));
        System.out.println("*******************************");
        System.out.println("\t MODULO ASIGNADO EXITOSAMENTE");
        System.out.println("*******************************");
    }
    public void asignarModuloAlumno(){
        
       Scanner reader = new Scanner(System.in);
        if (Alumnos.size() == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("\tLISTA DE ALUMNOS");
        System.out.println("*******************************");
        for (int i = 0; i < Alumnos.size(); i++) {
            System.out.println((i + 1) + ") " + Alumnos.get(i).getNombre());
        }
        System.out.print("SELECCIONA EL ALUMNO POR NUMERO: ");
        int indiceAlumno = verificar() - 1;

        if (indiceAlumno < 0 || indiceAlumno >= Alumnos.size()) {
            System.out.println("Indice no valido.");
            return;
        }

        if (Modulos.size() == 0) {
            System.out.println("No hay modulos registrados.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("\tLISTA DE MODULOS");
        System.out.println("*******************************");
        for (int i = 0; i < Modulos.size(); i++) {
            System.out.println((i + 1) + ") " + Modulos.get(i).getNombre_Modulo());
        }
        System.out.print("SELECCIONA EL MODULO POR NUMERO: ");
        int indiceModulo = verificar() - 1;

        if (indiceModulo < 0 || indiceModulo >= Modulos.size()) {
            System.out.println("Indice no valido.");
            return;
        }

        Alumnos.get(indiceAlumno).agregarModulo(Modulos.get(indiceModulo));
        System.out.println("*******************************");
        System.out.println("\t MODULO ASIGNADO EXITOSAMENTE");
        System.out.println("*******************************");
    }
    public void asignarNotaUF() {
        Scanner reader = new Scanner(System.in);
        if (Alumnos.size() == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("\tLISTA DE ALUMNOS");
        System.out.println("*******************************");
        for (int i = 0; i < Alumnos.size(); i++) {
            System.out.println((i + 1) + ") " + Alumnos.get(i).getNombre());
        }
        System.out.print("SELECCIONA EL ALUMNO POR NUMERO: ");
        int indiceAlumno = verificar() - 1;

        if (indiceAlumno < 0 || indiceAlumno >= Alumnos.size()) {
            System.out.println("Indice no valido.");
            return;
        }

        Alumno alumno = Alumnos.get(indiceAlumno);
        if (alumno.getModulos().size() == 0) {
            System.out.println("El alumno no tiene modulos asignados.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("\tLISTA DE MODULOS DEL ALUMNO");
        System.out.println("*******************************");
        for (int i = 0; i < alumno.getModulos().size(); i++) {
            System.out.println((i + 1) + ") " + alumno.getModulos().get(i).getNombre_Modulo());
        }
        System.out.print("SELECCIONA EL MODULO POR NUMERO: ");
        int indiceModulo = verificar() - 1;

        if (indiceModulo < 0 || indiceModulo >= alumno.getModulos().size()) {
            System.out.println("Indice no valido.");
            return;
        }

        Modulo modulo = alumno.getModulos().get(indiceModulo);
        if (modulo.getListaUFs().size() == 0) {
            System.out.println("El modulo no tiene UFs asignadas.");
            return;
        }

        System.out.println("*******************************");
        System.out.println("\tLISTA DE UFs DEL MODULO");
        System.out.println("*******************************");
        for (int i = 0; i < modulo.getListaUFs().size(); i++) {
            System.out.println((i + 1) + ") " + modulo.getListaUFs().get(i).getNombre_UF());
        }
        System.out.print("SELECCIONA LA UF POR NUMERO: ");
        int indiceUF = verificar() - 1;

        if (indiceUF < 0 || indiceUF >= modulo.getListaUFs().size()) {
            System.out.println("Indice no valido.");
            return;
        }

        UF uf = modulo.getListaUFs().get(indiceUF);
        System.out.print("INGRESA LA NOTA PARA LA UF: ");
        double nota = verificarNota();

        uf.setNota_UF(nota);
        modulo.setNota(modulo.calcularNotaModulo());
        System.out.println("*******************************");
        System.out.println("\t NOTA ASIGNADA EXITOSAMENTE");
        System.out.println("*******************************");
    }   
    
    
    public void imprimirModulos() {
        if (Modulos.size() > 0) {
            System.out.println("*******************************");
            System.out.println("\tLISTA DE MODULOS");
            System.out.println("*******************************");
            for (Modulo modulo : Modulos) {
                System.out.println(modulo.toString_1());
                System.out.println("-----------------------------");
            }
        } else {
            System.out.println("No hay ningun modulo");
        }
    }
    public void imprimirAlumnos() {
    if (Alumnos.size() > 0) {
       
        for (int i = 0; i < Alumnos.size(); i++) {
            System.out.println(Alumnos.get(i).toString());
            System.out.println("-----------------------------");
        }
    } else {
        System.out.println("No hay ningun alumno registrado.");
    }
}
    public void imprimirProfesor() {
    if (Profesores.size() > 0) {
       
        for (int i = 0; i < Profesores.size(); i++) {
            System.out.println(Profesores.get(i).toString());
            System.out.println("-----------------------------");
        }
    } else {
        System.out.println("No hay ningun profesor registrado.");
        }
    }
    private int verificar() {
        Scanner reader = new Scanner(System.in);
        boolean fin = false;
        int indice = 0;
        do {
            if (reader.hasNextInt()) {
                indice = reader.nextInt();
                if(indice > -1){
                    fin = true;
                }else{
                System.out.println("--------------------------------------------");
                System.out.print("NUMERO NEGATIVO, NO VALIDO: ");
                
                }
            } else {
                System.out.println("--------------------------------------------");
                System.out.print("ERROR, VULELVA A INGRESAR: "); 
                reader.next();
                
            }
        } while (!fin);
        return indice;
    }
    public double verificarNota() {
        Scanner reader = new Scanner(System.in);
        boolean fin = false;
        double nota = 0;
        do {
            if (reader.hasNextDouble()) {
                nota = reader.nextDouble();
                reader.nextLine(); // consume the newline
                if (nota >= 0 && nota <= 10) {
                    fin = true;
                } else {
                    System.out.println("--------------------------------------------");
                    System.out.print("NOTA NO VALIDA, DEBE ESTAR ENTRE 0 Y 10: ");
                }
            } else {
                System.out.println("--------------------------------------------");
                System.out.print("ERROR, VUELVA A INGRESAR: ");
                reader.next();
            }
        } while (!fin);
        return nota;
    }
    
    static private String VerificarPalabra(String string){
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        do {
            System.out.print("Ingresa " +string+ ": ");
            palabra = sc.nextLine();
            
        } while (!esPalabraValida(palabra)); 
        
        return palabra;
    }
    public static boolean esPalabraValida(String palabra) {
    // Verifica si la palabra no es un número y tiene más de 2 letras
        if (palabra.matches("\\d+")) 
        {
            System.out.println("Error, la palabra no puede ser un número.");
            return false;
        } else if (palabra.length() < 1) {
            System.out.println("Error, la palabra debe tener más de 1 letra.");
            return false;
        }
        return true;
    }
    static private int VerificarNum(String string){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean tipuscorrecte = false;
        do {
            System.out.print("Ingresa " +string+ ": ");
            tipuscorrecte = sc.hasNextInt();
            if (tipuscorrecte) {
                num = sc.nextInt();
            } else {
                System.out.println("ERROR: caracter incorrecto");
                sc.next();
            }
            sc.nextLine();
        } while (!tipuscorrecte); 
        
        return num;
    }
    static private String generarDNI(){
        String DNI;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            sb.append(random.nextInt(10)); // Generar un número aleatorio entre 0 y 9
        }

        // Calcular el dígito de control
        String dniSinDigitoControl = sb.toString();
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma += Character.getNumericValue(dniSinDigitoControl.charAt(i)) * (i + 1);
        }
        int resto = suma % 23;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char digitoControl = letras[resto];

        // Asignar el DNI generado a la persona
        DNI = dniSinDigitoControl + digitoControl;
        return DNI;
    }
    static private int generarTelf(){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
             sb.append(random.nextInt(10)); // Generar un número aleatorio entre 0 y 9
        }

        int telf = Integer.parseInt(sb.toString());

        return telf;
    }
    static private String generarCorreo(String Nombre, String Apellido){
        String correo = Nombre.toLowerCase() + Apellido.toLowerCase() + "@gmail.com";
        return correo;
    }
    private static String VerificarSexo() {
        Scanner sc = new Scanner(System.in);
        String sexo;
        
        while (true) {
            System.out.print("Ingrese el sexo (M/F): ");
            sexo = sc.nextLine().trim();
            
            // Verificar que la longitud sea 1 y que sea 'm' o 'f' ignorando mayúsculas
            if (sexo.length() == 1 && (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, intente nuevamente.");
            }
        }
        
        return sexo;
    }

}
