package chapter15;

import java.util.List;

//main 클래스 :프로젝트 실행 
public class Main {
	//
	public static void main(String[] args) {
		//프로젝트 
//		< 도서관리 시스템>
//		1 클래스& 객체를 사용한 프로젝트 데이터 설정 
//		1)클래스 도서(Book),회원(member),대여(Loan)
		
//		==Book 클래스 === 
//		책 제목(title),저자(author),책고유 번호() , 대여가능 
//		책 대여 호출, 책 반납 호출
//		void 반환 타입 
		
//		member클래스 
//		회원 아이디 ,회원이름 ,책대여 목록 
//		boorrowBook(Book book), returnBook(Book book)
//		반환 타입 
		
//		Loan 클래스===
//		member 클래스의 인스턴스 
//		Book클래스의 인스턴스 
		Library library =new Library();
		
		Book book1 = new PaperBook("자바 Hi", "이승아", "1234", 150);
		Book book2 = new PaperBook("파이썬", "이도경", "2345", 300);
		Book book3 = new PaperBook("C언어", "김명진", "3456", 250);

		Book book4 = new EBook("안녕 Hi", "구희연", "111", "www.example.com");
		Book book5 = new EBook("반가워", "윤대휘", "222", "www.example.com");
		Book book6 = new EBook("Hello", "이승아 ", "333", "www.example.com");
		Book book7 = new EBook("Hi", "정규민", "444", "www.example.com");
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.addBook(book6);
		library.addBook(book7);
		// 회원 생성
		Member member1 = new Member("001", "박성욱");
		Member member2 = new Member("002", "윤안나");
		Member member3 = new Member("003", "조승범");
		Member member4 = new Member("004", "진상영");
		
		try {
			member1.borrowBook(book1);
			member1.borrowBook(book2);
			member1.borrowBook(book6);
			
			member2.borrowBook(book7);
			
			member3.borrowBook(book7);
			
		} catch (BookAlreadyBorrowedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("제목으로 HI책을 검색");
		List<Book> foundBooksByTitle = library.searchBooksByTitle("Hi");
		for(Book book: foundBooksByTitle ) {
			System.out.println(book.getTitle()+ " / "+ book.getAuthor());
		}
		System.out.println("이승아 검색 ");
		List<Book> foundBooksByAuthor = library.searchBooksByAuthor("이승아");
		for(Book book: foundBooksByAuthor ) {
			System.out.println(book.getAuthor()+ " / "+ book.getTitle());
	}
}
}
