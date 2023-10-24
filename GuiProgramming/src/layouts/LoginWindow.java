package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginWindow {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("로그인 시스템");
		frame1.setSize(400, 300);
		frame1.setLocation(30, 30);
		frame1.setLayout(null);
		
		//라벨
		JLabel label1 = new JLabel("아이디");
		label1.setSize(100, 50);
		label1.setLocation(110, 50);
		frame1.add(label1);
		
		//텍스트
		JTextField text1 = new JTextField();
		text1.setSize(100, 30);
		text1.setLocation(160, 60);
		frame1.add(text1);
		
		//라벨2
		JLabel label2 = new JLabel("비밀번호");
		label2.setSize(100, 50);
		label2.setLocation(100, 100);
		frame1.add(label2);
		
		//텍스트2
		JTextField text2 = new JTextField();
		text2.setSize(100, 30);
		text2.setLocation(160, 110);
		frame1.add(text2);
		
		//버튼
		JButton button = new JButton("로그인");
		button.setSize(100, 30);
		button.setLocation(140, 180);
		frame1.add(button);
		
		
		//디스플레이
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	}

}
