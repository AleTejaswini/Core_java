package Static;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
	String name;

	public Employee(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class MethodReference3 {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Teja"),
											new Employee("Renuka"),
											new Employee("Afsheen"));
	 emp.sort(Comparator.comparing(Employee::getName)); 
	emp.forEach(emp1->System.out.println(emp1.getName()));

	}

}
