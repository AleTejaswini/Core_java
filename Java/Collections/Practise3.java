package list;

import java.util.Vector;

public class Practise3 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(9);
		v.add(8);
		v.add(5);
		v.add(0);
		v.add(10);
		System.out.println("Original List:" +v);
		
		// Split a list  into two list
		
		Vector<Integer> List1 = new Vector<Integer>();
		for(int i=0;i<=2;i++) {
	     List1.add(v.get(i));
		 }System.out.println("List1: "+List1);
		 
		 
		 Vector<Integer> List2 = new Vector<Integer>();
			for(int i=3;i<=5;i++) {
		     List2.add(v.get(i));
			 }System.out.println("List2: "+ List2);
			 
			 
			 // Merging of two lists
			List1.addAll(List2);
			System.out.println("Merged List: " +List1);

	}

}
