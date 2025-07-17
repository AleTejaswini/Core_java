package oops;

public class Weather {
	String cityname;
	int temp;
	int humidity;

	public Weather(String cityname, int temp, int humidity) {
		this.cityname = cityname;
		this.temp = temp;
		this.humidity = humidity;
	}

	public static void main(String[] args) {
		Weather[] w= {
				new Weather("Delhi",35,60),
				 new Weather("Mumbai", 30, 75),
		            new Weather("Hyderabad", 33, 68),
		            new Weather("Chennai", 36, 80),
		            new Weather("Shimla", 22, 55)
		};
		for( Weather cities : w) {
			System.out.println(cities.cityname + "," + cities.humidity + "," + cities.temp);
			
		}
		

	}

}
