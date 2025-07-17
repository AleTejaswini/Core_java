package oops;

public class StaticVar {
	static int  count;
	
	StaticVar(){
		count++;
	}
	public static void main(String[] args) {
		StaticVar s1= new StaticVar();
		StaticVar s2 = new StaticVar();
//		StaticVar s3 = new StaticVar();
		System.out.println(StaticVar.count);
		
		
	}

}
