package chapter15_1;
//도서 클래스를 상속받는 전자 책 , 종이 책
public class EBook extends Book{
	private String downloadLink ;
	public EBook(String title, String author, String isbn, String downloadLink) {
		super(title, author, isbn);
		this.downloadLink=downloadLink;
	}
	@Override
	public void borrowBook() throws BookAlreadyBorrowedException{
		super.borrowBook();
		System.out.println("다운로드 링크 : " + downloadLink);
	}
}
