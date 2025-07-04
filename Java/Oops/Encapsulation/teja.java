package encapsulation;

public class teja {
	
		private int id;
		private String empName;
		private String empAddr;

		public void setvalues(int ID,String empN, String empA) {
			 id = ID;
			 empName= empN;
			 empAddr= empA;
			
			
		}
		public String  getempName()
		{
		
			return empName;
		}
		public String  getempAddr()
		{
		
			return empAddr;
		}
		public int  getid()
		{
		
			return  id;
		}
		class demo
		{
	   public static void main(String[] args) {
		   teja e = new teja();
		   e.setvalues(001, "Affu", "chadoor");
		   System.out.println("Empid "+ e.getid() +  "\n EmpName:"+ e.getempName() + "\n EmpAddre "+ e.getempAddr() );
		   
	   }
}	}

