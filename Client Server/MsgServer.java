import java.net.*;
import java.io.*;
import java.util.*;
public class MsgServer {
    ServerSocket ss = new ServerSocket(1254);

    Socket cs = ss.accept();

    Scanner ins = new Scanner(cs.getInputStream());
    PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);

    string s = ins.nextLine();
    System.out.println("From Client:"+s);
    Outs.println("Hello Client");
    
    outs.close();_
    ins.close();_
    cs.close();_
    ss.close();_
}
