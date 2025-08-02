package ps;

public class Std {
		int id;
		String name;
		int phymark;
		int Telugumarks;
		int Engmarks;
		int sciemarks;
		int mathsmarks;
	public Std(int id, String name, int phymark, int telugumarks, int engmarks, int sciemarks, int mathsmarks) {
			this.id = id;
			this.name = name;
			this.phymark = phymark;
			Telugumarks = telugumarks;
			Engmarks = engmarks;
			this.sciemarks = sciemarks;
			this.mathsmarks = mathsmarks;
		}
	public int  avg() {
		int avg = (phymark+Telugumarks+Engmarks+sciemarks+mathsmarks)/5;
		if(avg > 80 )
			System.out.println("Grade : A");
		else if(avg > 60)
			System.out.println("Grade : B");
		else if(avg >40)
			System.out.println("Grade : C");
		else
			System.out.println("Grade : D");
		
		return avg;
		
		
	}
	public int getavg() {
		return avg();
	}
	
	public static void main(String[] args) {
		Std s1 = new Std(1,"Teja" ,80,90,85,80,100);
		System.out.println("Average marks of "   +s1.getName() + " is "  + s1.getavg() );
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	

}
