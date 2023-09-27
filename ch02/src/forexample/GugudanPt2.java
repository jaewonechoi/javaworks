package forexample;

public class GugudanPt2 {

	public static void main(String[] args) {
		// 구구단에서 짝수단만 출력
		
		for(int dan = 1; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				if(dan % 2 == 1) {
					continue;
				}
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		
	}

}
