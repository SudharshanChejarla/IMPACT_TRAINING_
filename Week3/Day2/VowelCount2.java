package Week3.Day2;

import java.util.Scanner;

public class VowelCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        String vStr = "aeiouAEIOU" ;

        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt((i)) ;
            if(vStr.indexOf(ch) != -1 ) {
                System.out.print(ch+" ");
                vowelCount++ ;
            }
        }

        System.out.println("\nVowels Count : " + vowelCount);
    }
}
