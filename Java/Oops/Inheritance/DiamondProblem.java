package inheritance;

class A {
	public void show() {
		System.out.println("class A");
	}
}

class B extends A {
	public void show() {
		System.out.println("class B");
	}
}

class C extends A {
	public void show() {
		System.out.println("class C");
	}
}
//   class D extends B , C{  }      // this diamond problem
// java does not allow multiple inheritance via class

// using interfaces java allow multiple inheritance
interface Ia {
	default void show() {
		System.out.println("class A");
	}

}

interface Ib extends Ia {
	default void show() {
		System.out.println("class B");
	}
}

interface Ic extends Ia {
	default void show() {
		System.out.println("class C");
	}
}

interface Id extends Ib, Ic { // because it override
	default void show() {
		System.out.println("class D");
		Ib.super.show();
		Ic.super.show();
	}
}

class Test implements Id {

}

public class DiamondProblem {
	public static void main(String[] args) {
		Test t = new Test();
		t.show();

	}

}
