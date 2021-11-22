package br.com.rafael.sockets.multiple_connections;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private List<PrintStream> clientPrintStreams;
    private int port;

    public static void main(String[] args) {
        try {
            (new Server(12345)).execute();
        } catch (IOException ioe) {
            System.out.println("An IOException was thrown out");
        }
    }

    public void execute() throws IOException {
        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("Port " + port + " opened");
            while (true) { //This server will be on eternally.
                Socket client = server.accept();
                System.out.println("New connection with client " + client.getInetAddress().getHostAddress());
                clientPrintStreams.add(new PrintStream(client.getOutputStream()));
                //Keeping hold of all print streams of our clients. Once a message has been sent
                //from a client in the net, we can resend it to all other clients.
                (new Thread(new ClientDealer(client.getInputStream(), this))).start();
            }
        } catch(IOException ioe) {
            System.out.println("An error occurred...");
        }
    }

    public Server(int port) {
        this.port = port;
        this.clientPrintStreams = new ArrayList<>();
    }

    public List<PrintStream> getClientPrintStreams() {
        return clientPrintStreams;
    }

    public void setClientPrintStreams(List<PrintStream> clientPrintStreams) {
        this.clientPrintStreams = clientPrintStreams;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void distributeMessage(String message) {
        if (clientPrintStreams == null)
            return;
        if (clientPrintStreams.size() == 0)
            return;
        for (PrintStream printer : clientPrintStreams)  //for-each uses iterators...
            printer.println(message);
    }
}
