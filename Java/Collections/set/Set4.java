package map;

import java.util.HashSet;
import java.util.Set;
//unique elements
public class Set4 {

	public static void main(String[] args) {
		String str = "Ramalingam";
		Set<Character> unique = new HashSet<>();
		for(char ch : str.toLowerCase().toCharArray()){
			unique.add(ch);
			
		}
		System.out.println(unique);
	}

}
