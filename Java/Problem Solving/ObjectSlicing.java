package oops;

class Animal{
	String name ="Animal";
	public void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal{
	String breed="hatch";
	String name="Dog";
	public void sound() {
		System.out.println("dog barks");
	}
	public void displaybreed() {
		System.out.println(breed);
	}
}
public class ObjectSlicing {

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal ani = d;   // to access subclass methods to superclass
		ani.sound(); // here it is overriding
		System.out.println(ani.name);   // here variable is hidding
		System.out.println(((Dog) ani).name);

	}

}




