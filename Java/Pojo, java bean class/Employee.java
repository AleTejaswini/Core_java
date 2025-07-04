package demo;

public class Employee {  //POJO class (plain odd Java object)
	private int id;
	 public int salary;
	protected String role;
	
	
	public Employee() {
		System.out.println("no agrs statement");
		
	}
	public Employee(int id)
	{
		this.id=id;
		
	}
	public void setid(int id) {
		this.id=id;		
		
		
	}
	public int getid() {
		return id;
	}

}
