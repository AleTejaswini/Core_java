package demo;

public class Program {

	public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.role= "Developer";
	e1.setid(17);
	e1.salary = 45000;
	
	
	Employee e2 = new Employee();
	e2.role= "Trainer";
	e2.setid(19);
	e2.salary = 15000;
	
	Employee e3 = new Employee();
	e3.role= "Manager";
	e3.setid(001);
	e3.salary = 50000;
	
	Employee[] emp = new Employee[] {e1,e2,e3}; /// we can store multiple values
	
	System.out.println(e1.role);
	System.out.println(e1.getid());

	
	

	}

}
