import java.util.ArrayList;
import java.util.List;

class Book {
	String title;
	String author;
	double price;

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void displayInfo() {
		System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
	}
}

class EBook extends Book {
	String filesize;
	String downloadlink;

	public EBook(String title, String author, double price, String filesize, String downloadlink) {
		super(title, author, price);
		this.filesize = filesize;
		this.downloadlink = downloadlink;
	}

	@Override
	public void displayInfo() {
		System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Filesize: " + filesize
				+ ", Download link: " + downloadlink);
	}
}

class PrintedBook extends Book {
	long pages;
	double weight;

	public PrintedBook(String title, String author, double price, long pages, double weight) {
		super(title, author, price);
		this.pages = pages;
		this.weight = weight;
	}

	@Override
	public void displayInfo() {
		System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Pages: " + pages
				+ ", Weight: " + weight);
	}
}

public class MainBook {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new EBook("To Kill a Mockingbird", "Harper Lee", 120.00, "34MB", "www.harper.com"));
		books.add(new EBook("A Brief History of Time", "Stephen Hawking", 300.00, "50MB", "www.science.com"));

		books.add(new PrintedBook("The Alchemist", "Paulo Coelho", 220.00, 600, 15.00));
		books.add(new PrintedBook("The Secret", "	Rhonda Byrne", 150.00, 300, 23.00));

		for (Book b : books) {
			b.displayInfo();

		}

	}

}
