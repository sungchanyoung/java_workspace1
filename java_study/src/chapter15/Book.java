package chapter15;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;
	
	public Book(String title, String author, String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.isAvailable=true;
	}
	//대여 시 isAvailable false설정
//	해당 메서드가 특정 예외를 던질수 있음 나타냄 (가능성 )\
//	해당 메서드가 throws 예외를  던질수 있으니 해당 메서드
	public void borrowBook() throws BookAlreadyBorrowedException{
		if(!isAvailable) {
			throw new BookAlreadyBorrowedException(this.title + "책이 이미 대여중입니다");
		}
		isAvailable =false;
		System.out.println(this.title+"(이)가 대여되었습니다");
	}
	public void returnBook() {
		isAvailable =true;
		System.out.println(title+ "(이)가 반납되었습니다");
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	
	
	
}
