package Static;

import java.util.Arrays;
import java.util.List;

class Order{
	int orderid;
	double amt;
	public Order(int orderid, double amt) {
	
		this.orderid = orderid;
		this.amt = amt;
	}
	

public boolean isHighvalue() {
	return amt > 5000;
}

public void print() {
	System.out.println("OrderID " +orderid + "," + "Amount " +amt);
}
}
public class MethodReference1{
	
	public static void main(String[] args) {
		List<Order> menu = Arrays.asList(new Order(101,5400),
				new Order(102,4000),new Order(103,3000),
				new Order(104,6000));
		menu.stream().filter(Order::isHighvalue).forEach(Order::print);
	}
}