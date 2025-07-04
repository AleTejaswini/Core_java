package list;

import java.util.Arrays;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector v1 = new Vector();
//	Vector v1 = new Vector(30); // specifies particular capacity 
		
		v1.add("Teja"); // adding element
		v1.add("renu");
		v1.add("affu");
		v1.add(2, "uma"); //returns at specified index
		v1.add(3);
		System.out.println(v1.size()); //returns size of vector
		System.out.println(v1.capacity()); // returns capacity of vector
		System.out.println(v1.indexOf("Teja"));  // returns index of an elements
		System.out.println(v1.firstElement());  // returns first element in list
		System.out.println(v1.lastElement());     // returns last element in list
		System.out.println(v1);
		Object[]  arr1 = v1.toArray();
		
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		Object[] arr = new Object[] {"teja",17, "affu",43,"renu", 3};
		Vector v2= new Vector(Arrays.asList(arr));   // converts array to list
		v2.add("raj");
		v2.add(3);
		v2.add("tej");
		
		
		System.out.println(v2.capacity());  // returns no. of elements if we create vector with arrays
		System.out.println(v2);
		
//		 v2.addAll(v1);         // adds v1 collection  elements to v2
		 v2.addAll(2,v1);     
		 System.out.println(v2); 
		v2.removeAll(v1);   // removes v1 elements
		System.out.println(v2);
		
		
		//Generic concept
//		Object[] arr2 = new Object[] {1,2,3,4,5};
//		Vector v3 = new Vector(Arrays.asList(arr2));
//		v3.add("teja");   // gets exception while we do sum  , so to over come this problem we use generic  concept
		
		
		//Generic concept
		Vector <Integer> v3 = new Vector<>();
		v3.add(12);
		// v3.add("teja");  returns error
		v3.add(12);
		v3.add(34);
//		v3.add(null);  // allows null values
		int sum =0;
		for(int i=0;i<v3.size();i++) {
			sum += (Integer) v3.get(i);
			
		}System.out.println(sum);
		
		
		
		
		System.out.println(v1); 
		v1.set(1, "renuka"); // updates 
		System.out.println(v1);
	        v1.remove(2); // removes element at specified index
	       
	       System.out.println(v1.contains("teja")); // case sensitive
	       
		
		
		System.out.println(v1);
		System.out.println(v1.get(2));  // get elements at specified index
		v1.clear();  // clears all elements
		System.out.println(v1); 
		
		
		
	}

}
