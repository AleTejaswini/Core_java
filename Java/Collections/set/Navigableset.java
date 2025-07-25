package map;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigableset {

	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println(set.lower(10)); // becoz there are no lesser elements
		System.out.println(set.floor(10)); // return less or equal elements
		System.out.println(set.ceiling(25)); // returns smallest element greater than  or equal
		System.out.println(set.higher(10)); //returns smallest element greater than
		
		System.out.println(set.pollFirst()); // removes and returns first lowest element
		System.out.println(set.pollLast()); // removes and returns last highest element
		System.out.println(set.descendingSet()); // becoz it removes 10 and 50 above
	}

}
