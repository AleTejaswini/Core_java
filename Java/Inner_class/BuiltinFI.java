package inner_class;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class BuiltinFI {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Teja","Afsheen","Renuka","uma","Raju","Rajesh");
		//Predicate
		Predicate<String> filterd = name-> name.length()>5;
		List<String> ori= names.stream().filter(filterd).collect(Collectors.toList());
		System.out.println("Using Predicate: " +ori);
		
		
		//Function
		Function<String,Integer> strlength = str -> str.length();
		System.out.println("Using Function: " +strlength.apply( "Tejaswini"));
		
		
		//Consumer
		Consumer<String> greet= name-> System.out.println("Using Consumer: " + "Hello, " +name);
		greet.accept("Teja");
		
		//Supplier
		Supplier<String> msg = ()->"Hello";
		System.out.println("Using Supplier: " +msg.get());
		
		
		//BinaryOperator
		BinaryOperator<String> oper = (s1,s2) -> s1+s2;
		System.out.println( "Using BinaryOperator: " +oper.apply("Teja", "Ramalingam"));

		
	}

}
