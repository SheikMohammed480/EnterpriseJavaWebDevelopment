package com.networks;
import java.io.*;
import java.net.*;

public class SocketServer {
    public static void main(String[] args) {
//        int port = 1234; // Port number
//
//        try  {
//        	ServerSocket serverSocket = new ServerSocket(port);
//            System.out.println("Server is listening on port " + port);
//
//            while (true) {
//                // Wait for a client to connect
//                Socket socket = serverSocket.accept();
//                System.out.println("New client connected");
//
//                // Create output stream to send data to the client
//                OutputStream output = socket.getOutputStream();
//                PrintWriter writer = new PrintWriter(output, true);
//
//                // Send a message to the client
//                writer.println("Hello, Client!");
//
//                // Close the connection
//                socket.close();
//            }
//
//        } catch (IOException ex) {
//            System.out.println("Server exception: " + ex.getMessage());
//            ex.printStackTrace();
//        }
    	int port=2527;
    	try {
    		ServerSocket serverSocket = new ServerSocket(port);
    		System.out.println("server is listening on port:"+port);
    		while(true) {
    			Socket socket = serverSocket.accept();
    			System.out.println("new client connected");
    			OutputStream outputStream = socket.getOutputStream();
    			PrintWriter printWriter = new PrintWriter(outputStream,true);
    			printWriter.println("hi client");
    			socket.close();
    			
    		}
    		
    		
    		
    		

    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
