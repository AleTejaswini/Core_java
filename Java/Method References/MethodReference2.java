package Static;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class product{
	String name;
	 double price;
	public product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	static product applydiscount(product p) {
		return new product(p.name,  p.price*0.9);
	}
	
	public String toString() {
		return name + ":" + price;
	}
}
public class MethodReference2 {
public static void main(String[] args) {
	List<product> prod= Arrays.asList(new product("Laptop", 60000),
			new product("Mobile",30000),
			new product("Tablet",40000));
	List<product> list =prod.stream().map(product::applydiscount).collect(Collectors.toList());
	list.forEach(System.out::println);
}
}
