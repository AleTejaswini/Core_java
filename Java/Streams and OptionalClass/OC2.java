package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OC2 {

	public static void main(String[] args) {
		// remove all null values 
		List<String> emails =Arrays.asList("aleteja@gmail.com",null,"affu@gmail.com",null,"renuka@gamil.com");
		emails.stream().map(Optional::ofNullable)
						.filter(Optional::isPresent)
						.map(Optional::get)
						.forEach(System.out::println);
	}

}
