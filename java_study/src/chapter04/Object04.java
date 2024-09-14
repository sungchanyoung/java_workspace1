package chapter04;
class Book{
	String title;
	int price;
	
Book(String title, int price){
	this.title = title;
	this.price = price;
}
void BookInfo() {// 클래스 기능 
	System.out.println("책 제목: "+title+","+ "책의 가격"+ price);
		}
}

// 생성자 생략 가능 사용시- 호출될 메서드 
// 생략시  - 속성에 기본값이 할당 
public class Object04 {
	public static void main(String[] args) {
		Book book = new Book("만화책",12000);// 객체를 인스턴스화 
		Book book1 = new Book("소설책",5000);
		book1.BookInfo();// 메서드 호출 
		
		book.price= 1000;// 속성값 변경
		book.BookInfo();
	}
}
