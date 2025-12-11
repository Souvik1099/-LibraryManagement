package LibraryManagement;

public class Book {
	private int id;
	private String titel;
	private String author;
	private boolean  isBorrowed;
	

	public Book(int id, String titel, String author) {
		this.id =id;
		this.titel=titel;
		this.author=author;
		this.isBorrowed=false;
	
	}

	public int getId() {
		return id;
	}
	public String getTitel() {
		return titel;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isBorrowed() {
		return isBorrowed;
		
	}
	public void setBorrowed(boolean borrow) {
		isBorrowed= borrow;
	}
	
	public String toString() {
		return (id+" "+titel+" "+author+" "+isBorrowed);
	}
	
}
