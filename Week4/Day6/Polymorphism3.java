package Week4.Day6;

public class Polymorphism3 {
    
}

class Shape {
    double getArea() ;
    double getPerimeter() ;
}

class Circle extends Shape {
    double radius ;
    Circle(double radius) {
        this.radius = radius ;
    }

    double getArea() {
        return Math.PI * radius * radius ;
    }

    

}

class Rectangle extends Shape {
    
}

class Triangle extends Shape {
    
} 
