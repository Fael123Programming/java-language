package br.com.rafael.sockets.multiple_connections;

import java.io.InputStream;
import java.util.Scanner;

public class ClientDealer implements Runnable {
    private InputStream client;
    private Server server;

    public ClientDealer(InputStream client, Server server) {
        this.client = client;
        this.server = server;
    }

    public InputStream getClient(){
        return client;
    }

    public void setClient(InputStream client) {
        this.client = client;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public void run(){
        Scanner scanner = new Scanner(client);
        while (scanner.hasNextLine())
            server.distributeMessage(scanner.nextLine());
        scanner.close();
    }
}
