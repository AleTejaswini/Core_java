package list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practise6 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 =new ArrayList<>();
		arr1.add(4);
		arr1.add(9);
		arr1.add(8);
		arr1.add(5);
		System.out.println(arr1);
		
		
		ArrayList<Integer>  arr2 = new ArrayList<>();
		arr2.add(1);
		arr2.add(8);
		arr2.add(0);
		arr2.add(5);
		arr2.add(1);
		arr2.add(6);
		System.out.println(arr2);
		
		
		
		// list of common elements between two list
		Set<Integer> common = new HashSet<>(arr2);
		
		common.retainAll(arr1);  // retainAll keeps only the elements that are also in arr1
		System.out.println(common);
		
		
		
		// delete the elements of list1  from list 2
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(9);
		list1.add(8);
		System.out.println(list1);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(1);
		list2.add(9);
		list2.add(4);
		list2.add(8);
		list2.add(0);
		list2.add(5);
		list2.add(1);
		list2.add(8);
		list2.add(6);
		System.out.println(list2);
		
		// delete the elements of list1  from list 2
//		list2.removeAll(list1);
//		System.out.println(list2);
		
		
		// print position of elements in the list
		System.out.println(list2.indexOf(8)+1);
		
		
		// reserve of a list
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(4);
		list3.add(9);
		list3.add(8);

        
//     Collections.sort(list3,Comparator.reverseOrder()); // reverses and sort 
       Collections.reverse(list3); // reverse the list
	   System.out.println(list3);
	   
	   
	   
	  // ascending and descending order of list
	   Collections.sort(list2); // ascending
	   System.out.println(list2);
	   Collections.sort(list2,Comparator.reverseOrder()); // descending
	   System.out.println(list2);
	   
	   
	   
	 // print first non repeated element
	   Map<Integer,Integer> count = new LinkedHashMap<>();
	   
	   for(Integer num: list2) {
		   count.put(num, count.getOrDefault(num, 0)+1);
	   
	   
	  for( Map.Entry<Integer, Integer> e : count.entrySet()) {
		  if(e.getValue()==1) {
			  System.out.println("First non repeated element: " +e.getKey());
			  return;
		  }
		  
		  
	  }
	  System.out.println("No elements were found");
	
	   }
	
	   
	
	
	
	}


	}



