package demo;

public enum Week{ 
//	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;  // ctrl + shift + X = to get capital letters
//	MONDAY(1,"open"),TUESDAY(2),WEDNESDAY(3,"open"),THURSDAY(4,"open"),FRIDAY(5),SATURDAY(6),SUNDAY(7);	
	MONDAY(9,10),TUESDAY(10,6),WEDNESDAY(9,8),THURSDAY(8,9),FRIDAY(9,10),SATURDAY(9,6),SUNDAY(9,6);	
	 int index;
	 String status = "closed";
	 int opentime;
	 int closingtime;
	 
	 
	private Week() {
		
	}
	
	private Week(int index) {
		this.index= index;
	}
	private Week(String s) {
		this.status= s;
	}
	private Week(int index,String s) {
		this.index= index;
		this.status= s;
	}
	private Week(int opentime,int closingtime) {
		this.opentime= opentime;
		this.closingtime= closingtime;
	}
}

