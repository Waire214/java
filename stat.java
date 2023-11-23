public class stat {
    public static void main(String[] args) throws ClassNotFoundException {
        // the class loads every time you initiate an object
        Mobile Obj1 = new Mobile();

        Obj1.brand = "Apple";
        Obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile Obj2 = new Mobile();

        Obj2.brand = "Samsung";
        Obj2.price = 1700;


        Mobile Obj3 = new Mobile();

        Obj1.show();
        Obj2.show();

        Mobile.show1(Obj2);

        // Class.forName("Mobile"); // loads the static block
    }
}

class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";

         System.out.println("in static block");
    }

    public void show() {
        System.out.println(brand + ": " + price + ": " + name );
    }

    public static void show1(Mobile obj) {
        System.out.println("show static" + obj.brand + ": " + obj.price + name);
    }

    public Mobile() {
        brand = "";
        price = 2000;
        
        System.out.println("in constructor");
    }
}