package method_overriding;

public class Manager extends Company {
	public void meeting() {
		System.out.println("leads meeting");
	}
	public void report() {
		System.out.println("Submits team report");}
		public void role() {
			System.out.println("manages people and projects");
			}
		public void work_hours() {
			System.out.println("depends on task of the day");
		}
		public void salary() {
			System.out.println("gets 20K");
		}
}
