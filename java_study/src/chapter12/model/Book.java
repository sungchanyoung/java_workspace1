package chapter12.model;

public class Book {
	private String title;
	private String author;
	private String pushlisher;
	
	public Book(String title,String author,String pushlisher) {
		this.title =title;
		this.author =author;
		this.pushlisher =pushlisher;
		
	}
	
	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}

	public String getPushlisher() {
		return pushlisher;
	}

	@Override
	public String toString() {
		return "Title=" + title + ", author=" + author + ", pushlisher=" + pushlisher ;
	}
}
