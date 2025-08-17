
public class ForLoop {

	 public static void main(String[] args) {
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.println(i + " " + j);
//			}
//		}

//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}

//		int term =6;
//		for(int i=1;i<=term;i++) {
//			for(int j=term;j>=i;j--) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}

//		int term =6;
//		int i=1;
//		while(i<=term) {
//			int j=term;
//			while(j>=i) {
//			System.out.print(" * ");
//			j--;
//			}
//			System.out.println();
//			i++;
//			
//		}

	// Fibanocci series
//		int n1 =0 ,n2 =1,n3 =0, count =10;
//		System.out.print(n1 + " " + n2);
//		for(int i=2;i<count;i++) {
//			n3 =n1+n2;
//			System.out.print(" " + n3);
//			n1=n2;
//			n2=n3;
//		}

	// using recursion

//	static int n1 = 0;
//	static int n2 = 1;
//	public static void fibonacci(int count) {
//		if (count > 0) {
//			int n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//			fibonacci(count - 1);
//		}
//	}
//	public static void main(String[] args) {
//		int count = 10;
//		System.out.print(n1 + " " + n2);
//		fibonacci(count - 2);
//	}
	
	
//	prime number
		 int num=20;
		 
		 for(int i=1;i<=num;i++) {
			 boolean isprime= true;
			 for(int j=2;j<=Math.sqrt(i);j++) {
				 if(i%j ==0)
					 isprime =false;
				
			 }
		 if(isprime)
			 System.out.println(i);
		 }
	

}
}