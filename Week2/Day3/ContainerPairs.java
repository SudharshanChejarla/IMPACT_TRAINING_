package Week2.Day3;

import java.util.Scanner ;
import java.util.Arrays;
public class ContainerPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Value : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array  Values : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        printContainerPairs(arr);


    }

    static void printContainerPairs(int[] arr) {
        Arrays.sort(arr);
        int a = 0;
        int b = arr.length-1 ;
        while(a<b) {
            System.out.println(arr[b]+" , "+arr[a]);
            b--;
            a++ ;
        }

        if(a==b) {
            System.out.println(arr[a]);
        }

        
    }


}
