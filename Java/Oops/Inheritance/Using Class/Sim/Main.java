package sim;

public class Main {

	public static void main(String[] args) {
		Sim2g sim_2g = new Sim2g();
		Sim3g sim_3g = new Sim3g();
		Sim4g sim_4g = new Sim4g();
		Sim5g sim_5g = new Sim5g();
		sim_2g.sms();
		sim_3g.calling();
		sim_3g.gprs();
		sim_4g.volte();
		sim_5g.network();
		
		
		// TODO Auto-generated method stub

	}

}
