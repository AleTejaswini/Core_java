package comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator4 {
	String name;
	String city;
	int Ordercount;
	public Comparator4(String name, String city, int ordercount) {
	
		this.name = name;
		this.city = city;
		this.Ordercount = ordercount;
	}
	public String toString() {
		return name + "," + city + "," +  Ordercount;
	}
	public static void main(String[] args) {
		List<Comparator4> customer = Arrays.asList(new Comparator4("Teja","hyd",10),
				new Comparator4("Affu" ,"benglore",5),
				new Comparator4("Renuka","sagar" ,6),
				new Comparator4("Uma",null,9));
		
		
		customer.sort(Comparator.comparing((Comparator4 c) -> c.city,Comparator.nullsLast(Comparator.naturalOrder()))
				.thenComparing(Comparator.comparing((Comparator4 c)  -> c.Ordercount).reversed()
						.thenComparing(Comparator.comparing((Comparator4 c ) -> c.name))));
		
		customer.forEach(System.out::println);
	}

}
