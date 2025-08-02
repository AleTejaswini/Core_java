package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp {
	int id;
	String name;
	String department;

	public Emp(int id, String name, String department) {
		
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public String toString() {
		return id + "," + name + "," + department ;
	}

	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(new Emp(101,"Teja","Trainee"),
				new Emp(102,"Affu","Trainee"),
				new Emp(103,"Shiva","Developer"),
				new Emp(104,"Ashwini","Developer"),
				new Emp(105,"Shashi","Developer"),
				new Emp(106,"Renuka","Trainee"));
		Map<String,List<Emp>> map =list.stream().collect(Collectors.groupingBy(s->s.getDepartment()));
		System.out.println(map);
	
	}
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

}
