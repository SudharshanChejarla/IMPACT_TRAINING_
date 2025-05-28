package Week4.Day3;

class parent {
    void display() {
        System.out.println("Parent Class");
    }
}

class child extends parent {
    void show() {
        System.out.println("Child Class");
    }
}

class grandSon extends child {
    void showGrandSon() {
        System.out.println("Grand Class");
    }
}

class Main {
    public static void main(String[] args) {
        grandSon obj = new grandSon();
        obj.display();
        obj.show();
        obj.showGrandSon();
    }
}
