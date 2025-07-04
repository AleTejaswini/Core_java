package encapsulation;

public class Atm {
	private double balance;
	private int pin;
	
	
	 public  void setbalance(double bal)
	 {
		 balance = bal;
		 
	 }
public void setpin(int P) {
	pin= P;
}

public double getbalance()
{
	return balance;
}
public int getpin()
{
	return pin;
}
public void deposite(double amt)
{
	balance = balance + amt;
}
public void withdraw(double amt)
{
	balance = balance - amt;
	
}
public class  demo{
public static void main(String args[])
{
	Atm a = new Atm();
	a.setbalance(10000);
	a.setpin(1324);
	
	
	a.deposite(200);
	a.withdraw(500);
	
	System.out.println("Balance :"+ a.getbalance() + "\n pin:" +a.getpin() );
}
	
}




}

