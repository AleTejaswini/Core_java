package list;

import java.util.ArrayList;

public class Practise1 {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(0);
		a.add(9);
		a.add(8);
		a.add(10);
		System.out.println(a);
		
		// sum of elements
		int sum=0;
		for(int i=0;i<a.size();i++) {
			sum += a.get(i);
			}
		System.out.println("Sum: " +sum);

		
		// average of elements
		 int avg =0;
		 avg += sum/6;
		 System.out.println("Average: " +avg);
	}

}
