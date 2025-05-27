package Day6;
import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n+1] ;
        System.out.print("Enter array Elements : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Insertion Position : ");
        int pos  = sc.nextInt();
        System.out.print("Enter Inserting Element : ");
        int elm  = sc.nextInt();

        int idx = n ;
        for(int i=n-1; i>=pos-1; i--) {
            arr[idx--] = arr[i];
        }

        arr[pos-1] = elm ;

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ") ;
        }
        
    }
}
