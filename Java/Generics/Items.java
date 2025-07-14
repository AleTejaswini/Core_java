package variables;
interface Store<K,V>{
	K getKey();
	V getValue();
}
public class Items<K,V>  implements Store<K,V> {
	K key;
	V value;
	Items(K key ,  V value){
		this.key =key;
		this.value= value;
	 	}
	@Override
	public K getKey() {
    	return key;
    	}
	@Override
    public V getValue() 
    {
    	return value; 
    	}

	public static void main(String[] args) {
		
		Store<String, Integer> item = new Items<>("Milk" , 2);
		System.out.println(item.getKey()  + ">>"  +item.getValue());
		Store<String, Integer> item1 = new Items<>("bread" , 4);
		System.out.println(item1.getKey()  + ">>"  +item1.getValue());
		
		
		
		

	}

}
