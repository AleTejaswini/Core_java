package encapsulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ShoppingCart {
	private String item;
	private int quantity;
	private Map<String,Integer> cartlist= new HashMap<>();
	private Map<String,Integer> itemPrice= new HashMap<>();
	
	
   public void additem(String item,int quantity,int price) {
	   if(quantity <=0) 
		   System.out.println("Quantity must be greater than 0");
	   if(quantity <=0) 
		   System.out.println(" Price must be greater than 0");
	   cartlist.put(item, quantity);
	   itemPrice.put(item, price);
	   
   }
   public void removeitem(String item ) {
	  
	   cartlist.remove(item);
	   itemPrice.remove(item);
   }
   
   public int getItemPrice(String item) {
       if (!cartlist.containsKey(item)) {
           System.out.println("Item not found: " + item);
           return 0;
       }
       int quantity = cartlist.get(item);
       int price = itemPrice.get(item);
       return price * quantity;
   }
   public int calculateTotal() {
       int total = 0;
       for (String item : cartlist.keySet()) {
           total += getItemPrice(item);
       }
       return total;
   }
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.additem("Apple", 2, 100);
//		System.out.println(cart.calculateTotal());
		cart.additem("Chocolate", 5, 10);
		System.out.println(cart.calculateTotal());
		cart.removeitem("Chocolate");
		System.out.println(cart.cartlist);
		System.out.println(cart.calculateTotal());
	}

}
