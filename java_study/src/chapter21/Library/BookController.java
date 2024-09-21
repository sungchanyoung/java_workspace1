package chapter21.Library;
import java.util.*;
public class BookController {
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	public void addBook(String title, String author, int year) {
		bookService.addBook(title,author,year);
	}
	public void updateBook(int id , String title, String author, int year) {
		bookService.updateBook(id,title,author,year);
	}
	public void deleteBook(int id ) {
		bookService.deleteBook(id);
	}
	public Book getBook(int id) {//특정 id를 가진 책 조회 
		return bookService.getBook(id);
	}
	
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
}
