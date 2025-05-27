package Week4.Day1 ;
import java.util.*;

public class Insertion_Sort {

    public static void insertion(int arr[]){
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]<key) {
                arr[j+1] = arr[j];
                j = j-1;

            }
            arr[j+1] = key;

        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array values : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        insertion(arr);
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
       
    }
}