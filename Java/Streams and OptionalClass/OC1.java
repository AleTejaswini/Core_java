package streams;

import java.util.Optional;

public class OC1 {

	public static void main(String[] args) throws Exception {
	Optional<String> name = Optional.of("Teja");
	System.out.println(name);
	//get() => Gets the value inside Optional.
	System.out.println(name.get());
	
	// throws null pointer exception
//	Optional<String> name1 =Optional.of(null);
//	System.out.println(name1); // throws null pointer exception
	
	
// isPresent()
//Returns true if a value exists inside the Optional.
//Returns false if Optional is empty.	
		
//isEmpty()
//Returns true if Optional does NOT contain any value.
//Returns false if a value exists.
	
	// returns boolean value
//	Optional<String> name1 =Optional.ofNullable(null);
//	System.out.println(name1.isPresent()); 
//	System.out.println(name1.isEmpty());
	
	//isPresent() Executes the given code only if value exists.
//	Optional<String> name2= Optional.of("Teja");
//	name2.ifPresent(n->System.out.println(n));
	
	//orElse()=>Returns the value if present, else returns the default value.
//	Optional<String> name3= Optional.ofNullable(null);
//	Optional<String> name3 =Optional.of("Teja");
//	System.out.println(name3.orElse("Default"));
	
//	Optional<String> name3 = Optional.ofNullable(null);
//	System.out.println(name3.orElse(null));
		
		// orElseGet => needs supplier
//		Optional<String> name= Optional.of("Teja");
//		System.out.println(name.orElseGet(() -> "Default"));
	
	
	//orElseThrow()
//	Optional<String> name= Optional.ofNullable(null);
//	System.out.println(name.orElseThrow( () -> new Exception("value not found")) );
	

//	Optional<String> empty = Optional.empty();
//	System.out.println(empty.orElseThrow(() -> new RuntimeException("Value not found")));  
	
	
	
	//map Transforms (converts) the value if it is present.
//	Returns a new Optional.
//	Optional<String> name = Optional.of("Teja");
//	Optional<String> n= name.map(String::toUpperCase);
//	System.out.println(n.get());
	
	
	
//	filter
//	Keeps the value only if it matches a condition.
//	If condition fails → returns empty Optional.
	
//	Optional<String> name= Optional.of("Teja");
//	Optional<String> n = name.filter(n1 -> n1.startsWith("T"));
//	System.out.println(n.get());
	
//	Optional<String> name= Optional.of("Teja");
//	Optional<String> n = name.filter(n1 -> n1.startsWith("X"));
//	System.out.println(n.isPresent());
//	System.out.println(n.get());
	
	
	}

}
