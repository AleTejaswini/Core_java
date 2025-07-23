//ExceptionPropagation

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practise6 {

	public static void main(String[] args) {
//		method1();
//		System.out.println("end of main");
//	}
//
//	private static void method1() {
//		method2();
//	}
//
//	private static void method2() {
//		int a=9;
//		int b=0;
//		int result= a/b;
//		System.out.println(result); 
		
		
//		try {
//		    int x = 10 / 0;
//		} catch (ArithmeticException ae) {
//		    System.out.println("Caught arithmetic exception");
//		} catch (Exception e) {
//		    System.out.println("Caught general exception");
//		}
		
		
		// inputmismatch
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your input");
		int input = s.nextInt();
		System.out.println("your input " +input);
	}
		catch(InputMismatchException i) {
			System.out.println(i);
			throw i;
		}
		finally {
			System.out.println("caught exception");
		}

		
		
}}
