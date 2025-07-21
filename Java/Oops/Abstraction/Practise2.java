package Abstract_class;
  
interface Vehicle{
	abstract void start();
	abstract void work();
	abstract void price();
	abstract void wheels();
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("car starts using key");
	}
	@Override
	public void work() {
		System.out.println("car works using engine");
	}
	@Override
	public void price() {
		System.out.println("car price starts from 3 lakhs");
	}
	@Override
	public void wheels() {
		System.out.println("car contains 4 wheels");
		
	}
	}
class Bike implements Vehicle{
	@Override
	public void start() {
		System.out.println("bike starts using button");
		
	}

	@Override
	public void work() {
		System.out.println("bike works using battery");
		
	}

	@Override
	public void price() {
		System.out.println("bike price starts from 1 lakh");
		
	}

	@Override
	public void wheels() {
		System.out.println("bike contains 2 wheels");
		
	}
	
}
class Lorry implements Vehicle{

	@Override
	public void start() {
		System.out.println("lorry starts by using key");
	}

	@Override
	public void work() {
		System.out.println("lorry works by using engine");
		
	}

	@Override
	public void price() {
		System.out.println("lorry price starts from 6 lakhs");
	}

	@Override
	public void wheels() {
		System.out.println("Lorry contains 6 wheels");
	}
	
}

public class Practise2 {
	public static void main(String[] args) {
	       Car c = new Car();
	       c.wheels();
	       
	       Lorry l = new Lorry();
	       l.work();
	       
	       
	       Bike b = new Bike();
	       b.start();
	       
	}

}
