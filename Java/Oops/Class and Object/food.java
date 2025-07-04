package oops;

public class food {
	String type;
	String quantity;
	int price;
	String taste;
	String state;
public food(String t, String q, int p, String ts, String s)
{
	type=t;
	quantity=q;
	price=p;
	taste=ts;
	state=s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
food Dinner = new food("Biryani","one plate",250,"spicy","solid" );
food Dinner1 = new food("fried rice","two plate",25,"normal","solid" );
System.out.println("type:"+Dinner1.type);
System.out.println("quantity:"+Dinner1.quantity);
System.out.println("price:"+Dinner.price);
System.out.println("taste:"+Dinner.taste);
System.out.println("state:"+Dinner.state);
	}

}
