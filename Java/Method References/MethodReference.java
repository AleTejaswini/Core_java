package Static;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
// using static method
//public class MethodReference {
//	public static void msg(String name) {
//		System.out.println("Hello " +name);
//	}
//	public static void main(String[] args) {
//		Consumer<String> name = MethodReference::msg;
//		name.accept("Teja");
//		
//	}
//
//}
// using instance method
//public class MethodReference{
//	public void display(String name) {
//		System.out.println(name);
//		
//	}
//	
//	public static void main(String[] args) {
//		MethodReference mr = new MethodReference();
//		Consumer<String> name = mr::display;
//		name.accept("TEJA");
//		
//		
//		
//		// reference to instance methodname
//		List<String> names = Arrays.asList("Teja","Afsheen","Renuka");
//		names.sort(String:: compareToIgnoreCase);
//		names.forEach(System.out::println);
//		
//		
//		
//		
//			}
//}




//using constructor
//public class MethodReference{
//	MethodReference(){
//		System.out.println("using constructor");
//	}
//	
//	public static void main(String[] args) {
//		Supplier<MethodReference> supp = MethodReference::new;
//		MethodReference mr1=supp.get();
//	}
//}


//using constructor
public class MethodReference{
	String name1;
	MethodReference(String name1){
		this.name1= name1;
	}
	public static void main(String[] args) {
		List<String> names= Arrays.asList("Teja","Afsheen","Renuka");
		
		List<MethodReference> emp= names.stream().map(MethodReference::new).collect(Collectors.toList());
//		names.forEach(System.out::println);
		emp.forEach(emp1->System.out.println(emp1.name1));
		
		
		
	}
}
