package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.*;

public class Practise5 {

	public static void main(String[] args) {
	// identify highest number of duplicates
//		Vector<Integer> v = new Vector<>();
//		v.add(4);
//		v.add(1);
//		v.add(9);
//		v.add(4);
//		v.add(8);
//		v.add(0);
//		v.add(5);
//		v.add(8);
//		v.add(1);
//		v.add(8);
//		v.add(6);
//		System.out.println(v);
//		  
////		boolean current;
////		int count=0;
////		
////		
////		// print repeated  values and their count
////		for(int i=0;i<v.size();i++) {
////			count=0;
////			current= false;
////		
////		 
////			 for(int j=0;j<i;j++) {
////				if( v.get(j).equals(v.get(i))) {
////					current = true;
////					break;
////					
////				 }
////				 
////			 }
////			 if(!current) {
////				 for(int k=0;k<v.size();k++) {
////					 if(v.get(i).equals(v.get(k))){
////						 count++;
////					 }
////				 }
////				
////				 if((count>2)) {
////					 System.out.println(v.get(i) + " >> " +count +" times");
////				 }
////			 }
////		 }
//		
//		Map<Integer,Integer>  m = new HashMap<>(); // for storing number of count
//		for(int n : v) {
//			m.put(n, m.getOrDefault(n, 0)+1);
//		}
//		int maxcount=0;  // initially no count is calculated
//		int maxElement =-1;   // as the list has all postive integers , -1 will not appear in list
//
//		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
//			if(e.getValue()> maxcount) {
//				maxcount = e.getValue();
//				maxElement = e.getKey();
//			}			
//		}
//		if(maxcount>1) {
//		 System.out.println( maxElement +" >> " + maxcount + " times");
//		}
//		else {
//			System.out.println("no duplicates found");
//		}

		
		// delete duplicate values
		List<Integer> v1 = new ArrayList<>();
		v1.add(4);
		v1.add(1);
		v1.add(9);
		v1.add(4);
		v1.add(8);
		v1.add(0);
		v1.add(5);
		v1.add(8);
		v1.add(1);
		v1.add(8);
		v1.add(6);
		System.out.println(v1);
		
		
		Set<Integer> uniqueSet = new LinkedHashSet<Integer>(v1);

        // Convert back to list if needed
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("List after removing duplicates: " + uniqueList);
		
		
		
		
		
	}

}
