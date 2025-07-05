package properties;

public class HeapTest {

	public static void main(String[] args) {
		int size =10;
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			int[] arr =new int[size];
			size *=2;
			System.out.println(size);
			//Xmx100m
		}

	}

}
