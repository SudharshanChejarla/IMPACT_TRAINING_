import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean reachedLast = false;
        boolean takenFirst = false;
        String str = "";
        char prevLast = ')';

        while (!reachedLast) {
            str = sc.nextLine();

            if (str.equals("####")) {
                reachedLast = true;
                break;
            } else if (!takenFirst) {
                prevLast = str.charAt(str.length() - 1);
                System.out.println(str);
                takenFirst = true;
            } else if (str.charAt(0) == prevLast) {
                prevLast = str.charAt(str.length() - 1);
                System.out.println(str);
            }

        }
    }
}