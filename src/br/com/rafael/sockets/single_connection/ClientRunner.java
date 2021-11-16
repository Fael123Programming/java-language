package br.com.rafael.sockets.single_connection;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//import java.net.*;
//java.net is the basic API to use when making talkative applications in Java (client -> server).
//To find out what is your IP address: on command prompt, type "ipconfig".

public class ClientRunner {
    public static void main(String[] args) {
        //A socket is a bidirectional mechanism used to connect two points in
        //a data communication.
        //A protocol is a language in which machines use to communicate and 
        //exchange information (bytes). TCP (Transmission Control Protocol) is
        //that protocol which ensures that all information being transferred from
        //one machine to another will arrive safely and reliably.
        //Through TCP, you can create a stream between computers in
        //an IP-addressed network.
        //We have only one physical connection but through it multiple
        //applications communicate; all of them is identified uniquely.
        //To do that, each computer have their gates: each app use a gate
        //to move data to and fro.
        //A gate is a value of 2 Bytes: varies from 0 to 65535.
        //If all of them are occupied, then it is impossible to communicate
        //with that machine!
        //http standard gate is 80.
        //An application address is made of: anIPAddress:specificGate;
        //To make that many clients can communicate at the same time, a specific
        //gate is used to only "receive the guests". After being accepted, the client
        //is moved to another gate. It allows multiple connections meanwhile!!!
        //In Java, this mechanism is done by threads (multiple execution lines).
        (new Thread(new Client(10, "0.0.0.0"))).start();
    }

    private static class Client implements Runnable {
        private final int portToConnect;
        private final String serverIPAddress;

        public Client(int portToConnect, String serverIPAddress) {
            this.portToConnect = portToConnect;
            this.serverIPAddress = serverIPAddress;
        }

        @Override
        public void run() {
            try {
                Socket clientSocket = new Socket(serverIPAddress, portToConnect);
                System.out.println("Client has been connected to server " + serverIPAddress + " on port " + portToConnect);
                PrintStream printer = new PrintStream(clientSocket.getOutputStream());
                Scanner input = new Scanner(System.in);
                while (input.hasNextLine()) {
                    printer.println(input.nextLine());
                }
                input.close();
                printer.close();
                clientSocket.close();
            } catch (IOException ioe) {
                System.out.println("An error occurred in method run() of class Client");
            }
        }
    }
}
