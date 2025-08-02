package ps;

import java.util.Arrays;
import java.util.List;

public class Shopping {
	int id;
	String name;
	double price;
	int quantity;
	public Shopping(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public static void calculate(List<Shopping> cart) {
		int total =0;
		for(Shopping s : cart) {
			total += s.price * s.quantity;
			
		}
		System.out.println("Total cart price is: " +total);
		
		
	}
	public static void main(String[] args) {
		
		List<Shopping> cart = Arrays.asList(new Shopping(01,"Apple",250, 2),
				new Shopping(02,"Soaps" ,200,6),
				new Shopping(03,"Rice", 1000,2),
				new Shopping(04,"Salt" ,50 ,1),
				new Shopping(05,"Turmeric",300,2));
		Shopping.calculate(cart);
	}

}
