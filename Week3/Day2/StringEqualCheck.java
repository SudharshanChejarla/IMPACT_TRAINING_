package Week3.Day2;

public class StringEqualCheck {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Bye");
        String s4 = new String("Bye");

        System.out.println(s1==s2);
        System.out.println(s3==s4);
    }
}
