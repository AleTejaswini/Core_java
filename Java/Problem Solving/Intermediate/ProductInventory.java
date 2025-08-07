package intermediate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class ProList{
	String name;
	double price;
	int quantity;
	public ProList(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString() {
		return name + " ->" + quantity + " ->"  + price;}
	}
	public class ProductInventory {
		static List<ProList> products = new ArrayList<>();
		static Scanner sc = new Scanner(System.in);
		final static int LOW_Stock_threshold =5;
	
	public static void main(String[] args) {
		int choice;
		while(true) {
		System.out.println("----Product Inventory-----");
		System.out.println("1. View Product");
		System.out.println("2.Add Product");
		System.out.println("3.Purchase Product");
		System.out.println("4.Search product by name");
		System.out.println("5.Low Stock alert");
		System.out.println("6.Sort product by price");
		System.out.println("7.Exit");
		System.out.println("Enter you Choice");
		 choice = sc.nextInt();
		 
		 
		 switch(choice) {
		 case 1: viewproducts();break;
		 case 2: addproduct();break;
		 case 3:purchaseproduct();break;
		 case 4:searchproduct();break;
		 case 5: lowstockthreshold(); break;
		 case 6: sortprice();break;
		 case 7: exit();System.exit(0); break;
		 default: System.out.println("Invalid choice ..please enter the choice in (1/2/3/4/5/6/7)");
		 
		 }
		}
		
	}

	private static void exit() {
		System.out.println("Thank you ");
		
	}

	private static void sortprice() {
	products.stream().sorted(Comparator.comparingDouble(ProList::getPrice)).forEach(System.out::println);
	
			
	}

	private static void lowstockthreshold() {
		System.out.println("Low stock products are");
		products.stream().filter(p-> p.getQuantity() < LOW_Stock_threshold).forEach(System.out::println);
		
	}

	private static void searchproduct() {
		viewproducts();
		sc.nextLine(); 
		System.out.println("Enter search product name");
		String name= sc.nextLine();
		List<ProList> results = products.stream().filter(p->p.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		if(results.isEmpty()) {
			System.out.println("Product not found");
		}
		else{
			results.forEach(System.out::println);
		}
		
	}

	private static void purchaseproduct() {
		viewproducts();
		sc.nextLine();
		System.out.println("Enter product name");
		String name =sc.nextLine();
		System.out.println("Enter product quantity");
		int qty = sc.nextInt();
		boolean found = false;
		for( ProList p : products ) {
			if(p.name.equalsIgnoreCase(name))
			if(p.getQuantity() >= qty) {
				p.setQuantity(p.getQuantity()- qty);
				System.out.println("product Purchased successfully ");
			}
			else {
				System.out.println("Out of stock");
			}
			break;
		}if(!found)
		System.out.println("No product name found");
		
	}

	private static void addproduct() {
		System.out.println("Enter product name");
		String name =sc.next();
		System.out.println("Enter price");
		double price= sc.nextDouble();
		System.out.println("Enter quatity");
		int qty= sc.nextInt();
		products.add(new ProList(name,price,qty));
		System.out.println("Product add successfully");
	}

	private static void viewproducts() {
		if(products.isEmpty()) {
			System.out.println("No products yet");
			
		}else {
			for(int i=0;i<products.size();i++)
				System.out.println((i+1) + "." + products.get(i));
		}
		
	}
	
	
	

}
