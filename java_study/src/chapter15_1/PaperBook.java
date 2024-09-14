package chapter15_1;

public class PaperBook  extends Book{
	private int numberOfPages;
	public PaperBook(String title,String author, String isbn, int  numberOfPages) {
		super(title, author, isbn);
		this.numberOfPages = numberOfPages;
		
	}
	public void borrowBook() throws BookAlreadyBorrowedException{
		super.borrowBook();
		System.out.println("종이책만 대여가능합니다");
	}
}
