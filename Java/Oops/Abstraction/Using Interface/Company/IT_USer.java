package Interface;

public class IT_USer {

	public static void main(String[] args) {
		Dmantz D =new Dmantz();
		Konam K = new Konam();
		Lee L = new Lee();
		D.backend();
		D.data_analyst();
		D.System();
		D.trainers();
		K.backend();
		K.designer();
		K.System();
		K.frontend();
		L.frontend();
		L.designer();
		L.security();
		
		
		IT_hub.HR(); //Static method
		
		
	}

}
