package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class List {

	public static void main(String[] args) {
		String[] s = new String[] {"Teja","affu","renu","raju","ramesh"};
		ArrayList<String> name = new ArrayList<>(Arrays.asList(s));
		System.out.println(name.size());
	
		Integer[] I = new Integer[] {69,78,45,34,90,};
		Vector<Integer> marks = new Vector<>(Arrays.asList(I));
		System.out.println(marks.size());
		name.add("uma");
		marks.add(77);
		
		name.add("mahesh");
		marks.add(67);
			
		name.set(4, "suresh");
		marks.set(4, 99);
		
		marks.set(0, 98);
		for(int i=0;i<name.size();i++) {
			System.out.println("name: " +name.get(i) + " ,marks:" +marks.get(i)) ;
			}
		
		
		int total =0;
		for(int mark : marks)
			total += mark;
		
           System.out.println("Total marks: " +total);
		 int avg=0;
		 avg = total/marks.size();
		 System.out.println("Average: " +avg);
		
	}

}
