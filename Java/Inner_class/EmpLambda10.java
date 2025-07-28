package inner_class;

import java.util.Arrays;
import java.util.Comparator;

public class EmpLambda10 {
	String name;
	int id;
	double salary;

	public EmpLambda10(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String toString() {
		return name + ","+ id +","+ salary;
	}

	public static void main(String[] args) {
		Comparator<EmpLambda10> sortsalary = Comparator.comparing((EmpLambda10 d1 ) -> d1.salary);
		

		EmpLambda10[] emp = {
					new EmpLambda10("Teja" ,001,50000.00),
					new EmpLambda10("Affu", 002,60000.00),
					new EmpLambda10("Renu", 003,40000.00),
					new EmpLambda10("uma",004,30000.00)
};
		
		Arrays.sort(emp,sortsalary);
		System.out.println(Arrays.asList(emp));

	}
}