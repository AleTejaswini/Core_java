package ps;

import java.util.Arrays;
import java.util.List;



public class Book {
	 int bookid;
	 String title;
	 String author;
	public Book(int bookid, String title, String author) {
		this.bookid = bookid;
		this.title = title;
		this.author = author;
	}
	public int getBookid() {
		return bookid;
	}

	public  String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public  static void searchByTitle(List<Book> list, String searchTitle) {
		boolean found =false;
		for(Book book : list) {
			if(book.getTitle().replaceAll("\\s+", "").equalsIgnoreCase(searchTitle)) {
				System.out.println("Book found with Id: " + book.getBookid() + " and author: " + book.getAuthor());
				found = true;
			}}
			
				if(!found) {
					System.out.println("Book not found with title: " + searchTitle);
				}
			}
			

	public static void main(String[] args) {
		List<Book> list = Arrays.asList(new Book( 101 ,"Antarvahini", "Yandamoori Veerendranath"),
			    new Book( 102 , "Maro Prastanam", "Kinnera Vijayalakshmi"),
			    new Book(103 , "Jeevana Vedam", "Gurajada Apparao"),
			    new Book(104, "Antharmukham - Self Discovery", "Yandamoori Veerendranath"),
			    new Book(105 , "Manasulo Maata", "Bapu-Ramana"),
			    new Book(106, "Chivaraku Migiledi", "Buchi Babu"),
			    new Book(107, "Jeevana Satyam", "Jandhyala Papayya Sastry"),
			    new Book(108 , "Amma Chettu Chepa Chiluka", "Volga"));
		
		Book.searchByTitle(list, "maroprastanam");
	
	
	}

	
	

}
