package flight;
import java.util.Scanner;

public class F_main {
	public static void main(String[] args) {
		Scanner S =new Scanner(System.in);
		Flight[] flight= {
				new Flight("F001","hyd","usa",20),
				new Flight("F002","hyd","mumbai",40),
				new Flight("F003","hyd" ,"Delhi", 50),
				new Flight("F004","hyd", "kerala",60)
		};
		boolean running =true;
		while(true) {
			System.out.println("Flight ticket Booking ");
			System.out.println("1.View all flights");
			System.out.println("2.Search flight route");
			System.out.println("3.Book Seat");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice = S.nextInt();
			S.nextLine();
			
	if(choice==1) {
		System.out.println("Available Flights:");
		for(Flight f : flight ) {
			f.display();
		}
	}else if(choice ==2) {
		System.out.println("Enter you source");
		String scr = S.nextLine().trim();
		System.out.println("enter your destination");
		String des = S.nextLine().trim();
		boolean found = false;
		System.out.println("Matching flights");
		for(Flight f:flight) {
			if(f.source.equalsIgnoreCase(scr) && f.destination.equalsIgnoreCase(des)) {
				f.display();
				found=true;
			}
		}if(!found) {
			System.out.println("no flights found");
		}
		
	}else if(choice ==3) {
		System.out.println("enter flight id to book");
		String flightId =S.nextLine().trim();
		boolean booked = false;
		
		for (Flight f : flight) {
            if (f.flightId.equalsIgnoreCase(flightId)) {
                System.out.print("Enter number of seats to book: ");
                int seats = S.nextInt();
                S.nextLine();

                if (f.bookseats(seats)) {
                    System.out.println("Booking successful! Remaining seats: " + f.availableSeats);
                } else {
                    System.out.println("Not enough seats available.");
                }
                booked = true;
                break;
            }
        }

        if (!booked) {
            System.out.println("Flight ID not found.");
        }

    } else if (choice == 4) {
        System.out.println("Thank you for using the Flight Booking System.");
        running = false;

    } else {
        System.out.println("Invalid choice. Please try again.");
    }
}
}
}