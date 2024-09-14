package chapter15;
//상속과 다형=== 
// 도서(book)클래스를 상속 받는 전차책(EBook) 종이책 클래스 정의 

public class EBook  extends Book{
	private String downloadLink;
	public EBook(String title, String author, String isbn, String downloadLink) {
		super(title, author, isbn);// 셍성자 호출 
		this.downloadLink =downloadLink;
	}
	public void borrowBook () throws BookAlreadyBorrowedException {
		super.borrowBook();
		System.out.println("다운로드 링크: "+ downloadLink);
	}

}
