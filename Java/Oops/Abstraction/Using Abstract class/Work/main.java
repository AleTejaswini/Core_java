package Abstract_class;

public class main {

	public static void main(String[] args) {
	work D = new Developer(); // doesnt show implementation for interface
	Designer d =new Designer(); // shows implementation (f3)
	
	
	D.dowork();
	d.meeting();
	d.salary();
	D.salary();
	D.meeting();
	d.design();
	

	}

}
