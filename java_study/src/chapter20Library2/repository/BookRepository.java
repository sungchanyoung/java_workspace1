package chapter20Library2.repository;




import java.util.ArrayList;
import java.util.List;

import chapter20Library2.model.Book;
import chapter20Library2.model.User;

public class BookRepository {

private List<Book> books =new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
		
	}

	public Book findBookByTitle(String bookTitle) {
		for(Book book : books) {
			if(book.getTitle().equals(bookTitle));
			return book;
		}
		return null;
	}


	public List<Book> findAllBook() {
		return books;
	}
	
}
