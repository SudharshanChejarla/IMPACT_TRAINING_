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

class Main {
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
        obj.show();
    }
}
