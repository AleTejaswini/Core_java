package Interface;

public interface Laptop {
	public void copy();
	public void paste();
	public void cut();
	public void delete();
    default void camera()
    {
    	storage();
    	System.out.println("captures photos code");
    	
    }
    static void security()
    {
    	//non-static methods can also call in static methods
    	
    	System.out.println("security code");
    }
    private void touch() {
    	storage();
    	
    	System.out.println("touch  code");
    }
    private static void storage() {
    	
    	System.out.println("storage");
    }

} 