package inner_class;

import java.util.stream.Stream;

@FunctionalInterface
interface calculator{
	public int operation(int a, int b);
}

public class Lambda4 {

	public static void main(String[] args) {
		calculator  add = (a, b) -> a+b;
		calculator mul = (a,b) -> a*b;
		
		System.out.println(add.operation(10, 20));
		System.out.println(mul.operation(40, 10));

		
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		
	}

}
