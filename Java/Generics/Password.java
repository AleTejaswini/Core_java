package variables;

public class Password<K,V>{ 
	K key;
	V value;
	Password(K key ,V value){
		this.key = key;
		this.value = value;
		}
	
	public K  getkey() {
		return key;
	}
    public V getvalue() {
    	return value;
    }
	public static void main(String[] args) {
        Password<String,Boolean> correct= new Password<String,Boolean>("Teja" , true);
        Password<String,String> correct1= new Password<String,String>("Teja" , "Hi345");
        System.out.println(correct.getkey());

	}

}
