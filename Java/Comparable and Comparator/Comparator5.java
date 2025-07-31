package comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator5 {
	String accType;
	double balance;
	
	public Comparator5(String accType, double balance) {
		this.accType = accType;
		this.balance = balance;
	}
	

	public String getAccType() {
		return accType;
	}


	public double getBalance() {
		return balance;
	}
public String toString() {
	return accType + "-" + balance;
}

	public static void main(String[] args) {
		List<String> acctype= Arrays.asList("Savings","Current","Fixed");
		List<Comparator5> accounts =Arrays.asList(new Comparator5("Current",5000),
				new Comparator5("Savings",1000),
				new Comparator5("Fixed",6000),
				new Comparator5("Current",2000),
				new Comparator5("Fixed",2000),
				new Comparator5("Savings",5000),
				new Comparator5(null,6000));
		

		Comparator<Comparator5> com = Comparator.comparing(Comparator5::getAccType, Comparator.nullsLast(Comparator.comparing(acctype::indexOf)))
				.thenComparing(Comparator.comparing(Comparator5 ::getBalance).reversed());
		
		accounts.sort(com);
			System.out.println(accounts);	
				
	}

}
