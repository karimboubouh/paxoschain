package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Server {
	private int id;
	private ArrayList<Object> blockchain;
	private int []ballot;
	private ArrayList<String> transaction ;
	private Socket          socket   = null; 
	private ServerSocket    server   = null; 
	
	public Server(int port) throws ClassNotFoundException 
	 { 
	     // starts server and waits for a connection 
	     try
	     { 
	         server = new ServerSocket(port); 
	         System.out.println("Server started"); 

	         System.out.println("Waiting for a client ..."); 
	         socket = server.accept(); 
	         System.out.println("Client accepted"); 
	         //close connection 
	         socket.close(); 
	     } 
	     catch(IOException i) 
	     { 
	         System.out.println(i); 
	     } 
	 } 
	public void sendRequest() {
		
		
		
	}
	
	public void receiveRequest() {
		
	}
	
	public void sendMessage() {
		
		
		
	}
	
	public void receiveMesage() {
		
		
	}
	public void main(String []args) throws ClassNotFoundException {

		new Server(Integer.parseInt(args[1]));
	}
	
}
