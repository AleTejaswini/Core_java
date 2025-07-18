package inheritance;
// super class
class vehicle{
	public void fuel(){
		System.out.println("vehicles runs with fuel");
	}
	public int Rental(int hours) {
		return 0;
	}
	
}
// sub classes
class Car extends vehicle{
	@Override
	public void fuel(){
		System.out.println("car runs with diesel");
	}
	@Override
	public int Rental(int hours) {
		return hours*500;
	}
	
}
class Bike extends vehicle{
	@Override
	public void fuel() {
		System.out.println("bike runs with petrol");
	}
	@Override
	public int Rental(int hours) {
		return hours*300;
	}
}
class electricvehicle extends vehicle{
	@Override
	public void fuel() {
		System.out.println("electric vehicle runs with charging");
	}
	@Override
	public int Rental(int hours) {
		return hours*800;
	}
}

public class VehicleRent {
	
	public static void main(String[] args) {
	 Car c = new Car();
	 int rent = c.Rental(3);
	 System.out.println(rent);
	 
	 Bike b = new Bike();
	 int bikerent = b.Rental(3);
	 System.out.println(bikerent);
	 
	 
	 electricvehicle  e = new electricvehicle();
	 int EVrent =e.Rental(3);
	 System.out.println(EVrent);

	}

}
