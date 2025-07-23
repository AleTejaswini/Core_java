// multiple userdefined exception
class Outofstack extends Exception{
	Outofstack(String msg){
	super(msg);
	}
}
class Invalidquantity extends Exception{
	Invalidquantity(String msg){
	super(msg);
	}
}

public class Practise7 {
	static int stock=10;
	public static void order(int quantity ) throws Outofstack, Invalidquantity  {
		
		if(quantity>stock) throw new Outofstack("insufficient stock");
		
		if(quantity <=0) throw new Invalidquantity("enter valid quantity");
		stock -= quantity;
		System.out.println("order placed " +quantity);
	}

	public static void main(String[] args) throws Exception {
		try {
		order(-1);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
			throw e; // re-throw exception
		}
			
		}

}
