class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void printdetails() {
		System.out.println("Name: " + name + "Salary: " + salary);
	}

}

class Manager extends Employee {
	String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;

	}

	@Override
	public void printdetails() {
		System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + department);

	}

}

class Developer extends Employee {
	String language;

	public Developer(String name, double salary, String language) {
		super(name, salary);
		this.language = language;
	}

	@Override
	public void printdetails() {
		System.out.println("Name: " + name + ", Salary: " + salary + ", Language: " + language);

	}

}

public class MainEmp {
	public static void main(String[] args) {
		Developer d = new Developer("Teja", 12000.00, "Java");
		d.printdetails();

		Manager m = new Manager("Afsheen", 50000.00, "FullStack Java");
		m.printdetails();

	}
}
