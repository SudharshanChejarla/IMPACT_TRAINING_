//WAP to create a class called Animal with method Sound() and then create two sub class cat and bird , override the sound method in each class to create specific sound for each animal.

package Week4.Day6;

public class Polymorphism2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Bird bird = new Bird();
        bird.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal Roars");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    void sound() {
        System.out.println("Bird Chirps");
    }
}
