package Week2.Day4;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        int n = sc.nextInt();

        int dec = 0;
        int power = 0;

        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            dec += ((int) Math.pow(2, power++) * digit);
        }

        System.out.print("Decimal Number : " + dec);
    }
}
