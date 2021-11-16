package br.com.rafael.sockets.challenges.whatsapp_simulator.runners;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ServerRunner {
    private final int port;

    public ServerRunner(int port) {
        this.port = port;
    }

    public void run(){
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server running at port: " + port);
            System.out.println("Server's IP address: " + server.getInetAddress().getHostAddress());
            System.out.println("----------------------------------------------------------------------");
            Socket client = server.accept();
            connectionBar();
            System.out.println(client.getInetAddress().getHostAddress() + " connected");
            Scanner input = new Scanner(client.getInputStream());
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Communication ended");
            input.close();
            server.close();
        } catch(IOException ioe) {
            System.out.println("Error in class ServerRunner");
        }
    }

    private void connectionBar(){
        System.out.println("Connecting...");
        for (int i = 0; i < 70; i++) {
            System.out.print("-");
            try {
                Thread.sleep(100);
            } catch(InterruptedException ie) {}
        }
        System.out.println();
    }
}
