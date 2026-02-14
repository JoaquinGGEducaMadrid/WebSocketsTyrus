package com.example.websocket;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws")
public class EchoEndpoint {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Cliente conectado: " + session.getId());
    }

    @OnMessage
    public String onMessage(String message) {
        System.out.println("Mensaje recibido: " + message);
        return "Eco: " + message;
    }
}



