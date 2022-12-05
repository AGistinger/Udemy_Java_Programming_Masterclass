package com.echo_server;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        // Assign a port number and see if socket instance is succesfully created
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            // infinite loop to check if string is not exit
            // Willl accept multiple client connections
            while(true) {
                new Echoer(serverSocket.accept()).start();
            }
        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}