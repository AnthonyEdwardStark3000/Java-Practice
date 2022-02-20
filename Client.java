import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
//import java.rmi.UnknownHostException;

public class Client {
    public static void main(String args[]) throws IOException
//            , UnknownHostException
    {
        Socket sock = new Socket("127.0.0.1", 9999);
        System.out.println("Client connected with the server..");
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();
        out.write("Hello from the client".getBytes());
        byte [] response = new byte[1024];
        in.read(response);
        System.out.println("Response Received is:"+new String(response).trim());
        sock.close();
    }
}
