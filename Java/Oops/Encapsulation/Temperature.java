package encapsulation;

public class Temperature {
	private double celsius;
	

	public double getCelsius() {
		return celsius;
	}


	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
    public double getFahrenheit(){
    	 return celsius * 9 / 5 + 32;
    }
    public void setFahrenheit(double  fahrenheit) {
        double celsius = ((fahrenheit - 32) * 5 / 9);
        setCelsius(celsius);
    }
	public static void main(String[] args) {
		Temperature t1 = new Temperature();
		t1.setCelsius(0);
		System.out.println(t1.getFahrenheit());
	}

}
