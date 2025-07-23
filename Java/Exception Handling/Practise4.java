class InsufficientBalance extends Exception{
	InsufficientBalance (String msg){
		super(msg);
	}
	
	static void withdraw(int amt) throws InsufficientBalance {
		int balance =10000;
		if(amt>balance) throw new InsufficientBalance("insuffient balance");
		else
			System.out.println(balance - amt);
	}
	public class Practise4{
		public static void main(String[] args) throws InsufficientBalance {
			try {
				withdraw(10000);
			}
			catch(InsufficientBalance b) {
			
				System.out.println(b.getMessage());
				throw b;
			}
		}
	}
	
}