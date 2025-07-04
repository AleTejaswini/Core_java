package library;

public class User {
	String Name;
	String Id;
	String dept;
	public void displayInfo(String Name,int i,String dept) {
		
		System.out.println("Name: " +Name);
		System.out.println("Id: " + i);
		System.out.println("Dept: " +dept);
		}
	public  void calculateFine(int  daysLate) {
		
		System.out.println("Fine in rupees: " +daysLate* 5);
		}
		
	}


