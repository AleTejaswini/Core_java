package inner_class;

import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Lambda13 {

	public static void main(String[] args) {
		Supplier<LocalDateTime> create = () -> LocalDateTime.now();
		LocalDateTime currentDateTime = create.get();

        System.out.println(currentDateTime);
        
        
        
        BiFunction<String,String,String> concate= (str1,str2) -> str1 + str2;
        String result= concate.apply("hello, ", "world");
        System.out.println(result);
        
	}

}
