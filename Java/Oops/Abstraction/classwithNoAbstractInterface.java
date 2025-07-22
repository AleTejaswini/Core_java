package Abstract_class;

// class with no interface and abstract 
class Washingmachine{
	public void start() {
		fillingwater();
		mixDetergent();
		System.out.println("machine started");
	}
																
	private void fillingwater() {  // these should be private because to hide as hiding make sense of abstraction...this is called anstration via encapusualtion
		System.out.println("filling water");
	}
	private void mixDetergent() {
		System.out.println("mixed detergent");
	}
}

public class classwithNoAbstractInterface {
	
	public static void main(String[] args) {
		Washingmachine wm = new Washingmachine();
	    wm.start(); // this internally access private methods

	}

}
