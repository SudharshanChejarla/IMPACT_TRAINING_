package Week2.Day3;

import java.util.Scanner;

class Move01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Test Cases: ");
        int n = sc.nextInt();

        recursFunc(n);

        // while(n!=0) {
        //     System.out.print("Enter Test Case(only 0s and 1s): ");
        //     ArrangeNumber(sc.nextInt());
        //     n--;
        // }
    }

    static void recursFunc(int n) {
        if(n == 0) return ;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter test case: ");2

        int tc = sc.nextInt();
        n--;
        recursFunc(n);
        ArrangeNumber(tc);

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
