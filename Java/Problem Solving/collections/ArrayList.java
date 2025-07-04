package list;

import java.util.ArrayList;


public class Practise4 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("ball");
		l.add("baby");
		l.add("soap");
		l.add("baby");
		l.add("shampoo");
		l.add("chalk");
		l.add("soap");
		l.add("makeup");
		l.add("baby");
		l.add("lotion");
		System.out.println(l);
		
		ArrayList<String> l1 = new ArrayList<String>();
		boolean current;
		int count=0;
		
		// print repeated  values and their count
		for(int i=0;i<l.size();i++) {
			count=0;
			current= false;
		
		 
			 for(int j=0;j<i;j++) {
				if( l.get(j).equals(l.get(i))) {
					current = true;
					break;
					
				 }
				 
			 }
			 if(!current) {
				 for(int k=0;k<l.size();k++) {
					 if(l.get(i).equals(l.get(k))){
						 count++;
					 }
				 }
				 if(count>1) {
					 System.out.println(l.get(i) + " >> " +count +" times");
				 }
			 }
		 }
	}

}
