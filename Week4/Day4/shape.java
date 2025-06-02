package Week4.Day4;

public class shape {

    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}


class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        System.out.println(rectangle.getArea());
    }
}

