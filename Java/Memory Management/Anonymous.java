package demo;

public class Anonymous {
	String name ="Teja";
	public void education() {
		System.out.println(name + " had completed her graduation");
	}

	public static void main(String[] args) {
	    new Anonymous().education();  // anonymous object
	    
	   // the object which is not referenced by referenced variable is AO
	    Anonymous a = new Anonymous();
	    a.education();       // this is not right way to use if there is only one method
	}

}
