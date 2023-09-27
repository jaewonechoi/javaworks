package statics.classvar;

public class ClassVar {
	static int serialNum = 1000;  //static이 붙으면 클래스변수(필드)
	int id;        //인스턴스 변수(필드)
	String name;   //인스턴스 변수(필드)
	
	//입력
	public void setId(int id) {
		this.id = id;
	}
	//출력
	public int getId() {
		return id;
	}
	
}
