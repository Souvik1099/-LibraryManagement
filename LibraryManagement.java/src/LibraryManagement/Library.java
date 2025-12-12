package LibraryManagement;
import java.util.*;
import java .io.*;
public class Library { 

	private ArrayList<Book> bok=new ArrayList<>();
	
	public  void addBook(Book b) {
		bok.add(b);
		System.out.println("Book Added Succesfully");
		}
	
	public Book removeBook(int id) {
		bok.removeIf(b->b.getId()==id);
		System.out.println("Book Removed Succesfully");
		return null;
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
public void loadFromFile() {
    try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
        String line;
        while ((line = br.readLine()) != null) {
           String[]arr= line.split(",");
           Book b= new Book(Integer.parseInt(arr[0]),(arr[1]),(arr[2]));
           b.setBorrowed(Boolean.parseBoolean(arr[3]));
           bok.add(b);
        }
        System.out.println("Data Loaded Successfully!");
    } catch (Exception e) {
        System.out.println("No Saved File Found!");
    }
}
public void ShowBook(){
	System.out.println("Your book list : ");
	for(Book b:bok) {
		System.out.println(b);
	}
}
	
	
	
	
	
	
	
	
	
	
	
}













