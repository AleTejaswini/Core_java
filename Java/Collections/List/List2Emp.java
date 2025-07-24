package list;


import java.util.Arrays;
import java.util.Comparator;

public class List2Emp {
	
	int id;
	String name;
	double salary;
		
	public List2Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return id +"," + name + "," + salary;
		
	}
	public static void main(String[] args) {
		
		
	
		Comparator<List2Emp> Salarysort = Comparator.comparing((List2Emp l) -> l.salary);
		
		List2Emp[] emp = {
		new List2Emp(01,"Teja",80000),
		new List2Emp(02,"Affu" ,60000),
		new List2Emp(03,"Renu" ,90000)
		};
	
		Arrays.sort(emp,Salarysort);
		
		System.out.println(Arrays.asList(emp).reversed());  // descending order

			
		
		
			
	
		
	
	
			
			
	    
	    
	    
	    		

	}

}
