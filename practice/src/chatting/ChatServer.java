package chatting;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
	
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(50);
	
	public static void main(String[] args) {
		
	}

}
