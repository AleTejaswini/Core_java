package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Product Inventory System
Problem:
Create a Product class (id, name, category, price). Given a list of products, write methods to:

Find the most expensive product in each category.

Count how many products are there in each category.
 */
public class Product {
	int id;
	String name;
	String category;
	double price;
	public Product(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return id + ","+name + ","+category +"," +price;
	}
	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product(101,"Apple iPhone 15 Pro","Electronics",	135000),
				new Product(102,"Samsung Galaxy S24","Electronics",	125000),
				new Product(103,"Nike Air Max","Footwear",14000),
				new Product(104,"Mixer Grinder","Home appliance",4500),
				new Product(105,"Puma shoes","Footwear",9500));
		
	// most expensive item in each category
		Map<String,Optional<Product>> maxitembyCat =list.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))));
		maxitembyCat.forEach((category,product)->{
			System.out.println(category + " >> " + product.get());
		});
			
		
		//count products in each category
		Map<String,Long> count = list.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
		System.out.println(count);
	}
}
