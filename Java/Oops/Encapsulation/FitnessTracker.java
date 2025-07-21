package encapsulation;

public class FitnessTracker {
     private int steps;
     private int heartrate;
     private double caloriesburnt;
     public int getSteps() {
 		return steps;
 	}
 	public void setSteps(int steps) {
 		this.steps = steps;
 	}
 	public int getHeartrate() {
 		return heartrate;
 	}
 	public void setHeartrate(int heartrate) {
 		this.heartrate = heartrate;
 	}
     
     private void heartrateactivity(int bpm) {
    	 if(bpm < 40 || bpm >220)
    		 System.out.println("invalid heart rate");
    	 if(bpm <60 || bpm >200)
    		 abnormalheartrate();
    	 this.heartrate=bpm;
    	 updateheartrate();
     }
     private void abnormalheartrate() {
    	 System.out.println(" heart rate  falls outside the normal resting range ");
     }
     private void updateheartrate() {
    	 caloriesburnt = steps * 0.04 + heartrate * 0.1;
     System.out.println("calories burnt:" +caloriesburnt);
     }
     
	public static void main(String[] args) {
		
		FitnessTracker ft = new FitnessTracker();
		ft.setSteps(2000);
         ft.heartrateactivity(100);
	}
	

}
