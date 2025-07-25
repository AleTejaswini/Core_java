package map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set3 {

	public static void main(String[] args) {
		String sentence = "Java is is a programming language language";
		String[] words =sentence.split(" ");
		Set<String> unique = new HashSet<>(Arrays.asList(words));
		System.out.println(String.join(" " , unique));
		

	}

}
