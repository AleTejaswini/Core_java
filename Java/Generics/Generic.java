package demo;



 class Almond {
	 String name;
	 public Almond(String name) {
		 this.name = name;
	 } 
	 @Override
	 public String toString() {
		 return "Almond [name = " + name + "]";
				 }
	 }
	 class Cashew {
		 String name;
		 public Cashew(String name) {
			 this.name = name;
		 } 
		 @Override
		 public String toString() {
			 return "Almond [name = " + name + "]";
					 } 
		 
	 }


class Box<T> {
	T[] dryfruit;
	int index;
	public Box(int size) {
		dryfruit = (T[])new Object[size];
		index =0;
		
	}
	public void add(T dryfruits) {
		dryfruit[index] = dryfruits;
		index++;
	}
	public T get(int i) {
		return dryfruit[i];
	}
}
public class Generic {
public static void main(String[] args) {
    Box<Almond>  al = new Box(10);
    al.add(new Almond("Indian Almond"));
    al.add(new Almond("Australia Almond"));
    al.add(new Almond("us Almond"));
//    al.add("hello"); //now gets an error
    System.out.println(al.get(1));
    
    Box<Cashew>  ca = new Box<>(10);
    ca.add(new Cashew("Indian Cashew"));
    ca.add(new Cashew("Australia Cashew"));
    ca.add(new Cashew("us Cashew"));
    System.out.println(ca.get(1));
}}
	
	


