package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Std {
    
     int id;
     String name;
     int Telmarks;
     int Hinmarks;
     int Engmarks;
     int mathsmarks;
     int sciencemarks;
     int socialmarks;
    
	
     
	public Std( int id,String name, int telmarks, int hinmarks, int engmarks, int mathsmarks, int sciencemarks,
			int socialmarks) {
		
		this.name = name;
		this.id = id;
		this.Telmarks = telmarks;
		this.Hinmarks = hinmarks;
		this.Engmarks = engmarks;
		this.mathsmarks = mathsmarks;
		this.sciencemarks = sciencemarks;
		this.socialmarks = socialmarks;
	}
	
	
		
public int Avg() {
	
	int avg = ( Telmarks +  Hinmarks +  Engmarks + mathsmarks + sciencemarks + socialmarks)/6;
	return avg;
	}
public String grade() {
	int avg =Avg();
	
	if(avg > 90) {
		
		return "A grade";
	}
	else if(avg > 80 && avg<90) {
		return "B grade";
	}
	else if(avg > 70 && avg <80) {
		return "C grade";
	}
	else if(avg > 60&& avg <70) {
		return "D grade";
	}
	else if(avg > 50 && avg <60) {
		return "E grade";
	}
	else {
		return " Fail";
		}
	
	
}
public boolean isFailed() {
	return Telmarks<35 || Hinmarks<35 ||Engmarks<35 || mathsmarks<35 ||sciencemarks<35 || socialmarks<35; 
}

public String toString() {      // for failed students
	return "ID: " + id + " , Name: " +name ;
}


	public static void main(String[] args) {
		List<Std> list = Arrays.asList(new Std(101, "Teja",78,80,90,99,89,90 ),
				new Std(102,"Affu", 89,79,80,90,99,70),
				new Std(103,"Renuka",89,79,90,89,90,88),
				new Std(104,"Uma",38,60,34,50,30,49),
				new Std(105,"Vasu",88,50,29,70,67,60),
				new Std(106,"Mahesh" ,50,48,77,70,60,49));

	list .forEach(s -> System.out.println("ID: " + s.id + " Name: " + s.name + " Average marks: " + s.Avg() + " Grade: " + s.grade()));
	Comparator<Std> com = Comparator.comparing(Std :: Avg);
	Optional<Std> topper = list.stream().max(com);
	topper.ifPresent(s -> System.out.println("Topper: " + s.name + ", Avg: " + s.Avg() + " Grade: " + s.grade()));
 
	System.out.println("Failed students");
	List<Std> failed= 	list.stream()
            .filter(Std ::isFailed)
            .collect(Collectors.toList());
	if(failed.isEmpty()) {
		System.out.println("no failed students ");
	}else {
		failed.forEach(s-> System.out.println(s));
	}
	

	}

}
