package method_overloading;
abstract class Shape{
	public abstract void draw();
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing square");
	}
}
class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");	
	}
	
}
class ShapeFactory{
	public static Shape getshape(String type) {
		if(type.equalsIgnoreCase("Circle")) return new Circle(); 
		if(type.equalsIgnoreCase("Square")) return new Square();
		if(type.equalsIgnoreCase("Rectangle")) return new Rectangle();
		return null;
	}
}
public class Practise5 {

	public static void main(String[] args) {
		
		Shape sf = ShapeFactory.getshape("circle");
        sf.draw();
     
       
	}

	

	

}
