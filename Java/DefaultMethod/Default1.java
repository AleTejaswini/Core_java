package inner_class;
interface PaymentGateway{
	public void process(int amt);
	default void authenticate() {
		System.out.println("authenticating payment gateway");
	}
	
}
	 class Payprocess implements PaymentGateway{

		@Override
		public void process(int amt) {
			System.out.println( "payment done of rupees "+ amt);
			
		}
		
	}
	 
	public class Default1 {
	public static void main(String[] args) {
		Payprocess p = new Payprocess();
		p.authenticate();
		p.process(600);
	}
}