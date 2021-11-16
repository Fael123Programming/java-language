package br.com.rafael.sockets.challenges.ex01;

import java.io.*;
import java.util.Scanner;
import java.net.Socket;

public class ClientRunner {
    public static void main(String[] args) {
        //Transferring a file from a client to a server using threads.
        (new Thread(new Client( "0.0.0.0", 10, "C:\\Users\\rafae\\OneDrive\\Área de Trabalho\\aProgram.py"))).start();
    }

    private static class Client implements Runnable {
        private final String serverIPAddress, filePath; //File to be transferred textually.
        private final int portToConnect;

        public Client(String serverIPAddress, int portToConnect, String filePath) {
            this.serverIPAddress = serverIPAddress;
            this.portToConnect = portToConnect;
            this.filePath = filePath;
        }

        @Override
        public void run(){
            try {
                Socket client = new Socket(serverIPAddress, portToConnect);
                System.out.println("Client socket created and connected to " + serverIPAddress + " on port " + portToConnect);
                Scanner fileReader = new Scanner(new File(filePath));
                PrintStream printer = new PrintStream(client.getOutputStream());
                while (fileReader.hasNextLine()) {
                    printer.println(fileReader.nextLine());
                }
                System.out.println("File transferred to server successfully!");
                printer.close();
                fileReader.close();
                client.close();
            } catch (IOException ioe) {
                System.out.println("Error occurred in class: " + this.getClass());
            }
        }
    }
}
