package oops;

public class Objmemorymgmt {
         int id;
         String name;
	public Objmemorymgmt(int id, String name) {
			
			this.id = id;
			this.name = name;
		}
	public void show() {
		System.out.println(id + "," +name);
	}
	protected void finalize() {
		System.out.println("object destroyed: " + id + name);
	}
	public static void main(String[] args) {
		Objmemorymgmt o1 = new Objmemorymgmt(101,"Teja");
		Objmemorymgmt o2 = new Objmemorymgmt(102,"Affu");
		 
		o1.show();
		o2.show();
		
		  
		o1 = null;
		System.gc();
		
		o1.show();
	    
		
	}

}
