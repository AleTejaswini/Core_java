package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable1 implements Comparable<Comparable1> {
		String name;
		int rollno;
		
	public Comparable1(String name, int rollno) {
			this.name = name;
			this.rollno = rollno;
		}
	

	public static void main(String[] args) {
		List<Comparable> std= Arrays.asList(new Comparable1("Teja",17), 
				new Comparable1("Affu",43),
				new Comparable1("Renuka",3),
				new Comparable1("Vijay",10),
				new Comparable1("Vasu",14));
		Collections.sort(std);
		System.out.println(std);
	}


	@Override
	public int compareTo(Comparable1 anotherrollno) {
		
		return Integer.compare(this.rollno ,anotherrollno.rollno);
	}
	public String toString() {
		return name + "-" +rollno;
		
	}
}
