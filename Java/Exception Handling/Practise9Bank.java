class Checked extends Exception{
	Checked(String msg){
 super(msg);}
}
class Unchecked extends RuntimeException{
	Unchecked(String msg){
		super(msg);
	}
}
public class Practise9Bank {
public void checked(int amount) throws Checked {
	if(amount> 1000) {
		throw new Checked("checked: withdraw limit exceeds");
	}
	System.out.println("Withdrawn (checked) " +amount);
}


public void Unchecked(int amount) {
	if(amount> 1000) {
		throw new Unchecked("unchecked:withdraw limit exceeds");
	}
	System.out.println("Withdrawn (unchecked) " +amount);
}




	public static void main(String[] args) {
		Practise9Bank bank = new Practise9Bank();
		
		//checked 
		try {
			bank.checked(1500);
			
		}
		catch(Checked c) {
			System.out.println("Caught checked: " +c.getMessage());
		}
		// unchecked
//		try {
//		bank.Unchecked(1500);
//		}
//		catch(Unchecked u) {
//			System.out.println("Caught unchecked: " +u.getMessage());
//		}

}
}