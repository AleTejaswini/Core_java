package list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistEx {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>(); 
		ll.add(45);
		ll.add(89);
		ll.add(65);
		ll.add(66);
		 System.out.println(ll);
		ll.remove(2);
		System.out.println(ll.get(2));
       System.out.println(ll);
		ll.set(0,55);
		System.out.println(ll);
		
		System.out.println( ll.contains(45)); 
		
		Collections.synchronizedList(ll);

	}

}
