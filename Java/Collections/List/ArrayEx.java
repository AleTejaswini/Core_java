package list;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class ArrayEx {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1,4,6,78,5,9};
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
		a.add(5);
		a.add(0, 56);
		a.add(null);
		a.add(56);
		a.remove(5);
		System.out.println(a.get(3));
		System.out.println(a);
		a.set(5, 66);
		a.contains(66);
		System.out.println(a);
		System.out.println(a.size()); // doesn't allow capacity method
		
		
		for(Integer ele : arr)
		{	System.out.println(ele);	
		
		}
		
		Collections.synchronizedList(a);  // allow multiple threads
	}

}
