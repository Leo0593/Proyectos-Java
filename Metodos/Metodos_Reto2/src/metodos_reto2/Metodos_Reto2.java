
package metodos_reto2;

public class Metodos_Reto2 {

    
    public static void main(String[] args) {
            Metodos_Reto2 programa = new Metodos_Reto2();
            programa.inicio();
    }
    public void inicio()
    {
        mostrarMaxim(4);
        mostrarMaxim(5);
        mostrarMaxim(6);
        
    }
    
    public void mostrarMaxim(int a)
    {
        for(int i = 0; i < a ; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
