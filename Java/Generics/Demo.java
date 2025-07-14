package variables;
// //generic class => create flexible classes
//class Box<T> {
//    private T value;
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        return value;
//    }   }
//public class Demo{
//public static void main(String[] args) {
//        Box<Integer> intBox = new Box<>();  // can use integer ,String, double..any DT
//        intBox.setValue(100);
//        System.out.println("Integer: " + intBox.getValue());
//
//        Box<String> strBox = new Box<>();
//        strBox.setValue("Hello");
//        System.out.println("String: " + strBox.getValue());
//        
//        Box<Character> cha = new Box<>();
//        cha.setValue('T');
//        System.out.println("Character: " + cha.getValue());
//        
//        
//        Box<Float> flo = new Box<>();
//        flo.setValue(10.00f);
//        System.out.println("Float: " + flo.getValue());
//        
//        }
//}


//
//// Generic Method 
//public class Demo{
//	public <T> void print(T value , int result) {  // we can use generics and normal parameter like int , string..
//		System.out.println("Value: "   + value + "," + result);
//	}
// public static void main(String[] args) {
// 		Demo d = new Demo();
// 		d.<String>print("hello" ,5);
// 		d.<Integer>print(326 ,95);
// 		d.<Boolean>print(true,1);
// 		
//		
//	}
//}
 

//// another example Generic method
//public class Demo{
//	static String name[] = {"Teja" ,"Renu" ,"Affu"};
//	Integer num[] =	{2,5,545,35,65};
//	public <T> void display(T[] arr ) {
//		for(T a : arr) {
//			System.out.println(a);
//		}
//		}
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.display(name ); 
//		d.display(d.num);  // we can't access non static members directly need object
//		
//	}
// 	}


//// Bounded Type Parameters  
////Bounded to a Class (extends)
//public class Demo<T extends Number>{  // Number is a  default class in java that allow only int,float,double ,short i.e number type onlt
//	public void Doushow(T val) {
//		System.out.println(val.doubleValue());
//		}
//	public void   floshow(T  val) {
//		System.out.println(val.floatValue());
//	}
//	public static void main(String[] args) {
//		Demo d = new Demo(); 
//		d.Doushow(689);	 // converts to type of data that we call method
//		d.floshow(6);
//		
//	}
//}
 

//// Bounded to interface
//public class Demo<T extends Comparable<T>> {
//    public void compare(T a, T b) {
//        System.out.println(a.compareTo(b));
//    }
//
//    public static void main(String[] args) {
//    	Demo<String> p = new Demo<>();
//        p.compare("apple", "banana"); // alphabetically
//        
//        
//        Demo<Float> f = new Demo<>();
//        f.compare(0.5f, 0.0f);
//        f.compare(0.0f, 0f);
// /* returns 0 if equal
//  *         -1 if <
//  *         i if  >
//  */
//        
//    }
//}


//// multiple bounds
//class Demo<T extends Number & Comparable<T>> {  // number has integer ,double.. subclass extends comaparable
//    T value;
//
//    Demo(T value ) {
//        this.value = value;
//
//        
//    }
//    
//    void show() {
//        System.out.println("Value: " + value);
//    }
//    public static void main(String[] args) {
//		Demo d = new Demo(23);
//		d.show();
//		
//		
//		Demo<Double> d1 = new Demo(98458d);
//		d1.show();
//	
//	}
//}


// unbounded wild card <?>  , which means I don’t know the exact type, and I don’t care , it can be any type

//import java.util.*;
//
//public class Demo {
//    public static void printList(List<?> list) {
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Teja", "Renu", "Affu");
//        List<Integer> numbers = Arrays.asList(10, 20, 30);
//
//        printList(names);    
//        printList(numbers);  
//      // we can use this when we don't know the specific  type of data and need to process all  
//        // we can't add elements "list.add(4873)" bcoz the compiler don't now which it should accept
//        
//        /* same as
//         * upper bound <? extends T> which means subclass
//         * lower bound <? super T> which superclass 
//         */
//    }
//}

//// upper bound <? extends T>
///// if you want use only in parameter we use wild card ?
//import java.util.*;
//public class Demo{
//	public static void printList(List<? extends Number> list) {
//		for(Number n : list) {
//			System.out.println(n);
//		}
//		
//	}
//	public static void main(String[] args) {
//        List<Integer> intList = Arrays.asList(10, 20, 30);
//        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
//
//        printList(intList);   
//        printList(doubleList); 
//}}

// other wise <T>
import java.util.*;
public class Demo{
	public static <T extends Number> void printList(List<T>  list) { 
		for(T num : list) {
			System.out.println(num);
		}
		
	}
	public static void main(String[] args) {
      List<Integer> intList = Arrays.asList(10, 20, 30);
      List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

      printList(intList);   
      printList(doubleList); 
}}




// // lower bound <? super T>    // when you use super you need need to use wild cards only
//import java.util.*;
//
//public class Demo {
//    public static void addIntegers(List<? super Integer> list) {  // should use particular type as it is superclass
//        list.add(10);  
//        list.add(20);  
//        // list.add("hello"); not an integer
//    }
//
//    public static void main(String[] args) {
//        List<Number> numList = new ArrayList<>();
//        addIntegers(numList); 
//        System.out.println(numList); 
//    }
//}


// Interface
//interface Pair<K, V> {
//    K getKey();
//    V getValue();
//}
//
//class OrderPair<K, V> implements Pair<K, V> {
//    private K key;
//    private V value;
//
//    public OrderPair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public K getKey() {
//    	return key;
//    	}
//    public V getValue() 
//    {
//    	return value; 
//    	}
//}
//public class Demo{
//	public static void main(String[] args) {
//		Pair<String, Integer> student = new OrderPair<>("Teja", 101);
//		System.out.println(student.getKey() + ": " + student.getValue());
//
//	}
//}
