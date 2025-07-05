package properties;

public class MemoryMgmt {
	int orgID =45578;
	String orgName = "Java";
	String ceo = "James Gosling";
	int no_of_depts =2;
	static double networth =5000.00;
	public int getOrgID() {
		return orgID;
	}public static double getNetworth() {
		return networth;
	}
	public void deleteEmployee(int id) {
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		int eid =101;
		String empName="Jhon";
		double salary = 5000.00;
		MemoryMgmt m1 = new MemoryMgmt();
		m1.getOrgID();
		System.out.println(MemoryMgmt.getNetworth());
		
		MemoryMgmt m2 = new MemoryMgmt();
		m2.deleteEmployee(101);
		
		Thread.sleep(5000);
		
	
		
}
	

}
