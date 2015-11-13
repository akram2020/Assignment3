
/**
 * NAME : MUHAMMAD AKRAM BIN AHMAD
 * MATRIC : 2014873252
 * COURSE CODE : ITT786 
 * DESCRIPTION : SOCKET PROGRAMMING (SERVER-SIDE)
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class serverTestDate {

    /**
     * Run/Start the server.
     */
    public static void main(String[] args) throws IOException 
    {
        ServerSocket collect = new ServerSocket(9090);
        try 
        {
            while (true) 
            {
                Socket socket = collect.accept();
                try 
                {
                    PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                        out.println(new Date().toString());
                } 
                finally 
                {
                    socket.close();
                }
            }
        }
        finally 
        {
            collect.close();
        }
    }
}