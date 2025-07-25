package map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		String word = "swiss";
		Map<Character , Integer> charcount =  new HashMap <> ();
		
		 for (char ch : word.toCharArray()) {
			 charcount.put(ch, charcount.getOrDefault(ch, 0) + 1);
	        }
	        
	        for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.println("First non repeating character " + entry.getKey());
	                return;
	            }
	        }
	        
	        System.out.println("No Non-Repeating Character Found");
	    }
	}