package method_overloading;
class payment{
	public void process(int amount) {
		System.out.println("paid " +amount);
	}
}

class creditcard extends payment{
	public void process(int amount) {
		System.out.println("paid by using creditcard" +amount);
	}
}

class Upi extends payment{
	public void process(int amount) {
		System.out.println("paid by using UPI" +amount);
	}
}
class paypal extends payment{
	public void process(int amount) {
		System.out.println("paid by using paypal" +amount);
	}
}

// runtime polymorphism
public class Practise1 {

	public static void main(String[] args) {
		payment p = new payment(); 
		p.process(4000);
		
		
		p = new creditcard();
		p.process(500);
		
		
		p=new Upi();
		p.process(500);
		
		p = new paypal();
		p.process(2000);
	}

}
