class calculator {

    int a;

    public int add(int n1, int n2) {
        System.out.println("null");

        
        return n1 + n2;
    }
}

public class obj {
    public static void main(String a[]) {

        int num1 = 4; //primitive
        int num2 = 5;

        calculator calc = new calculator(); // reference // object creation

        int result = calc.add(num1, num2);
        
        System.out.println(result);
    }
}
