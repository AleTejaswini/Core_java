package Static;



	
		interface logger{
			static void log(String msg) {
				System.out.println("Log: " +msg);
			}
		}
		
		class service implements logger{
			void execute() {
				logger.log("hello");
			}
		}
		public class Static3 {
		public static void main(String[] args) {	
		new service().execute();
		
	}

}
