package comparable;

import java.util.Arrays;
import java.util.Comparator;
// comparator is functional interface
// we can use by both in one program
	
public class Student1{
	int rollno;
	String name;
	float marks;
	int phymarks;
	
	public Student1 (int rollno, String name, float marks,int phymarks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.phymarks =phymarks;
	}
	@Override
	 public String toString() {
		 return rollno + " " + name + " " + marks + " " + phymarks;
		 
		 
	 }

	public static void main(String[] args) {
//		Comparator<Integer> com = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer x, Integer y) {
//				if(x < y) 
//					return 1;
//				else if(x>y)
//						return -1;
//					else
//						return 0;
//				}
//				
//			};
			
			
	        // using lambda expression
//			Comparator<Integer> com = (Integer x, Integer y) -> (x<y) ? 1:(x==y) ? 0 : -1; 
			
			// using integer
//			Comparator<Integer> com = (Integer x, Integer y) -> Integer.compare(y, x); 
					
			// static methods
//		Comparator<Integer> com = Comparator.comparingInt((Integer i) -> i).reversed();
			
				
		
		
		
		Integer[] arr = {7,2,4,9,6,0};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr,com);
//		System.out.println(Arrays.toString(arr));
		
		
//		Comparator<Student1> stdcomp = new Comparator<Student1>() {
//			 @Override
//				public int compare(Student1 s1, Student1 s2) {
//					
//					return s1. name.compareTo(s2.name);   //asce
////					return s2. name.compareTo(s1.name);   // desc
//					}
//		};
		
		// lambda expression
//		Comparator<Student1> stdcomp = ( s1,  s2) -> s1. name.compareTo(s2.name);   //asce
				
		// static methods
//		Comparator<Student1> stdcomp  = Comparator.comparing((Student1 s) -> s.name);
		
		// for null
		Comparator<Student1> stdcomp  = Comparator.comparing((Student1 s) -> s.name ,Comparator.nullsFirst(Comparator.naturalOrder()));  // to keep last we use nullsLast
		
		
		// for null // marks
				Comparator<Student1> markscomp  = Comparator.comparing((Student1 s) -> s.name ,Comparator.nullsFirst(Comparator.naturalOrder())); 
				// for null // rollno
				Comparator<Student1> rollcomp  = Comparator.comparing((Student1 s) -> s.name ,Comparator.nullsFirst(Comparator.naturalOrder()));  
				// for null phymarks
				Comparator<Student1> phycomp  = Comparator.comparing((Student1 s) -> s.name ,Comparator.nullsFirst(Comparator.naturalOrder()));  
		 Student1[] std = { 
					new Student1 (103,"Renu",300.00f ,200) ,
					new Student1 (104,"Uma",200.00f,300),
					new Student1(101,"Teja" ,100.00f,600),
					new Student1(102 ,"Affu" ,100.00f,500),
					new Student1(105,null , 400.00f,200)
				};

		// names
//		 Arrays.sort(std,stdcomp);
////		 Arrays.sort(std,stdcomp.reversed());  // desc
//			System.out.println(Arrays.asList(std));
			
			//marks
			Arrays.sort(std,markscomp.thenComparing(phycomp)); 
			System.out.println(Arrays.asList(std));
			
//			// rollno
//			Arrays.sort(std,rollcomp);
//			System.out.println(Arrays.asList(std));
			
	}

}
