package oops;

public class InstanceMV {
	String name; // Instance variable
	int id;  // Instance variable
	
	public void display() {  // Instance method
		System.out.println(name + "," +id);
	}

	public static void main(String[] args) {
		
		InstanceMV i1 = new InstanceMV();
		i1.name= "Teja"; // we use = to assign values
		i1.id =101;
		
		InstanceMV i2 = new InstanceMV();
		i2.name= "Affu"; 
		i2.id =102;
		
		i1.display();
		i2.display(); // IM
		
		System.out.println(i1.name + " , " + i1.id); //IV
		System.out.println(i2.name + " , " + i2.id);
		
		
	}

}
