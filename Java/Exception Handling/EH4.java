import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.InputStreamReader;

public class EH4 {

	public static void main(String[] args) throws Throwable{
		File file = new File("./demo.txt");
		if(!file.exists()) 
		{
		file.createNewFile();
		}
		
		
		//Auto closable
	try(
			  FileInputStream fis = new FileInputStream(file);
		    InputStreamReader isr = new InputStreamReader(fis);
		    BufferedReader kl = new BufferedReader(isr);
			)
			
	{
		
//		FileReader fr = new FileReader("./sample.txt") ;
		 
		System.out.println(1/0);
		
		System.out.println(kl); // just initialization   
		
		
	}
	
//	catch(Exception e) {
//		e.printStackTrace();
//		System.out.println("Exception");
//		throw e;
	    
	
//	catch(FileNotFoundException f1) {         // can write multiple catch statments
//		f1.printStackTrace();
//	}
//	     
	
	
	catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) { // write multiple exceptions 
	    e1.printStackTrace();
	    System.out.println("catch");
	    System.exit(0);   // stops the next execution of lines
	    
		} 
	finally {
		System.out.println("finally");
	}
	}
}

//try {
//    System.out.println("Before exit");
//    System.exit(0);
//    System.out.println("After exit"); // ❌ This will never execute
//} catch (Exception e) {
//    System.out.println("Caught exception");
//}
//
//	}}



















//import java.io.*;
//
//public class EH4 {
//    public static void main(String[] args) {
//        File file = new File("example.txt");
//
//        try (
//            FileInputStream fis = new FileInputStream(file);
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader br = new BufferedReader(isr);
//        ) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}