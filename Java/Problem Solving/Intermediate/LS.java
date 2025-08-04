package intermediate;

import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Book{
	int bookId;
	String title;
	String author;
	String category;
	boolean isIssued;
	public Book(int bookId, String title, String author, String category) {
	
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
	
	}
}

class Members{
	int memberId;
	String name;
	public Members(int memberId, String name) {
		
		this.memberId = memberId;
		this.name = name;
	}
	
}
class BorrowRecord{
	Book book;
	Members member;
	LocalDate borrowDate;
	LocalDate dueDate;
	LocalDate returnDate;
	public BorrowRecord(Book book, Members member, LocalDate borrowDate, LocalDate dueDate) {
		
		this.book = book;
		this.member = member;
		this.borrowDate = borrowDate;
		this.dueDate = dueDate;
	
	}
}
public class LS {
	List<Book> books = new ArrayList<>();
	List<BorrowRecord> borrowrecord = new ArrayList<>();

	public void BorrowBook(Book book,Members member){
	
			if(book.isIssued) {
				System.out.println("Book is already issued");
				}
			else {
				book.isIssued=true;
				BorrowRecord record = new BorrowRecord(book,member,LocalDate.now(),LocalDate.now().plusDays(15));
				borrowrecord.add(record);
				System.out.println(book.title + "is borrowed by" +member.name);
			}
			}
		
		
	
public void returnBook(Book book){
	for(BorrowRecord record : borrowrecord) {
		if(record.book == book && record.returnDate==null) {
			record.returnDate = LocalDate.now();
			book.isIssued=false;
			System.out.println("Book returned" + book.title);
			return;
		}
	}
	System.out.println("No more active records of this book");
	
}
public void showOverdueBooks() {
	System.out.println("Over due books: ");
	borrowrecord.stream().filter(r-> r.returnDate == null && r.dueDate.isBefore(LocalDate.now())).forEach(r->System.out.println(r.book.title + "is borrowed by " + r.member.name + "Due date" + r.dueDate));
	
}
	public static void main(String[] args) {
	LibrarySystem library = new LibrarySystem();
	
	Book b1 = new Book(101,"To Kill a Mockingbird","Harper Lee","Fiction");
	Book b2 = new Book(102,"A Brief History of Time","Stephen Hawking","Science");
	Book b3 = new Book(103,"The Alchemist","Paulo Coelho","Fiction");
	Book b4 = new Book(103,"The Secret","	Rhonda Byrne","Self-Help");
	Book b5 = new Book(104,"Ignited Minds","A.P.J. Abdul Kalam","Biography");
	Book b6 = new Book(105,"India After Gandhi","Ramachandra Guha","History");
	
	Members m1 = new Members(101,"Teja");
	Members m2 = new Members(102,"Affu");
	
	
	library.borrowBook(b5 ,m1);
	
	library.borrowrecord.get(0).dueDate= LocalDate.now().minusDays(5);
	library.showOverdueBooks();

	
	library.returnBook(b6);
	
	library.borrowBook(b6, m2);
	}

}
