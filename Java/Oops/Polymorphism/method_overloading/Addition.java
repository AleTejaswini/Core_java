package method_overloading;

public class Addition {// same method but different  number of , type of ,order of parameters 
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(String a ,String b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(int a, String b) {
		System.out.println(a+b);
	}public void add(String a, int b) {
		System.out.println(a+b);
	}
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	
}
