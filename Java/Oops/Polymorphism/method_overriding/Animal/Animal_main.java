package method_overriding;

public class Animal_main {

	public static void main(String[] args) {
		Dog D =new Dog();
		Goat G = new Goat();
			Tiger T = new Tiger();
D.food_habits();
G.food_habits();
T.food_habits();
D.sound();
G.sound();
T.sound();
D.move();
T.move();
G.move();
	}

}
