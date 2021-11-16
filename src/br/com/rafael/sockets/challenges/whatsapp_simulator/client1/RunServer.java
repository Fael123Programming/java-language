package br.com.rafael.sockets.challenges.whatsapp_simulator.client1;

import br.com.rafael.sockets.challenges.whatsapp_simulator.runners.ServerRunner;

public class RunServer {
    public static void main(String[] args) {
        ServerRunner server = new ServerRunner(10);
        server.run();
    }
}
