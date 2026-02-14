package com.example.websocket;

import org.glassfish.tyrus.server.Server;

public class WebSocketServer {

    public static void main(String[] args) {
    	//  Server server = new Server("localhost", 8080, "/", null, EchoEndpoint.class);
    	String port = System.getenv("PORT");
    	//String servidor = "localhost";
    	 String servidor ="0.0.0.0";  
    	if (port == null)
    		port ="8080";
    	Server server = new Server(servidor, Integer.parseInt(port), "/", null, EchoEndpoint.class);
        try {
            server.start();
            System.out.println("Servidor WebSocket iniciado en ws://"+servidor+":"+port+"/ws");
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }
    }
}


