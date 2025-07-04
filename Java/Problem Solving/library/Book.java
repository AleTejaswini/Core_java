package library;

public class Book {
	private String book_name;
	private String author;
	private String title;
	private int year;

	public  void setvalues(String book_name, String author, String title,int year ) {
		this.book_name=book_name;
		this.author=author;
		this.title= title;
		this.year=year;
		}
	public String getbook_name(){
		return book_name;
		}
	public String getauthor() {
		return author;
	}
	public String gettitle() {
		return title;}
	
		public int getyear() {
			return year;
		}
		
		
	}
