package Week3.Day2;

import java.util.Scanner;

public class ChcekPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        if(isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    static boolean isPalindrome(String str) {
        int x = 0 ;
        int y = str.length()-1 ;
        boolean flag = true ;
        while(x<y) {
            if(str.charAt(x++) != str.charAt(y--)) {
                flag = false ;
            }
        }
        return flag ;
    }
}
