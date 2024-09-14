package chapter15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
	private Map<String,Book> books;
	
	public Library() {
		this.books = new HashMap<String,Book>();
		
	}
	// 책 추가 메서드 
	public void addBook(Book book) {
		books.put(book.getIsbn(),book);
		System.out.println(book.getTitle()+"이/가  도서관에 추가되었습니다");
	}
	public List<Book> searchBooksByTitle(String title){
		return books.values().stream()
				.filter(book -> book.getTitle().equalsIgnoreCase(title))
				.collect(Collectors.toList());
	}
	public List<Book> searchBooksByAuthor(String author){
		return books.values().stream()
				.filter(book -> book.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
	}
}
