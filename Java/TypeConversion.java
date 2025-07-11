package demo;

public class TypeConversion {

	public static void main(String[] args) {
		byte b =10;    //–128 to 127
		short s =55;   //–32,768 to 32,767
		int i =180;    //–2,147,483,648 to 2,147,483,647  
		float f = 8587.834f;  
		long l = 9385693;
		double d= 89478658.854;
		
		
		char c ='A';
		boolean bo = true;  // true or false
		
		
		// Implicit conversion -- by default java does this conversion
//		i=b;  // int to byte
//		System.out.println(i);
		f =i; // float to int
		System.out.println(f); 
		l=i; // long to int
		System.out.println(l);
		
		//Explicit conversion
		
//		int B =(byte) i;    // converts -> 0,1,2,....127,-128,-127,-126,....0,1,2,...
//		System.out.println(B);    // so i = 180 =>180-127=53 => this 53rd number after 127 is -76 and the type is promoted to int
		int i1 = 12;
		int I = (byte) i1;
		System.out.println(I);   // if it is in the range of conversion value it gives the same
		
		char c1 = 'B';
		int k = ('A'+'B');  // calculates ascii code of A and B and gives output
		System.out.println(k);
		
		// Boolean can't  be converted to any type of data type
		
		short t = 'A'+ 'B'-985;
		Object  o= t;   // to get type of variable
		System.out.println(o.getClass().getName());
		System.out.println(t);
		
		
		long l1 = 'g' + 'y'+ 678906865*6736;
		Object obj =l1;   
		System.out.println(l1);
		System.out.println(obj.getClass().getName());
		
		
	}

}
