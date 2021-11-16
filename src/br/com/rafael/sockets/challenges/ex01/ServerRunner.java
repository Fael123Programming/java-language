package br.com.rafael.sockets.challenges.ex01;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerRunner {
    public static void main(String[] args) {
        (new Thread(new Server(10, "C:\\Users\\rafae\\OneDrive\\Documents\\prg\\java\\java-language\\src\\br\\com\\rafael\\sockets\\helloworld.py"))).start();
    }

    private static class Server implements Runnable {
        private final int port;
        private final String filePath;

        public Server(int port, String filePath) {
            this.port = port;
            this.filePath = filePath;
        }

        @Override
        public void run(){
            try {
                ServerSocket server = new ServerSocket(port);
                System.out.println("Server is running");
                System.out.println("Port: " + port);
                System.out.println("IP address: " + server.getInetAddress().getHostAddress());
                System.out.println("---------------------------------------------------------");
                Socket client = server.accept();
                System.out.println("Client at " + client.getInetAddress().getHostAddress() + " was accepted");
                Scanner localFileReader = new Scanner(client.getInputStream());
                PrintStream localFilePrinter = new PrintStream(filePath);
                while (localFileReader.hasNextLine()) {
                    localFilePrinter.println(localFileReader.nextLine());
                }
                System.out.println("File received successfully!");
                localFilePrinter.close();
                localFileReader.close();
                server.close();
            } catch(IOException ioe) {
                System.out.println("An error occurred in class: " + this.getClass());
            }
        }
    }
}
