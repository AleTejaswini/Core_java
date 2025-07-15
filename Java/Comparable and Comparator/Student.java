package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	float marks;
	
	
	
	public Student (int rollno, String name, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student anotherStudent) {
//		int x = this.rollno;
//		int y =anotherStudent.rollno;
//		
////		float x = this.marks;
////		float y = anotherStudent.marks;
//////		return this.name.compareTo(anotherStudent.name);  // for string 
////		
////		
//		if (x<y)
//			return -1;
//		else if(x>y)
//			return 1;
//		else
//			return 0;
//		
//		
//		
////		short cut for above
////		return Integer.compare(this.rollno, anotherStudent.rollno); 
		//or
//		return this.name.compareTo(anotherStudent.name);
		
		// to get descending order ..just swap the parameters
		return anotherStudent.name.compareTo(this.name);
		
		
	}
	
	
//	@Override
//	 public String toString() {
//		 return rollno + " " + name + " " + marks;
//		 
//		 
//	 }
	public static void main(String[] args) {
		Integer[] n = {1,4,7,2,5,9};
		List<Integer> list = new ArrayList<>(Arrays.asList(n));
		 System.out.println(list);
		 
		 
		 Collections.sort(list);
		 System.out.println(list);
		 
		 Collections.reverse(list);
		 System.out.println(list);
		 
		
		
		
		
        Student[] std = { 
				new Student (103,"Renu",300.00f) ,
				new Student (104,"Uma",200.00f),
				new Student(101,"Teja" ,100.00f),
				new Student(102 ,"Affu" ,400.00f),
			};
        
        Arrays.sort(std);
		System.out.println(Arrays.asList(std));
		
		
		
		 
		 
		 
		 }
	
	
	}


