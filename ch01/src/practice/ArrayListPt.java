package practice;

import java.util.ArrayList;

class Book{
	String bookName;
	int price;
	
	public Book(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public String toString() {
		return bookName + ", " + price;
	}
	
}

public class ArrayListPt {

	public static void main(String[] args) {
		//ArrayList선언
		ArrayList<Book> cart = new ArrayList<>();
		
		//자료 추가
		cart.add(new Book("개미", 10000));
		cart.add(new Book("자바입문", 20000));
		cart.add(new Book("신", 13000));
		
		//자료 출력
		System.out.println(cart.get(0));
		System.out.println(cart.get(1));
		
		//자료 수정
		
		
		//자료 삭제
		cart.remove(2);
		
		//자료 크기
		System.out.println(cart.size());
		
		System.out.println("====================================");
		
		//전체 자료 출력
		for(int i = 0; i < cart.size(); i++) {
			Book book = cart.get(i);
			System.out.println(book);
		}
		
		System.out.println();
		
		//향상된 for문
		for(Book books : cart) {
			System.out.println(books);
		}
	}

}
