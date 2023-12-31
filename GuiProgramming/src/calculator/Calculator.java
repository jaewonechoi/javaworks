package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	//필드
	String[] operator = {"+", "-", "*", "/"};
	JComboBox<String> comboBox;
	JLabel label;
	
	
	//생성자
	public Calculator() {
		//윈도우(프레임) 생성
		this.setTitle("사칙연산 프로그램");
		this.setSize(300, 120);
		this.setLocation(200, 100);
		
		//패널 2개 생성 - BorderLayout
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		//컴포넌트 객체 생성 - FlowLayout'
		//panel1에 배치하고 올리기
		panel1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		//콤보 박스
		comboBox = new JComboBox<>(operator);
		
		JTextField text2 = new JTextField(5);
		//라벨
		label = new JLabel("=");
		JTextField text3 = new JTextField(5);
		
		//버튼 객체
		panel2.setLayout(new FlowLayout());
		JButton calcBtn = new JButton("계산");
		JButton resetBtn = new JButton("취소");
		
		//panel1, 2에 올리기
		panel1.add(text1);
		panel1.add(comboBox);
		panel1.add(text2);
		panel1.add(label);
		panel1.add(text3);
		
		panel2.add(calcBtn);
		panel2.add(resetBtn);
		
		//이벤트
		//계산 버튼을 눌렀을때 연산 구현
		ActionListener listener1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String operator = (String)comboBox.getSelectedItem();
				int num1 = Integer.parseInt(text1.getText());
				int num2 = Integer.parseInt(text2.getText());
				//if ~ else문
				/*if(operator.equals("+")) {
					int sum = num1 + num2;
					text3.setText(String.valueOf(sum));
				}else if(operator.equals("-")) {
					int sub = num1 - num2;
					text3.setText(String.valueOf(sub));
				}else if(operator.equals("*")) {
					int mul = num1 * num2;
					text3.setText(String.valueOf(mul));
				}else if(operator.equals("/")) {
					double div = (double)num1 / num2;
					text3.setText(String.valueOf(div));
				}*/
				
				//switch ~ case문
				switch(operator) {
				case "+":
					int result = num1 + num2;
					text3.setText(String.valueOf(result));
					break;
				case "-":
					result = num1 - num2;
					text3.setText(String.valueOf(result));
					break;
				case "*":
					result = num1 * num2;
					text3.setText(String.valueOf(result));
					break;
				case "/":
					double result2 = (double)num1 / num2;
					text3.setText(String.valueOf(result2));
					break;
				}
			}
		};
		calcBtn.addActionListener(listener1);
		
		//취소 버튼을 눌렀을때 입력 초기화 구현
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
			}
		};
		resetBtn.addActionListener(listener2);
		
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
