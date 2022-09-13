package Sockets.client;

import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        final int PORT = 1234;
        final String IP = "127.0.0.1";
        Socket clientSocker = null;

        //request connection
        try {

            clientSocker = new Socket(IP, PORT);
            
        } catch (Exception e) {
            System.out.println("Não foi possível fazer a conexão.");
            System.out.println(e.getMessage());
            return;
            //TODO: handle exception
        }

        //comunication

        //end connection

        try {
            clientSocker.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }
    }
    
}
