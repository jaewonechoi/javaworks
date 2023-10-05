package practice.InOutputPt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class InOutputPt {

	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("IOPT.txt");
			ObjectOutputStream oos = new ObjectOutputStream(os);
				
			//1. 객체 생성
			Customer c1 = new Customer("우영우", 20000);
			
			//2.파일에 쓰기
			oos.writeObject(c1);
			
			oos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			InputStream is = new FileInputStream("IOPT.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			
			//3. 역직렬화하여 파일 읽기
			Customer c2 = (Customer)ois.readObject();
			
			//4. 출력
			System.out.println(c2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
