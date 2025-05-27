package Week3.Day1;

public class EvenOrOdd {
    public static void main(String[] args) {
        int binary = 5 ;
        boolean isEven = ( binary & 1 ) == 0 ;

        if(isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
