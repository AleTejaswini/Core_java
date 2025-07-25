package map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// check if two set are disjoint(no common elements)
public class Set5 {

	public static void main(String[] args) {
		Set<Integer> set1 =new HashSet<>(Arrays.asList(1,2,3));
		
		Set<Integer> set2 =new HashSet<>(Arrays.asList(4,5,6));
		
		set1.retainAll(set2);
		
		if(set1.isEmpty())
 System.out.println("sets are disjoint");
		else
			System.out.println("sets are not disjoint");
	}

}
