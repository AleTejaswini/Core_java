package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

// Intersection
public class List4 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new Vector<>();
		list2.add(1);
		list2.add(20);
		list2.add(3);
		list2.add(40);
		list2.add(5);
		list2.add(20);
		list2.add(3);
		list2.add(40);
		list2.add(5);
		System.out.println(list2);
		
		//intersection of two lists
//		Set<Integer> set = new HashSet<>(list1);
//		
//		List<Integer> intersection = new ArrayList<>();
//		
//		for(Integer num : list2) {
//			if(set.contains(num)) {
//				intersection.add(num);
//			}
//			
//		}
//		
//		System.out.println(intersection);
		
		
		//remove duplicates
		Set<Integer> set1 = new LinkedHashSet<Integer>(list2);
		System.out.println(set1);
		
		
		
		
		
	}}