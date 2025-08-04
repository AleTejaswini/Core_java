package intermediate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Email {

	public static void main(String[] args) {
		List<String> email = Arrays.asList("aleteja@gmail.com", "aleusha@gmail.com","affu@gmail.com","renu@gmail.com","aleteja@gmail.com","aleusha@gmail.com","affu@gmail.com","teja@gmail.com");
		LinkedHashSet <String> distinct = new LinkedHashSet<>(email);
		System.out.println(distinct);
		
		//using streams
		List<String> dis =  email.stream().distinct().collect(Collectors.toList());
		System.out.println(dis);
		
	}

}
