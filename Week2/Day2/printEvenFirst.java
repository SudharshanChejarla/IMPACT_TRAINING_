package Week2.Day2;
import java.util.Scanner;

public class printEvenFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n val: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printEvenFirst(arr);
    }

    static void printEvenFirst(int[] arr) {
        int n = arr.length;
        System.out.println("Arrays after seggregation: ");
        //print even
        for(int i=0; i<n; i++ ){
            if(arr[i] %2 == 0) {
                System.out.print(arr[i]+" ");
                arr[i] = -1 ;
            } 
        }

        //print odd
        for(int i=0; i<n; i++) {
            if(arr[i] != -1) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
