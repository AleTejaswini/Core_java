package oops;

public class employee {
	String name;
	int salary;
	int id;
	String role;
	String company;
	public employee(String n ,int s,int i,String r,String c )
	{
		name =n;
		salary =s;
		id =i;
		role=r;
		company= c;
	}
	

	public static void main(String[] args) {
		
	employee topper = new employee("affu",10000,002,"Associate application developer","Dmantz");
	System.out.println( topper.name);
	System.out.println( topper.salary);
	System.out.println( topper.id);
	System.out.println( topper.role);
	System.out.println( topper.company);
	
		// TODO Auto-generated method stub

	}

}
