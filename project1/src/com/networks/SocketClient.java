package com.networks;
import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        String hostname = "localhost"; // Server's hostname or IP address
//        int port = 1234; // Server's port
//
//        try  {
//            // Create input stream to receive data from the server
//        	Socket socket = new Socket(hostname, port);
//            InputStream input = socket.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//
//            // Read and print the message from the server
//            String message = reader.readLine();
//            System.out.println("Server says: " + message);
//
//        } catch (UnknownHostException ex) {
//            System.out.println("Server not found: " + ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println("I/O error: " + ex.getMessage());
//        }
        try {
        	Socket socket = new Socket("localhost",2527);
        	InputStream inputStream = socket.getInputStream();
        	BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));
        	String message=bufferReader.readLine();
        	System.out.println("server says:"+message);
        }
        catch(Exception e)
        {
        	
        }
    }
}
