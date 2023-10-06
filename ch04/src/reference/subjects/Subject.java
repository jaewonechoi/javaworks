package reference.subjects;

//Subject 자료형 정의
public class Subject {
	//필드
	private String subjectName;  //과목 이름
	private int scorePoint;  	 //과목 점수
	
	public Subject() {}
	
	//매개변수가있는 생성자 사용
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	//getter, setter
	//과목이름 입력
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//과목이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	
	//과목점수 입력
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	//과목점수 출력
	public int getScorePoint() {
		return scorePoint;
	}
}