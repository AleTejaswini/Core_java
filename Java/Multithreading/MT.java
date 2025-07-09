package multithreading;

public class MT {

	public static void main(String[] args) {
//		System.out.println("hello");
//		System.out.println(Thread.currentThread());  
//		System.out.println(Thread.currentThread().threadId()); 
//		System.out.println(Thread.currentThread().getName()); 
//		System.out.println(Thread.currentThread().getPriority()); 
//		System.out.println(Thread.currentThread().getThreadGroup());
//		System.out.println(Thread.activeCount());
		
		
		
		Thread t1 = new Thread();   // creation of thread
		t1.start();   // to run the thread    
//		System.out.println(Thread.activeCount());
//		
		Thread t2 = new Thread();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
		
		Thread t4 = new Thread();
		t4.start();
		
		Thread t5 = new Thread();
		t5.start();
		
//		Thread t6 = new Thread();
//		t6.start();
//		
//		Thread t7 = new Thread();
//		t7.start();
		
		
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());  // gives different number when we run
		
		
	}

}
