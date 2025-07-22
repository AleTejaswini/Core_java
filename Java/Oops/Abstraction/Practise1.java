package Abstract_class;

 interface Paymentprocess {
	public abstract void process();
	default void printReceipt() {
		System.out.println("receipt printed");
	}
	static String getSupported() {
		return "Teja";
	}
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
		String currency =  Paymentprocess.getSupported();
		System.out.println(currency);
		
		
		debitcard d =new debitcard();
		d.process();
		String currency1 =  Paymentprocess.getSupported();
		System.out.println(currency1);
		
		
		paypal p = new paypal();
		p.process();
		String currency3 =  Paymentprocess.getSupported();
		System.out.println(currency3);
	}

}
