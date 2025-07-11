package demo;

import java.util.ArrayList;

//  wrapper classes are object representations of primitive data types.
//  we cant store primitive data types in collections framework so we use wrapper classes 
public class Wrapperclass {
	
	
//	primitive DT    Wrapper class
//	  int            Integer
//	  byte           Byte
//	   short          Short
//	  long            Long
//	  float           Float
//	 double           Double
//	  char            Character
//	  boolean          Boolean

	public static void main(String[] args) {
		 int i =99;
//		Wrapperclass wc = new Wrapperclass();
		
//		Integer i1 = new Integer(876);  deprecated
		int i1 = Integer.valueOf(46);   // boxing 
		Integer i2 = Integer.valueOf(i);
		
	
		int i3 = i2;  // Auto boxing
		System.out.println(i1);
		System.out.println(i);
		System.out.println(i3);
		
//		int i4 =i2.valueOf(34);   // unboxing
		int i4 =i2;   // Auto unboxing 
		
		System.out.println(i4); 
		
	ArrayList<Integer> al = new ArrayList();
	al.add(45);  // auto boxing
	al.add(Integer.valueOf(95));  // boxing
	System.out.println(al);
	
	
	String s = "35";
	Integer age = Integer.valueOf(s);  // prints wrapper class instance
	int age1 = Integer.parseInt(s);     // prints primitive data type
	System.out.println(age);
	System.out.println(age1);
	
	
	
//	Boxing is the process of converting a primitive type into its wrapper class object manually
	int a = 10;
	Integer obj = Integer.valueOf(a);  // boxing
	System.out.println(obj);
	
	
	
//  Unboxing is the process of converting a wrapper class object back to its primitive type manually
	Integer obj1 = Integer.valueOf(20);
	int a1 = obj1.intValue();  // Unboxing
	System.out.println(a1);
	
	
	
	
//	Auto boxing is automatic conversion of a primitive type into a corresponding wrapper class by the compiler
	int a2 = 30;
	Integer obj2 = a2;  // Autoboxing (no need for valueOf)
	System.out.println(obj2);
	
	
	
	
//	Auto-unboxing is automatic conversion of a wrapper class object to its corresponding primitive type by the compiler
	Integer obj3 = 40;
	int a3 = obj3;  // Auto-unboxing (no need for intValue)
	System.out.println(a3);

	
	
	
	
		
		
		

	}

}
