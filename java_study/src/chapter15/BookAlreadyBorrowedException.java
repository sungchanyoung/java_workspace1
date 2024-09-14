package chapter15;

public class BookAlreadyBorrowedException  extends RuntimeException{
	public BookAlreadyBorrowedException (String message) {
		super(message);
	}
}
