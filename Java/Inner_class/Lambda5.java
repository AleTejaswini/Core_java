package inner_class;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda5 {
String name;
int age;
	public Lambda5(String name, int age) {
	
	this.name = name;
	this.age = age;
}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return getName() + "," +getAge();
	}

	public static void main(String[] args) {
		List<Lambda5> demo = Arrays.asList(new Lambda5("teja", 21),
				new Lambda5("affu", 22),
				new Lambda5("renu" ,20));

		demo.sort(Comparator.comparing(Lambda5::getName).thenComparing( Lambda5::getAge));
		System.out.println(demo);

	}

}
