package list;
import java.util.Scanner;
import java.util.Stack;

public class List5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> undo = new Stack<String>();
		Stack<String> redo = new Stack<String>();
				
		String currentString = "";
		
		while(true) {
			System.out.println("Current String: " +currentString);
			System.out.println("Enter your option");
			System.out.println("1.Type text");
			System.out.println("2.Undo");
			System.out.println("3.Redo");
			System.out.println("4.Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch(choice) {
			case 1:
				System.out.println("enter the text");
				String typedtext = sc.nextLine();
				
				undo.push(currentString);
				redo.clear();
				
				currentString += typedtext;
				break;
				
			case 2:
				if(!undo.isEmpty()) {
					redo.push(currentString);
					currentString =undo.pop();
					System.out.println("undo succesfull");
			}
				else
					System.out.println("nothing to undo");
				break;
				
			case 3:
				if(!redo.isEmpty()) {
					undo.push(currentString);
					currentString = redo.pop();
					System.out.println("redo successfull");
					
				}
				else
					System.out.println("nothing to redo");
				break;
				
			case 4:
				System.out.println("existing text editor");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
			}
		}
				
				
}

}






