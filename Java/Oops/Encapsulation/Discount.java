package encapsulation;

import java.time.LocalDate;

public class Discount {
 private  String coupon;
 private double discountpercent;
 private int usecount;
 private LocalDate  expirydate;
 boolean active = true;
 public void applycoupon() {
	 applycoupon();
 }
 
 public void applycoupon(int originalprice) {
	 if(!active)
		 System.out.println("coupon expired");
	 if(LocalDate.now().isAfter(expirydate))
		 System.out.println("coupon expired");
	 usecount++;
	double discount = originalprice * (1 - discountpercent/100);
	System.out.println("Discount received: " +discount);
	 
 }
 
	public double getDiscountpercent() {
	return discountpercent;
}

 public void setDiscountpercent(double discountpercent) {
	this.discountpercent = discountpercent;
 }

 public LocalDate getExpirydate() {
	return expirydate;
 }

 public void setExpirydate(LocalDate expirydate) {
	this.expirydate = expirydate;
 }
 public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

 public String getCoupon() {
	return coupon;
 }

	public static void main(String[] args) {
		Discount d = new Discount();
		d.setCoupon("Teja");
		d.setDiscountpercent(12.00);
		d.setExpirydate(LocalDate.of(2025, 7, 22));
		d.applycoupon(10);


		
		
	}

	
}
