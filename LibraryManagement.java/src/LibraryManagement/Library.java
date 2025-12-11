package LibraryManagement;
import java.util.*;
import java .io.*;
public class Library { 

	private ArrayList<Book> bok=new ArrayList<>();
	
	public  void addBook(Book b) {
		bok.add(b);
		System.out.println("Book Added Succesfully");
		}
	
	public void removeBook(int id) {
		bok.removeIf(b->b.getId()==id);
		System.out.println("Book Removed Succesfully");
	}
	public Book searchBook(String titel) {
		for(Book b:bok) {
			if(b.getTitel().equalsIgnoreCase(titel)) {
				return b;	
		}}
		return null;
	}
	public void borrowbook(int id) {
		for(Book b:bok) {
			if(b.getId()==id && !b.isBorrowed()) {
				b.setBorrowed(true);
				System.out.println("Book Borrowed Succesfully");
				return ;
			}
		}
		System.out.println("Book Not Available!");
	}
	public  void returnBook(int id) {
		for(Book b:bok) {
			if (b.getId()==id && b.isBorrowed()) {
				b.setBorrowed(false);
				System.out.println("Book Rrturn Succesfully");
			}
		}
		System.out.println("Invalid Return Request!");
	}
public void savefile() {
	try(PrintWriter p=new PrintWriter(new FileWriter("data.csv"))){
		for(Book b:bok) {
			p.println(b.getId()+""+b.getTitel()+""+b.getAuthor()+""+b.isBorrowed());
		}
		System.out.println("Book deatial Save Succesfully");
	}catch(IOException e) {
		e.printStackTrace();
	
	}
}
public void loadfile() {
	try(BufferedReader r=new BufferedReader(new FileReader("data,csv")))
	String line;
			while ((line=r.readLine())!=null) {
}
	
	
	
	
	
	
	
	
	
	
	
}













