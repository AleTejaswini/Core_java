package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import java.util.Arrays;
//
//public class Products implements Comparable<Products> {
//	int id;
//	String name;
//	int price;
//
//	public Products(int id, String name, int price) {
//		this.id = id;
//		this.name = name;
//		this.price = price;
//	}
//
// public String toString() {
//	 return id + " " + name + " " + price;
//	 }
//	@Override
//	public int compareTo(Products anotherprice) {
////		int x =this.price;
////		int y = anotherprice.price;
////		if(x<y)
////			return -1;
////		else if(x>y)
////			return 1;
////		else
////			return 0;
//		return Integer.compare(this.price, anotherprice.price);
//	}
//public static void main(String[] args) {
//		Products[] prod = {
//				new Products(01,"Book" ,50),
//				new Products( 03, "pen" ,10),
//				new Products(02,"chocolate" ,30),
//				new Products(05, "bottle" ,50),
//				new Products(04,"sketch" ,60)
//				};
//		Arrays.sort(prod);
//		System.out.println(Arrays.asList(prod));
//	}
//
//}


// comparator
public class Products{
	int id;
	String name;
	int price;
	public Products(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

 public String toString() {
	 return id + " " + name + " " + price;
	 }
 public static void main(String[] args) {
	 
	Comparator<Products> c = (Products p1, Products p2) ->  p1.name.compareTo(p2.name);
		
	Comparator<Products> c1 = (Products p1, Products p2) ->  Integer.compare(p1.price,p2.price);
	
	Comparator<Products> c2 = (Products p1, Products p2) ->  Integer.compare(p1.id,p2.id);
	


List<Products> Pro = new ArrayList<Products>();
Pro.add(new Products(01,"Book",50));
Pro.add(new Products(04,"pen",5));
Pro.add(new Products(03,"bottle",50));
Pro.add(new Products(02,"marker",25));

       Collections.sort(Pro,c);
       System.out.println("Sorted using names: " +Pro);
       
       Collections.sort(Pro,c1);
       System.out.println("Sorted using prices: " +Pro);
       
       Collections.sort(Pro,c2);
       System.out.println("Sorted using ids: " +Pro);

 }
}