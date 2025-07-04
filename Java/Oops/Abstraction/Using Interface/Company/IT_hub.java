package Interface;

public interface IT_hub {
	public void frontend();
	public void backend();
	public void designer();
	default void data_analyst() {
		HR();
		System.out.println("analyse data");
	}
    static void HR()
    {
    	System.out.println("Manages the company");
    }
    private void  security() {
    	System();
    	System.out.println("security");
    	
    }
    private static void System() {
    	System.out.println("carry their own system");
    }
}
