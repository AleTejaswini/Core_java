package demo;

public class SB {

	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "Hello";
//		System.out.println(s1==s2);
//		
//		s1 = s1 + "prends";
//		System.out.println(s1==s2);
//		
//		String s3 = "Helloprends";
//		System.out.println(s1==s3);
//		
//		System.out.println(".......");
//		
//		
//		StringBuffer sb1 = new StringBuffer("Hello");
//		StringBuffer sb2 = new StringBuffer("Hello");
//		
//		System.out.println(sb1 == sb2);
//		
//		sb1 = sb1.append("prends");
//		System.out.println(sb1 == sb2);
//		
//		StringBuffer sb3 = new StringBuffer("Helloprends");
//		System.out.println(sb1 == sb3);
		
		
		 // string buffer and string builder have same  operations
//		     but differ synchronization
		StringBuffer sb = new StringBuffer("Teja");
//		sb.append("swini");
		sb.insert(4, "swini");
		System.out.println(sb.capacity());
		sb.delete(4, 9);
		
		
		
		System.out.println(sb);
		
	}

}
