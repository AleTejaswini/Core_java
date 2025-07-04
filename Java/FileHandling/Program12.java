package files;         //merging of two text files
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program12 {

	public static void main(String[] args) throws IOException {
	FileReader f1 = new FileReader("./sample.txt");
	FileReader f2 = new FileReader("./example.txt");
	FileWriter f3 = new FileWriter("./merged.txt");
	
	
    int ch;
	 while ((ch = f1.read()) != -1) {
         f3.write(ch);
         }
	 f3.write('\n');
while((ch = f2.read()) !=-1) {
	f3.write(ch);
}
f1.close();
f2.close();
f3.close();
System.out.println("merged successfully");
}
	
}