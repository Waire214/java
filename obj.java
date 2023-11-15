class calculator {

    int a;

    public int add(int n1, int n2) {
        System.out.println("null");

        
        return n1 + n2;
    }
}

class Computer {

    public void playMusic() {

        System.out.println("Playing Music");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "pen";
        }
       
        return "Nothing";
    }
}

class MethodOverload {

    public int add(int n1, int n2, int n3) {

        return n1+n2+n3;
    }

    public int add(int n1, int n2) { // return type and parameter type must match
       
       
        return n1+n2;
    }

    public double add(double n1, int n2) { // return type and parameter type must match
       
       
        return n1+n2;
    }
}

public class obj {
    public static void main(String a[]) {

        int num1 = 4; //primitive
        int num2 = 5;

        calculator calc = new calculator(); // reference // object creation
        int result = calc.add(num1, num2);
        System.out.println(result);

        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(12);
        System.out.println(str);

        MethodOverload met = new MethodOverload();
        int add1 = met.add(num1, num2);

        System.out.println(add1);
    }
}
