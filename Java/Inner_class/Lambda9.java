package inner_class;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda9 {

	public static void main(String[] args) {
		List<String> names =Arrays.asList("Apple","banana","apricot" ,"grapes", "Avacado");
		List<String> filtered = names.stream().filter(name -> name.toLowerCase().startsWith("a")).collect(Collectors.toList());
		System.out.println(filtered);
		
		
		
		List<Integer> numbers = Arrays.asList(3,5,1,3,6,7,9,4);
		List<Integer> des =numbers.stream().sorted((a,b) -> a-b).collect(Collectors.toList());
		System.out.println(des);
		
		
		
		// printing all elements => foreach using lambda 
		numbers.forEach(num->  System.out.println(num));
		
		// list of string to upper case
		List<String> upper = names.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);
		
		
		//count number of even numbers in list
		long even = numbers.stream().filter(num1 -> num1%2==0).count();
		System.out.println(even);
		
		List<String> data= Arrays.asList("Java", "", null, "Lambda", "", "Streams", null);
		List<String> clean = data.stream().filter(s -> s!= null && !s.isEmpty()).collect(Collectors.toList());
		System.out.println(clean);
		
		
		// mul2 
		List<Integer> mul2 = numbers.stream().map(num2 -> num2 *2).collect(Collectors.toList());
		System.out.println(mul2);
		
		
		//predicate
		List<String> names1 = Arrays.asList("Teja", "Afsheen", "Renuka", "Mahesh", "uma");
		Predicate<String> filterd = name1 -> name1.length() >5;
		List<String> ori = names1.stream().filter(filterd).collect(Collectors.toList());
		System.out.println(ori);
		
		
		
		
		
		
	}

}
