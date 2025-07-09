package multithreading;

// using Runnable
	public class MT2 {   // run different threads randomly  and gives output in different order for multiple executions
		  // this is  one way to implement multi threading
			public static void main(String[] args)  throws InterruptedException {
//				Emp e1 = new Emp();  //  e1 runnable object
//				Thread t1 = new Thread(e1 ,"t1");
//				t1.start();
//				
//				Man m1 = new Man();  //  m1 runnable object
//				Thread t2 = new Thread(m1 ,"t2");
//				t2.start();
				
				
				 //  (3rd way) as runnable is functional interface we use anonymous class
//				Runnable r1 = new Runnable() {
//					public void run() {
//						System.out.println("hello " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
//						}
//					};
//					
//				
//				Runnable r2 = new Runnable() {
//						public void run() {
//							System.out.println("hi " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
//							}
//						};
//						
//						
//						Thread t1 = new Thread(r1 ,"R1");
//						t1.start();
//						Thread t2 = new Thread(r2,"R1");
//						t2.start();
						
						
				// (4th way) as runnable is functional interface we use anonymous class with lambda expression
//						Runnable r1 = () -> System.out.println("hello " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
//			
//						Runnable r2 = () -> System.out.println("hi " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
//								
//						 Thread t1 = new Thread(r1 ,"R1");
//								t1.start();
//								Thread t2 = new Thread(r2,"R1");
//								t2.start();
					
//		Runnable r1 = () -> {
//			for(int i=0 ;i<5;i++) {  // 2 threads run same time (it doesnt run after one thread after other
//			System.out.println("hello " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
//		}
//		};					
//		Runnable r2 = () -> {
//			for(int i=0 ;i<5;i++) {
//			System.out.println("hi " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
//		}
//		};								
//	       Thread t1 = new Thread(r1 ,"R1");
//		         t1.start();
//				Thread t2 = new Thread(r2,"R1");
//					t2.start();
				
				
				// to run after one thread after another thread (join())
				// to run after 10 sec we use sleep()
				Runnable r1 = () -> {
					for(int i=0 ;i<5;i++) {  // 2 threads run same time (it doesnt run after one thread after other
					System.out.println("hello " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
				}
				};					
				Runnable r2 = () -> {
					for(int i=0 ;i<5;i++) {
					System.out.println("hi " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
				}
				};								
			       Thread t1 = new Thread(r1 ,"R1");
			       Thread t2 = new Thread(r2,"R1");
			       System.out.println(t1.getState());  // get status of thread 
				         t1.start();
				         System.out.println(t1.getState());
//				          t1.join();
				         t1.sleep(10000);
				         t2.start();
				         System.out.println(t1.getState());
				         
				         
			// Life cycle 6 stages
//		    0- New
//		    1-running
//		    2-blocked
//		    3-waiting
//		    4- timed waiting(specific time/sleep)
//		    5- terminated
							
				
				System.out.println(Thread.activeCount());
				System.out.println(Thread.currentThread().getName());
				
		}

		}
		class Emp implements Runnable{  //1
			@Override
			public void run() {
				System.out.println("hello " + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
				}
			}
		class Man implements Runnable{  //3
			
			@Override
			public void run() {
					System.out.println("Hi " + Thread.currentThread().getName()+ ">>" + Thread.currentThread().threadId());
			}}


