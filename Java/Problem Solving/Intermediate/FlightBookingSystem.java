package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

class Flight{

	String FlightNum;
	String source;
	String Destination;
	String date;
	int totalseats;
	public Flight(String flightNum, String source, String destination, String date, int totalseats) {
		this.FlightNum = flightNum;
		this.source = source;
		this.Destination = destination;
		this.date = date;
		this.totalseats = totalseats;
	}
	public String toString() {
		return FlightNum + "|" + source  + "|" + Destination + "|" + date;
	}
	
}

class Booking{
	String BookingId;
	Flight flight;
	int SeatNum;
	String PassengerName;
	public Booking(String bookingId, Flight flight, int seatNum, String passengerName) {
		this.BookingId = bookingId;
		
		this.flight = flight;
		this.SeatNum = seatNum;
		this.PassengerName = passengerName;
	}
	
}


class BookingManager{
	Map<Flight,List<Booking>> flightbooking = new HashMap<>();
	
	public void seatbooking(Flight flight, int seatNum,String PassengerName) {
		List<Booking> bookings = flightbooking.getOrDefault(flight, new ArrayList<>());
		for(Booking b:bookings) {
			if(b.SeatNum ==seatNum)
			{
				System.out.println("Seat is already booked");
				return;
			}	}
			
			if(bookings.size()>= flight.totalseats) {
				System.out.println("No seats available for flight " +flight.FlightNum );
				return;
			}
		
			
			Booking newbooking = new Booking(UUID.randomUUID().toString(),flight,seatNum,PassengerName) ;
			bookings.add(newbooking);
			flightbooking.put(flight, bookings);
			System.out.println("Booking was succesfully completed for " +PassengerName + " on " + seatNum);
			}
		
		
		
	
	
	public void searchFlight(List<Flight> flights,String source,String destination,String date) {
		for(Flight flight :flights) {
			if(flight.source.equalsIgnoreCase(source)&&flight.Destination.equalsIgnoreCase(destination)&&flight.date.equals(date)) {
				int bookedseats= flightbooking.getOrDefault(flight, new ArrayList<>()).size();
				int availableseats =flight.totalseats - bookedseats;
				System.out.println(flight + "available seats "+availableseats);
			}
		}
	}
	
	
	public void bookingSummary(){
		for(Map.Entry<Flight, List<Booking>> entry : flightbooking.entrySet()) {
			System.out.println(entry.getKey() + " total bookings " +entry.getValue().size());
			
		}
		
	}
	}


public class FlightBookingSystem {

	public static void main(String[] args) {
		Flight f1 = new Flight("A1","Delhi","kerla","2025-08-10",5);
		Flight f2 = new Flight("A2", "Usa","UK","2025-08-21",3);
		
		List<Flight> flight =Arrays.asList(f1,f2);
		
		BookingManager manager = new BookingManager();
		manager.seatbooking(f1, 1, "Teja");
		manager.seatbooking(f2, 2, "Affu");
		manager.seatbooking(f2, 2, "Renu");
		
		
		System.out.println("\nBooking summary:");
		manager.bookingSummary();
	}

}




