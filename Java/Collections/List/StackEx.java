package list;

import java.util.Stack;

public class StackEx { // it is child class of vector

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();  //it is parameter less constructor
		System.out.println(s.size());
		System.out.println(s.capacity());
//		s.add(45);
//		s.add(78);
//		s.add(98);
//		s.add(77);
//		s.add(65);
//		System.out.println(s);
//		
//		
//		
//		s.remove(1); 
//		System.out.println(s);
//		
//		
//		System.out.println(s.get(3));
//	    
//		s.set(3, 87);
//		 System.out.println(s);
		 
	// As stack follows LIFo it is not suitable to use above methods
		  
		 s.push(55);
		 s.push(98);
		 s.push(89);
		 s.push(45);
		 s.push(66);
		 s.push(55);
		 s.push(98);
		 s.push(56);
		 System.out.println(s);
		 s.pop(); // removes last element
		 System.out.println(s);
		 
		System.out.println( s.search(66));
		System.out.println( s.search(55));
		
		System.out.println(s.peek()); // shows the last element
		
		System.out.println(s.isEmpty()); // vector method
		 System.out.println(s.empty());  // stack method
		 
		

	}

}
