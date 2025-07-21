package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class BankAcc {
      private String name;
      private double balance;
      private double accountnum;
      private List<String> transationLog = new ArrayList<>();
      
      public BankAcc(String name,double accountnum) {
    	  this.name = name;
    	  this.accountnum= accountnum;
    	  
      }
      public void deposite(int amount) {
    	  if(amount<=0)
    		  System.out.println("Amount should be more than zero");
    	  
    	  balance += amount;
    	  transationLog.add("Deposited: " +amount );
      }
      public void withdraw(int amount) {
    	  if(amount<=0) 
    		  System.out.println("Amount should be more than zero"); 
    	  
    	  if(amount>=balance) 
    		  System.out.println("insufficient balance");
    	  
    	  balance -= amount;
    	  transationLog.add("Withdraw: " +amount );
      }
      
      
      public String getName() {
		return name;
	}


	  public void setName(String name) {
		  this.name = name;
	  }


	  public double getBalance() {
		  return balance;
	  }


	  public void setBalance(double balance) {
		  this.balance = balance;
	  }


	  public double getAccountnum() {
		  return accountnum;
	  }


	  public void setAccountnum(double accountnum) {
		  this.accountnum = accountnum;
	  }


	  public static void main(String[] args) {
		  BankAcc b1 = new BankAcc("Teja" ,25875173);
		  b1.deposite(10);
		  b1.deposite(1000);
		  b1.withdraw(10);
		  System.out.println(b1.transationLog);
		
		  
		  
		 

	}

}
