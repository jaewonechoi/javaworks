package basicclass;

class Mydog{
	String name;
	String type;
	
	public Mydog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " +  name;
	}
}

public class Q4 {

	public static void main(String[] args) {
		Mydog dog = new Mydog("멍멍이", "진돗개");
		System.out.println(dog);
	}

}
