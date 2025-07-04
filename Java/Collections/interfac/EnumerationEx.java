package interfac;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		// it is an interface
		//  introduced for iterating legacy collection objects
		// legacy classes - v1.0 (introduced classes)
		// new class - v1.2 (after 1.2 introduced classes)
		// legacy class are Stack, Vector, Hash table, dictionary,properties
		 
////		Vector<Integer> v = new Vector<>();
//		Stack<Integer> v = new Stack<>();
//		v.add(12);
//		v.add(90);
//		v.add(87);
//		v.add(45);
//		Enumeration<Integer> e = v.elements();
//		while(e.hasMoreElements()) {
//			System.out.println( e.nextElement());
//		}
      // Enumeration allows only forward direction access(No reversing)
		// don't allow other operation access like add, remove,update
		
		// Hash table
		// ***can access only values
//		Hashtable<Integer, String> h = new Hashtable<>();
//		h.put(101, "Teja");
//		h.put(102, "affu");
//		h.put(103, "Renu");
//		h.put(104, "uma");
//		
//		Enumeration<String>  e1 = h.elements();
//		while(e1.hasMoreElements()) {
//			System.out.println(e1.nextElement());
//		}
		
		
		
		// Properties (only values)
		Properties p = new Properties();
		p.setProperty("101", "Teja");
		p.setProperty("102", "affu");
		p.setProperty("103", "Renu");
		
		p.setProperty("Teja", "101");  // gives in alphabetical order
		p.setProperty("Renu", "102");
		Enumeration<Object> e2 = p.elements();
//		while(e2.hasMoreElements()) {
//			System.out.println(   e2.nextElement()); 
//		}
		
		// we can convert Enumeration object to Iterator object
	      p.elements().asIterator();
	      while(e2.hasMoreElements()) {
				System.out.println(   e2.nextElement()); 
			}
		
		
	}

}
