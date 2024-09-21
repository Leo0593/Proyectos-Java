package proyecto22;
public class Proyecto22 
{
    public static void main(String[] args) 
{
    int limite = 345;
  

        System.out.println("Numeros primos menores que 345:");
        for (int i = 2; i < limite; i++) 
        {
            int div = 0;
            for(int a=1; a<=i/2;a++){
                if(i%a==0)
                {
                    div+=2;
                }
                if(i%a>2)
                {
                  break;
                }
            }
            if (div ==2)
            {
             System.out.println(""+i);
            }       
  }
}        
}
     
 
    
