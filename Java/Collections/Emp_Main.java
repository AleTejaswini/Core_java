package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Emp_Main {

	public static void main(String[] args) {
		List<Emp> employee = new ArrayList<>();
		employee.add(new Emp("Teja" , 101, 10000.00, "India"));
		employee.add(new Emp("Afsheen",102,120000.00, "usa"));
		employee.add(new Emp("Renuka" ,103,30000.00, "uk"));
		employee.add(new Emp("Mahesh" ,104,15000.00,"canada"));
		employee.add(new Emp("raj" ,104,15000.00, "India"));
		employee.add(new Emp("vasu" ,105,30000.00,"India"));
		employee.add(new Emp("raviteja" ,106,60000.00,"usa"));
		employee.add(new Emp("uma" ,107,20000.00, "canada"));
		employee.add(new Emp("shiva" ,108 ,30000.00,"canada"));
		
		
		
		// print into list
		for(Emp e: employee) {
		System.out.println(Arrays.asList(e.name,e.id,e.salary,e.country));
		}
		
		
		
		// sum of same country salary
		int sum=0;
		for(Emp E:employee) {
		if(E.country == "India")
		 {
			sum += E.salary;
		 }}
		System.out.println(sum);
		
		
		// print employee names of same country
       Map<String ,List<String>> country = new HashMap<>();
       
       for(Emp e1: employee) {
    	   country.computeIfAbsent(e1.country, k -> new ArrayList<>()).add(e1.name);
       }
       for(Map.Entry<String,List<String>> ee : country.entrySet() ) {
    	   System.out.println(ee.getKey()  + ":" + ee.getValue());
       }
		
		
	}

}
