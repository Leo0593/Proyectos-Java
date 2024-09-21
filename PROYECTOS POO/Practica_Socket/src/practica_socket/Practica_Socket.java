
package practica_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Practica_Socket {

    
    public static void main(String[] args) {

       
            ServerSocket servidor = null;
            Socket sc = null;
            int PUERTO = 5000;
            DataInputStream in;
            DataOutputStream out;
            
         try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("SERVIDOR INICIADO");
            
            while(true)
            {
                sc = servidor.accept();
                System.out.println("Su pedido es:");
                in =new DataInputStream(sc.getInputStream());
                out =new DataOutputStream(sc.getOutputStream());
                String mensaje = in.readUTF();
                System.out.println(mensaje);
                
                out.writeUTF("SU PEDIDO A SIDO RECIVIDO");
                sc.close();
            }
            
      
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Practica_Socket.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
}
