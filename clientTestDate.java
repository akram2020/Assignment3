
/**
 * NAME : MUHAMMAD AKRAM BIN AHMAD
 * MATRIC : 2014873252
 * COURSE CODE : ITT786 
 * DESCRIPTION : SOCKET PROGRAMMING (CLIENT-SIDE)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;


public class clientTestDate 
{
      public static void main(String[] args) throws IOException 
      {
        String addServ = JOptionPane.showInputDialog("Enter IP Address of the server that is\n" 
        + "running the date service:");
        
        Socket s = new Socket(addServ, 9090);
        BufferedReader ip = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String respond = ip.readLine();
        JOptionPane.showMessageDialog(null, respond);
        
        System.exit(0);
    }
}