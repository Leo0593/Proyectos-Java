
package aplicacion2b_objetos;

import java.util.Scanner;



public class Aplicacion2B_objetos {

   
    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);
           
          System.out.println("\tDATOS PERSONA 1");
          System.out.println("********************************");
          System.out.print("INGRESA TU NOMBRE: ");
          String Nombre = reader.nextLine();
          //PERSONA2.setNombre(Nombre);
          System.out.print("INGRESA TU APELLIDO: ");
          String Apellido = reader.nextLine();
          System.out.print("INGRESA TU EDAD: ");
          int Edad = reader.nextInt();
          System.out.print("INGRESA TU SEXO: ");
          char Sexo = reader.next().charAt(0);
          System.out.print("INGRESA TU ALTURA: ");
          double Altura = reader.nextDouble();
          System.out.print("INGRESA TU PESO: ");
          double Peso = reader.nextDouble();
          Datos PERSONA1 = new Datos(Nombre,Apellido,Edad,Sexo,Altura,Peso);
          PERSONA1.Generar();
          System.out.println("********************************");
          System.out.println(PERSONA1.toString());
          System.out.println("TU IMC ES : "+PERSONA1.CalcularIMC());
          System.out.println("********************************");
          
          Datos PERSONA2 = new Datos(Nombre, Apellido,Edad,Sexo );
          PERSONA2.Generar();
          System.out.println("\tDATOS PERSONA 2");
          System.out.println("********************************");
          System.out.println(PERSONA2.toString1());
          System.out.println("TU IMC ES : "+PERSONA1.CalcularIMC());
          System.out.println("********************************");
          
          Datos PERSONA3 = new Datos();
          
          System.out.println("\tDATOS PERSONA 3 DEFAULT");
          System.out.println("********************************");
          System.out.println(PERSONA3.toString());
          System.out.println("********************************");
          System.out.println("\tDATOS PERSONA 3");
          System.out.println("********************************");
          PERSONA3.setNombre("Pamela");
          PERSONA3.setApellido("Ortiz");
          PERSONA3.setEdad(19);
          PERSONA3.setSexo('F');
          PERSONA3.setAltura(1.55);
          PERSONA3.setPeso(53);
          PERSONA3.Generar();
          PERSONA3.Mayor();
          System.out.println(PERSONA3.toString());
          System.out.println("TU IMC ES : "+PERSONA3.CalcularIMC());

          
          
          
    }
    
}
