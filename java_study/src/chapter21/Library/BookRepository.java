package chapter21.Library;
import java.util.*;
public class BookRepository {
	private List<Book> books =new ArrayList<Book>();
	private int idCount =1;
	
	public void save(Book book) {
		if(book.getId() ==0) {
			book.setId(idCount++);
			books.add(book);
		}else {
			int index = books.indexOf(findById(book.getId()));
			books.set(index,book);
			//set함수 -> index번 인덱스의 요소를 book매개변수 로 변경
		}
		
	}
	public Book findById(int id) {
		return books.stream()
					.filter(book -> book.getId() ==id)
					.findFirst()
					.orElse(null);
	}
	public void delete(int id) {
		books.removeIf(book -> book.getId() ==id);
	}
	public List<Book> findAll(){
		return books;
	}
	
}
