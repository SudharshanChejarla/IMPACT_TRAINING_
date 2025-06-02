// WAP for method overloading to find sum of two numbers

package Week5.Day1;

public class MethodOverloading1 {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.add(1, 2));
        System.out.println(s.add(2.35, 7.90));
        System.out.println(s.add(5, 5, 5));
    }
}

class Sum {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
