package ps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Voting {
	int id;
	String name;
	int votecount;
	public Voting(int id, String name) {
		this.id = id;
		this.name = name;
		this.votecount = 0;
	}
	public static void main(String[] args) {
		List<Voting> candidates = Arrays.asList(new Voting(1,"Teja"),
				new Voting(2,"Affu"),
				new Voting(3,"Renuka"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Voting started! Enter candidates id to vote ");
		while(true) {
			System.out.println("Vote for  (1) Teja , (2) Affu ,(3) Renuka (Enter 0 to exist)");
			int vote = sc.nextInt();
			if(vote ==0)
				break;
		boolean validvote = false;
		for(Voting c : candidates) {
			if(c.id == vote) {
				c.votecount++;
			    validvote = true;
				System.out.println("vote casted for " +c.name);
				break;
			}	}
			if(!validvote) {
				System.out.println("Invalid id..try again");
			}
	}
		
		
		// voting results
	System.out.println("Voting results");
		for(Voting c : candidates) {
		 System.out.println("Voting results of " +c.name  + " is " + c.votecount) ;
		}
 // declaring winner
		Voting winner = candidates.get(0);
		boolean tie = false;
		for(Voting c : candidates) {
			if(c.votecount>winner.votecount) {
				  winner =c;
				  tie =false;
			}
			else if(c.votecount == winner.votecount && c!=winner){
				tie = true;
			}
				
			}
		
		if(tie == true) {
			System.out.println("\nIts a tie");
		}
		else {
			System.out.println("\nwinner is " + winner.name + " and with vote count of " + winner.votecount);
		}
				
			
		}
}



























