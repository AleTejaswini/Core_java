package movie_ticket;
public class MovieTicket {
    private int age;
    private int Price = 200;

   
    public MovieTicket(int age) {
        this.age = age;
    }

   
    public int calculateFinalPrice() {
        if (age < 12) {
            return Price % 50;  
        } else if (age >= 60) {
            return Price % 50 ;  
        } else {
            return Price;       
        }
    }

    
    public void printTicketDetails() {
        System.out.println("Age: " + age);
        int finalPrice = calculateFinalPrice();
        System.out.println("Final Ticket Price: ₹" + finalPrice);
    }
}