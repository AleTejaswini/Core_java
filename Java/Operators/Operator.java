package demo;

public class Operator {

	public static void main(String[] args) {
		int a =20;
		int b=10;
		
		//Arithmetic operator
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		
		//Unary operator
//		System.out.println(a++); // post increment (prints a and then increments)
//		System.out.println(++a);  // pre increment (increments and then printd a)
//		System.out.println(a--);
//		System.out.println(--a);
		
		//Relational operator
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a<=b);
//		System.out.println(a>=b);

		
		// conditional operator
		System.out.println(a>b && a==b); // returns true if both conditions are true
		System.out.println(a>b || a==b);  //returns true if atleast one value is true 
		
		//Assignment operator
		System.out.println(a+=5);
		System.out.println(a-=5);
		System.out.println(a*=5);
		System.out.println(a/=5);
		System.out.println(a%=5);
		
		
		
	}

}
