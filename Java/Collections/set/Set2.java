package map;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// intersection of three lists
public class Set2 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(1,2,4,5,6,7,8);
		List<Integer> list3 = Arrays.asList(2,4,5,9,8);
		
//	List <Integer> intersection = new ArrayList<Integer>();
//	for(int num:list1) {
//		if(	list2.contains(num) && list3.contains(num))
//		{
//		    intersection.add(num);
//		    
//		}
//		
//	}System.out.println(intersection);
		
		
		
//	//using set
//	Set<Integer> intersection = new HashSet<>(list1);
//	intersection.retainAll(list2);
//	intersection.retainAll(list3);
//	
//	System.out.println(intersection);
	
	
	Set<String> set = new HashSet<>();
	set.add("Apple");
	set.add("Banana");

//	for (String s : set) {
//	    System.out.println(s);
//	}

	set.forEach(System.out::println);  
	
	
	
	
	
	}

}
