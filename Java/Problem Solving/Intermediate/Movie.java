package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Movie {
	String movie;
	int rating;

	public Movie(String movie, int rating) {
		
		this.movie = movie;
		this.rating = rating;
	}

	public String getMovie() {
		return movie;
	}

	public int getRating() {
		return rating;
	}

	public static void main(String[] args) {
		List<Movie> movielist = Arrays.asList(new Movie("A",4),
				new Movie("C",5),
				new Movie("C",4),
				new Movie("A",5),
				new Movie("B",3));
		
		Map<String,Double> avg = movielist.stream().collect(Collectors.groupingBy(Movie::getMovie,Collectors.averagingDouble(Movie::getRating)));
		System.out.println(avg);
		
		
		avg.entrySet().stream().filter(entry -> entry.getValue() >= 4).forEach(entry->System.out.println(entry.getKey() + " >> " +entry.getValue()));
	}

}
