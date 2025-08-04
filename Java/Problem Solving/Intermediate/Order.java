package intermediate;


import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
	private int OrderId;
	private int customerId;
	private double orderAmount;
	 private String orderStatus;
	
	public Order(int OrderId, int customerId, double orderAmount, String orderStatus) {
	
		this.OrderId = OrderId;
		this.customerId = customerId;
		this.orderAmount = orderAmount;
		this.orderStatus = orderStatus;
	}

	public static void main(String[] args) {
	List<Order> orderlist = Arrays.asList(
		    new Order(101, 1, 5000.0, "Completed"),
		    new Order(102, 2, 3000.0, "Pending"),
		    new Order(103, 1, 7000.0, "Completed"),
		    new Order(104, 3, 12000.0, "Pending"),
		    new Order(105, 2, 9000.0, "Completed"),
		    new Order(106, 3, 4000.0, "Completed"),
		    new Order(107, 4, 15000.0, "Pending"),
		    new Order(108, 1, 2000.0, "Completed"),
		    new Order(109, 2, 1000.0, "Pending"),
		    new Order(110, 5, 6000.0, "Completed")
		);
	
	
	Map<Integer, DoubleSummaryStatistics> orderSummary = orderlist.stream()
	        .collect(Collectors.groupingBy(
	            Order::getCustomerId,
	            Collectors.summarizingDouble(Order::getOrderAmount)
	        ));

	    orderSummary.entrySet().stream()
	        .filter(entry -> entry.getValue().getSum() > 10000)
	        .forEach(entry -> System.out.println("Customer ID: " + entry.getKey() + " Total Amount: " + entry.getValue().getSum()));
	    
	    long pendingOrdersCount = orderlist.stream()
	    	    .filter(order -> order.getOrderstatus().equalsIgnoreCase("Pending"))
	    	    .count();

	    	System.out.println("Number of Pending Orders: " + pendingOrdersCount);
	    	
	    	
	    	long completedOrdercount = orderlist.stream().filter(order-> order.getOrderstatus().equalsIgnoreCase("Completed")).count();
	    	System.out.println("Number of completed orders: " +completedOrdercount);
	}

	public  int getOrderId() {
		return OrderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public String getOrderstatus() {
		return orderStatus;
	}

}
