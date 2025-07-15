package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Bank implements Comparable<Bank> {
//	String Holdername;
//	int accountnum;
//	double balance;
//
//	public Bank(String holdername, int accountnum, double balance) {
//		Holdername = holdername;
//		this.accountnum = accountnum;
//		this.balance = balance;
//	}
//	@Override
//	public int compareTo(Bank anotherbalance) {
//		
//		return Double.compare(this.balance,anotherbalance.balance);
//	}
//	public String toString() {
//		return Holdername + " " + accountnum + " " + balance;
//	}
//
//	public static void main(String[] args) {
//		List<Bank> list = new ArrayList<>();
//		list.add(new Bank("Teja" , 83724689, 53873.00));
//		list.add(new Bank("affu", 39659283,7365465.00));
//		list.add(new Bank("Renu" ,63459282,3874985.00));
//		
//			Collections.sort(list);
//			System.out.println(list);
//			}
//	}

//Comparator
public class Bank {
	String Holdername;
	int accountnum;
	double balance;
	public Bank(String holdername, int accountnum, double balance) {
		Holdername = holdername;
		this.accountnum = accountnum;
		this.balance = balance;
	}
	public String toString() {
		return Holdername + " " + accountnum + " " + balance;
	}
	public static void main(String[] args) {
		
		Comparator<Bank> name = (Bank b1 ,Bank b2) -> b1.Holdername.compareTo(b2.Holdername);
		Comparator<Bank> accnum = (Bank b1 ,Bank b2) -> Integer.compare(b1.accountnum,b2.accountnum);
		Comparator<Bank> bal = (Bank b1 ,Bank b2) -> Double.compare(b1.balance,b2.balance);
		
		List<Bank> list = new ArrayList<>();
		list.add(new Bank("Teja" , 83724689, 53873.00));
		list.add(new Bank("Affu", 39659283,7365465.00));
		list.add(new Bank("Renu" ,63459282,3874985.00));
		
		Collections.sort(list,name);
		System.out.println("Names: " +list);
		Collections.reverse(list);
		System.out.println("DescendingNames: " +list);
		
		Collections.sort(list,accnum);
		System.out.println("accnum: " +list);
		
		Collections.sort(list,bal);
		System.out.println("Balance: " +list);
		
	}
	}
