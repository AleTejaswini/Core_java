package list;

import java.util.ArrayList;

public class Practise2 {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(0);
		a.add(9);
		a.add(8);
		a.add(10);
		System.out.println(a);
		
		int Evensum=0;
		for(int i=0;i<a.size();i++) {
					if(a.get(i) % 2 == 0)  { 
					Evensum += a.get(i);
			}
		}
	
		System.out.println( "Sum of even numbers:" +Evensum);
		
		
		
		
		
		
		
		
		
	}

}
