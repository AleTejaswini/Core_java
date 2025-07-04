package Icalculator;

public class Imain  implements Iscientific_cal{

	public static void main(String[] args) {
	Imain mycal = new Imain();
	mycal.adv_ope();
	mycal.log();
	mycal.transformations();
	mycal.operator();

	}


	public void log() {
		System.out.println("logorithms");
		
	}


	public void adv_ope() {
		System.out.println("modulus,percentage");
		
	}

	public void operator() {
		System.out.println("add,sub,mul,div");
		
	}


	public void transformations() {
		System.out.println("sin,cos,tan,cot,cosec,sec");
		
	}

}
