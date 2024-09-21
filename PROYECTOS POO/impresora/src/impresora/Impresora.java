
package impresora;
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;


public class Impresora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Crear el texto a imprimir
        String texto = "Hola, esto es un texto de prueba.\n\n";

        // Obtener el servicio de impresión por defecto
        PrintService service = PrintServiceLookup.lookupDefaultPrintService();

        // Crear un nuevo job de impresión
        DocPrintJob job = service.createPrintJob();

        // Configurar el contenido a imprimir
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(texto.getBytes(), flavor, null);

        // Crear atributos de impresión
        PrintRequestAttributeSet attrs = new HashPrintRequestAttributeSet();
        attrs.add(new Copies(1)); // Número de copias

        try {
            // Imprimir el documento
            job.print(doc, attrs);
        } catch (PrintException e) {
            e.printStackTrace();
        }
        }
    
}
