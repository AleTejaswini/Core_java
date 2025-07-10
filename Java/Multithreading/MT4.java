package multithreading;

public class MT4 {

	public static void main(String[] args) throws InterruptedException {
		Brick b = new Brick();
		Runnable r1 = () -> {
			for(int i =0;i<10000;i+=50) {
				b.increment();
			}
		};
		
		Runnable r2 = () -> {
			for(int i =0;i<10000;i+=50) {
				b.increment();
			}
		};
		
		Runnable r3 = () -> {
			for(int i =0;i<20000;i+=50) {
				b.increment();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
            System.out.println(b.brickcount);
            System.out.println(b.brickcount2);
	}

}
class Brick {
//	int brickcount =0;
//	int brickcount2 =0;
	
	volatile int brickcount =0;
	volatile int brickcount2 =0;
	public  void increment(){
		brickcount += 100;
		brickcount2 +=50;
	}
	
//     public synchronized void increment(){     // gets the exact and correct value always 
//		brickcount += 50;
//	    brickcount2 +=50;
//	}
	
//	public void increment() {
//		synchronized(this) {
//			brickcount2 += 50;
//		}
//		brickcount +=50;
//	}
//     
	
	
	
	
}