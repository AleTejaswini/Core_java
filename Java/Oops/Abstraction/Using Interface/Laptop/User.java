package Interface;

public class User  {

	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		HP h =new HP();
		Mac M = new Mac();
		lenovo.copy();
		lenovo.cut();
		lenovo.camera();
		lenovo.touch();
		
		h.delete();
		h.copy();
	
		M.camera();
		M.delete();
		Laptop.security();
		
		
		
	

		
	}}