package chapter20Library;
import java.util.List;
//프로튼 엔트 -view -controller -repository(DB연결) 이 순서로 실행 
// 사용자의 요청을 받아서 서비스로 전달하는 역할
public class BookController {
	private final BookService bookService;// 무조건 실행 해야하는 서비스 
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	// 책 추가
	public void addBook(String title, String author, int year) {
		bookService.addBook(title, author, year);
	}
	
	// 책 수정
	public void updateBook(int id, String title, String author, int year) {
		bookService.updateBook(id, title, author, year);
	}
	
	// 책 삭제
	public void deleteBook(int id) {
		bookService.deleteBook(id);
	}
	
	// 책 조회
	// 1. 특정 id를 가진 책 조회
	public Book getBook(int id , String author) {// 
		return bookService.getBook(id, author);
	}
	// 2. 모든 책 조회
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
}
