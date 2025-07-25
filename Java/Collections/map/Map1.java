package map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		String paragraph = "hello world hello java hello";
		
		String words[] = paragraph.split(" ");
		
		Map<String ,Integer> wordcount = new HashMap<String,Integer>();
		
		for(String word: words) {
			if(wordcount.containsKey(word)) {
				wordcount.put(word, wordcount.get(word) +1);
				
			}
			else {
				wordcount.put(word, 1);
			}}
			for(String word :wordcount.keySet() ) {
				System.out.println(word + ">>" + wordcount.get(word));
			}
		}
	}


