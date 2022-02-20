import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) throws IOException
    {
        ServerSocket serSocket = new ServerSocket(9999);
        System.out.println("Socket connection is on and waiting for some messages...");
        Socket sock =  serSocket.accept();
        System.out.println("Connected with the client...");
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();
        byte buffer[] = new byte[1024];
        in.read(buffer);
        System.out.println("Message Received from the server :"+new String(buffer).trim());
        out.write("Hello from the server...".getBytes());
        sock.close();
        serSocket.close();
    }
}
