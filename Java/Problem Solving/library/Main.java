package library;

public class Main {

	public static void main(String[] args) {
	Book b =new Book();
	
	b.setvalues("Java", "jhon", "java concepts",1991);
	Librarian L = new Librarian();
	User U =new User();
	
	U.displayInfo("Teja", 17, "cse");
	
	L.issuebook();
    U.calculateFine(6);
   System.out.println("Bookname: " +b.getbook_name()+ " \nauthor: " +b.getauthor() + "\ntitle:" +b.gettitle()+ "\nyear" +b.getyear());
	
	


	}

}
