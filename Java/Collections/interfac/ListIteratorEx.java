package interfac;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// it is an interface
		// introduced for only list type of collection
		// Legacy and new class that are implementing list interface
		// Forward and backward access
		// can read and write
		
		ArrayList<Integer> v = new ArrayList<>();
		v.add(12);
		v.add(90);
		v.add(87);
		v.add(45);
		 
		ListIterator<Integer> l = v.listIterator();
		// forward access
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		// backward access
		while(l.hasPrevious()) {
			System.out.println(l.previous());
			l.remove();
			
		}
		System.out.println(v);
//		l.add(45); // add elements
		
		
		
		
		
		
		
	    

	}

}
