package Week5.Day1;

public class MethodOverriding1 {
    public static void main(String[] args) {
        Sports fb = new Football();
        Sports bb = new Basketball();
        Sports rb = new Rugby();

        fb.play();
        bb.play();
        rb.play();
    }
}

class Sports {
    void play() {
        System.out.println("Play Sports");
    }
}

class Football extends Sports {
    void play() {
        System.out.println("Play Football");
    }
}

class Basketball extends Sports {
    void play() {
        System.out.println("Play Basketball");
    }
}

class Rugby extends Sports {
    void play() {
        System.out.println("Play Rugby");
    }
}
