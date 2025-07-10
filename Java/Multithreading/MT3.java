package multithreading;
// print number from 1 to 10
//public class MT3 {
// 
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		Thread t1 = new Thread(d);
//		t1.start();
//		}
//	}
//class Demo extends Thread {
//	@Override
//	public void run() {
//		int i =0;
//		for(i =0;i<=10;i++) {
//			System.out.println(i);
//		}
//		
//}
//	
//}


// multiplication table
//public class MT3{
//	public static void main(String[] args) {
//		Runnable r = () -> {
//			int i=1;
//			int  num=8;
//			while(i<=10) {
//				System.out.println(num + "x"  + i + "=" + num*i);
//				i++;
//			}
//         };
//         Thread t1 = new Thread(r);
//         t1.start();
//	}
//}
//class Mul implements Runnable{
//    @Override
//	public void run() {
//		int i=1;
//		int  num=8;
//		while(i<=10) {
//			System.out.println(num + "x"  + i + "=" + num*i);
//			i++;
//		}}}

// name and priority of different threads
//public class MT3{
//	public static void main(String[] args) throws InterruptedException {
//		Thread t1 = new Thread("T1");
//		t1.start();
////		t1.join();
//		System.out.println(" Thread Name : T1  >>   Thread priority:  " +t1.getPriority());
//		
//		
//		Thread t2 = new Thread("T1");
//		t2.start();
//		System.out.println(" Thread Name : T1  >>   Thread priority:  " +t2.getPriority());
//		
//	}
//}



//VIP customers get high priority in booking, while normal customers have normal priority.

//public class MT3{
//	public static void main(String[] args) {
//		Ticket normal = new Ticket("Normal customer");
//		normal.setPriority(Thread.MIN_PRIORITY);
//		
//		Ticket vip = new Ticket("vip customer");
//		vip.setPriority(Thread.MAX_PRIORITY);
//		
//		Thread t1 = new Thread(normal);
//		t1.start();
//		
//		Thread t2 = new Thread(vip);
//		t2.start();
//		}
//}
//class Ticket extends Thread{
//	public Ticket(String name) {
//		super(name);
//	}
//	public void run() {
//		System.out.println(getName() +" is booking a ticket with priority of "+ getPriority());
//	}
//}


//  Email & SMS Notifications (Join)
public class MT3{
	public static void main(String[] args) throws InterruptedException {
		Transaction T = new Transaction();
		Thread t1 = new Thread(T);
		
		Notification N = new Notification();
		Thread t2 = new Thread(N);
		t1.start();
		t1.join();
		t2.start();
	}
}

class Transaction extends Thread{
	public void run() {
		System.out.println("debeted 1000 rupees");
		System.out.println("transaction successfully completed");
		System.out.println("will receive a sms message");
	}
	}
class Notification extends Thread{
	public void run() {
		System.out.println(" received sms nofication ");
	}
	
}



