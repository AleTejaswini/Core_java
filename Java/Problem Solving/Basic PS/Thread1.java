
//public class Thread1 extends Thread{
//@Override
//	public void run() {
//		System.out.println("Hello");
//	}
//	
//	public static void main(String[] args) throws InterruptedException {
//		Thread1 t1 = new Thread1();
//		Thread1 t2 = new Thread1();
//		
//		t1.start();
//		t1.sleep(1000);
//		t1.run();
//	
//		t2.join();
//		t2.run();
//		
//
//	}
//
//}



 class mytask implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println(i);	
		}
		
	}}
 
 
	public class Thread1{
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new mytask());
		Thread t2 = new Thread(new mytask());
		
		t1.start();
		t2.start();
	
	}
}
