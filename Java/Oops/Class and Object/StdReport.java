package oops;

public class StdReport {
	String name;
	int marks;
	
public StdReport(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
}

         String grade() {
	if(marks>80) {
		return "A";
	}
	else if(marks>=60) {
		return "B";
	}
	else if(marks>=50) {
		return "C";
	}
	else {
		return "fail";
	}
	}
   


	public static void main(String[] args) {
		StdReport[] std = {
				new StdReport("Teja" , 87),
				new StdReport("Affu" , 62),
				new StdReport("renu" ,52),
		};
       for(StdReport s : std) {
    	   System.out.println(s.name + "," + s.marks  + "," + s.grade());
       }
	}

}
