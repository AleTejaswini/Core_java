package encapsulation;

public class Human {
private int  heart;
private String brain;
private int bones;
public void set(int H, String b,int B)
{
	heart =H;
	brain=b;
	bones= B;
	
}
public int getH() {
	return heart;
}
public int getB() {
	return bones;
}
public String getb() {
	return brain;
}
public void eye()
{
	System.out.println("we can see");
	
}
public void nose()
{
	System.out.println("We can breath");
	}
public class demo{
	public static void main(String args[])
	{
		Human h= new Human();
		h.set(72,"memory", 206);
		h.eye();
		h.nose();
		System.out.println("Brain is for: " +h.getb() + "\nHeart beats: " + h.getH() + "\n No.of bones: "+h.getB());
	}
}
}
