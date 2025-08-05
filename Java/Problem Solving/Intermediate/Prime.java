package intermediate;

public class Prime {

	public static void main(String[] args) {
		for(int i=2;i<=50;i++) {
			boolean isprime = true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j ==0) {
					isprime = false;
				}
				
			}if(isprime) {
				System.out.println(i);
			}
		}
	}

}
