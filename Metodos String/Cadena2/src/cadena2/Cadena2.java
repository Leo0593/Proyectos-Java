package cadena2;
public class Cadena2 {
    public static void main(String[] args) {
    
        String frase = "Mañana es sabado y voy a ir cenar con los amigos por la zona de marcha de Logroño";
        System.out.println(frase);
        
        
        int cont = 0;
        
        for (int i = 0; i < frase.length(); i++)
        {
            char caracter = frase.charAt(i); 
                if (caracter == 'A' || caracter == 'a' )
                {
                    cont++;
                }
        }
        
        System.out.println("La letra (a) aparece "+cont+" veces");

        
}    
}
