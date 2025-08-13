class BankAccount {
	long AccNum;
	double balance;

	public BankAccount(long accNum, double balance) {

		AccNum = accNum;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}
}

class SavingAcc extends BankAccount {
	double InterestRate;

	public SavingAcc(long accNum, double balance, double InterestRate) {
		super(accNum, balance);
		this.InterestRate = InterestRate;
	}

	public void addInterest() {
		double interest = balance * (InterestRate / 100);
		balance += interest;
		System.out.println(balance);
	}
}

class PremiumSavingAcc extends SavingAcc {
	int CashbackPercentage;

	public PremiumSavingAcc(long accNum, double balance, float InterestRate, int cashbackPercentage) {
		super(accNum, balance, InterestRate);
		CashbackPercentage = cashbackPercentage;
	}

	@Override
	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance");
		} else
			balance -= amount;
		System.out.println(balance);
	}

	public void applyCashback(double amountSpent) {
		double cashback = (amountSpent * (CashbackPercentage / 100.0));
		balance += cashback;
		System.out.println(balance);
	}
}

public class Bank {

	public static void main(String[] args) {
		SavingAcc sacc = new SavingAcc(746239, 50000.00, 3);
		sacc.addInterest();

		PremiumSavingAcc p = new PremiumSavingAcc(5238723, 40000, 4, 3);

		p.applyCashback(3000);
		p.withdraw(5000);
	}

}
