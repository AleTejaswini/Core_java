package intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Task {
	String title;
	boolean isCompleted;
	
	public Task(String title) {
	
		this.title = title;
		this.isCompleted=false;
	}	
		public void togglestatus() {
			isCompleted=!isCompleted;
		}
		public String toString() {
			return (isCompleted ? "[✔] " : "[ ] ") + title;
		}
		
	}
public class ToDoList{
	static List<Task> tasks =new ArrayList<>();
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		while(true) {
			System.out.println("1.View tasks");
			System.out.println("2.Add tasks");
			System.out.println("3.Edit tasks");
			System.out.println("4.Delete tasks");
			System.out.println("5.ToggleStatus");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			 choice =sc.nextInt();
			 sc.nextLine();
			 
			switch(choice) {
			case 1:
				viewtasks();
				break;
			case 2:
				addtasks();
				break;
			case 3:
				edittasks();
				break;
			case 4:
				deletetasks();
				break;
			case 5:
				toggleTaskStatus();
				break;
			case 6:
				System.out.println("Thank You");
				return;
			default:
				System.out.println("Invalid choice");
			}
		}}

		private static void edittasks() {
			viewtasks();
		
			System.out.println("Enter the task number to edit");
			int  index = sc.nextInt()-1;
			sc.nextLine();
			if(index>=0 && index<=tasks.size()) {
				System.out.println("Enter your new title");
				String newtitle = sc.nextLine();
				tasks.get(index).title= newtitle;
				System.out.println("task editted successfully");
			}else {
				System.out.println("Invalid task number");
			}
		
		
	}

		private static void deletetasks() {
		viewtasks();
		System.out.println("Enterr task number  to delete");
		int index =sc.nextInt() -1;
		if(index>=0 && index<=tasks.size()) {
		tasks.remove(index);
		System.out.println("task deleted succesfully");
		
		}
		else {
			System.out.println("Invalid task number");
		}
	}

		private static void viewtasks() {
			if(tasks.isEmpty()) {
				System.out.println("No tasks in the list");
				return;
			}
			else {
				for(int i=0;i<tasks.size();i++) {
					System.out.println( (i+1) + "." +tasks.get(i));
				}
			}
		}
			private static  void addtasks() {
				System.out.println("Enter your Task title");
				String title =sc.nextLine();
				tasks.add(new Task(title));
				System.out.println("Task added");
				
		}
			private static void toggleTaskStatus() {
			    viewtasks();
			    System.out.print("Enter task number to toggle status: ");
			    int index = sc.nextInt() - 1;
			    if (index >= 0 && index < tasks.size()) {
			        tasks.get(index).togglestatus();
			        System.out.println("Task status updated.");
			    } else {
			        System.out.println("Invalid task number.");
			    }
			}
		
			}

	

	
