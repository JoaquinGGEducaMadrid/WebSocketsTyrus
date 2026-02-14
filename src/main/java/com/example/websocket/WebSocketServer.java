package com.example.websocket;

import org.glassfish.tyrus.server.Server;

public class WebSocketServer {

    public static void main(String[] args) {
        Server server = new Server("localhost", 8080, "/", null, EchoEndpoint.class);

        try {
            server.start();
            System.out.println("Servidor WebSocket iniciado en ws://localhost:8080/ws");
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }
    }
}

