package Static;



	interface Shape{
		static Shape createcircle(){
			return new Circle();
		}}
		
		class Circle implements Shape{
			Circle(){
				System.out.println("created circle");
			}
		}
		
		public class Static2{
			public static void main(String[] args) {
				Shape shape= Shape.createcircle();

			}
		}
	


