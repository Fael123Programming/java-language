package br.com.rafael.sockets.challenges.whatsapp_simulator.runners;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientRunner {
    private final String serverIPAddress;
    private final int portToConnect;

    public ClientRunner(String serverIPAddress, int portToConnect) {
        this.serverIPAddress = serverIPAddress;
        this.portToConnect = portToConnect;
    }

    public void run(){
        try {
            Socket client = new Socket(serverIPAddress, portToConnect);
            connectionBar();
            System.out.println("Client connected with server at " + serverIPAddress + " on port " + portToConnect);
            System.out.println("Client's IP: " + client.getInetAddress().getHostAddress());
            System.out.println("----------------------------------------------------------------------");
            Scanner input = new Scanner(System.in);
            PrintStream printer = new PrintStream(client.getOutputStream());
            System.out.println("Type your messages below:");
            while (input.hasNextLine()) {
                printer.println(input.nextLine());
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Communication ended");
            printer.close();
            input.close();
            client.close();
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
