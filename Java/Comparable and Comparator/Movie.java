package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//public class Movie implements Comparable<Movie> {
//	String moviename;
//	int year;
//	float rating;
//
//	public Movie(String moviename, int year, float rating) {
//		this.moviename = moviename;
//		this.year = year;
//		this.rating = rating;
//	}
//	public String toString() {
//		return moviename + "," + year + "," + rating; 
//	}
//	@Override
//	public int compareTo(Movie anothermovie) {
//		return Float.compare(this.rating, anothermovie.rating);
//	}
//	public static void main(String[] args) {
//	  List<Movie> list = new ArrayList<Movie>() ;
//	  
//	  list.add(new Movie("Bahubali2",2017 ,8.3f));
//	  list.add(new Movie("RRR" ,2022,8.0f));
//	  list.add(new Movie("Eega" ,2012,7.7f));
//	  list.add(new Movie("Jaanu" ,2018 ,8.0f));
//	  
//	  Collections.sort(list);
//	  System.out.println(list);
//	  }
//	}

//comparator
public class Movie {
	String moviename;
	int year;
	float rating;

	public Movie(String moviename, int year, float rating) {
		this.moviename = moviename;
		this.year = year;
		this.rating = rating;
	}
	public String toString() {
		return moviename + "," + year + "," + rating; 
	}
	public static void main(String[] args) {
		 List<Movie> list = new ArrayList<Movie>() ;
		 
	      list.add(new Movie("Bahubali2",2017 ,8.3f));
		  list.add(new Movie("RRR" ,2022,8.0f));
		  list.add(new Movie("Eega" ,2012,7.7f));
		  list.add(new Movie("Jaanu" ,2018 ,8.0f));
		  list.add(new Movie("Rangastalam" ,2018, 8.3f));
		
		  Comparator<Movie> year = Comparator.comparing((Movie m) -> m.year);
		  Comparator<Movie> rating = Comparator.comparing((Movie m) -> m.rating);
		  Comparator<Movie> name = Comparator.comparing((Movie m) -> m.moviename);
		  
		  Collections.sort(list,year.thenComparing(rating));
		  System.out.println(list);
		  
		  
		  Collections.sort(list,rating.thenComparing(year));
		  
		  System.out.println(list);
	}
}

