package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
//		Hash set internally implements hash map
		HashSet<String> hs = new HashSet<>();  // doesn't give in sorted or insertion order
		hs.add("Teja");
		hs.add("geetha");
		hs.add("afsheen");
		hs.add("renuka");
		hs.add("babu");
		System.out.println(hs);  // gives random output
		System.out.println(hs.size()); // returns number of elements
		
		// removal
		hs.remove("Teja");
		System.out.println(hs); 
		
		// verification
		System.out.println(hs.contains("geetha"));
		
		// retrieval can be done using for each 
		for(String s:hs)  {
			System.out.println(s);
		}
		hs.clear();
		System.out.println(hs); 
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		
		// Linked hash set 
		// Linked hash set  internally implements linked hash map
		LinkedHashSet <String> lh=new LinkedHashSet<>();
		lh.add("Teja");
		lh.add("geetha");
		lh.add("afsheen");
		lh.add("renuka");
		lh.add("babu");
		System.out.println(lh); // gives in insertion order
		
		
		// Tree set
		// Tree set internally implements tree map
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Teja");
		ts.add("geetha");
		ts.add("afsheen");
		ts.add("renuka");
		ts.add("babu");
//		System.out.println(ts); // gives in sorted order  // capitals then small alphabets
//		
//		System.out.println(ts.first()); // gives lowest element
//		System.out.println(ts.last());  // gives highest element
//		
//		System.out.println(ts.pollFirst()); // removes first element
//		System.out.println(ts); 
//		System.out.println(ts.pollLast());  // removes last element
//		System.out.println(ts); 
//		
//		System.out.println(ts.isEmpty());   
		
		System.out.println(ts.subSet("Teja", "renuka"));  // based on sorted order
		System.out.println(ts.subSet("Teja","afsheen"));
		
		System.out.println(ts.descendingSet());
		
		
		ts.clear();
		System.out.println(ts); 
		
	} 

}
