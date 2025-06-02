package Week4.Day5;

public class Calculator {
    int add(int a,int b) {
        return a+b ;
    }
    double add(double a,double b) {
        return a+b ;
    }
    int add(int a,int b,int c) {
        return a+b+c ;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(2,5));
        System.out.println(cal.add(2.5,3.6));
        System.out.println(cal.add(2,4,5));
        
    }
}
