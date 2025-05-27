package Week2.Day6;

public class CheckSetBit {
    public static void main(String[] args) {
        int binary = 10101 ;
        int i = 1;
        int digit = 0; 


        while(i>=0) {
            digit = binary%10 ;
            binary = binary/10 ;
            i--;
        }

        if(digit==1) {
            System.out.println("It is a Set Bit");
        } else {
            System.out.println("It is not a Set Bit");

        }
    }
}
