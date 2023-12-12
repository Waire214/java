package encap;

public class encap {
    public static void main(String[] args) {
        Innerencap human = new Innerencap();

        human.setAge(20);
        System.out.println( human.getAge());
        human.setName("Jane Doe");
        System.out.println(human.getName());
       

    }
}

/**
 * encap.Innerencap
 */
class Innerencap {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int setAge(int a) {
        return age = a;
    }

    public String setName(String a) {
        return name = a;
    }
}