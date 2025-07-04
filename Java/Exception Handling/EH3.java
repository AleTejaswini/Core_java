import java.io.*;
public class EH3 {

	public static void main(String[] args) throws FileNotFoundException {
	 try {
		 File f =new File("mytext.txt");
		 FileReader  reader = new FileReader(f);
		 System.out.println("File found");
		 }
	 catch(FileNotFoundException F) {
		 System.out.println(F.toString());
		 System.err.println("file not found");
	 }
    finally {
    	System.out.println("code executed");
    }
	}

}
