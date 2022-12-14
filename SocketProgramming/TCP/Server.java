package SocketProgramming.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine = "";
        System.out.println("Listening...");
        while (inputLine != null) {
            inputLine = in.readLine();
            if ("hello server".equals(inputLine)) {
                out.println("hello client");
            }
            if (".".equals(inputLine)) {
                out.println("good bye");
                break;
            }
            else{
            out.println(inputLine);
        }
            }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    public static void main(String[] args) throws IOException {
        Server server=new Server();
        server.start(4444);
    }
}