package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,96,4,5,1));
		Queue<Integer> queue=new PriorityQueue<>(Arrays.asList(1,2,96,1,4,5));
		Set<Integer>  set = new HashSet<>(Arrays.asList(1,2,96,4,1,5));
		Vector<Integer> vector = new Vector(Arrays.asList(1,2,96,4,1,5));
		Map<Integer,String> map = new TreeMap<>();
		map.put(101, "Teja");
	    map.put(102, "Renu");
	    map.put(103, "Affu");
 		
		
		// for loop
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		  
//		
//		// for each loop
//		for(Integer i: list)
//			System.out.println(i);
//		
		
		// for each method(only for collections)
//		list.forEach(null);  // should not be null (throws exception)
		
		list.forEach( i -> System.out.println(i));
		set.forEach( i -> System.out.println(i));
		queue.forEach( i -> System.out.println(i));
	    vector.forEach(i -> System.out.println(i));
		map.forEach((k,v) -> System.out.println(k + ">>" +v));
		

	}

}
