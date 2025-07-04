package collections;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Contactlist {

	public static void main(String[] args) {
		TreeMap<String ,String> person = new TreeMap<>();
		person.put("Teja", "6305488956");
		person.put("Afsheen", "8096927660");
		person.put("Renuka", "7095260317");
		person.put("Daddy", "9989080265");
		person.put("Akka", "9676386325");
		System.out.println(person);
		System.out.println(person.get("Teja"));
		
		
		Set<Entry<String,String>> e =  person.entrySet() ;
		for(Entry<String,String>  p :e) {
			System.out.println("Name: " +  p.getKey() + " >> " + "Phno." +p.getValue());
		}
		
		// only keys
	    Set<String> keys = person.keySet();
		for(String s : keys) {
			System.out.println(s);
			}
		
		// only values
		Collection<String> values =person.values();
		for(String v :values) {
			System.out.println(v);
		}
			
		person.remove("Teja");
		System.out.println(person);
	
	
	}	}


