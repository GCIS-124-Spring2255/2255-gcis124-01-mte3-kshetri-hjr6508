// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockServer.java (inside knockknock package)

package mte3.knockknock;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class KnockKnockServer {
    public static int PORT = 54322;

    public static void receiveAndSend(Scanner scanner,String message,PrintWriter writer,boolean concat) {
        String line = scanner.nextLine();
        System.out.println("Recived: " + line );
        writer.println(message);
        writer.flush();
        System.out.println("Sent:" + message );
    } // receiveAndSend() method closed
    public static String receive( Scanner scanner ){
        return scanner.nextLine();
    }
    public static void send( String message, PrintWriter writer ){
        writer.println(message);
        writer.flush();
    }
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(PORT)) {
            Socket connection = server.accept();
            PrintWriter out = new PrintWriter( connection.getOutputStream() );
            Scanner in = new Scanner( connection.getInputStream() );

            receiveAndSend(in, "Who's there?", out, false);
            String name = receive( in );
            send(name+" who?", out);
            receiveAndSend(in, "<reaction>", out, false);
            



            
            connection.close();
            out.close();
            in.close();
        }
        catch( Exception e ){ e.printStackTrace(); }
    
    } // main() method closed
}