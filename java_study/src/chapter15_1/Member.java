package chapter15_1;

import java.time.LocalDate;
import java.util.*;

public class Member {
	private String memberId;
	private String name;
	private List<Loan> loans;
	
	public Member(String memberId,String name) {
		this.memberId = memberId;
		this.name = name;
		this.loans = new ArrayList<Loan>();
	}
	public void borrowBook(Book book) throws BookAlreadyBorrowedException{
		book.borrowBook();
		Loan loan = new Loan(this,book,LocalDate.now());
		loans.add(loan);
		System.out.println(name+ "회원이 "+ book.getTitle()+ "을/를 대여하였습니다");
	}
	public void returnBook(Book book) {
		book.returnBook();
		loans.removeIf(loan -> loan.getBook().equals(book));
		System.out.println(name+ "회원이"+ book.getTitle()+"을/를 반납하였습니다.");
	}
}
