class user {
    String name = new String("navin");

    String car = "Toyota";
}


/**
 * str
 */
public class str {

    public static void main(String[] args) {
        user newUser = new user();


        System.out.println(newUser.hashCode());
        System.out.println(newUser.name.charAt(0));
        System.out.println(newUser.car);
    }
    
}