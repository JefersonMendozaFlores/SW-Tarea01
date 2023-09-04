package com.example.demo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private final Integer PORT = 13;
	
	public Server() {
		Socket clienteSocket;
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			while(true) {
				System.out.println("-------------1 Iniciando server socket ---------------");
				System.out.println("-------------2 A la espera del clienteSocket ---------------");
				clienteSocket = serverSocket.accept();
				System.out.println("-------------3 Llegó el clienteSocket ---------------");
				
				Thread.sleep(3000); // 3 segundos
				
				System.out.println("-------------4 Se finaliza la atencion al clienteSocket ---------------");
				clienteSocket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
