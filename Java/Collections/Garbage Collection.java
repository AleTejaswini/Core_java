package interfac;

public class GC {

	public static void main(String[] args) {
		GC g1= new GC();
		GC g2 = new GC();
		GC g3 = new GC();
		
		
	     new GC();
	    
		g1=null;
		g2=g3;
		System.gc(); // is used to remove garbage objects  
		

	}

	public void finalize() {
		System.out.println("objects are removed");
		
	}
}
