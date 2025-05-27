package Week3.Day1;

public class SetBitRightShift {
    public static void main(String[] args) {
        int binary = 1101 ;
        int i = 2 ;

        if( ((binary>>i) & 1) ==1 ) {
            System.out.println("Set Bit at ith Place");
        } else {
             System.out.println("Not a Set Bit at ith Place");
        }
    }
}
