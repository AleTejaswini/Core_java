package inner_class;

// types  Non-static
        //  Static
		// Local classes
		// Anonymous inner class / Anonymous class
// Inner classes are introduced to access private variables 
          

public class Outer {
	int id = 100;
	
	public class Inner1{       // for multiple class multiple .class files are created
		  int id =101;
		  public void show() {
			  System.out.println("inner1 show");
		  }
		  public void demo() {
			  System.out.println("inner1 demo");
		  }
	
		}
	public class Inner1a extends Inner1{ //  inner class  extend non - abstract method 
		
		
	}
	
	public class Inner1b extends Inner5{

		@Override
		public void show() {
			System.out.println("abstract class show Inner5");
			
		}

		@Override
		public void demo() {
			System.out.println("abstract class demo Inner5");
			
		}
		
	}
    private class Inner2 implements Inner7{  // we can create public ,private , protected inner class
    // inner class implements  inner interface
		@Override
		public void showI() {
			System.out.println("Interface show");
			
		}

		@Override
		public void demoI() {
			System.out.println("Interface demo");
			
		}    
    	
    }
    protected class Inner3{
    	
    }
   static class Inner4 {  // can create static, abstract, final class
    	public void showStatic() {
    		System.out.println("static show");
    	}
    	
    }
    public abstract class Inner5{
    	public abstract void show();
    	public abstract void demo();
    	
    	
    }
    public final class Inner6{
    	
    }
    
    public interface  Inner7{
    	public void showI();
    	public void demoI();
    }

  
     public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.id);  // outer class id
		
//		Inner1  i1 = new Outer().new Inner1();
		Inner1 i1 = o.new Inner1();
		System.out.println(i1.id);  // inner class id
		  
		
		Inner1a ia = o.new Inner1a();
		ia.demo();
		ia.show();
		
		Inner1b ib = o.new Inner1b();
		ib.demo();
		ib.show();
		
		
		Inner2 i2 = o.new Inner2();  
		i2.demoI();
		i2.showI();
		
//		Inner4 i4 = new Outer.Inner4();  // for static method
		Inner4 i4 = new Inner4();
		i4.showStatic();
		
		
		
		  
	}
    
}
