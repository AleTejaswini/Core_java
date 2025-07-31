package comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {
	String item;
	int price;
	

	public Comparator2(String item, int price) {
		this.item = item;
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return item + "-" + price;
	}


	public static void main(String[] args) {
		List<Comparator2> product = Arrays.asList(new Comparator2("Orange",200),
				new Comparator2("Brocoli" ,250),
				new Comparator2("Waterbottle" , 50),
				new Comparator2("Soap",30),
				new Comparator2("Chocolate", 80),
				new Comparator2("Ginger",200));
		product.sort(Comparator.comparing(Comparator2::getItem).thenComparing(Comparator2::getPrice));
		System.out.println(product);
		
	}
	

}
