package oops;

public class movie {
	String name;
	int length;
	String type;
	int year;
	public movie(String n,int l,String t,int y)
	{
		name=n;
		length=l;
		type= t;
		year=y;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         movie tollywood= new movie("amaran",3,"real story",2024);
         System.out.println("Name :" + tollywood.name);
         System.out.println("length :" + tollywood.length);
         System.out.println("Type :" + tollywood.type);
         System.out.println("Year : " + tollywood.year);
	}

}
