package ps;

public class Demo {

	public static void main(String[] args) {
		int num = 6;
		int sum =0;
		int product =1;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
			System.out.println(i + " ");
			sum +=i;
			product *=i;
			}
		}
		if(sum==num &&product ==num) {
			System.out.println(num + " is perfect number that add and mul same ");
		}
		else {
			System.out.println("not perfect");
		}
	}}