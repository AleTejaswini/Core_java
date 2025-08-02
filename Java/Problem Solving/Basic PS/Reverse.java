package ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
//		String sentence = "Java is fun";
//		
//		String[] words = sentence.split(" ");
//		for(int i = words.length-1;i>=0;i--) {
//			System.out.print(words[i] + " ");
//		}
		
		 
		
		// reverse 
//		String word = "Java";
//		String[] c = word.split("");
//		for(int i = c.length-1;i>=0;i--) {
//			System.out.print(c[i]);
//		}
		
	// streams
		String str= "Java is fun";
	List<String> rev= Arrays.asList(str.split(" "));
	Collections.reverse(rev);
	System.out.println(String.join(" " , rev));
	
	
	String s = "java";
	List<String> r = Arrays.asList(s.split(""));
	Collections.reverse(r);
	System.out.println(String.join("", r));
	
		
		
		
		
		
		
	}
	
	
	

}
