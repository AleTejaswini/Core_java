package intermediate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Transaction{
	private int transactionId;
	private String transactionNum;
	private String transactionType;
	private double amount;
	private LocalDate transactionDate;
	public Transaction(int transactionId, String transactionNum, String transactionType, double amount,
			LocalDate transactionDate) {
		
		this.transactionId = transactionId;
		this.transactionNum = transactionNum;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public String getTransactionNum() {
		return transactionNum;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	
}
public class BankTransactionSummary {

	public static void main(String[] args) {
		List<Transaction>  transactions = Arrays.asList(new Transaction(1,"Acc123" , "DEPOSITE",5000,LocalDate.of(2025, 6, 23)),
				new Transaction(2,"Acc456" , "WITHDRAW", 6000,LocalDate.of(2025, 6, 28)),
				new Transaction(3,"Acc123","DEPOSITE",4000,LocalDate.of(2025, 6, 30)),
				new Transaction(4,"Acc456","WITHDRAW",2000,LocalDate.of(2025, 7, 01)),
				new Transaction(5,"Acc123","WITHDRAW",4000,LocalDate.of(2025, 7, 05)),
				new Transaction(6,"Acc456","DEPOSITE",4000,LocalDate.of(2025, 7, 10)),
				new Transaction(7,"Acc123","WITHDRAW",1000,LocalDate.of(2025, 7, 15)));
		
		
		String target = "Acc123";
		double balance =transactions.stream().filter(t->t.getTransactionNum().equals(target))
		.mapToDouble(t->t.getTransactionType().equals("DEPOSITE")? t.getAmount() : -t.getAmount()).sum();
		System.out.println("Current Balance of Account " + target + " :" + balance );
		
		transactions.stream().filter(t->t.getTransactionNum().equals(target)).forEach(t-> System.out.println(t.getTransactionId() + "|" +t.getTransactionNum() + "|" +t.getTransactionType() + "|" + t.getAmount() +"|"+ t.getTransactionDate()));
 	}

}
