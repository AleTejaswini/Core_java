package oops;

public class Constructor_Ex {

	//To refer to current class instance variables
	class Student{
		int id;
		String name;
	public Student(int id, String name) {
			this.id = id;
			this.name = name; // refers to IV
	}}
	
	//To call current class methods
	void display() {
		System.out.println("hello");
	}
	void show() {
		this.display(); // for calling methods
	}
	
	
//	To call current class constructor
//	constructor chaining
	class Person{
		Person(){
			this(100);
			System.out.println("Default constructor");
		}
		Person(int age){
			System.out.println("Age" + age);
		}
	}
	
	//To pass the current object as an argument
	class Box {
	    void print(Box b) {
	        System.out.println("Object received");
	    }

	    void send() {
	        print(this);
	    }
	}
	// To return the current object
	class Car {
	    Car start() {
	        System.out.println("Starting...");
	        return this;
	    }

	    Car drive() {
	        System.out.println("Driving...");
	        return this;
	    }
	} 
	public static void main(String[] args) {
		//usage 
//		new Car().start().drive();
	}

}
