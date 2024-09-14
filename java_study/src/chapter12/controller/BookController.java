package chapter12.controller;

import java.util.ArrayList;
import java.util.List;

import chapter12.model.Book;

//Book 데이터를 사용하여 기능 정의 
public class BookController {
// 인스턴스 변수 
	private List<Book> books;
	//생성자 
	public BookController() {
		this.books = new ArrayList<Book>();
	}
	// 책을 추가하는 기능 
	public void addBook(String title, String author, String publisher) {
		Book newBook = new Book(title,author,publisher);
		books.add(newBook);
	}
	// 책 리스트 반환
	public List<Book>getAllBooks(){
		return books;
	}
	// 도서 검색 기능 
	public List<Book> searchBook(String title){
		List<Book> result =  new ArrayList<Book>();
		for(Book book :  books) {
			if(book.getTitle().contains(title)) {
				result.add(book);
			}
		}
		return result;
	}
}
