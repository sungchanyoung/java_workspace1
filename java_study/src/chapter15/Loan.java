package chapter15;

// 컴퓨터의 현재 날짜 정보를 가지고옴 
import java.time.LocalDate;

public class Loan {
	private Member member;
	private Book book;
	private LocalDate loanDate;
	private LocalDate returnDate;
	
	
	//생성자 
	public Loan(Member member, Book book, LocalDate loanDate) {
		this.member =member;
		this.book =book;
		this.loanDate =loanDate;
		this.returnDate =null;
		
	}

	public Member getMember() {
		return member;
	};

	public Book getBook() {
		return book;
	};

	public LocalDate getLonDate() {
		return loanDate;
	};

	public LocalDate getReturnDate() {	
		return returnDate;	
	};
	// 반납 날짜 설정 
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate =returnDate;
		
	}
	//도서 연체 여부 확인하는 메서드 
	public boolean isOverdue() {
		return returnDate == null && loanDate.plusDays(14).isBefore(loanDate.now());
	}
	// loanDate.plus(14) = 대열 날짜 + 14일 
	// loanDate.now() 현재 날짜 
	//A.isBefore = 

	
}
