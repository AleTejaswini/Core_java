package streams;

import java.util.Optional;

public class UserServiceOC3 {
    
   
    public static UserOC3 findByUser(String userName) {
        if ("Teja".equals(userName)) {
            return new UserOC3("Teja");  
        }
        return null;
    }

    public static void main(String[] args) {
       // without existing user
        Optional<UserOC3> opt = Optional.ofNullable(findByUser("exist"));
        String result = opt
                .map(UserOC3::getName)
                .orElse("User Not Found");

        System.out.println(result);  

       // with existing user
        Optional<UserOC3> opt2 = Optional.ofNullable(findByUser("Teja"));
        String result2 = opt2
                .map(UserOC3::getName)
                .orElse("User Not Found");

        System.out.println(result2); 
    }
}

