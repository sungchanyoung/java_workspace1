package chapter15_1;

public class BookAlreadyBorrowedException extends RuntimeException{
//RuntimeException: 프로그램 실행중 발생하는 오류 
	public BookAlreadyBorrowedException(String message) {
		super(message);
	}
}
