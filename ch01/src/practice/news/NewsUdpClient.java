package practice.news;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsUdpClient {

	public static void main(String[] args) {
		
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			System.out.println("[클라이언트] 소켓 생성");
			
			String data = "정치";
			byte[] bytes = data.getBytes("utf-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes,
					bytes.length, new InetSocketAddress("localhost", 8100));
			datagramSocket.send(sendPacket);
			
			while(true) {
				//서버가 보낸 뉴스 받기
				DatagramPacket receivePacket =
						new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(receivePacket);
				
				//뉴스 받기 - 문자열로 복원
				String news = new String(receivePacket.getData(), 0,
						receivePacket.getLength(), "utf-8");
				System.out.println(news);
				
				if(news.contains("뉴스10"))
					break;
			}
			datagramSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
