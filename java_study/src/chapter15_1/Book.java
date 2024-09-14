package chapter15_1;

	

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailble;
	
	public Book(String title, String author, String isbn) {
		this.title= title;
		this.author =author;
		this.isbn =isbn;
		this.isAvailble =true;// 기본적으로 대여 가능 
	}
	// thorws- 해당 메서드가 특정 예외를 던질 수 있음을 나타냄 (가능성)
	public void borrowBook() throws BookAlreadyBorrowedException{
		if(!isAvailble) {
			throw new BookAlreadyBorrowedException(this.title+"은 이미 대여중입니다");
		}
		isAvailble =false;
		System.out.println(title+ "이 대여되었습니다");
		
	}
	public void returnBook() {
		isAvailble =true;
		System.out.println(title + "이/가 반납되었습니다");
	}
	public String getTitle() {// getter = private를 외부로 꺼낸는 메서드
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public boolean isAvailble() {
		return isAvailble;
	}
	
}
