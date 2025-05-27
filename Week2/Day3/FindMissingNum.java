package Week2.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        
        boolean found = false;
        for(int i=0; i<n-1; i++) {
            if(arr[i]>=0) {
                
                if(arr[i]+1 != arr[i+1]) {
                    System.out.print(arr[i]+1);
                    found = true ;
                }
                
            } 
        }
        
        if(!found) System.out.print(arr[n-1]+1);
    }
}




