package kr.ir.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	private static ServerSocket serverSocket;

	public static void main(String[] args) {
		System.out.println("=================================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("=================================================");
		
		//서버 시작
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { //서버 대기
			String key = scanner.nextLine();	//종료키 입력설정
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
		//서버 종료
		stopServer();
	}
	
	//서버 시작 메서드
	public static void startServer() {
		//항상 대기 - 스레드 만들기
		Thread thread = new Thread() {
			@Override
			public void run() {	//thread 생성시 run을 무조건 구현해야함
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[서버] 시작됨");
					
					//항상 클라이언트 연결 대기
					while(true) {
						System.out.println("\n[서버] 연결 요청 기다림\n");
						//연결 수락 및 클라이언트와 통신할 소켓 객체 생성
						Socket socket = serverSocket.accept();
						
						//IP 확인
						InetSocketAddress isa =
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
						
						//데이터 받기(수신)
						InputStream is = socket.getInputStream();
						DataInputStream dis = new DataInputStream(is);
						String message = dis.readUTF();
						System.out.println("[서버] 데이터를 받음: " + message);
						
						//데이터 보내기(송신)
						String message2 = "서버가 글을 보냅니다.";
						//OutputStream os = socket.getOutputStream();
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message2);
						dos.flush();
						System.out.println("[서버] 데이터를 보냄: " + message2);
						
						socket.close();	//소켓 종료
						System.out.println("[서버] " + clientIp + "의 연결을 끊음");
					}
					
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[서버] " + e.toString());
				}
			}
		};//thread 끝
		thread.start();	//스레드를 나와서 스타트를 해줘야 실행됨
	}
	
	//서버 종료 메서드
	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
