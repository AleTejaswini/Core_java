package ps;

public class Emp {
	int id;
	String name;
	double salary;
	double Netsalary;
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
// Netsalary = salary + HR + DA
//  where HR = 20% so 0.20 and DA =10% so 0.10
	public void setNetsalary() { 

		Netsalary =  salary + (salary * 0.20 +  salary *0.10);
		}
	public double getNetsalary() {
		return Netsalary;
		
	}

	public static void main(String[] args) {
		Emp e1 = new Emp(101,"Teja",15000);
		e1.setNetsalary();
		System.out.println("Netsalary of " + e1.name + " : " + e1.getNetsalary());
		
		Emp e2 = new Emp(102,"Affu",20000);
		e2.setNetsalary();
		System.out.println("Netsalary of " + e2.name + " : " +e2.getNetsalary());
	
		
		Emp e3 = new Emp(103,"Renu",30000);
		e3.setNetsalary();
		System.out.println("Netsalary of " + e3.name + " : " +e3.getNetsalary());
		
		

	}

}
