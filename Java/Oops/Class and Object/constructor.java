package oops;

public class constructor {
	String name;
	int rollno;
	//constructor
	public constructor(String n ,int r){
		 name = n;
		 rollno = r ;
	}
	
	
		
		public static void main(String args[])
		{
			constructor jhon = new constructor("John",01);
			System.out.println("Name: " + jhon.name);
	        System.out.println("Roll no: " +jhon.rollno);
		}
	

}
