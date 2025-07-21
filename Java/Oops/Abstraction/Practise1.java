package Abstract_class;

 interface Paymentprocess {
	public abstract void process();
 }
 class creditcard implements Paymentprocess{

	@Override
	public void process() {
		System.out.println("payment is done by  using credit card");
	}
	 }
 class debitcard implements Paymentprocess{

	@Override
	public void process() {
		System.out.println("payment is done by using debit card");
		
	}
	 
 }
 class paypal implements Paymentprocess{

	@Override
	public void process() {
		System.out.println("payment is done by using paypal");
	}
	 
 }
 public class Practise1 {
	public static void main(String[] args) {
		creditcard c = new creditcard();
		c.process();
		
		debitcard d =new debitcard();
		d.process();
		
		
		paypal p = new paypal();
		p.process();
	

	}

}
