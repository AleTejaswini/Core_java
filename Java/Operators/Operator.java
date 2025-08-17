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
		System.out.println(a++); // post increment (prints a and then increments)
		System.out.println(++a);  // pre increment (increments and then printd a)
		System.out.println(a--);
		System.out.println(--a);
		
		//Relational operator
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a<=b);
//		System.out.println(a>=b);

		
		// conditional operator
//		System.out.println(a>b && a==b); // returns true if both conditions are true
//		System.out.println(a>b || a==b);  //returns true if atleast one value is true 
		
		//Assignment operator
//		System.out.println(a+=5);
//		System.out.println(a-=5);
//		System.out.println(a*=5);
//		System.out.println(a/=5);
//		System.out.println(a%=5);
		
		// left shift operator
		System.out.println(10<<3);  //10 * 2^3 => 10*8=>80 
		System.out.println(12<<2);  //12 * 2^2 => 12*4 => 48
		
		//Right shift operator
		System.out.println(10>>3);  // 10 / 2^3 =>10/8 => 1
		System.out.println(34>>2);  // 34 / 2^2 =>34/4 => 8
		
		
		//Bitwise & ,|,^ ,~ => and ,or , xor , bitwise  not
		
		// Bitwise OR ( | )
		int c = 10;   // binary representation 1010  
		int d = 5;     // binary representation 0101  
		// c | d = 1010 | 0101 = 1111  
		// the value of 1111 in decimal representation is 15  
		System.out.println("The value of c | d is: " + (c | d));  
		
		// Bitwise AND ( & )
		int e = 11;   // binary representation 1011  
		int f = 5;     // binary representation 0101  
		// e & f = 1011 & 0101 = 0001  
		// the value of 0001 in decimal representation is 1  
		System.out.println("The value of e & f is: " + (e & f)); 
		
		// Bitwise XOR ( ^ )
		int g = 11;   // binary representation 1011  
		int h = 5;     // binary representation 0101  
		// g ^ h = 1011 ^ 0101 = 1110  
		// the value of 1110 in decimal representation is 14  
		System.out.println("The value of g ^ h is: " + (g ^ h));  
		
		
		// Bitwise Complement operator ( ~ )
		int i = 5;   // binary representation 0101  
		// ~i = 1010 which will be represented as 10 in decimal format   
		// The compiler will give 2's complement of this number which is -6  
		System.out.println("The value of ~i is: " + (~i));  
		
		
		
		//Logical Operator 
		// && (Conditional AND operator)
		// || (Conditional OR operator)
		// ! (Bitwise NOT)
		
		
		
		
		
	}

}
