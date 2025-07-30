package streams;

import java.util.Optional;

public class Optionalclass {
    
    public static Optional<String> username() {
         return Optional.ofNullable(null);
//        return Optional.of("Teja");
    }

    public static void main(String[] args) {
        
        Optional<String> name = username();

        if (name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("No Name Found");
        }

       

    }
}
