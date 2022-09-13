package Sockets.server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        final int PORT = 1234;
        
        ServerSocket serverSocket;
        Socket clientSocket = null;


        // create a socket 


         try {
            serverSocket = new ServerSocket(PORT);
         } catch (Exception e) {
            System.out.println("Porta em Uso.");
            System.out.println(e.getMessage());
            return;   
            //TODO: handle exception
         }

         //and waiting connection

        try {
            System.out.println("Aguardando conexão...");
           clientSocket= serverSocket.accept();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
         // comunication





        // end connection

        try {
            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }

    }
    
}
