import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your weight");
		s.nextInt();
		System.out.println("enter your height");
		s.nextFloat();
				
	double weight = 45;
	float height =5.3f;
	double BMI = weight/ (height*height);
	


	if(BMI < 18.5)
		System.out.println("you are underweight");
	else if( BMI <=24.9)
		System.out.println("you are normal");
	else if(BMI <=29.9)
     	System.out.println("you are over weight");
	else
		System.out.println("obese");

	}

}
