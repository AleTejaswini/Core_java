package list;

import java.util.LinkedList;

// insert element at middle of list using linked list
public class List3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Teja");
		list.add("AFfu");
		list.add("renu");
		list.add("vasu");
		list.add("uma");
		
		String element = "Mahesh";
		
		int middleindex = list.size()/2;
		
		list.add(middleindex, element);
		System.out.println(list);
		
		

	}

}
