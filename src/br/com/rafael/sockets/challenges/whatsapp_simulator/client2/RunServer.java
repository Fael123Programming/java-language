package br.com.rafael.sockets.challenges.whatsapp_simulator.client2;

import br.com.rafael.sockets.challenges.whatsapp_simulator.runners.ServerRunner;

public class RunServer {
    public static void main(String[] args) {
        ServerRunner server = new ServerRunner(20);
        server.run();
    }
}
