package inner_class;
interface vehicle{
	default String fueltype() {
		return "petrol";
	}
}
class ElectricCar implements vehicle{
	@Override
	public String fueltype() {
		System.out.println(vehicle.super.fueltype()); // prints interface 
		return "Electric";    // overrides
		
	}
	
}
public class Default4 {

	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar();
		
		String result = ec.fueltype();
		System.out.println(result);

	}

}
