package oops;

public class BankAccMgmt {
	String holdername;
	int accnum;
	int balance;
	

	public BankAccMgmt(String holdername, int accnum, int balance) {
		
		this.holdername = holdername;
		this.accnum = accnum;
		this.balance = balance;
	}
    public void deposite(int amt) {
    	balance += amt;
    	System.out.println("Total balance: " +balance);
    }
    public void withdraw(int amt) {
    	if(balance> amt) 
    		balance-= amt;
    		
    
    	else 
    		
    	   System.out.println("Insufficient balance");
    }
	public static void main(String[] args) {
		BankAccMgmt person1 = new BankAccMgmt("Teja" , 764876,6483);
		
		person1.deposite(500);
		person1.withdraw(6985);

	}

}
