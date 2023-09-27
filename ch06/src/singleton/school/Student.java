package singleton.school;

public class Student {
	private static int serialNum = 100;
	private int studentNum;
	
	public Student () {
		serialNum++;
		studentNum = serialNum;
	}
	
	//학번 출력 메서드
	public int getStudentNum() {
		return studentNum;
	}
}
