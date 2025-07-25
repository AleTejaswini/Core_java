package map;

import java.util.ArrayList;

import java.util.List;

public class List1{
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);
		List<Integer> even = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) % 2 ==0) {
				even.add(list.get(i));
				
			}
			
			
		}
		System.out.println(even);
 	}
}

