package flight;


public class Flight {
	String flightId;
	String source;
	String destination;
	int availableSeats;
	public  Flight(String flightId,String source,String destination,int availableSeats) {
		this.flightId= flightId;
		this.source=source;
		this.destination=destination;
		this.availableSeats=availableSeats;
	}
	public void display() {
		System.out.println("Flight Id:" +flightId + "\n Source:" +source + "\nDestination:" +destination + "\n Available Seats: " +availableSeats);
	}

	public boolean bookseats( int seats) {
		if( availableSeats >= seats) {
		availableSeats -=seats;
		return true;
	}
		return false;
	}
	
}
	