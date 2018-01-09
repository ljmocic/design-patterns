package structural.proxy;

import java.util.Scanner;

public class MainProxy {

    public static void main(String[] args) {
        // Just for demo purposes, doesn't actually work without local server
        ISocket socket = new SocketProxy( "127.0.0.1", 8080);
        String s;
        while(true) {
            s = new Scanner(System.in).nextLine();
            socket.writeLine(s);
            if(s.equals("quit")) {
                break;
            }
        }
        socket.dispose();
    }
}
