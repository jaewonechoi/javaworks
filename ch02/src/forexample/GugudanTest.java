package forexample;

public class GugudanTest {

	public static void main(String[] args) {
		// 단일 for()
		/*
		   3 * 1 = 3 
		   3 * 2 = 6 
		   3 * 3 = 9  
		   ... 
		   3 * 8 = 24 
		   3 * 9 = 27
		 */
		int dan = 9;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
			//System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}

	}

}
