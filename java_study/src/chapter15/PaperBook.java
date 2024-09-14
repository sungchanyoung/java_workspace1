package chapter15;

public class PaperBook  extends Book{
	private int numberOfPage;
	public PaperBook(String title, String author, String isbn,int numberOfPages) {
		super(title, author, isbn);// 셍성자 호출 
		this. numberOfPage = numberOfPage;
	}
	//종이책 대여 시 안내 메세지 출력 
	@Override
	public void borrowBook () throws BookAlreadyBorrowedException {
		super.borrowBook();
		System.out.println("종이 책은 물리적 대여만 가능합니다: ");
	}
}
