package Week4.Day3;

class parent {
    void display() {
        System.out.println("Parent Class");
    }
}

 class child1 extends parent {
    void showchild1() {
        System.out.println("Child1 Class");
    }
}

class child2 extends parent {
    void showchild2() {
        System.out.println("Child2 Class");
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        child1 obj1 = new child1();
        child2 obj2 = new child2();
        obj1.showchild1();
        obj2.showchild2();
        obj1.display();
    }
}
