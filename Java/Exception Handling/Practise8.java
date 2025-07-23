//import java.sql.SQLException;
//
//class DataAccess extends Exception{
//	DataAccess(String msg, Throwable cause){
//		super(msg,cause);
//	}
//}
//public class Practise8{
// public  void method() throws DataAccess {
//	 try {
//		 throw new SQLException("Data cannot access");
//	 }
//	 catch(SQLException d) {
//	  throw new DataAccess("Failed to acces",d);
//		 
//	 }
// }
//
//
//	public static void main(String[] args) {
//		Practise8 obj = new Practise8();
//		try {
//			obj.method();
//			}
//		catch(DataAccess e) {
//			System.out.println("Custom exception " +e.getMessage());
//			System.out.println("Original cause " +e.getCause());
//		}
//	}
//
//}

import java.sql.SQLException;

class DataAccess extends Exception{
	DataAccess(String msg , Throwable cause){
		super(msg,cause);
	}
}

public class Practise8{
	public void method() throws DataAccess {
		try {
			throw new SQLException("Data cant access");
		}
		catch(SQLException s) {
			throw new DataAccess("Failed" ,s);
		}
	}
	
	public static void main(String[] args) {
		Practise8 p = new Practise8();
		try {
			p.method();
		}
		catch(DataAccess a) {
			System.out.println("custom exception" +a.getMessage());
			System.out.println("original exception" +a.getCause());
		}
	}
}


