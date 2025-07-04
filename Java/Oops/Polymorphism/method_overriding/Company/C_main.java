package method_overriding;

public class C_main {
	public static void main(String args[]) {
		Developer D = new Developer();
		Manager M =new Manager();
		Intern I = new Intern();
		D.report();
		D.role();
		D.salary();
		D.meeting();
		M.meeting();
		M.salary();
		M.report();
		I.salary();
		I.role();
		I.report();
	}
}
