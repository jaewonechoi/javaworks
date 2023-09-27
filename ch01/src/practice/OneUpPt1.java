package practice;

public class OneUpPt1 {
	
		static int x = 1;
		public static int oneUp() {
			x += 1;
			return x;
		}
			
		public static void main(String[] args) {
			System.out.println(oneUp()); //2
			System.out.println(oneUp()); //2
			
			//System.out.println(x);  //oneUp()의 x는 소멸한 변수임
		}

}
