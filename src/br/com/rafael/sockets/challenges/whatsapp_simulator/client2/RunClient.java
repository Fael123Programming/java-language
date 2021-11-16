package br.com.rafael.sockets.challenges.whatsapp_simulator.client2;

import br.com.rafael.sockets.challenges.whatsapp_simulator.runners.ClientRunner;

public class RunClient {
    public static void main(String[] args) {
        final String serverIPAddress = "0.0.0.0";
        final int serverPort = 10;
        ClientRunner client = new ClientRunner(serverIPAddress, serverPort);
        client.run();
    }
}
