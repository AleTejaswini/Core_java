package inheritance;
// DMD is a mechanism by which the call to an override method  is resolved at runtime instead of compile time.
// i.e,when a parent class reference is used to child class object  an override method is called,,so java decides which method to run ..at run time  based on actual object type 
// it is used to enable polymorphism =>  i.e to support runtime polymorphism    
class Animal{
    	 public void sound() {
			System.out.println("Aniaml makes sound");
		}
		
	}
     class Dog extends Animal{
    	 public void sound() {
    		 System.out.println("dog barks");
    	 }
     }
     class Cat extends Animal{
    	 public void sound() {
    		 System.out.println("cat sounds meow");
    	 }
     }
	public class DynaMethoddispatch {
	public static void main(String[] args) {
	     Animal a;  // parent class reference
	   
	     a= new Dog();  // child class object
	     a.sound();
	     
	     a= new Cat(); // child class object
	     a.sound();
	}

}
