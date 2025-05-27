package Week2.Day3;
import java.util.Scanner;

public class MoveZeroesAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Test Cases: ");
        int n = sc.nextInt();
        while(n!=0) {
            System.out.print("Enter Test Case(only 0s and 1s): ");
            ArrangeNumber(sc.nextInt());
            n--;
        }
    }

    static void ArrangeNumber(int x) {
        int zeroes = 0 ;
        int ones = 0 ;
        while(x!=0) {
            int digit = x%10;
            x = x/10 ;

            if(digit==0) {
                zeroes++;
            } else {
                ones++;
            }
        }

        while(zeroes!=0 ) {
            System.out.print("0");
            zeroes--;
        }
        while(ones!=0 ) {
            System.out.print("1");
            ones--;
        }

        System.out.println();


    }
}
