package comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator1  {
		String name;
		double salary;
	public Comparator1(String name, double salary) {
			this.name = name;
			this.salary = salary;
		}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return name + "-" + salary;
	}
	public static void main(String[] args) {
	List<Comparator1> emp = Arrays.asList(new Comparator1("Teja",60000),
			new Comparator1("Affu",50000),
			new Comparator1("Renuka",700000),
			new Comparator1("Vasu" ,1000000),
			new Comparator1("Uma",700000));
	
	
	emp.sort((s1,s2) -> Double.compare(s1.salary , s2.salary)); // using without getter method
	System.out.println(emp.reversed());
	
	
	//using getter method
	Comparator<Comparator1> emp1 =Comparator.comparing(Comparator1::getSalary);
	emp.sort(emp1);
	System.out.println(emp.reversed());
	}


}
