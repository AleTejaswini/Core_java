package files; //using Scanner

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		
//		FileInputStream f = new FileInputStream(file);  // you can use this also by adding f.close and Scanner(f)
		
		
		// one way
//		Scanner scanner = new Scanner(file);
//		while(scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//			}
//		scanner.close();
		
		
		//alternate way
		Scanner scanner = new Scanner(file);
		String text = new String();
		while(scanner.hasNextLine()) {
			text += scanner.nextLine();
		}
		System.out.println(text);
        scanner.close();
	}

}
