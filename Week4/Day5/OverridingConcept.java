package Week4.Day5;

class Animal {
    void sound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingConcept {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Animal d = new Dog();
        d.sound();
    }
}
