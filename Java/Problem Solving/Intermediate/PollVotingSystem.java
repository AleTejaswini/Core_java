package intermediate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PollVotingSystem {
	static Map<String ,Integer> option = new HashMap<>();
	static List<String> voters = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	int choice;	
	option.put("Option A", 0);
	option.put("Option B", 0);
	option.put("Option C", 0);
	while(true) {
		System.out.println("----Poll voting system---");
		System.out.println("1.Vote");
		System.out.println("2.Show Results");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		choice =sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:vote();break;
		case 2: showresults();break;
		case 3 :exit();System.exit(0);break;
		default :System.out.println("Invalid choice");
		}
	}
	
	}
	
	private static void exit() {
		System.out.println("Thank you");
	}

	private static void vote() {
		System.out.println("Enter your name");
		String name = sc.nextLine();
		if(voters.contains(name)) {
			System.out.println("your vote is already casted.(only one time)");
			return;
		}
		
		
		
		
		System.out.println("Options");
		int i = 1;
		List<String> optionlist = new ArrayList<>(option.keySet());
	for(String option: optionlist ) {
		System.out.println(( i++) +" ." +option);
	}
	
	
	
	System.out.println("Enter option to vote");
	int votechoice = sc.nextInt();
	sc.nextLine();
	
	
	if(votechoice <1 || votechoice > option.size()) {
		System.out.println("Invalid choice  ");
	}
	
	
	String selectedoption = optionlist.get(votechoice-1);
	option.put(selectedoption, option.get(selectedoption) -1);
	voters.add(name);
	System.out.println("Thank you for voting");
	
	
	}
	
	
	private static void showresults() {
		int totalvotes = option.values().stream().mapToInt(Integer::intValue).sum();
		if( totalvotes==0) {
			System.out.println("No votes casted");
		}
		
		System.out.println("----Live poll results---");
		option.entrySet().stream().sorted((e1 ,e2) -> Integer.compare(e1.getValue(), e2.getValue()))
		.forEach(entry -> {
			String option =entry.getKey();
			int votes = entry.getValue();
			System.out.println(option +">>>" + votes);
		});
		
System.out.println("Total votes :" + totalvotes);		
	}

}
