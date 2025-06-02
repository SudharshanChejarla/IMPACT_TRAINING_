// create a class animal and a method named move() and create sub class cheetah that overrides move()  

package Week4.Day4;

public class Animal {
    public void move() {
        System.out.println("Animal move method");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Animal cheetah = new Cheetah();
        cheetah.move(); 
    }
}

class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Cheetah move method");
    }
}
