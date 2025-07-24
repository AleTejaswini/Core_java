package list;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
//		List<String> std = new ArrayList<String>();
//		std.add("Teja");
//		std.add("Renu");
//		std.add("Affu");
//		std.add("uma");
//		std.add("vasu");
//		std.add("mahesh");
//		System.out.println(std);
//
//	    // searching an element  
//		boolean found = false;
//		for(int i=0;i<std.size();i++) {
//			if( std.get(i).equals("vasu")) {
//				System.out.println("element is at " +i);
//				 found = true;
//				break;
//			}}
//		if(!found){
//			   System.out.println("not found");
//			}
		
		
		
		
		
		//even and odd number separation
		List<Integer> list = new ArrayList<>();
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
		
		//even and odd number separation
//		List<Integer> even = new ArrayList<>();
//		List<Integer> odd = new ArrayList<>();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i) % 2 ==0) {
//				even.add(list.get(i));
//				}
//			else {
//				odd.add(list.get(i));
//			}
//		}
//		System.out.println(even);
//		System.out.println(odd);
//		
	
	//reverse of a list
	for(int i=list.size()-1; i>=0;i--) {
		System.out.println(list.get(i));
     }
	System.out.println("original list: "+list);
	
	
	
	
	
	}}


