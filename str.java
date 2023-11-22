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

        StringBuffer sb = new StringBuffer("Navin");
         System.out.println(sb.capacity());
         System.out.println(sb.length());
         sb.append(" sb");
         System.out.println(sb);
         sb.insert(7, " java");
         System.out.println(sb);
         sb.setLength(30);
         System.out.println(sb);
    }
    
}