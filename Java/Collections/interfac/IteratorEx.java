package interfac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratorEx {

	public static void main(String[] args) {
	  // it is an interface
		// introduced for iterating all collection objects
		// both legacy and new classes
		// one direction access , read only with special permission for removing elements
		
		ArrayList<Integer> v = new ArrayList<>();
		v.add(12);
		v.add(90);
		v.add(87);
		v.add(45);
		 
		// access the elements
//		Iterator<Integer> i = v.iterator();
//		while(i.hasNext()) {
//		System.out.println( i.next());
//		}
		  
		
		// remove an element
//		Iterator<Integer> i = v.iterator();
//		while(i.hasNext()) {
//	     i.next();
//		i.remove();  // removes all elements
//		}
//		System.out.println(v);  
		
//		Iterator<Integer> i = v.iterator();
//		i.next();
//		i.remove();
//		System.out.println(v);  // removes only first element without loop
		
		
		PriorityQueue<String> p = new PriorityQueue<>();
		p.add("teja");
		p.add("affu");
		p.add("reenu");
		p.offer("raj");
		
//		Iterator<String> I = p.iterator();
//		while(I.hasNext()) {
//		System.out.println( I.next());
//		}
		
		HashSet<String> hs = new HashSet<>();  
		hs.add("Teja");
		hs.add("geetha");
		hs.add("afsheen");
		hs.add("renuka");
		hs.add("babu");
		hs.add("priya");
		
		Iterator<String> h1 = hs.iterator();
		while(h1.hasNext()) {
		System.out.println( h1.next());
		}
		
		
		
		
		
	}

}
