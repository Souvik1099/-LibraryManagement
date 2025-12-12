package LibraryManagement;
import java.util.Scanner;
public class LibraryApp {

	

	public static void main(String[] args) {
		
Library li= new Library();
li.loadFromFile();
Scanner s=new Scanner(System.in);
while(true) {
	System.out.println("\n==== Library Menu ====");
    System.out.println("1. Add Book");
    System.out.println("2. Remove Book");
    System.out.println("3. Search Book");
    System.out.println("4. Borrow Book");
    System.out.println("5. Return Book");
    System.out.println("6. Show All Books");
    System.out.println("7. Save & Exit");
    System.out.print("Choose: ");
    int a= s.nextInt();
    s.nextLine();
  switch(a) {
    
  case(1):
    	System.out.println(" Enter Book Id");
    int i=s.nextInt();
    s.nextLine();
    System.out.println(" Enter Book Titel");
    String t= s.nextLine();
    System.out.println(" Enter Book Author");
    String u= s.nextLine();
    li.addBook(new Book(i,t,u));
    break;

    
  case(2):  
	  System.out.println(" Enter Book Id to Remove!");
       li.removeBook(s.nextInt());
       break;
       
  case(3):
	  System.out.println(" Enter Book Titel ");
	  String z=s.nextLine();
	  li.searchBook(z);
	  if(li.searchBook(z)== null) {
		  System.out.println("Book not Found");
	  }
	  break;
  case(4):
	  System.out.println(" Enter Book Id"); 
       int p= s.nextInt();
       li.borrowbook(p);
     
       break;
  case(5):
	  System.out.println(" Enter Book Id");
       li.returnBook(s.nextInt());
       break;
  case(6): 
	  System.out.println(" Enter Book Id");
      li.ShowBook();
       break;
  case(7) :
	  System.out.println(" Enter Book id");
       li.savefile();
       System.out.println("Exiting...");
        return;
    }
}
	}
}
