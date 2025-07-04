package Interface;

public interface telecomm_operators {
public  void Calling();
public void Sms();
public void Pho_num();

default void validity() {
	callertunes();
	System.out.println("varies for differ operators");
	
}
static void callertunes() {
	System.out.println("allows caller tunes");

}private void Spam_calls() {
	sim5G();
	System.out.println("Notifies Spam calls");
}
private static void sim5G() {
	System.out.println("Provide 5g network");
}
}