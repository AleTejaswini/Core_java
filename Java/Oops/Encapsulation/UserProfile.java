package encapsulation;

public class UserProfile {
		private String email;
		private int age;
		
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(!email.contains("@") || !email.contains(".")) {
			System.out.println("must contain @ and . symbols");
		}
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=13)
			System.out.println("Must be 13+");
		this.age = age;
	}
	public static void main(String[] args) {
		UserProfile u1 = new UserProfile();
//		u1.setEmail("ale");
		u1.setEmail("aletejaswini@gmail.com");
		
		System.out.println(u1.getEmail());

	}
}
