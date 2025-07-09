package multithreading;

public class MT1 {   // run different threads randomly  and gives output in different order for multiple executions
  // this one way to implement multi threading
	public static void main(String[] args) {
		Employee t1 = new Employee("T1");  //2
		t1.start();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		
		
		Manager m1 = new Manager("T2"); //4
		m1.start();
				

	}

}
class Employee extends Thread{  //1  // when you extend thread employee becomes thread type of class
	
	public  Employee(String tname) {   //5   // to give name for thread
		super(tname);
	}
	@Override
	public void run() {
		System.out.println("hello" + Thread.currentThread().getName() +">>" + Thread.currentThread().threadId());
		}
	}
class Manager extends Thread{  //3
	public  Manager (String tname) {  //5  // to give name for thread 
		super(tname);
	}
	@Override
	public void run() {
			System.out.println("Hi" + Thread.currentThread().getName()+ ">>" + Thread.currentThread().threadId());
	}}