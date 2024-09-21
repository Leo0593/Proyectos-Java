package array9;
public class Array9 {
    public static void main(String[] args) {
        int numeros [] = new int [15];
        int i;
        int n1=1;
        System.out.println("Secuencia primaria");
        for(i=0; i<numeros.length;i++)
        {
            numeros [i]= n1;
            n1=n1+1;
            System.out.print(+numeros [i]+"-");
        }
        System.out.println("\nSecuencia invetida");
        
        for ( i = numeros.length - 1; i >=0 ; i--) 
        {
            
            System.out.print(+numeros[i]+"-");
        }
    }  
}
