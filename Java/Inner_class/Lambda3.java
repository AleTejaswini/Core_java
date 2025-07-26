package inner_class;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("teja", "affu" ,"renu" ,"uma");
//		list.forEach(names -> System.out.println(names));
		// using method reference
		//	list.forEach(System.out::println);
		
		list.sort((s1,s2) -> s1.length() - s2.length());   
		 // s1 = length of first string
		// s2 = length of second string
//		 If result < 0 → s1 comes before s2.
//		 - If result > 0 → s2 comes before s1.
//		 - If result == 0 → Order unchanged.											
		
		
		System.out.println(list);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		num.stream().filter(n -> n %2 ==0).forEach(System.out::println);
		
		
		List<Integer> squares = num.stream().map(n -> n* n).collect(Collectors.toList());
		System.out.println(squares);

		
		new Thread(() -> System.out.println("thread is running using lambda") ).start();
		
		List<String> str = Arrays.asList(null, "satwik","Santosh", "" ,"sahithi");
		
		Set<String> demo = str.stream().filter(s -> s!=null && !s.isEmpty()).collect(Collectors.toSet());
		System.out.println(demo);
		
		
		//convert string to upper case
		List<String> list1 = Arrays.asList("teja","affu","renu");
		List<String> list2 =list1.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list2);
		
		String str1= "java is language";
//		String[] words = str1.
		System.out.println(str1.split(" ").length);
		
	}

	
	
}
