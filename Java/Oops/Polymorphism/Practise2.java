package method_overloading;
class Animal{
	public void sound() {
		System.out.println("animals makes sound");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog barks");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("cat makes meow sound");
	}
}
class Cow extends Animal{
	public void sound() {
		System.out.println("Cow makes Moo sound");
	}
}
public class Practise2 {

	public static void main(String[] args) {
//	Animal a=new Animal();
	Animal a[]= {new Dog(),new Cat(),new Cow()};
	for(Animal  ani :a) {
		ani.sound();
	}
	
	}

}
