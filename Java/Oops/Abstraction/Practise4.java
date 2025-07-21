package Abstract_class;
abstract class Sensor{
	public abstract void readData();
}
class TemperatureSensor extends Sensor{

	@Override
	public void readData() {
		System.out.println("Reads from a thermistor, thermocouple, or digital sensor Ex..in celcius");
	}
	
}
class MotionSensor extends Sensor{

	@Override
	public void readData() {
		System.out.println("Detects movement in an area. Ex..Motion detected at 3:42 PM");	
	}
	
}
class HumiditySensor extends Sensor{

	@Override
	public void readData() {
		System.out.println("Measures the amount of moisture in the air  Ex..68%");
	}
	
}
public class Practise4 {

	public static void main(String[] args) {
		TemperatureSensor temp= new TemperatureSensor();
		temp.readData();

		MotionSensor  motion = new MotionSensor();
		motion.readData();
		
		HumiditySensor humidity = new HumiditySensor();
		humidity.readData();
		
	}

}
