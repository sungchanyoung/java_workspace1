package chapter15_1;

import java.time.LocalDate;



public class Loan {
	private Member member;
	private Book book;
	private LocalDate loanDate;
	private LocalDate returnDate;
	
	public Loan(Member member, Book book, LocalDate loanDate) {
		this.member = member;
		this.book =book;
		this.loanDate = loanDate;
		this.returnDate =null;
	}

	public Member getMember() {
		return member;
	}

	public Book getBook() {
		return book;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public boolean isOverdue() {
		return returnDate == null && loanDate.plusDays(14).isBefore(loanDate.now());
	}
	
}
