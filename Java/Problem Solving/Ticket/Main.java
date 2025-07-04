package movie_ticket;
public class Main {
    public static void main(String[] args) {
        
        MovieTicket childTicket = new MovieTicket(8);
        MovieTicket adultTicket = new MovieTicket(30);
        MovieTicket seniorTicket = new MovieTicket(65);

        System.out.println(" Child Ticket:");
        childTicket.printTicketDetails();

        System.out.println("Adult Ticket:");
        adultTicket.printTicketDetails();

        System.out.println(" Senior Ticket:");
        seniorTicket.printTicketDetails();
    }
}
