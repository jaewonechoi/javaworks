package chess;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessPiece {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		List<Integer> chess = new ArrayList<>();
		
		int king = 0;
		int queen = 0;
		int r = 0;
		int b = 0;
		int k = 0;
		int p = 0;
		
		while(true) {
			System.out.println("동혁이가 찾은 흰색말의 개수를 입력해주세요");
			System.out.print("찾은 king의 개수: ");
			int key = scanner.nextInt();
			
			chess.add(key);
			if(key == chess.get(0)) {
				key++;
			}else if(key > 1 || key <= 2) {
				key--;
			}
			
			System.out.print("찾은 queen의 개수: ");
			int key2 = scanner.nextInt();
			
			chess.add(key);
			if(key2 == chess.get(1)) {
				key2++;
			}else if(key2 > 1 || key2 <= 2) {
				key2--;
			}
			
			
		}
		System.out.println(chess);

	}

}
