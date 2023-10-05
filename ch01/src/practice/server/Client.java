package practice.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 6000);
			System.out.println("[클라이언트] 연결 성공");
			
			String sendMessage = "내일은 금요일이다!";
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보내기 성공! " + sendMessage);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receive = dis.readUTF();
			System.out.println("[클라이언트] 데이터 되돌려 받음 " + receive);
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}