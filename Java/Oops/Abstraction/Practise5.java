package Abstract_class;
abstract class Gamedevelopment{
	void move() {
		System.out.println("Represents movement of character i.e,forward/backward/left/right ");
	}
	abstract void specialability();
}
 class Wizard extends Gamedevelopment{

	 @Override
	void specialability() {
		System.out.println("Wizard uses Fireball");
	}
	
}
class Warrior extends Gamedevelopment{

	@Override
	void specialability() {
		System.out.println("Warrior performs a Shield Bash");
	}
	
}
class Archer extends Gamedevelopment{

	@Override
	void specialability() {
		System.out.println("Archer fires Multi-Shot");	
	}
	
}
public class Practise5 {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.move();
		w1.specialability();
		System.out.println("--------------------------------");
		Warrior w2 = new Warrior();
		w2.move();
		w2.specialability();
		System.out.println("--------------------------------");
		
		Archer a = new Archer();
		a.move();
		a.specialability();
		
	}

}
