package properties;

public class StackTest {

	public static void main(String[] args) {
		StackTest t = new StackTest();
		t.add(1);
		

	}public void add(int i) {
		System.out.println(i);
		i++;
		add(i);
		//Xss2m
	}

}
