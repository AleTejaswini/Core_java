package method_overriding;

public class Dog extends Animal {
	public void food_habits()  {// method over ridding with different implementation{ 
		System.out.println("eats flesh, rice, milk");
	}
	public void sound() {
		System.out.println("Barks");
	}
	public void move() {
		System.out.println("runs");
	}

}
