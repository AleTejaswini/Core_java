package method_overloading;

public class A_main {

	public static void main(String[] args) {
		Addition A = new Addition();
		A.add(4, 5);
		A.add(5, "g");
		A.add("java", 24);
		A.add("java","Programming");
		A.add(4, 5, 8);
		A.add(5.6f, 7.9f);

	}

}
